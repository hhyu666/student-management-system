import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;

public class Sort {
    // 快速排序，a是数组，n表示数组的大小
    public static void quickSortGPA(AllStudent allStudent, int length) {
        ArrayList<Student> all = allStudent.AllStudent;
        quickSortInternally(allStudent, 0, length - 1);
    }
    
    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(AllStudent allStudent, int p, int r) {

        if (p >= r) return;
        StdRandom.shuffle(allStudent.AllStudent.toArray());

        int q = partition(allStudent, p, r); // 获取分区点
        quickSortInternally(allStudent, p, q - 1);
        quickSortInternally(allStudent, q + 1, r);
    }

    private static int partition(AllStudent allStudent, int p, int r) {
        double pivot = tool.getGPA(allStudent.AllStudent.get(r).getScore(), allStudent);
        int i = p;
        for (int j = p; j < r; ++j) {
            if (tool.getGPA(allStudent.AllStudent.get(j).getScore(), allStudent) < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    Student mid = allStudent.AllStudent.get(i);
                    allStudent.AllStudent.set(i++, allStudent.AllStudent.get(j));
                    allStudent.AllStudent.set(j, mid);
                }
            }
        }
        Student mid = allStudent.AllStudent.get(i);
        allStudent.AllStudent.set(i, allStudent.AllStudent.get(r));
        allStudent.AllStudent.set(r, mid);
        return i;
    }


}






