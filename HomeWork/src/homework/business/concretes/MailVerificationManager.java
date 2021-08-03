

package homework.business.concretes;

import homework.business.abstracts.VerificationService;
import java.util.ArrayList;
import java.util.List;


public class MailVerificationManager implements VerificationService{

    List<String> verificatedEmails=new ArrayList<>();
    @Override
    public void sendEmail(String email) {
        System.out.println(email+" emailine doğrulama postası gönderildi");
    }

    @Override
    public void verifyEmail(String email) {
        verificatedEmails.add(email);
    }

    @Override
    public boolean isVerificated(String email) {
        if (verificatedEmails.contains(email)) {
            return true;
        }
        return false;
    }
    
}
