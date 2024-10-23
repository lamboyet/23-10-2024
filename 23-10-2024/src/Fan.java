public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    Fan(String make, double radius, String color){this.make = make; this.radius=radius; this.color = color;}

    public void switchOn(){this.isOn = true;}

    public void switchOff(){this.isOn = false;}

    void changeSpeed(byte howMuch){this.speed += howMuch;}

    @Override
    public String toString() {
        return "Fan{" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }
}
