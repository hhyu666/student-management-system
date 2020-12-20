public class Course {
    private final String courseCode;
    private final int credit;
    private final int classSize;

    public Course(String[] buf_info) {
        String[] temp_courseCode_credit = buf_info[0].split(",");
        String temp_classSize = buf_info[1];

        this.courseCode = temp_courseCode_credit[0];
        this.credit = Integer.parseInt(temp_courseCode_credit[1]);
        this.classSize = Integer.parseInt(temp_classSize);
    }

    public String toString() {
        return courseCode + " " + credit + "\n" + classSize;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredit() {
        return credit;
    }

    public int getClassSize() {
        return classSize;
    }

}
