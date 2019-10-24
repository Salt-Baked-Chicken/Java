package com.control;

import com.bean.Adminasin;

import java.util.Scanner;

import static java.lang.System.exit;

public class logic_main {
    int many = 1;
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("欢迎来到图书馆管理系统：）");
        System.out.println("话说这次考试的代码量真的是多的好过分呢:（");
        System.out.println("=======================================");
        System.out.println("请大胆的输入账号吧，长度三位，超三自爆");
        String login = input.next();
        System.out.println("请大胆的输入密码吧，错三次也自爆");
        String psw = input.next();
        Adminasin l = new Adminasin();
        if (many == 3){
            System.out.println("你登陆超过三次，爆了,禁止登陆");
            exit(0);
        }else{
            if (login.equals(l.getId()) && psw.equals(l.getPsw())){
                System.out.println("恭喜你登陆成功");
                control_curd c = new control_curd();
                c.c();
            }else{
                System.out.println(l.getId());
                System.out.println(l.getPsw());
                System.out.println("登陆失败");
                System.out.println("过分了啊老铁，你居然想测试登录次数");
                many++;
                login();
            }
        }
    }
}
