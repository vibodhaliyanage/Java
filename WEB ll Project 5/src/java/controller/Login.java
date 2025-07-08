/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user;

/**
 *
 * @author vibod
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.addHeader("Access-Control-Allow-Origin", "*");
        
        Gson gson = new Gson();
        user u = gson.fromJson(request.getReader(), user.class);
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_5?useSSL=false", "root", "Vibodha20050718_");
            
            Statement smt = connection.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM `user` WHERE `mobile`='" + u.getMobile() + "'& `password`='" + u.getPassword() + "'");
            
            if (rs.next()) {
                response.getWriter().print(rs.getString("first_name"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
            
            
        }
        
    }
    
}
