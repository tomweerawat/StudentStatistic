
package student_statistic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class StatData {
   Student_Statistic sc ;
   private float total;
   private float sum;
   private ArrayList<Integer> student;
    public StatData(){
        
        
    }
    
 public double CalstatData(List <Integer> student) {
//  Integer sum = 0;
//  if(!student.isEmpty()) {
//    for (Integer score : student) {
//        sum += score;
//    }
//    return sum.doubleValue() / student.size();
//  }
//  return sum;
    int score = student.size()/2;
    if (student.size()%2 == 1) {
        return student.get(score);
    } else {
        return (student.get(score-1) + student.get(score)) / 2.0;
    }

}
//static ArrayList<student> sort(ArrayList<student> List) {
// 
//    
//  return List;
// }
//    
    
}
