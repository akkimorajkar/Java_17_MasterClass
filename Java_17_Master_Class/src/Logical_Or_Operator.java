public class Logical_Or_Operator {

    public static void main(String[] args) {

        int myScore = 35;
        int topScore = 100;
        int averageScore = 85;
        int lowestScore = 35;
        if (myScore > averageScore && myScore <= topScore) {

            System.out.println(" Your score is average");

        }
        if (myScore < averageScore || myScore <= lowestScore) {

            System.out.println(" Your score is very low or below average");

        }
    }



}
