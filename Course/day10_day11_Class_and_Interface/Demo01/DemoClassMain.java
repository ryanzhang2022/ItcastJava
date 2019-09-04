package cn.itcast.day11.demo01;
 // Weapon类作为成员变量
public class DemoClassMain {
    public static void main(String[] args) {
        // 创建一个英雄角色
        Role role = new Role();
        // 设置角色id
        role.setId(10001);
        //设置角色血量
        role.setBlood(100);
        // 设置角色姓名
        role.setName("盖伦");
        // 创建一把武器
        Weapon weapon = new Weapon("AK-47", 15);
        // 将创建的武器设置给角色
        role.setWeapon(weapon);

        role.attack();

    }
}
