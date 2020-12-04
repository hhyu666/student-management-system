import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ClassMessage {

    public static void deal(String classtxt, AllStudent allStudent) throws IOException {//处理班级文件
        BufferedReader br = tool.ReadTxt(classtxt);
        assert br != null;
        String line = br.readLine();
        String[] course = tool.SpiltString(line);
        line = br.readLine();
        Course course1 = new Course(course[0], course[1], line);
        int number = course1.getNumber();
        StdOut.println("Please choose the sorting field:");
        StdOut.println("(1) Surname; (2) ID; (3) Score; (4) Grade");
        String read1 = StdIn.readLine();
        StdOut.println("Please choose the sorting ways:");
        StdOut.println("(A)scending order; (D)escending order");
        String read2 = StdIn.readLine();
        allStudent.nowClassStudent = new ArrayList<>();
        StdOut.println("Course Code:" + course1.getName());
        StdOut.println("Credit:" + course1.getCredit());
        StdOut.println("Number of Students:" + course1.getNumber());
        StdOut.println("Name:               Id:                 Score:              Grade:");

        for (int i = 0; i < number; i++) {
            line = br.readLine();
            String[] student = tool.SpiltString(line);
            allStudent.nowClassStudent.add(new Student(student[0], student[1], student[2], student[3], 0));
        }


        if (read1.equals("1")) Sort.quickSortSurnName(allStudent, allStudent.nowClassStudent.size());
        else if (read1.equals("2")) {
            Sort.quickSortID(allStudent, allStudent.nowClassStudent.size());
        } else Sort.quickSortScore(allStudent, allStudent.nowClassStudent.size());

        if (!read2.equals("A")) Collections.reverse(allStudent.nowClassStudent);

        
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
