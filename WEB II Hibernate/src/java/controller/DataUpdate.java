
package controller;

import hibernate.Brand;
import hibernate.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author vibod
 */
@WebServlet(name = "DataUpdate", urlPatterns = {"/DataUpdate"})
public class DataUpdate extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        Brand b = new Brand();
        b.setId(3);
        b.setName("Huawei");
        
       s.update(b);
       s.beginTransaction().commit();
        
        
    }


}
