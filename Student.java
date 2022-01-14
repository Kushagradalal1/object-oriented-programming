public class Student {

    //datas
    private int rollno;                         //data for an Object
    private String name;                        //data for an Object
    private int per;                     //data for Class
    private static int totalpassed;
    private static int totalfailed;
    

    public static void showAvg(Student... s){
       
        int sum=0;
        
        for(int i=0; i<=s.length; i++){
           
            sum=sum+s.length;
            
        }
        System.out.println("Average is : "+sum/s.length);
        
    }
    //members (Method)
/*    public static void showAvg(Student tmp1 , Student tmp2 ,Student tmp3){
        System.out.println("Average Percentage of "+tmp1.rollno+","+tmp2.rollno+","+tmp3.rollno+" is "+(tmp1.per+tmp2.per+tmp3.per)/3);
    }
    public static void showAvg(Student tmp1 , Student tmp2){
        System.out.println("Average Percentage of "+tmp1.rollno+","+tmp2.rollno+" is "+(tmp1.per+tmp2.per)/2);
    }
*/    
    public static void showGrade(Student tmp){
        
        if(tmp.per>=90){
            System.out.println("Grade of "+tmp.rollno+" is A");
        }
        else if(tmp.per>=80){
            System.out.println("Grade of "+tmp.rollno+" is B");
        }
        else{
            System.out.println("Grade of "+tmp.rollno+" is C");
        }
    }
    public static void showoverallResults(){
        System.out.println("________________________________________");
        System.out.println("Total Passed Students : "+totalpassed);
        System.out.println("Total Failed Students : "+totalfailed);
        System.out.println("________________________________________");
    }
    public void reportCard(){
        
        System.out.println("Showing Results For Report card..");
        System.out.println("Stud Name : "+name);
        System.out.println("Stud Rollno : "+rollno);
        System.out.println("Stud per : "+per);
        if(per>=33){
            System.out.println("Student passed:)");
            totalpassed++;
            
        }else{
            System.out.println("Student Failed:(");
            totalfailed++;
            
        }
        System.out.println("_________________________________");
    }
    public void setData(int a , String b , int c){
        
        rollno=a;
        name=b;
        per=c;
        
    }
    
    
    
}
