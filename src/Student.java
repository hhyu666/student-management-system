import java.util.ArrayList;

public class Student {
    private String SurnName;
    private String GivenName;
    private String ID;
    private ArrayList<Double> Score = new ArrayList<>();
    private int Credit;
    private int GPA;

    public Student() {

    }

    public String getID() {
        return ID;
    }

    public String getGivenName() {
        return GivenName;
    }

    public String getSurnName() {
        return SurnName;
    }

    public int getGPA() {
        return GPA;
    }

    public int getCredit() {
        return Credit;
    }

    public ArrayList<Double> getScore() {
        return Score;
    }

    public void setCredit(int credit) {
        Credit = credit;
    }

    public void setSurnName(String surnName) {
        SurnName = surnName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setScore(ArrayList<Double> score) {
        Score = score;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setGivenName(String givenName) {
        GivenName = givenName;
    }
}
