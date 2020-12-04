import java.io.IOException;

public class Methods {

    public static void useClassMessage(String classtxt, AllStudent allStudent) throws IOException {
        ClassMessage.deal(classtxt, allStudent);
    }


    public static void SortingOnGPA(AllStudent allStudent) {
        SortingOnGPA.sorting(allStudent);
    }

    public static void StatisticsReports(String classtxt) throws IOException {
        StatisticsReports.statisticsReports(classtxt);
    }

    public static void ScoreInquirybysurmsname(String surname, AllStudent allStudent) {
        ScoreInquiry.scoreInquirybysurname(surname, allStudent);
    }

    public static void ScoreInquirybyid(String id, AllStudent allStudent) {
        ScoreInquiry.scoreInquirybyid(id, allStudent);
    }

    public static void scoreInquiryBySurnameWithWildCards(String surname, AllStudent allStudent) {
        ScoreInquiry.scoreInquiryBySurnameWithWildCards(surname, allStudent);
    }


}
