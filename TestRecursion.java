
public class TestRecursion {

    
    public static int fun(int n){
       if(n==0)
           return 0;
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
        return 0;
    }
    
    public static void main(String[] args) {
    
        fun(3);
        
    }
}
