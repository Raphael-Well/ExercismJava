public class CarsAssemble {
    int productionPerHour = 221;
    public double productionRatePerHour(int speed) {
        if(speed >= 1 && speed <= 4){
            return 1.0 * productionPerHour * speed;
        } else if (speed >= 5 && speed <= 8) {
            return 0.9 * productionPerHour * speed;
        } else if (speed == 9) {
            return 0.8 * productionPerHour * speed;
        }else if (speed == 10) {
            return 0.77 * productionPerHour * speed;
        }else{
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)((this.productionRatePerHour(speed))/ 60);
    }
}
