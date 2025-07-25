public class Matango extends Monster {
    public Matango(String getName,int getHp,char suffix) {
        super("おばけきのこ",getHp,suffix);

    }

    public void attack(Creature target) {
        System.out.println(target.getName() + "は体当たり攻撃！" + target.getName() + "に6ダメージをあたえた！");
        target.setHp(target.getHp() -6);
    }
}
