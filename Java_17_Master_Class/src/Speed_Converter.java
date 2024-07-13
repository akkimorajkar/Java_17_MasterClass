public class Speed_Converter {

    public static void main(String[] args) {

        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        long milesPerHour = 0;
        double milesPerHour1 = 0;
        if (kilometersPerHour < 0) {

            milesPerHour = -1;

        } else {

            milesPerHour1 = (kilometersPerHour * 0.621371);

            milesPerHour = Math.round(milesPerHour1);
        }

        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour > 0) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

        } else {
            System.out.println("Invalid number");
        }

    }
}
