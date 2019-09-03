package cn.itcast.day09.demo03;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    // 发红包
    public ArrayList<Integer> send(int sendMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();
        // 1. 检查是否超出余额
        int leftMoney = super.getMoney();

        if (sendMoney > super.getMoney()){
            System.out.println("余额不足");
            return redList;
        }

        // 2. 并从余额扣钱
        super.setMoney(leftMoney - sendMoney);

        // 3. 将钱平均分成n份
        int avg = sendMoney / count;
        int mod = sendMoney % avg;

        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        redList.add(avg + mod);

        return redList;


    }


}
