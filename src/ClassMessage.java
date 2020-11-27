import edu.princeton.cs.algs4.StdOut;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.BufferedReader;
import java.io.IOException;

public class ClassMessage {
    @SuppressFBWarnings("NP_DEREFERENCE_OF_READLINE_VALUE")
    public static void deal(String classtxt) throws IOException {//处理班级文件
        BufferedReader br = tool.ReadTxt(classtxt);
        assert br != null;
        String line = br.readLine();
        String[] course = Segmentation(line);
        line = br.readLine();
        Course course1 = new Course(course[0], course[1], line);
        int number = course1.getNumber();
        StdOut.println("Course Code:" + course1.getName());
        StdOut.println("Credit:" + course1.getCredit());
        StdOut.println("Number of Students:" + course1.getNumber());
        StdOut.println("Name:               Id:                 Score:              Grade:");

        for (int i = 0; i < number; i++) {
            line = br.readLine();
            space(line);
            StdOut.println();
        }
    }

    @SuppressFBWarnings("NM_METHOD_NAMING_CONVENTION")
    public static String[] Segmentation(String ok) {
        return ok.split(",");
    }

    public static void space(String one) {
        String[] array1 = one.split(",");
        String ok1 = array1[0] + "," + array1[1];
        System.out.printf("%-20s", ok1);
        for (int i = 2; i < array1.length; i++) {
            System.out.printf("%-20s", array1[i]);//根据空格切分}
        }
        float grade = Float.parseFloat(array1[array1.length - 1]);
        System.out.print(tool.Grade(grade));

    }


}
