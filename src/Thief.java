public class Thief extends Character {
    public Thief(String name, int hp) {
        super(name, hp);
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + " 素早く攻撃し " + target.getName() + "に5ダメージを与えた！");
        target.setHp(this.getHp() - 5);
    }
}
