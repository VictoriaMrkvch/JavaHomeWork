package Homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    String sentence;

    public Sentence() {
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    public void theLongestWord(){
        String []array = sentence.split(" ");
        System.out.println();
        int max = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if(array[i].length()>max){
                max = array[i].length();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i].length()==max){
                System.out.println("The longest word: "+array[i]);
                System.out.println("The number of its letters: "+max);
            }
        }
    }

    public void reverseOrder(){
        String []array = sentence.split(" ");
        array[1] = new StringBuffer(array[1]).reverse().toString();
        System.out.println(array[1]);
    }
    public void oneSpace(){
        String pattern = "[a-zA-Z]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);
        while (m.find()){
            System.out.print(sentence.substring(m.start(),m.end())+" ");
        }
    }

}
