package homework.business.concretes;

import homework.business.abstracts.UserCheckService;
import homework.entities.concretes.User;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {

    List<String> listOfEmail = new ArrayList<String>();

    @Override
    public boolean checkFirstName(User user) {
        if (user.getFirstName().length() < 2) {
            System.out.println("İsim alanı 2 karakterden kısa olamaz");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkLastName(User user) {
        if (user.getLastName().length() < 2) {
            System.out.println("Soyad alanı 2 karakterden kısa olamaz");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkPassword(User user) {
        if (user.getPassword().length() <= 6) {
            System.out.println("Şifre alanı 6 karakterden kısa olamaz");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkEmail(User user) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        if (pattern.matcher(user.getEmail()).find() == false) {
            System.out.println("Email geçersiz formatta: Örnek abc@sdds.com.tr");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean unıqueEmail(User user) {
        if (listOfEmail.contains(user.getEmail())) {
            System.out.println("Bu email sistemde vardır");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isValid(User user) {
        if (checkFirstName(user) && checkLastName(user) && checkEmail(user) && checkPassword(user) && unıqueEmail(user)) {
            return true;
        } else {
            return false;
        }
    }

}
