
package com.mycompany.capp.dao;

import com.mycompany.capp.domain.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aman
 */
@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO{

    @Override
    public void save(User u) {
        String sql = "INSERT INTO user(name,phone,email,address,loginname,password,role,loginstatus)"+
                " VALUES(:name,:phone,:email,:address,:loginname,:password,:role,:loginstatus)";
        Map m = new HashMap();
        m.put("name",u.getName());
        m.put("phone",u.getPhone());
        m.put("email",u.getEmail());
        m.put("address",u.getAddress());
        m.put("loginname",u.getLoginName());
        m.put("password",u.getPassword());
        m.put("role",u.getRole());
        m.put("loginstatus",u.getLoginStatus());
        
        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m); 
       super.getNamedParameterJdbcTemplate().update(sql,ps,kh);
       Integer usedi = kh.getKey().intValue();
       u.setUserid(usedi);
    }
    @Override
    public void update(User u) {
        String sql = "UPDATE user SET name=:name,"
                + "phone = :phone, email = :email,"
                + " address = :address, loginname = :loginname, password = :password, role = :role, loginstatus = :loginstatus";
        
        Map m = new HashMap();
        m.put("name",u.getName());
        m.put("phone",u.getPhone());
        m.put("email",u.getEmail());
        m.put("address",u.getAddress());
       
        m.put("role",u.getRole());
        m.put("loginstatus",u.getLoginStatus());
        m.put("useid", u.getUserid());
        
        getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void delete(User u) {
        this.delete(u.getUserid());
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM user WHERE userid=?";
        getJdbcTemplate().update(sql,id);
        
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User findById(Integer id) {
         
    }

    @Override
    public User findByProperty(String propName, Object propValue) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        
}
