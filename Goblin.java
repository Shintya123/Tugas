public class Goblin extends Monster {
    public Goblin(String name, int baseHp) {
        super(name, baseHp);
    }
    @Override
    public void monsterSound() {
        System.out.println("Kikikik! Goblin mengendap-endap!");
    }
}
