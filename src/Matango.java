public class Matango extends Monster {
    public Matango(int hp,char suffix) {
        super("おばけきのこ",hp,suffix);

    }

    public void attack(Creature target) {
        System.out.println(target.getName() + "は体当たり攻撃！" + target.getName() + "に6ダメージをあたえた！");
        target.setHp(target.getHp() -6);
    }
}
