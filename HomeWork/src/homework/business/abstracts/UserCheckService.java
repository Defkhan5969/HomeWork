
package homework.business.abstracts;

import homework.entities.concretes.User;


public interface UserCheckService {
    boolean checkFirstName(User user);
    boolean checkLastName(User user);
    boolean checkPassword(User user);
    boolean checkEmail(User user);
    boolean unıqueEmail(User user);
    boolean isValid(User user);
}
