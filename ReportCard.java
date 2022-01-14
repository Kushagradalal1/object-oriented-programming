public class ReportCard {

    public static void main(String[] args) {
   
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        
        s1.setData(111, "AAA", 95);
        s2.setData(222, "BBB", 35);
        s3.setData(333, "CCC", 85);
        
        //s1.reportCard();
        //s2.reportCard();
        //s3.reportCard();
        //Student.showGrade(s1);
        //Student.showGrade(s2);
        //Student.showGrade(s3);
        //Student.showoverallResults();
        Student.showAvg(s1,s2);
        Student.showAvg(s1,s2,s3);
        
    }
}
