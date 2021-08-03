
package homework.business.abstracts;

import homework.entities.concretes.User;


public interface UserService {
    void signUp(User user);
    void signIn(User user);
    void delete(User user);
}
