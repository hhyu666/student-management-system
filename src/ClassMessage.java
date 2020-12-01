import edu.princeton.cs.algs4.StdOut;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ClassMessage {
    @SuppressFBWarnings("NP_DEREFERENCE_OF_READLINE_VALUE")
    public static void deal(String classtxt, AllStudent allStudent) throws IOException {//处理班级文件
        BufferedReader br = tool.ReadTxt(classtxt);
        assert br != null;
        String line = br.readLine();
        String[] course = tool.SpiltString(line);
        line = br.readLine();
        Course course1 = new Course(course[0], course[1], line);
        int number = course1.getNumber();
        StdOut.println("Course Code:" + course1.getName());
        StdOut.println("Credit:" + course1.getCredit());
        StdOut.println("Number of Students:" + course1.getNumber());
        StdOut.println("Name:               Id:                 Score:              Grade:");

        allStudent.nowClassStudent = new ArrayList<>();
        StdOut.println("Please choose the sorting field:");
        StdOut.println("(1) Surname; (2) ID; (3) Score; (4) Grade");


        for (int i = 0; i < number; i++) {
            line = br.readLine();
            String[] student = tool.SpiltString(line);
            allStudent.nowClassStudent.add(new Student(student[0], student[1], student[2], student[3], 0));

            //space(line);
            //StdOut.println();
        }
        //sort!!!
        Sort.quickSortScore(allStudent, allStudent.nowClassStudent.size());
        Collections.reverse(allStudent.nowClassStudent);

        for (Student student : allStudent.nowClassStudent) {
            space(student);
            StdOut.println("");
        }

    }

    private static void space(Student student) {

        System.out.printf("%-20s", student.getName());

        System.out.printf("%-20s", student.getID());

        System.out.printf("%-20s", student.getScore(0));

        System.out.print(tool.Grade(student.getScore(0)));

    }


}
