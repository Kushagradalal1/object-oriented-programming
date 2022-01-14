
public class OneToN {
 
    public static int fun(int n){
    
       if(n==0) 
           return 0;
       fun(n-1); 
       System.out.println(n);
       return 0;
            
    }
   
    public static void main(String[] args){
   
        int n=4;
        fun(n);
        

    }
}
