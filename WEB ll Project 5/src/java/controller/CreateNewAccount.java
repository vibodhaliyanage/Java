/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mysql.cj.xdevapi.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet(name = "CreateNewAccount", urlPatterns = {"/CreateNewAccount"})
public class CreateNewAccount extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");

//        JSON -> JAVA
        Gson gson = new Gson();
//        user user = gson.fromJson(request.getReader(), user.class);

        JsonObject user =gson.fromJson(request.getReader(),JsonObject.class);
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
          java.sql.Connection  c = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_5?useSSL=false","root","Vibodha20050718_");
            java.sql.Statement s =c.createStatement();
            s.executeUpdate("INSERT INTO `user`"
                    + "(`mobile`,`first_name`,`last_name`,`password`,`country`)"
                    + "VALUES ('"+user.get("mobile").getAsString()+"','"+user.get("firstName").getAsString()+"','"+user.get("lastName").getAsString()+"','"+user.get("password").getAsString()+"','"+user.get("country").getAsString()+"')");
 
            response.getWriter().write("Success");
            
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }

    }
}
