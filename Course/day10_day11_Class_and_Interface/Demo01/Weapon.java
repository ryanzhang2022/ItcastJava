package cn.itcast.day11.demo01;

public class Weapon {
    private String name;  // 武器的名字
    private int hurt;  // 武器的伤害值

    public Weapon() {
    }

    public Weapon(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
