import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      List<String> overEnrolledStudents = new LinkedList<>();
      for (String names : courseListsByStudentName.keySet()){
        int totUnit = 0;
        List<Course> classes = new ArrayList<Course>();  
        classes = courseListsByStudentName.get(names);
        for (Course courses : classes){
            int units = courses.getNumUnits();
            totUnit += units;
            }
        if (totUnit > unitThreshold){
            overEnrolledStudents.add(names);
            }
      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */
}
      return overEnrolledStudents;      
   
}
}
