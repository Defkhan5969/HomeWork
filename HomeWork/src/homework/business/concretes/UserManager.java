/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.business.concretes;

import homework.business.abstracts.UserCheckService;
import homework.business.abstracts.UserService;
import homework.business.abstracts.VerificationService;
import homework.dataAccess.abstracts.UserDao;
import homework.entities.concretes.User;


/**
 *
 * @author Selçuk ÖZDEMİR
 */
public class UserManager implements UserService{

    UserCheckService userCheckService;
    UserDao userDao;
    VerificationService verificationService;

    public UserManager(UserCheckService userCheckService, UserDao userDao, VerificationService verificationService) {
        this.userCheckService = userCheckService;
        this.userDao = userDao;
        this.verificationService = verificationService;
    }
    
    
    @Override
    public void signUp(User user) {
        if (userCheckService.isValid(user)) {
            System.out.println(user.getFirstName() + ": Kullanıcısı başarıyla sisteme eklendi");
            verificationService.sendEmail(user.getEmail());
            userDao.add(user);
        }
    }

    @Override
    public void signIn(User user) {
       verificationService.verifyEmail(user.getEmail());
       
        if (userDao.getEmail(user) &&userDao.getPassword(user) && verificationService.isVerificated(user.getEmail())) {
            System.out.println("Kullanıcı giriş yaptı");
        }
        else if (verificationService.isVerificated(user.getEmail())==false) {
            System.out.println("Mail adresi doğrulanmamış");
        }
        else
            System.out.println("Kullanıcı kayıt olmamış");
            
    }

    @Override
    public void delete(User user) {
      userDao.delete(user);
    }
    
}
