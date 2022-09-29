package com.mycompany.capp.rm;

import com.mycompany.capp.domain.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author aman
 */
public class ContactRowMapper implements RowMapper<Contact>{
    

    @Override
    public Contact mapRow(ResultSet rs, int i) throws SQLException {
        Contact c = new Contact();
        c.setUserid(rs.getInt("userid"));
        c.setName(rs.getString("name"));
        c.setPhone(rs.getString("phone"));
        c.setEmail(rs.getString("email"));
        c.setAddress(rs.getString("address"));
        c.setContactid(rs.getInt("contactid"));
        c.setRemark(rs.getString("remark"));
        return c;
    }
    
}
