package cn.itcast.day11.demo01;

public class Role {
    // 定义一个角色类
    // 基本数据类型
    private int id;
    private String name;
    private int blood;

    // 引用类型, 自己创建的类
    // weapon/armor...
    private Weapon weapon;
    private Armor armor;

    public Role() {
    }

    public Role(int id, int blood, String name, Weapon weapon, Armor armor) {
        this.id = id;
        this.name = name;
        this.blood = blood;
        this.weapon = weapon;
        this.armor = armor;
    }

    // 成员方法
    public void attack(){
        System.out.println("ID为" + id + "的" + name + "用" + getWeapon().getName() + "发起攻击");
        System.out.println("给对方造成了" + weapon.getHurt() + "点伤害");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
