import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String phrase = in.nextLine();
        String Phrase = phrase.toLowerCase();
        Phrase = Phrase.replaceAll(" ", "");
        Phrase = Phrase.replaceAll(",", "");

        int mark = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (Phrase.charAt(i) == Phrase.charAt(phrase.length() - 1 - i)) {
                mark += 1;
            }
        }

        if (mark == Phrase.length()) {
            System.out.println("Конгратс. Палиндром пойман");
        } else {
            System.out.println("Анлаки, брат");
        }

    }
}