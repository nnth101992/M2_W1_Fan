public class Fan {
    public Fan() {
    }

    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;

    private int speed = SLOW;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public boolean getOn() {
        return status;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setOn(boolean on) {
        status = on;
    }

    public void setSpeed(int fanSpeed) {
        speed = fanSpeed;
    }

    public void setRadius(double fanRadius) {
        radius = fanRadius;
    }

    public void setColor(String fanColor) {
        color = fanColor;
    }

    public String getInfo() {
        if (status) {
            return "Status: " + getOn() + ", Radius: " + getRadius() + ", Speed: " + getSpeed() + ", Color: " + getColor() + ", This fan is on;";
        } else {
            return "Status: " + getOn() + ", Radius: " + getRadius() + ", Speed: " + getSpeed() + ", Color: " + getColor() + ", This fan is off;";
        }
    }
}
