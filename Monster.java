public class Monster {
    protected String name;
    protected int baseHp;
    public Monster(String name, int baseHp) {
        this.name = name;
        this.baseHp = baseHp;
    }
    public void monsterSound() {
        System.out.println("Grooaarrr! Monster mendekat!");
    }
}
