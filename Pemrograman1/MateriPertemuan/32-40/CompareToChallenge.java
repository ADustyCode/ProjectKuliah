public class CompareToChallenge {
    public static void main(String[] args) {
        String str1 = "Lah", str2 = "Iya", str3 = "Kenapa", str4 = "Gatau", str5 = "Yaudah", str6 = "Sembarangan", str7 = "Nahlo";

        System.out.print("Comparing \"Lah\" with \"Iya\" produces ");
        System.out.println(str1.compareTo(str2) );
        System.out.print("Comparing \"Iya\" with \"Lah\" produces ");
        System.out.println(str2.compareTo(str1) );
        System.out.print("Comparing \"Kenapa\" with \"Iya\" produces ");
        System.out.println(str3.compareTo(str2) );
        System.out.print("Comparing \"Kenapa\" with \"gatau\" produces ");
        System.out.println(str3.compareTo(str4) );
        System.out.print("Comparing \"Nahlo\" with \"Yaudah\" produces ");
        System.out.println(str7.compareTo(str5) );
        }
}
