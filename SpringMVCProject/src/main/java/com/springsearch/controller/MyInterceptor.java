package com.springsearch.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;


public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("This is Pre-Handler");
       /** String name = request.getParameter("user");
        if (name.startsWith("d")){
            response.setContentType("text/html");
            response.getWriter().println("<h1>Invalid Name ....Name should not start with "+name+"<h1>");
            return false;
        }*/

        String name = request.getParameter("user");
        PrintWriter out = response.getWriter();
        if (name.startsWith("p")){
            out.println("<h1>Sorry It can not be proceed because your name start with 'p' That`s means :"+name+"<h1>");
            out.flush();
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        System.out.println("This is Post-Handler");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        System.out.println("This is After Completion Method");
    }
}
