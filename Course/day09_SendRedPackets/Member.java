package cn.itcast.day09.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    // 群友抢红包, 就是从redList随机的取一个, 得到金额加到自己的余额中, 并删除该元素
    public void receive(ArrayList<Integer> redList){
        // 得到一个随机索引值
        int index = new Random().nextInt(redList.size());
        // 获取该索引的红包金额, 并删除该元素
        int amountMoney = redList.remove(index);
        // 获取群友余额
        int leftMoney = getMoney();
        // 重设增加余额
        super.setMoney(leftMoney + amountMoney);
    }
}
