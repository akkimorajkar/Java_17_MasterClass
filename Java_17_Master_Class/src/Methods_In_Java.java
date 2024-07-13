public class Methods_In_Java {

    public static void main(String[] args) {

        boolean gameOver = true;
        int yourScore = 5;
        int levelCompleted = 1;
        int yourFinalScore = yourScore;

        scoreCalculator1(gameOver, yourScore, levelCompleted, yourFinalScore);

        int highestScore = scoreCalculator2(gameOver, yourScore, levelCompleted, yourFinalScore);
        System.out.println("This is the highest score " + highestScore);

        int playerRank1  = calculateHighScorePosition(1500);
        displayHighScorePosition("Akki", playerRank1);

        int playerRank2  = calculateHighScorePosition(1000);
        displayHighScorePosition("Akki", playerRank2);

        int playerRank3  = calculateHighScorePosition(500);
        displayHighScorePosition("Akki", playerRank3);

        int playerRank4  = calculateHighScorePosition(100);
        displayHighScorePosition("Akki", playerRank4);

        int playerRank5  = calculateHighScorePosition(25);
        displayHighScorePosition("Akki", playerRank5);

        System.out.println("--------------------------------------------------------------");


        int playerRank6  = calculateHighScorePositionOptimized(1500);
        displayHighScorePosition("Akki", playerRank6);


        int playerRank7  = calculateHighScorePositionOptimized(1000);
        displayHighScorePosition("Nishad", playerRank7);


        int playerRank8 = calculateHighScorePositionOptimized(500);
        displayHighScorePosition("Murali", playerRank8);


        int playerRank9  = calculateHighScorePositionOptimized(100);
        displayHighScorePosition("Golu", playerRank9);

        int playerRank10  = calculateHighScorePositionOptimized(25);
        displayHighScorePosition("Golu", playerRank10);

    }

    public static void scoreCalculator1(boolean gameOver, int yourScore, int levelCompleted, int yourFinalScore) {

        if (gameOver) {

            yourFinalScore += (levelCompleted * yourScore) + 100;

            System.out.println("Your Final Score: " + yourFinalScore);

        }
    }

    // Same method withReturn Type

    public static int scoreCalculator2(boolean gameOver, int yourScore, int levelCompleted, int yourFinalScore) {

        if (gameOver) {

            yourFinalScore += (levelCompleted * yourScore) + 100;

        }

        return yourFinalScore;
    }

    public static void displayHighScorePosition(String playerName , int playerRankInHighScoreList){

        System.out.println(playerName + " Managed to get rank " + playerRankInHighScoreList + " in High Score List");

    }
    public static int calculateHighScorePosition(int playersScore){

        int result= 0;

        if (playersScore >=1000){
            result = 1;
        } else if (playersScore >=500 && playersScore <1000) {
            result = 2;
        } else if (playersScore >=100 && playersScore < 500) {
            result = 3;
        }else {
            result = 4;
        }
        return result;
    }

    public static int calculateHighScorePositionOptimized(int playersScore){

        int result= 4;

        if (playersScore >=1000){
            result = 1;
        } else if (playersScore >=500) {
            result = 2;
        } else if (playersScore >=100) {
            result = 3;
        }
        return result;
    }
}
