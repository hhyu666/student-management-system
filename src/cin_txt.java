import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.IOException;

public class cin_txt {


    public static void main(String[] args) throws IOException {

        int NumberClass = 0;
        StdOut.println("Please enter the database filename:");
        AllStudent allStudent = new AllStudent();
        String input = StdIn.readLine();
        AddStudent.ChooseStudent(input, NumberClass, allStudent);
        NumberClass++;
        while (true) {
            StdOut.println("Do you have another score report?\n" +
                    "Press \"Y\" for Yes and \"N\" for No.");
            if (StdIn.readLine().equals("Y")) {
                StdOut.println("Please enter the database filename:");
                input = StdIn.readLine();
                AddStudent.ChooseStudent(input, NumberClass, allStudent);
                NumberClass++;
            } else break;
        }
        do {
            StdOut.println("Please select the feature you want!：");
            StdOut.println("1.Print out the class message");
            StdOut.println("2.Statistics Reports for a class");
            StdOut.println("3.Search the grades of all courses taken by a student");
            StdOut.println("4.Sorting on GPA");
            StdOut.println("5.search the students by surnames");
            StdOut.println("6.query by student names with wild cards");

            input = StdIn.readLine();
            switch (input) {
                case "1":
                    StdOut.println("Please choose the course code first:");
                    input = StdIn.readLine() + ".txt";
                    Methods.useClassMessage(input, allStudent);
                    break;
                case "2":
                    StdOut.println("Please choose the course code first:");
                    input = StdIn.readLine() + ".txt";
                    Methods.StatisticsReports(input);
                    break;
                case "3":
                    StdOut.println("Please input the student ID:");
                    Methods.ScoreInquirybyid(StdIn.readLine(), allStudent);

                    break;
                case "4":
                    Methods.SortingOnGPA(allStudent);
                    break;
                case "5":
                    StdOut.println("Please input the surname:");
                    Methods.ScoreInquirybysurmsname(StdIn.readLine(), allStudent);
                    break;
                default:
                    StdOut.println("Please input the surname:");
                    Methods.scoreInquiryBySurnameWithWildCards(StdIn.readLine(), allStudent);
                    break;
            }

            StdOut.println("Do you want to quit or use some other feature?");
            StdOut.println("1.quit    2.use");
        } while (!StdIn.readLine().equals("1"));


    }


}
