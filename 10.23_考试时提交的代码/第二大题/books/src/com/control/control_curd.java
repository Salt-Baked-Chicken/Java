package com.control;

import com.Dao.*;

import java.util.Scanner;

import static java.lang.System.exit;

public class control_curd {
    public void c(){
        add_c a = new add_c();
        select_c s = new select_c();
        update_c u = new update_c();
        delete_c d = new delete_c();
        s_from_name ss = new s_from_name();
        Scanner input = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("查询图书 按1");
        System.out.println("增加图书 按2");
        System.out.println("删除图书 按3");
        System.out.println("修改图书 按4");
        System.out.println("根据图书编号名称查询图书信息 按5");
        System.out.println("推出系统 按0");
        System.out.println("=================================");
        int p = input.nextInt();
        switch (p){
            case 0:
                exit(0);
                System.out.println("成功推出");
            case 1:
                s.s();
                c();
            case 2:
                System.out.println("输入你想增加的图书名");
                String c = input.next();
                System.out.println("输入你想增加的作者名");
                String b = input.next();
                a.add_book(c,b);
                c();
            case 3:
                System.out.println("输入你想删除的图书名");
                String pa = input.next();
                d.de(pa);
                c();
            case 4:
                System.out.println("输入你想原本的书名");
                String au = input.next();
                System.out.println("输入你想修改的作者名");
                String ua = input.next();
                u.update(au,ua);
                c();

            case 5:
                System.out.println("输入你想查询的书名");
                String sss = input.next();
                ss.s(sss);
                c();
        }
    }
}
