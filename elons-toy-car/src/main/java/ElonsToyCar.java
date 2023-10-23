import static java.lang.String.format;

public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
        return this.battery == 0 ? "Battery empty" : format("Battery at %d%%", this.battery);
    }

    public void drive() {
        updateDistance();
    }

    private void updateDistance(){
        if(this.battery != 0){
            this.distance += 20;
            updateBattery();
        }
    }

    private void updateBattery(){
        this.battery-- ;
    }
}
