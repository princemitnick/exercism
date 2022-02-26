public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //throw new UnsupportedOperationException("Please implement the AssemblyLine.productionRateperHour() method");
        double rate = 0.0d;

        if (speed <= 0 || speed > 10){
            rate = 0.0d;
        }
        else if (speed >= 1 && speed <= 4 ){
            rate = speed * 221 * 1;
        }
        else if (speed >= 5 && speed <= 8){
            rate = speed * 221 * 0.9;
        }
        else if (speed == 9){
            rate = speed * 221 * 0.8;
        }
        else {
            rate = speed * 221 * 0.77;
        }

        return rate;
    }

    public static int workingItemsPerMinute(int speed) {
        int productedPerMin = 0;

        if (speed <= 0 || speed > 10){
            productedPerMin  = 0;
        }
        else if (speed >= 1 && speed <= 4 ){
            productedPerMin = (int) (speed * 221 * 1)/60;
        }
        else if (speed >= 5 && speed <= 8){
            productedPerMin = (int) (speed * 221 * 0.9)/60;
        }
        else if (speed == 9){
            productedPerMin = (int) (speed * 221 * 0.8)/60;
        }
        else {
            productedPerMin = (int) (speed * 221 * 0.77)/60;
        }


        return productedPerMin;
    }


}
