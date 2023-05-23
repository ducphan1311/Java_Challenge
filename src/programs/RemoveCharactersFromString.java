package programs;

public class RemoveCharactersFromString {

    public static void main(String[] args) {
        String str = "(123)-456-78910";
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                str1 += ch;
            }
        }

        System.out.println("String: after remove all characters: " + str1);



//        String newString = str.replaceAll("[\\(\\)\\-]", "");
//        System.out.println("String: after remove all characters : " + newString);
//        //12345678910
    }
}
