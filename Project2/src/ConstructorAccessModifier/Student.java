package ConstructorAccessModifier;

/**
 * Xây dựng lớp Student với tính bao đóng
 */
public class Student {
    private int id;
    private String name;
    private double score;

    public Student(int id ,String name, double score){
        this.id = id;
        this.name = name;
        this.score =score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
    public void setName(String name){
        if(name.trim().equals("")){
            System.out.println("Bắt buộc nhập tên");
        } else {
            this.name = name;
        }
    }
    public void setScore(double score){
        if(score >= 0 && score <= 10){
            this.score = score;
        } else {
            System.out.println("Điểm số phải nằm từ từ 0 đến 10");
        }
    }
}
