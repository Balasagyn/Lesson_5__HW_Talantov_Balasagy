public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(200);
        boss.setHealth(1000);
        boss.setDefenceType("Uranium");

        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefenceType());
    }
}