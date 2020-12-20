import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Objects;


public class StudentFileIO {
    public static void readFile(String classPath, int numberOfClass, AllStudent allStudent) {//处理班级文件
        // update pass parameter: numberOfClass
        try {
            String pathname = Objects.requireNonNull(Main.class.getClassLoader().getResource(classPath)).getPath();
            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File(pathname))));

            String[] buf_info = new String[2]; //
            for (int i = 0; i < 2; i++) {
                buf_info[i] = bf.readLine();
            }
            allStudent.addGlobalCoursesList(new Course(buf_info));

            String buf_string = bf.readLine();
            while (buf_string != null) {
                allStudent.addGlobalStudentList(buf_string, numberOfClass); // update: use numberOfClass
                buf_string = bf.readLine();
            }

        } catch (Exception ex) {
            return;
        }

        for (Student student : allStudent.getNowClassStudentList()) {
            space(student);
            StdOut.println(student.Grade(0));
        }

    }

    private static void space(Student student) {

        System.out.printf("%-20s", student.getName());

        System.out.printf("%-20s", student.getStudentID());

        System.out.printf("%-20s", student.getScore(0));
    }


}
