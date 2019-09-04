package cn.itcast.day11.demo02;

// 接口Skill作为成员变量
public class DemoInterfaceMain {
    public static void main(String[] args) {
        // 创建一个英雄
        Hero hero = new Hero();
        // 设置英雄名字
        hero.setName("盖伦");

        // 创建技能接口的实现子类
        // 使用多态
        // 为英雄设置技能A
        hero.setSkill(new SkillOneImpl());
        hero.releaseSkill();
        System.out.println("===========");

        // 换一种技能
        hero.setSkill(new SkillTwoImpl());
        hero.releaseSkill();
        System.out.println("===========");


        // 使用匿名内部类实现接口, 实现一种技能
        Skill SkillThreeImpl = new Skill() {
            @Override
            public void use() {
                System.out.println("Wa~Wa~Wa");
            }
        };
        // 设置技能
        hero.setSkill(SkillThreeImpl);
        hero.releaseSkill();
    }
}
