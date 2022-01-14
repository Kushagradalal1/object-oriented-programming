public class Sumdigit {

    public static int getSum(int n){
        if(n==0)
            return 0;
        else
        return getSum(n/10)+n%10;
    }
    public static void main(String[] args) {
   
        int n = 537;
        System.out.println(getSum(n));

    }
    
}
