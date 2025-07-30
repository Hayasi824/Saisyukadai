import javax.print.attribute.HashPrintJobAttributeSet;

public abstract class Monster implements Creature {
    private String name;
    private int hp;
    private char suffix;


    public Monster(String name, int hp, char suffix) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }

    public final boolean isAlive() {
        return hp > 0;
    }

    public  void showStatus() {
        System.out.println(this.name  + suffix + " HP:" + hp);

    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public char getSuffix() {
        return suffix;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
}
