package com.yhl.aigou.web.controller;

import com.yhl.aigou.domain.Employee;
import com.yhl.aigou.util.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController 与controller的区别：他是controller和ResponseBody的合成
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    // RequestBody:接收请求的body中的参数
    public AjaxResult login( @RequestBody Employee employee){
        //登录进行判断名字是不是相同，是不是存在该用户
        /*
        * 假设数据
        * 根据前台传递过来的数据进行查找
        * select username， password from t_employee where username="admin"
        *查询出来的username：admin
        *          password：admin
        * */
        if("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setData("返回页面的数据");
        }else {
            return AjaxResult.me().setData(null).setSuccess(false).setMsg("登陆失败！");
        }
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "xxxx" ;
    }


}
