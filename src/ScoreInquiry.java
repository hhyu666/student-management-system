import edu.princeton.cs.algs4.StdOut;

public class ScoreInquiry {
    public static void scoreInquirybyid(String id, AllStudent allStudent) {
        for (int i = 0; i < allStudent.AllStudent.size(); i++) {
            if (id.equals(allStudent.AllStudent.get(i).getID())) {
                for (int j = 0; j < allStudent.AllStudent.get(i).size(); j++) {
                    if (allStudent.AllStudent.get(i).getScore(j) == -1.0) continue;
                    StdOut.println(allStudent.courses.get(j).getName() + "         " + tool.Grade(allStudent.AllStudent.get(i).getScore(j)));
                }
                StdOut.println("GPA: " + tool.getGPA(allStudent.AllStudent.get(i).getScore(), allStudent));
                break;
            }
        }
    }

    public static void scoreInquirybysurname(String surname, AllStudent allStudent) {
        for (int i = 0; i < allStudent.AllStudent.size(); i++) {
            if (surname.equals(allStudent.AllStudent.get(i).getSurnName())) {
                StdOut.println(allStudent.AllStudent.get(i).getGivenName() + " " + allStudent.AllStudent.get(i).getSurnName() + " " + allStudent.AllStudent.get(i).getID());
                for (int j = 0; j < allStudent.AllStudent.get(i).size(); j++) {
                    if (allStudent.AllStudent.get(i).getScore(j) == -1.0) continue;
                    StdOut.println(allStudent.courses.get(j).getName() + "         " + tool.Grade(allStudent.AllStudent.get(i).getScore(j)));
                }
                StdOut.println("GPA: " + tool.getGPA(allStudent.AllStudent.get(i).getScore(), allStudent));
                StdOut.println("");

            }
        }
    }


    public static void scoreInquiryBySurnameWithWildCards(String surname, AllStudent allStudent) {
        for (int i = 0; i < allStudent.AllStudent.size(); i++) {
            if (CompareSurname(surname, allStudent.AllStudent.get(i).getSurnName())) {
                StdOut.println(allStudent.AllStudent.get(i).getGivenName() + " " + allStudent.AllStudent.get(i).getSurnName() + " " + allStudent.AllStudent.get(i).getID());
                for (int j = 0; j < allStudent.AllStudent.get(i).size(); j++) {
                    if (allStudent.AllStudent.get(i).getScore(j) == -1.0) continue;
                    StdOut.println(allStudent.courses.get(j).getName() + "         " + tool.Grade(allStudent.AllStudent.get(i).getScore(j)));
                }
                StdOut.println("GPA: " + tool.getGPA(allStudent.AllStudent.get(i).getScore(), allStudent));
                StdOut.println("");

            }
        }
    }

    private static boolean CompareSurname(String surname, String surname2) {
        int length = surname.length();
        if (length > surname2.length()) return false;
        String ok = surname2.substring(0, length);
        return ok.equals(surname);
    }

}
