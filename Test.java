public class Test {

    //instant variable..    
    private int x,y;
    
    public Test(int a , int b){
        x=a;
        y=b;
        
    }
    
    public void show(){
        System.out.println(x+","+y);
    }
    public static void main(String[] args) {
   
        Test t1;
        new Test(10,20);
        Test t2=new Test(30,40);
        Test t3=t2;
        t1=t2;
        System.out.println(t1.x+","+t1.y);
        System.out.println(t2.x+","+t2.y);
        System.out.println(t3.x+","+t3.y);
    }
    
}
