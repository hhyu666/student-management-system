import java.util.Arrays;

public class Student {
    private String surnName;
    private String givenName;
    private String ID;
    private Double[] Score = new Double[15];
    private int Credit;
    private int GPA;

    public Student(String surnName, String givenName, String ID, double score, int index) {
        this.surnName = surnName;
        this.givenName = givenName;
        this.ID = ID;
        Score[index] = score;
    }

    public String toString() {
        return surnName + "," + givenName + "\t" + ID + "\t" + Arrays.toString(Score);
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

    public Double[] getScore() {
        return Score;
    }

    public double getScore(int index) {
        if (Score[index] == null) return -1.0;
        return Score[index];
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

        Score[index] = score;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public int size() {
        return Score.length;
    }
}
