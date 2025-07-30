import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<>();
        Hero hero = new Hero("勇者", 100,  "バスターソード");
        Wizard wizard = new Wizard("魔法使い",60, 30);
        Thief thief = new Thief("アーチャー", 70);
        party.add(hero);
        party.add(wizard);
        party.add(thief);

        ArrayList<Monster> monsters = new ArrayList<>();
        Goblin goblin = new Goblin(50,'A');
        Matango matango = new Matango(45, 'A');
        Slime slime = new Slime(40, 'A');
        monsters.add(goblin);
        monsters.add(matango);
        monsters.add(slime);

        System.out.println("---味方パーティ---");
        for (Character ch : party) {
            ch.showStatus();

        }


        System.out.println("---敵グループ---");
        for (Monster mon : monsters) {
            mon.showStatus();
        }

        System.out.println("味方の総攻撃！");
        for (Character ch : party) {
            for (Monster mon : monsters) {
                ch.attack(mon);

            }
        }
        System.out.println("敵の総攻撃!");
        for (Monster mon : monsters) {
            for (Character ch : party) {
                mon.attack(ch);
            }
        }

        System.out.println("ダメージを受けた勇者が突然光りだした！");
        System.out.println("勇者はスーパーヒーローに進化した!");
        SuperHero superHero = new SuperHero(hero);
        party.set(0, superHero);
        for (Monster mon : monsters) {
            superHero.attack(mon);
        }

        System.out.println("---味方パーティ最終ステータス---");
        for (Character ch :party) {
            ch.showStatus();
            if (ch.isAlive()) {
                System.out.println("製造状況:生存");
            } else {
                System.out.println("生存状況:死亡");
            }
        }
        System.out.println("---敵グループ最終ステータス---");
        for (Monster mon :monsters) {
            mon.showStatus();
            if (mon.isAlive()) {
                System.out.println("生存状況:生存");
            } else {
                System.out.println("生存状況:死亡");
            }
        }















    }

    
}
