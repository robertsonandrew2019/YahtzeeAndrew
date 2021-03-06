import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        //int[] dice = new int[5];
        //int[] dice = {1, 3, 5, 2, 6}; //A
        //int[] dice = {2, 2, 2, 3, 2}; //B
        //int[] dice = {1, 1, 1, 1, 1}; //C
        //int[] dice = {2, 3, 4, 6, 1}; //D
        //int[] dice = {2, 2, 4, 2, 4}; //E
        //int[] dice = {1, 5, 5, 2, 6}; //F
        int[] dice = {5, 5, 2, 5, 1}; //G

        /*for (int i = 0; i < dice.length; i++) {
            dice[i] = rand.nextInt(6) + 1;
        }*/
        java.util.Arrays.sort(dice);
        for(int i = 0; i < dice.length; i++) {
            System.out.printf("%d ", dice[i]);
        }
        System.out.printf("\n");

        aces(dice);
        twos(dice);
        threes(dice);
        fours(dice);
        fives(dice);
        sixes(dice);
        threeOfAKind(dice);
        fourOfAKind(dice);
        fullHouse(dice);
        smallStraight(dice);
        largeStraight(dice);
        yahtzee(dice);
        chance(dice);
    }

    public static void aces(int[] dice) {
        int ace = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                ace++;
            }
        }
        System.out.printf("Aces: %d\n", ace);;
    }

    public static void twos(int[] dice) {
        int two = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 2) {
                two += 2;
            }
        }
        System.out.printf("Twos: %d\n", two);
    }

    public static void threes(int[] dice) {
        int three = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 3) {
                three += 3;
            }
        }
        System.out.printf("Threes: %d\n", three);
    }

    public static void fours(int[] dice) {
        int four = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 4) {
                four += 4;
            }
        }
        System.out.printf("Fours: %d\n", four);
    }

    public static void fives(int[] dice) {
        int five = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 5) {
                five += 5;
            }
        }
        System.out.printf("Fives: %d\n", five);
    }

    public static void sixes(int[] dice) {
        int six = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 6) {
                six += 6;
            }
        }
        System.out.printf("Sixes: %d\n", six);
    }

    public static void threeOfAKind(int[] dice) {
        int threeOfAKind = 0;
        boolean parameter = false;
        for (int i = 0; i < dice.length - 3; i++) {
            if ((dice[i] == dice[i + 1]) && (dice[i + 1] == dice[i + 2])) {
                parameter = true;
            }
        }
        if (parameter) {
            for (int j = 0; j < dice.length; j++) {
                threeOfAKind += dice[j];
            }
        }
        System.out.printf("Three of a Kind: %d\n", threeOfAKind);
    }

    public static void fourOfAKind(int[] dice) {
        int fourOfAKind = 0;
        boolean parameter = false;
        for (int i = 0; i < dice.length - 3; i++) {
            if ((dice[i] == dice[i + 1]) && (dice[i + 1] == dice[i + 2]) && (dice[i + 2] == dice[i + 3])) {
                parameter = true;
                }
            }
        if (parameter) {
        for (int j = 0; j < dice.length; j++) {
            fourOfAKind += dice[j];
            }
        }
        System.out.printf("Four of a Kind: %d\n", fourOfAKind);
    }

    public static void fullHouse(int[] dice) { //three of one nuber, 2 of another
        int fullHouse = 0;
        if ((((dice[0] == dice[1]) && (dice[1] == dice[2])) && (dice[2] != dice[3]) && (dice[3] == dice[4])) || ((dice[0] == dice[1]) && (dice[1] != dice[2]) && ((dice[2] == dice[3]) && (dice[3] == dice[4])))) {
            fullHouse = 25;
            }
        System.out.printf("Full House: %d\n", fullHouse);
    }

    public static void smallStraight(int[] dice) {
        int count = 1;
        int smallStraight = 0;
        for (int i = 0; i < dice.length - 1; i++) {
            if ((dice[i + 1] - dice[i]) == 1) {
                count++;
            }
        }
        if (count == 4) {
            smallStraight = 30;
        }
        System.out.printf("Small Straight: %d\n", smallStraight);
    }

    public static void largeStraight(int[] dice) {
        int count = 1;
        int largeStraight = 0;
        for (int i = 0; i < dice.length - 1; i++) {
            if ((dice[i + 1] - dice[i]) == 1) {
                count++;
            }
        }
        if (count == 5) {
            largeStraight = 40;
        }
        System.out.printf("Large Straight: %d\n", largeStraight);
    }

    public static void yahtzee(int[] dice) {
        int count = 0;
        int yahtzee = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[0] == dice[i]) {
                count++;
            }
            if (count == 5) {
                for (int j = 0; j < dice.length; j++){
                    yahtzee = 50;
                }
            }
        }
        System.out.printf("Yahtzee!: %d\n", yahtzee);
    }

    public static void chance(int[] dice){
        int chance = 0;
        for(int i = 0; i < dice.length; i++) {
            chance += dice[i];
        }
        System.out.printf("Chance: %d", chance);
    }
}
