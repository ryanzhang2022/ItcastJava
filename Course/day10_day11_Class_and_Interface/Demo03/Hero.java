package cn.itcast.day11.demo04;

public class Hero {
    private String name;
    private int skillNo;

    public Hero() {
    }

    public Hero(String name, String skill, int skillNo) {
        this.name = name;
        this.skillNo = skillNo;
    }

    public void showSkill(Skill skill){  // 传入Skill接口的一个实现子类对象, 返回一个String
        String skillStr = skill.analysisSkill(skillNo);
        System.out.println("技能编号: " + skillNo + "----技能名: " + skillStr );
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkillNo() {
        return skillNo;
    }

    public void setSkillNo(int skillNo) {
        this.skillNo = skillNo;
    }
}
