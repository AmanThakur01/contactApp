package com.mycompany.capp.rm;

import com.mycompany.capp.domain.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author aman
 */
public class UserRooMapper implements RowMapper<User>{
    

    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User u = new User();
        u.setUserid(rs.getInt("userid"));
        u.setName(rs.getString("name"));
        u.setPhone(rs.getString("phone"));
        u.setEmail(rs.getString("email"));
        u.setAddress(rs.getString("address"));
        u.setLoginName(rs.getString("loginname"));
        u.setRole(rs.getInt("role"));
        u.setLoginStatus(rs.getInt("loginstatus"));
        return u;
    }
    
}
