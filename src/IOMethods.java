import edu.princeton.cs.algs4.StdOut;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.*;

public class IOMethods {

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"DM_DEFAULT_ENCODING", "OS_OPEN_STREAM", "NP_DEREFERENCE_OF_READLINE_VALUE"})
    public static void read() {/* 读班级TXT文件 */
        try {
            String pathname = cin_txt.class.getClassLoader().getResource("LP002.txt").getPath();// 相对路径
            File filename = new File(pathname); // 要读取以上路径的input。txt文件
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // 建立一个输入流对象reader
            BufferedReader br = new BufferedReader(reader); // 建立一个对象

            deal(br);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressFBWarnings("NP_DEREFERENCE_OF_READLINE_VALUE")
    public static void deal(BufferedReader br) throws IOException {//处理班级文件
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
        System.out.print(Grade(grade));

    }

    @SuppressFBWarnings("NM_METHOD_NAMING_CONVENTION")
    public static String Grade(float grade) {
        if (grade >= 93) return "A+";
        else if (grade >= 88) return "A";
        else if (grade >= 83) return "A-";
        else if (grade >= 78) return "B+";
        else if (grade >= 72) return "B";
        else if (grade >= 68) return "B-";
        else if (grade >= 63) return "C+";
        else if (grade >= 58) return "C";
        else if (grade >= 53) return "C-";
        else if (grade >= 50) return "D";
        else if (grade >= 40) return "F";
        else return "O";

    }


}
