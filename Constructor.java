public class Constructor {

    Constructor(){
    
        System.out.println("Zero-args Constructor");
    };        
    Constructor(int a){
        System.out.println("One-args Constructor");
    
    };   
    Constructor(String s){
        System.out.println("One String-args Constructors..");
    }
    Constructor(int a , int b){
    
        System.out.println("Two-args Constructors..");
    };
    
    public static void main(String[] args) {
   
        Constructor c1=new Constructor();
        Constructor c2=new Constructor(10);
        //Constructor c3=new Constructor("indore","kushagra");
        Constructor c4=new Constructor(10,20);
        //error Constructor c5=new Constructor(10,20,30);
        

    }
}
