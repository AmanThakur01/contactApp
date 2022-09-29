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
        
    }
    
}
