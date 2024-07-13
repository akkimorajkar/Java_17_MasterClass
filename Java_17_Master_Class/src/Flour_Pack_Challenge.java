public class Flour_Pack_Challenge {
    public static void main(String[] args) {

        System.out.println(canPack (2, 2, 11));

    }

    public static boolean canPack(int bigCount , int smallCount , int target){

        if (target >=5 && target % (bigCount*5) == 0){

            return true;

        } else if (target >=5 && (bigCount*5)%target>0) {

            return ((target % (bigCount * 5)) <= smallCount);

        } else if (target<=5 && (target <= smallCount)) {

            return true;

        }

        else return false;

    }


}
