/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class PalindromeCheckUsingRecursion {

    boolean isPalindrome(String str, int start, int end){
        if(start>=end)
            return true;
        
        return (str.charAt(start)==str.charAt(end))&&isPalindrome(str , start+1 , end-1);
        
        
    }
    
    public static void main(String[] args) {
        int n=5;
        
        PalindromeCheckUsingRecursion p1=new PalindromeCheckUsingRecursion();
        boolean b=p1.isPalindrome("greeks", 0, n-1);
        System.out.println(b);
    }
}
