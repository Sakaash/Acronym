import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence to be converted to acronym : ");
        String str = scanner.nextLine();
        String acronym = acronym(str);
        System.out.println(acronym);
    }

    private static String acronym(String str) {
        StringBuilder acro = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(flag && Character.isAlphabetic(ch)) {
                if(ch>'Z'){
                    ch-=32;
                }
                acro.append(ch);
                flag = false;
            }
            else if(ch == ' '||ch == '-') {
                flag = true;
            }
        }
        return acro.toString();
    }
}
