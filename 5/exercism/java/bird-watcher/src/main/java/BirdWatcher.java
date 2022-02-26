
class BirdWatcher {

    public static void main(String... args){
        System.out.println();

        int [] birdsPerday = {2,5,0,7,4,1};
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerday);
        System.out.println();

        System.out.println(birdWatcher.getToday());
        birdWatcher.incrementTodaysCount();

        System.out.println(birdsPerday[birdsPerday.length-1]);
        System.out.println();

        System.out.println(birdWatcher.getCountForFirstDays(4));

        System.out.println(birdWatcher.getBusyDays());




    }

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");

        int [] lastWeek = getLastWeek();
        if (lastWeek.length == 0)
            return 0;
        else
            return this.birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] = getToday()+1;
    }

    public boolean hasDayWithoutBirds() {
        boolean dayWithoutBirds = false;
        for (int i: birdsPerDay) {
            if (i == 0) dayWithoutBirds = true;
        }
        return dayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if (numberOfDays >= birdsPerDay.length){
            for (int i = 0; i < birdsPerDay.length; i++) {
                sum = sum + birdsPerDay[i];
            }
        }
        else{
            for (int i = 0; i < numberOfDays ; i++) {
                sum = sum + birdsPerDay[i];
            }
        }
        return sum;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        int countBusyDay = 0;

        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5){
                countBusyDay += 1;
            }
        }

        return countBusyDay;
    }
}
