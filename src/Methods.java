import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.IOException;

public class Methods {

    public static void useClassMessage(String classtxt) throws IOException {
        ClassMessage.deal(classtxt);
    }

    @SuppressFBWarnings("NM_METHOD_NAMING_CONVENTION")
    public static void SortingOnGPA(AllStudent allStudent) {
        SortingOnGPA.sorting(allStudent);
    }


}
