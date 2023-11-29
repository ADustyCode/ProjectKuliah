public class EvennessFunction {
    public static void main(String[] args) {
        for (int i=1;i < 21; i++){
            System.out.print(i);
            if (isDivisibleBy3(i) && isEven(i)){
                System.out.print(" <=");
            }
            else if (isEven(i)){
                System.out.print(" <");
            }
            else if (isDivisibleBy3(i)){
                System.out.print(" =");
            }
            System.out.println();
        }
    }

    public static boolean isEven( int n ){
        return (n%2==0);
    }
    public static boolean isDivisibleBy3( int n ){
        return (n%3==0);
    }
}
