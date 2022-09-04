package com.mycompany.capp.dao;

import com.mycompany.capp.domain.User;
import java.util.List;

/**
 *
 * @author aman
 */
public interface UserDAO {
    public void save(User u);
    public void update(User u);
    public void delete(User u);
    public void delete(Integer id);
    public List<User> findAll();
    public User findById(Integer id);
    public User findByProperty(String propName,Object propValue);
}
