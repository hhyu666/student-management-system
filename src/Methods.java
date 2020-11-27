import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.IOException;
import java.util.ArrayList;

public class Methods {

    public static void useClassMessage(String classtxt) throws IOException {
        ClassMessage.deal(classtxt);
    }

    @SuppressFBWarnings({"DLS_DEAD_LOCAL_STORE", "DLS_DEAD_LOCAL_STORE", "DLS_DEAD_LOCAL_STORE", "NM_METHOD_NAMING_CONVENTION"})
    public static void StudentIdentity() {
        ArrayList<Student> AllStudent = new ArrayList<>();
        ArrayList<String> ClassName = new ArrayList<>();
        ArrayList<String> ClassCredit = new ArrayList<>();
    }


}
