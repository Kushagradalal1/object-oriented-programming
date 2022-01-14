public class ThisRefExample {

    private int x , y;
    
    public ThisRefExample(int a , int b){
        a=x;
        b=y;
        
    }
    
    public void show(){
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println("____________________________");
    }
    
    public static void main(String[] args) {
   
        ThisRefExample d1=new ThisRefExample(10,20);
        ThisRefExample d2=new ThisRefExample(30,40);

        d1.show();
        d2.show();
    }
}
