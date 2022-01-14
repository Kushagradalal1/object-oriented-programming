

public class Cuttingproblem {

    public static int cutting(int n, int a , int b , int c){
        
       if(n==0)
           return 0;
       if(n<=0)
           return -1;
       
       int res= max(cutting(n-a , a , b , c),cutting(n-b , a , b , c),cutting(n-c , a , b , c));
       
       if(res == -1)
           return -1;
       
       return res+1;
    }
    public static void main(String[] args) {
    
        int n=5 , a=4 , b=1 , c=2;
        System.out.println(cutting(n,a,b,c));
        
    }

    private static int max(int cutting, int cutting0, int cutting1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int max = cutting;
        if(cutting0 > max)
            max = cutting0;
        if(cutting1 > max)
            max = cutting1;
        return max;
                    
    }
}
