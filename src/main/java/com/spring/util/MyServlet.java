package com.spring.util;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Employee;

public class  MyServlet extends HttpServlet {



       @Override
      protected void doGet(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
            //    PrintWriter out = response.getWriter();


      }


       
	@Override
    public void init() throws ServletException {
              
                @SuppressWarnings("resource")
                ApplicationContext ac = new ClassPathXmlApplicationContext("resource-annotation.xml");

                Employee emp = ac.getBean("myemployee", Employee.class);
                System.out.println(emp.toString());

    }


      @Override
    public void destroy() {
    }


}
