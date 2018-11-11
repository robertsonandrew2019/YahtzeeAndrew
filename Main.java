import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] dice = new int[5];

        for (int i = 0; i < dice.length; i++) {
            dice[i] = rand.nextInt(6) + 1;
        }
        java.util.Arrays.sort(dice);

        for(int i = 0; i < dice.length; i++) {
            System.out.printf("%d ", dice[i]);
        }
        System.out.printf("\n");

        int aces = aces(dice); System.out.printf("Aces: %d\n", aces);
        int twos = twos(dice); System.out.printf("Twos: %d\n", twos);
        int threes = threes(dice); System.out.printf("Threes: %d\n", threes);
        int fours = fours(dice); System.out.printf("Fours: %d\n", fours);
        int fives = fives(dice); System.out.printf("Fives: %d\n", fives);
        int sixes = sixes(dice); System.out.printf("Sixes: %d\n", sixes);
        int threeOfAKind = threeOfAKind(dice); System.out.printf("Three of a Kind: %d\n", threeOfAKind);
        int fourOfAKind = fourOfAKind(dice); System.out.printf("Four of a Kind: %d\n", fourOfAKind);
        int fullHouse = fullHouse(dice); System.out.printf("Full House: %d\n", fullHouse);
        int smallStraight = smallStraight(dice); System.out.printf("Small Straight: %d\n", smallStraight);
        int largeStraight = largeStraight(dice); System.out.printf("Large Straight: %d\n", largeStraight);
        int yahtzee = yahtzee(dice); System.out.printf("Yahtzee!: %d\n", yahtzee);
        int chance = chance(dice); System.out.printf("Chance: %d", chance);
    }

    public static int aces(int[] dice) {
        int ace = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                ace++;
            }
        }
        return ace;
    }

    public static int twos(int[] dice) {
        int two = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 2) {
                two += 2;
            }
        }
        return two;
    }

    public static int threes(int[] dice) {
        int three = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 3) {
                three += 3;
            }
        }
        return three;
    }

    public static int fours(int[] dice) {
        int four = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 4) {
                four += 4;
            }
        }
        return four;
    }

    public static int fives(int[] dice) {
        int five = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 5) {
                five += 5;
            }
        }
        return five;
    }

    public static int sixes(int[] dice) {
        int six = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 6) {
                six += 6;
            }
        }
        return six;
    }

    public static int threeOfAKind(int[] dice) {
        int threeOfAKind = 0;
        for (int i = 0; i < dice.length - 3; i++) {
            if (dice[i] == dice[i + 1] && dice[i + 1] == dice[i + 2]) {
                for (int j = 0; j < dice.length; j++) {
                    threeOfAKind += dice[j];
                }
            }
        }
        return threeOfAKind;
    }

    public static int fourOfAKind(int[] dice) {
        int fourOfAKind = 0;
        for (int i = 0; i < dice.length - 3; i++) {
            if (dice[i] == dice[i + 1] && dice[i + 1] == dice[i + 2] && dice[i + 2] == dice[i + 3]) {
                for (int j = 0; j < dice.length; j++) {
                    fourOfAKind += dice[j];
                }
            }
        }
        return fourOfAKind;
    }

    public static int fullHouse(int[] dice) { //three of one nuber, 2 of another
        int fullHouse = 0;
        if ((((dice[0] == dice[1]) && (dice[1] == dice[2])) && (dice[3] == dice[4])) || ((dice[0] == dice[1]) && ((dice[2] == dice[3]) && (dice[3] == dice[4])))) {
            fullHouse = 25;
            }
        return fullHouse;
    }

    public static int smallStraight(int[] dice) {
        int count = 0;
        int smallStraight = 0;
        for (int i = 0; i < dice.length - 1; i++) {
            if ((dice[i + 1] - dice[i]) == 1) {
                count++;
            }
        }
        if (count == 4) {
            smallStraight = 30;
        }
        return smallStraight;
    }

    public static int largeStraight(int[] dice) {
        int count = 0;
        int largeStraight = 0;
        for (int i = 0; i < dice.length - 1; i++) {
            if ((dice[i + 1] - dice[i]) == 1) {
                count++;
            }
        }
        if (count == 5) {
            largeStraight = 40;
        }
        return largeStraight;
    }

    public static int yahtzee(int[] dice) {
        int count = 0;
        int yahtzee = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[0] == dice[i]) {
                count++;
            }
            if (count == 5) {
                for (int j = 0; j < dice.length; j++){
                    yahtzee += dice[j];
                }
            }
        }
        return yahtzee;
    }

    public static int chance(int[] dice){
        int chance = 0;
        for(int i = 0; i < dice.length; i++) {
            chance += dice[i];
        }
        return chance;
    }
}
