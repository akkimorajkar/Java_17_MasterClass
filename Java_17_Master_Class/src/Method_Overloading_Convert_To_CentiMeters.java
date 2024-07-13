public class Method_Overloading_Convert_To_CentiMeters {

    public static void main(String[] args) {

        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5 ,8));

    }

    public static double convertToCentimeters(int heightInInches){

        return  heightInInches * 2.54;

    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches){

        return  convertToCentimeters(heightInInches) + (heightInFeet * 30.48);

    }

}
