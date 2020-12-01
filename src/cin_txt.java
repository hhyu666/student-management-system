import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.IOException;

public class cin_txt {


    public static void main(String[] args) throws IOException {
        int NumberClass = 0;
        StdOut.println("Please enter the database filename:");


        AllStudent allStudent = new AllStudent();
        String input = StdIn.readLine();
        //StatisticsReports.statisticsReports(input);
        AddStudent.ChooseStudent(input, NumberClass, allStudent);
        //StdOut.println(allStudent.AllStudent.toString());
        NumberClass++;

        StdOut.println("Do you have another score report?\n" +
                "Press \"Y\" for Yes and \"N\" for No.");
        if (StdIn.readLine().equals("Y")) {
            StdOut.println("Please enter the database filename:");
            input = StdIn.readLine();
            AddStudent.ChooseStudent(input, NumberClass, allStudent);
            //StdOut.println(allStudent.AllStudent.toString());
        }

        Methods.SortingOnGPA(allStudent);


        //StdOut.println("Please input the student ID:");
        //ScoreInquiry.scoreInquirybyid(StdIn.readLine(), allStudent);

        StdOut.println("Please input the surname:");
        ScoreInquiry.scoreInquirybysurname(StdIn.readLine(), allStudent);


    }


}
