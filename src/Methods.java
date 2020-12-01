import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.IOException;

public class Methods {

    public static void useClassMessage(String classtxt, AllStudent allStudent) throws IOException {
        ClassMessage.deal(classtxt, allStudent);
    }

    @SuppressFBWarnings("NM_METHOD_NAMING_CONVENTION")
    public static void SortingOnGPA(AllStudent allStudent) {
        SortingOnGPA.sorting(allStudent);
    }


}
