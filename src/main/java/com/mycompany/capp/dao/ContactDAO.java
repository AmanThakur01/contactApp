package com.mycompany.capp.dao;

import com.mycompany.capp.domain.Contact;
import java.util.List;

/**
 * @author aman
 */
public interface ContactDAO {
 public void save(Contact u);
    public void update(Contact u);
    public void delete(Contact u);
    public void delete(Integer id);
    public List<Contact> findAll();
    public Contact findById(Integer id);
    public Contact findByProperty(String propName,Object propValue);
}
