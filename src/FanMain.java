public class FanMain {
    public static void main(String[] args) {
        Fan newFan_1 = new Fan();
        newFan_1.setRadius(10);
        newFan_1.setSpeed(newFan_1.FAST);
        newFan_1.setColor("yellow");
        newFan_1.setOn(true);

        Fan newFan_2 = new Fan();
        newFan_2.setRadius(5);
        newFan_2.setSpeed(newFan_2.MEDIUM);
        newFan_2.setColor("blue");
        newFan_2.setOn(false);

        System.out.println(newFan_1.getInfo());
        System.out.println(newFan_2.getInfo());
    }
}
