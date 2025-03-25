package DaHinh;

public class Cat extends Animal implements  Flyable{
    void tiengKeu(){
        System.out.println("meo meo");
    }
    void  run(){
        System.out.println("Chạy");
    }

//    @Override
//    public String toString() {
//        return "Cat{}";
//    }
    @Override
    public void fly(){
        System.out.println("Bay");
    }
}
