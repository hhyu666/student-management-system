import java.io.*;
import java.util.Objects;

public class tool {


    public static BufferedReader ReadTxt(String classtxt) {/* 读班级TXT文件 */
        try {
            String pathname = Objects.requireNonNull(cin_txt.class.getClassLoader().getResource(classtxt)).getPath();// 相对路径
            File filename = new File(pathname); // 要读取以上路径的input。txt文件
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // 建立一个输入流对象reader
            return new BufferedReader(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void WriteTxt() throws IOException {
        /* 写入Txt文件 */
        try {
            File writeName = new File(".\\src\\output.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write("我会写入文件啦1\r\n"); // \r\n即为换行
                out.write("我会写入文件啦2\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String Grade(double grade) {
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

    public static String[] SpiltString(String ok) {
        return ok.split(",");
    }

    public static String[] SpiltString2(String ok) {
        return ok.split("\\.");
    }

    public static double getGPA(Double[] Score, AllStudent allStudent) {//算gpa

        double gradePointTotal = 0;
        double gradeOfEachCourseTotal = 0;
        for (int i = 0; i < allStudent.courses.size(); i++) {
            if (Score[i] == null) continue;
            gradePointTotal += pointOfEachCourse(Score[i]) * allStudent.courses.get(i).getCredit();
            gradeOfEachCourseTotal += allStudent.courses.get(i).getCredit();
        }

        return Double.parseDouble(new java.text.DecimalFormat("#.00").format(gradePointTotal / gradeOfEachCourseTotal));
    }

    public static double pointOfEachCourse(double grade) {//根据实际成绩判断学分方法
        double point = 0.0;
        if (grade >= 93)
            point = 4.0;
        else if (grade >= 88)
            point = 3.7;
        else if (grade >= 83)
            point = 3.3;
        else if (grade >= 78)
            point = 3.0;
        else if (grade >= 72)
            point = 2.7;
        else if (grade >= 68)
            point = 2.3;
        else if (grade >= 63)
            point = 2.0;
        else if (grade >= 58)
            point = 1.7;
        else if (grade >= 53)
            point = 1.3;
        else if (grade >= 50)
            point = 1.0;
        else
            point = 0.0;

        return point;
    }
}
