public class If_Else_Else_If {

    public static void main(String[] args) {

        int score = 2000;
        int HighestScore = 5000;
        int lowestScore = 500;
        int averageScore = 2000;

        if (score <= lowestScore){

            System.out.println("Your score is very low " + score);

        } else if (score >= HighestScore) {

            System.out.println("Your score is very high " + score);

        }
        else{

            System.out.println("Your score is average " + score);
        }

    }

}
