package cn.itcast.day11.demo02;

public class Hero {
    // 创建的一个英雄类
    private String name;  // 英雄的名字
    private Skill skill;  // 英雄的技能

    // 构造方法
    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    // 类的成员方法
    public void releaseSkill(){
        System.out.println(name + "正在施放技能");
        skill.use();
        System.out.println("技能施放完毕");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
