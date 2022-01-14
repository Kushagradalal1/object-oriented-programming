/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class SumOfNNaturalNumber {
    
    
    public static int getsum(int n){
        if(n==0)
           return 0;
           
        return n+getsum(n-1);      
        
    }
    public static void main(String[] args) {
        
        int n=5;
        System.out.println(getsum(n));
    }
}
