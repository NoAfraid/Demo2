package com.controller;

import com.pojo.ST;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
@RequestMapping("student")
@ResponseBody
public class StudentController{
//    @Resource
//    private IStudentService studentService;
    @RequestMapping("index")
    public String index()  {
        return "index.jsp";
    }
    @RequestMapping("login")
    public String login(ST registerUser){
//        ST user=  this.studentService.insertByEmail(registerUser.getEmail());
//        noinspection SpringMVCViewInspection
        return "login";
    }
}
