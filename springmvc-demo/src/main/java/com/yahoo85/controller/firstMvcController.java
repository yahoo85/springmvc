package com.yahoo85.controller;



import com.yahoo85.annotation.demoController;
import com.yahoo85.annotation.demoRequestMapping;
import com.yahoo85.annotation.demoRequestParam;

import java.io.IOException;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;


@demoController

@demoRequestMapping("/test")
public class firstMvcController {

    @demoRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @demoRequestParam("param") String param) {
        System.out.println(param);
        try {
            response.getWriter().write("doTest method success! param:" + param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @demoRequestMapping("/doTest2")
    public void test2(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().println("doTest2 method success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}