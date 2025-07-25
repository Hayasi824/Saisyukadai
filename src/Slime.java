public final class Slime extends Monster {
    public Slime(int hp, char suffix) {
        super("スライム", hp, suffix);
    }
    public void attack(Creature target) {
        System.out.println(target.getName() + "は体当たり攻撃！" + target.getName() + "に5ダメージを与えた");
        target.setHp(target.getHp() -5);
    }
}