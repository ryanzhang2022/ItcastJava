package cn.itcast.day11.demo04;

public class SkillTwoImp implements Skill {
    @Override
    public String analysisSkill(int skillNum) {
        System.out.println("解析方案2");
        if (skillNum == 1){
            return "Pia~Pia~Pia~";
        }else{
            return "Biu~Biu~Biu~";
        }
    }
}
