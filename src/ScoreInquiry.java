import edu.princeton.cs.algs4.StdOut;

public class ScoreInquiry {
    public static void scoreInquiry(String id, AllStudent allStudent) {
        for (int i = 0; i < allStudent.AllStudent.size(); i++) {
            if (id.equals(allStudent.AllStudent.get(i).getID())) {
                for (int j = 0; j < allStudent.AllStudent.get(i).size(); j++) {
                    if (allStudent.AllStudent.get(i).getScore(j) == -1.0) continue;
                    StdOut.println(allStudent.ClassName.get(j) + "         " + tool.Grade(allStudent.AllStudent.get(i).getScore(j)));
                }
                break;
            }
        }
    }
}
