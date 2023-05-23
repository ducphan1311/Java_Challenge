package programs;

public class RemoveCharacter {

    public static void main(String[] args) {

        String str1 = "Hello World";
        String newString1 = str1.replace("World", "");
        System.out.println("String after removing 'World' = " + newString1);
        //Hello


        String str2 = "Hello World";
        String newString2 = str2.replaceFirst("o", "");
        System.out.println("String after removing first 'o' = " + newString2);
        //Hell World


        String str3 = "Hello World";
        char char1 = str3.charAt(0);
        char char2 = str3.charAt(6);
        System.out.println("String after replacing all small letters = " + char1 + " " + char2);
        //H W
    }
}
