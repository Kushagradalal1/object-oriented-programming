
public class VExamples {

    public static void add(int...v){
    
        int sum=0;
        for(int i=0; i<v.length; i++){
            sum=sum+v[i];
            
        }
        System.out.println("Sum = "+sum);
        
    }
    
    public static void main(String[] args) {
        add(10);
        add(1,2);
        add(10,20,30,40);
        add(10,20,30,40,50,60,70);
        add(10,20,30,40,90);
        add(10,20,30);
        
    }
    
}
