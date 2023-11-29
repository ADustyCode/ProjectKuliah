public class NoticingEvenNumbers {
    public static void main(String[] args) {
        String even = "";
        for (int x = 1; x <= 20; x++){
            even = "";
            if (x % 2 == 0){
                even = " <";
            }
            System.out.println(x + even);
        }
    }
}
