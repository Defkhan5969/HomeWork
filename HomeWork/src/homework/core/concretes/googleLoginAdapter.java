/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.core.concretes;

import homework.core.abstracts.googleService;
import homework.google.LoginGoogleManager;

/**
 *
 * @author Selçuk ÖZDEMİR
 */
public class googleLoginAdapter implements googleService{

    LoginGoogleManager googleManager=new LoginGoogleManager();
    @Override
    public void sendToVerifyMail() {
      googleManager.sendToVerifyMail();

    }
    @Override
    public void checkVerifyAccount() {
        googleManager.checkVerifyAccount();
    }
    
}
