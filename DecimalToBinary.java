public class DecimalToBinary {

    public static int  fun(int n){
        if(n==0){
            return 0;
        }
        fun(n/2);
        System.out.println(n%2);
        return 0;
        
    }
    
    public static void main(String[] args) {
   
        fun(2);
        

    }
}
