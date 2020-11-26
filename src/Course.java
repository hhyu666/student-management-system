public class Course {
    private String name;
    private int Credit;
    private int number;

    public Course(String name, String credit, String number) {
        this.name = name;
        this.Credit = Integer.parseInt(credit);
        this.number = Integer.parseInt(number);
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return Credit;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredit(int credit) {
        this.Credit = credit;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
