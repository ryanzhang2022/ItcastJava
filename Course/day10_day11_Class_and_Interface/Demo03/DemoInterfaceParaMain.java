package cn.itcast.day11.demo04;

/*
有点类似于抢红包的例子, 创建一个接口用于对技能编号进行解析.
showSkill方法的传入参数类型是接口类型Skill
主方法中可以设置不同的解析方式, 从而showSkill调用analysisSkill抽象方法时得到不同的结果
 */
public class DemoInterfaceParaMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("亚瑟");
        hero.setSkillNo(1);

        Skill skill01 = new SkillOneImpl();
        hero.showSkill(skill01);

        Skill skill02 = new SkillTwoImp();
        hero.showSkill(skill02);
    }
}
