/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.dataAccess.concretes;

import homework.dataAccess.abstracts.UserDao;
import homework.entities.concretes.User;
import java.util.ArrayList;
import java.util.List;


public class HibernateUserDao implements UserDao{

    List<User> users=new ArrayList<User>();

    @Override
    public void add(User user) {
        users.add(user);
        System.out.println("Hibernate ile eklendi: "+user.getFirstName());
    }

    @Override
    public void delete(User user) {
        users.remove(user);
        System.out.println("Hibernate ile silindi: "+user.getFirstName());
        
    }

    @Override
    public void update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getEmail(User user) {
        for (User user1 : users) {
            if (user1.getEmail()==user.getEmail()) {
                return true;
            }
           
        }
        return false;
    }

    @Override
    public boolean getPassword(User user) {
        for (User user1 : users) {
            if (user1.getPassword()==user.getPassword()) {
                return true;
            }
           
        }
        return false;
    }
   

 
    
}
