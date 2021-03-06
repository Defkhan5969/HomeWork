package homework.dataAccess.abstracts;

import homework.entities.concretes.User;
import java.util.List;

public interface UserDao {

    void add(User user);

    void delete(User user);

    void update(User user);

    User get(int id);

    List<User> getAll();
    
    boolean getEmail(User user);
    boolean getPassword(User user);
}
