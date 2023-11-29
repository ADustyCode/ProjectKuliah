public class ShorterDoubleDice {
    public static int dadu() {
        return (int)(Math.random()*(6-1+1)+1);
    }
    public static void main(String[] args) {
        int roll1, roll2;
        boolean sama = false;
        do{
            roll1 = dadu();
            roll2 = dadu();
            System.out.println("Roll #1: " + roll1);
            System.out.println("Roll #2: " + roll2);
            System.out.printf("The total is %d!\n", (roll1+roll2));
            sama = roll1 == roll2;
        }while (!sama);
    }
}
