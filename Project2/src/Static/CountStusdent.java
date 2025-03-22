package Static;

/**
 * Đếm số lượng đối tượng Student được tạo ra
 */
public class CountStusdent {
    private int msStudent;
    private String name;
    private double score;
    static int count = 0;

    public int getMsStudent() {
        return msStudent;
    }

    public void setMsStudent(int msStudent) {
        this.msStudent = msStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static int getCount() {
        return count;
    }


    public CountStusdent(int msStudent, String name, double score){
        this.msStudent = msStudent;
        this.name = name;
        this.score = score;
        count++;

    }



}
