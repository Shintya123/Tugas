public class Dragon extends Monster {
    private int fireDamage;
    public Dragon(String name, int baseHp, int fireDamage) {
        super(name, baseHp);
        this.fireDamage = fireDamage;
    }
    @Override
    public void monsterSound() {
        System.out.println("ROOAAR! Naga menyemburkan api!");
    }
}
