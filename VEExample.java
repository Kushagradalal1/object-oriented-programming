public class VEExample {

    public static void city(String... items){
        for(String item:items){
            System.out.println(item);
        }
    }
    public static void add(double...v){
        double sum=0;
        for(double d: v)
        System.out.println("Addition of Double is : "+d);
    } 
    public static void add(int...v){
        int sum=0;
        for(int i=0; i<v.length; i++){
            sum=sum+v[i];
            
        }
        System.out.println("Addition of integer is : "+sum);
    }
    public static void main(String[] args) {
   
        city("indore"," banglore");
        city("barwani","manglore","manipal");
        
        
        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
        add(4,8,7,5,6,12);
        add(1.2,1.3,5.2,2.3);
        
    }
    
}
