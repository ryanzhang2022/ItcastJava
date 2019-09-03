package cn.itcast.day09.demo03;

import java.awt.*;
import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        // 创建群主对象
        Manager manager = new Manager("群主", 100);
        // 创建群友
        Member m1 = new Member("成员1", 0);
        Member m2 = new Member("成员2", 0);
        Member m3 = new Member("成员3", 0);

        // 显示一遍金额
        manager.show();
        m1.show();
        m2.show();
        m3.show();
        System.out.println("=============");

        // 发红包
        ArrayList<Integer> redList = manager.send(20, 3);
        // 收红包
        m1.receive(redList);
        m2.receive(redList);
        m3.receive(redList);

        // 再显示一遍金额
        manager.show();
        m1.show();
        m2.show();
        m3.show();

    }
}
