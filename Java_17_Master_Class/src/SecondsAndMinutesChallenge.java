public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

       System.out.println( getDurationString(5000));

    }

    public static String getDurationString(int howManySeconds){

        int minutes = howManySeconds/60;
        int hours = minutes/60;
        int minutesRemaining = minutes % 60;
        int seconds = howManySeconds % 60;

        String time = hours+"hh " +minutesRemaining+"m "+seconds+"s";

        return time;

    }

    public static String getDurationString(int howManyMinutes , int howManySeconds){

        int hours = howManyMinutes / 60;
        int minutes = howManyMinutes % 60;

        String time = hours+"hh " +minutes+"m "+howManySeconds+"s";

        return time;

    }

}
