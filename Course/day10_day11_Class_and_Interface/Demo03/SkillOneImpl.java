package cn.itcast.day11.demo04;

public class SkillOneImpl implements Skill {
    @Override
    public String analysisSkill(int skillNum) {
        System.out.println("解析方案1:");
        if (skillNum == 1){
            return "Biu~Biu~Biu~";
        }else {
            return "Pia~Pia~Pia~";
        }
    }
}
