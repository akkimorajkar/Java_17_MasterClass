public class Operator_Precendence_Challenge {

    public static void main(String[] args) {

        double var1 = 20.00 , var2 = 80.00;

        double remainder = ((var1+var2)*123)%40.00;

        System.out.println(remainder);

        boolean remainderValue = (remainder == 0.00) ? true : false;

        System.out.println(remainderValue);

        if(!remainderValue){
            System.out.println("Got Some remainder");
        }

    }
}
