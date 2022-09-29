
package com.mycompany.capp.test;
import com.mycompany.capp.config.SpringRootConfig;
import com.mycompany.capp.dao.UserDAO;
import com.mycompany.capp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author aman
 */
public class TestUserDAOupdate {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);
        User u = new User();
        // ths user later wll be taken from nput class
        u.setName("AmanThakur");
        u.setPhone("9893063139");
        u.setEmail("amanthakur@gmal.com");
        u.setAddress("House-49");
      
        u.setRole(1);//admn
        u.setLoginStatus(1);//actve
        
        userDAO.update(u);
        
        System.out.println("---------Data Saved----------");
    }
    
}
