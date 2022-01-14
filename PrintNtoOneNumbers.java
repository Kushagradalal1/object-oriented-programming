/*Print the number in reverse way such as example like if n=4 , then 4 3 2 1 upto one we have to print and Value of 
Nth should be n>=1 ..*/
public class PrintNtoOneNumbers {

    public static int fun(int n,int k){
       if(n==0) 
           return 0; 
       System.out.println(k);
       fun(n-1,k+1 );
       
       return 0;
        
    }
    public static void main(String[] args) {
   
        int n=10, k =1;
        fun(n, k);

    }
}
