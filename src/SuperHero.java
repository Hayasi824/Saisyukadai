public class SuperHero extends Hero {
    public SuperHero(Hero hero) {
        super(hero.getName(),hero.getHp(),hero.getWeapon());
    }
    public void attack(Creature target) {
        System.out.println(this.getName() + this.getWeapon() + "攻撃" + target.getName() + "に25ダメージを与えた！");
        target.setHp(target.getHp() -25);
    }
}
