package Crypto.scr;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    Character cs;
    Character cf;
    int shift;
    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this cf = cf;
        this.shift = cf.charValue() - cs.charValue();
    }

    ROT13() { }

    public String crypt(String text) throws UnsupportedOperationException {

        String result = "";
        char alphabet = text.charAt(i);
        for(int i = 0; i < text.length(); i++){
            alphabet = text.charAt(i);
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){ //for lowercase
                alphabet = (char) (text.charAt(i) + shift);
                if alphabet > 'z'){
                    alphabet = (char) (alphabet - 26);
                }
                result += alphabet;
            }else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){ //for uppercase
                alphabet = (char) (text.charAt(i)) + shift);
                if (alphabet > 'Z'){
                    alphabet = (char) (alphabet- 26);
            }
            result += alphabet;
            }else
                result += alphabet
        }
        return result;
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        String result1 = "";
        String result2 = "";
        int shift = c.charValue() - 65;
        for (int i = 0; i < shift; i++){
            char alphabet = s.charAt(i);
            alphabet = (char) (s.charAt(i));
            result += alphabet;
        }
        return result1 + result2;
    }

}
