
package student_statistic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
public class Student_Statistic {
    private int check = 13;
    public static ArrayList<Integer> student;
    
    public Student_Statistic(){
        //StatData sd = null;
        //sd.CalShowStatData(student);
        addData();
//        System.out.print(student);
    }
    
    
    public ArrayList<Integer> addData(){
        ArrayList<Integer> student = new ArrayList<Integer>();
        Scanner sn = new Scanner(System.in);
        System.out.println("Press any key for start program" );
        for(check=0;check<7;check++){
            System.out.print("Enter Data Score of Student = ");
            student.add(sn.nextInt());   
            if(check==6){
                for(int i = 0; i < student.size(); i++) {   
                    StatData stat = new StatData();
                     Collections.sort(student);
                    
                    System.out.println("Score" + student.get(i)+"Median = "+stat.CalstatData(student));
                    //System.out.println("Median = "+stat.CalstatData(student));
                    //System.out.println("Range = "+stat.CalstatData(student));
                    
                }  
                  
            }
        }   
        
        
        return (student);
    }
    
    public static void main(String[] args) {
        Student_Statistic sc = new Student_Statistic();
        StatData c;
//        System.out.print("Range "+c.CalRange(student));
        
        
        
    }

}
