public class Wizard extends Character {
    private int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + this.getHp() + " は火の玉をとなえた! " + target.getName() + "に3ダメージを与えた！");
        target.setHp(this.getHp() - 3);
        this.setHp(this.getHp() - 1);

    }
    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
}
