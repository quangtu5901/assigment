/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AccountDBContext;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;

/**
 *
 * @author thand
 */
public class CreateAccount extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("view/createaccount.jsp");
//        request.getRequestDispatcher().forward(request, response);
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        AccountDBContext adb = new AccountDBContext();
        
        if(!adb.IsEmail(email)){
            String phone = request.getParameter("phone");
            String fistname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String raw_gender = request.getParameter("gender");
            boolean gender = raw_gender.equals("male");
            String raw_dob = request.getParameter("dob");
            Date dob = Date.valueOf(raw_dob);
            String password = request.getParameter("password");
            
            Account a =new Account();
            a.setEmail(email);
            a.setPhone(phone);
            a.setFirstname(fistname);
            a.setLastname(lastname);
            a.setGender(gender);
            a.setDob(dob);
            a.setPassword(password);
            adb.insertAccount(a);
        }
        response.sendRedirect("view/login.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
