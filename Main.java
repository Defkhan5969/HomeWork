
package homework;

import homework.business.concretes.MailVerificationManager;
import homework.business.concretes.UserCheckManager;
import homework.business.concretes.UserManager;
import homework.dataAccess.concretes.HibernateUserDao;
import homework.entities.concretes.User;


public class Main {
    public static void main(String[] args) {
        User user=new User(1,"Selçuk","Özdemir","123456","s_05_60@hotmail.com");
        User user2 =new User(2, "Seyyit", "Ömer", "1907195", "seyit60.ss@gmail.com");
        User user3=new User(3, "a", "s", "f", "adv@sd.sd");
        
        UserManager userManager=new UserManager(new UserCheckManager(), new HibernateUserDao(), new MailVerificationManager());
        
        
        userManager.signUp(user2);
        userManager.signIn(user2);
        
        
                
    }
}
