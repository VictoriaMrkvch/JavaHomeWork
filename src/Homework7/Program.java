package Homework7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        System.out.println("Enter your string");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Sentence sentence = new Sentence();
        sentence.setSentence(string);
        sentence.oneSpace();
        sentence.theLongestWord();
        sentence.reverseOrder();

        String pattern = "^\\$[0-9]+(\\.[0-9][0-9])?";
        String text = "$5467.85";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()));
        }

    }
}
