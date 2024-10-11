package com.registerpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterPage extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String mobile = req.getParameter("mobile");
        String dob = req.getParameter("dob");
        String gradyear = req.getParameter("gradYear");
        String specialization = req.getParameter("specialization");
        String semesterpercentage = req.getParameter("semesterPercentage");
        String tenthpercent = req.getParameter("tenthPercent");
        String twelthpercent = req.getParameter("twelthPercent");
        String graduationpercent = req.getParameter("graduationPercent");
        String experience = req.getParameter("experience");
        String gender = req.getParameter("gender");

        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");

            String query = "insert into rdetails (first_name,last_name,email,password,mobile_number,gender,dob,graduation_year,specialization,semester,tenth_percentage,twelth_percentage,graduation_percentage, experience) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = c.prepareStatement(query);
            
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, mobile);
            ps.setString(6, gender);
            ps.setString(7, dob);
            ps.setString(8, gradyear);
            ps.setString(9, specialization);
            ps.setString(10, semesterpercentage);
            ps.setString(11, tenthpercent);
            ps.setString(12, twelthpercent);
            ps.setString(13, graduationpercent);
            ps.setString(14, experience);

            int i = ps.executeUpdate();
            
            if (i > 0) 
                out.println("<h1>Successfully Register</h1>");
            else 
                out.println("<h1>Registration failed.</h1>");
            
            ps.close();
            c.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
