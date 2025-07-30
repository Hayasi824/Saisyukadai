public abstract class Character implements Creature {
    private String name;
    private int hp;


    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }


    @Override
    public final boolean isAlive() {
        return this.hp > 0;
    }

    public void showStatus() {
        System.out.println(this.getName() + "HP:" + this.getHp());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}
