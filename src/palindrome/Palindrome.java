/*
 * Jared Craig
 * 10/09/2018
 * Palindrome part 1
 */ 
package palindrome;
import javax.swing.*;
/**
 *
 * @author jacra1226
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palindrome = JOptionPane.showInputDialog("words that are the same forwards and backwards are caled palindromes This program determines if a words is a palindrome" + "\n Enter a word:"); 
                String palindromeCon = palindrome.toLowerCase();
                String reverse = "";
                
                for(int i = palindromeCon.length() - 1; i >= 0; i--)
        {
            reverse = reverse + palindromeCon.charAt(i);
        }
                if(reverse.equals(palindromeCon)){
        System.out.println(palindrome + " Is a palindrome"); 
                }
                else {
                    System.out.println(palindrome + " Isnt a palindrome"); 
                }
                    
    }
    
      

}
