/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import hibernate.Brand;
import hibernate.HibernateUtil;
import hibernate.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.OrderBy;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vibod
 */
@WebServlet(name = "DataAdvanceSearch", urlPatterns = {"/DataAdvanceSearch"})
public class DataAdvanceSearch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        Criteria c = s.createCriteria(Product.class);

        Brand b = (Brand) s.load(Brand.class, 1);

//      Restrictions   
//        Criterion crt1 = Restrictions.eq("qty", 30);
        Criterion crt5 = Restrictions.lt("price", 200000.0);
        Criterion crt6 = Restrictions.eq("brand", b);
        Criterion crt2 = Restrictions.lt("qty", 10);
        Order o1 = Order.asc("qty");

//        Criterion crt3 = Restrictions.lt("price", 200000.0);
//        Criterion crt4 = Restrictions.ilike("name", "ultra", MatchMode.ANYWHERE);
        c.add(crt6);
//        c.addOrder(o1);
        c.add(crt5);
//        c.add(crt3);

        List<Product> products = c.list();

        for (Product product : products) {

            System.out.println(product.getName());
        }

    }

}
