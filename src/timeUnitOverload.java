public class timeUnitOverload {

    public static void main(String[] args) {
        String totalTime = timeConversion(122,30) + " and " + timeConversion(66);
        System.out.println(totalTime);
    }

    //hours minutes seconds
    public static String timeConversion (int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "invalid value";
        } else{
            int hours = minutes/60;
            int remainingMinutes = minutes % 60;
            return (hours + " hours " + remainingMinutes + " minutes " + seconds + " seconds" );
        }
    }

    //minutes and seconds
    public static String timeConversion (int seconds){
        if (seconds<0){
            return ("invalid value");

        } else {
            int conversionToMinutes = seconds/60;
            int remainingSeconds = seconds % 60;
            return timeConversion(conversionToMinutes,remainingSeconds);
        }
    }

}
