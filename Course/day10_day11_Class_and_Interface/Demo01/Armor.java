package cn.itcast.day11.demo01;

public class Armor {
    String name;   // 防具的名字
    int protect;  // 防具的防御值

    public Armor() {
    }

    public Armor(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
