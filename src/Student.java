import java.util.ArrayList;

public class Student {
    private String surnName;
    private String givenName;
    private String ID;
    private ArrayList<Double> Score = new ArrayList<>();
    private int Credit;
    private int GPA;

    public Student(String surnName, String givenName, String ID, double score, int index) {
        this.surnName = surnName;
        this.givenName = givenName;
        this.ID = ID;
        Score.add(index, score);
    }

    public String toString() {
        return surnName + "," + givenName + "\t" + ID + "\t" + Score.toString();
    }

    public String getID() {
        return ID;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurnName() {
        return surnName;
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
        this.surnName = surnName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setScore(double score, int index) {
        Score.add(index, score);
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
