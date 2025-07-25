public class Goblin extends Monster {
    public Goblin(int hp, char suffix) {
        super("ゴブリン", hp, suffix);
    }
    public void attack(Creature target) {
        System.out.println(target.getName() + "はナイフで切りつけた！" + target.getName() + "に8ダメージを与えた");
        target.setHp(target.getHp() -8);
    }
}
