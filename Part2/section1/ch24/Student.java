package Part2.section1.ch24;

import java.util.ArrayList;

public class Student {
    int studnetID;
    String studentName;
    ArrayList<Subject> SubjectList;

    public Student(int studnetID, String studentName) {
        this.studnetID = studnetID;
        this.studentName = studentName;

        SubjectList = new ArrayList<Subject>();
    }
    public void addSubject(String name,int score)
    {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        SubjectList.add(subject);
    }
    public void showStudentInfo()
    {
      int total= 0;
      for(Subject s: SubjectList)
      {
          total+= s.getScore();
          System.out.println("학생 "+studentName+"의 "+ s.getName()+" "+s.getScore());
      }
        System.out.println("총점은 "+ total);
    }
}
