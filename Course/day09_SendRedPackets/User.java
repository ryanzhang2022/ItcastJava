package cn.itcast.day09.demo03;

public class User {
    private String name;  // 姓名
    private int money;  // 余额

    public User() {  // 无参构造方法
    }

    public User(String name, int money) {  // 全参构造方法
        this.name = name;
        this.money = money;
    }

    // 展示一下用户有多少钱
    public void show(){
        System.out.println("姓名: " + name + ", 余额: " + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
