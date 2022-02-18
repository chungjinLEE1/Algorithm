package generic;

public class mainGe2 {

    public static void main(String[] args) {
        man2<String, Integer> man2 = new man2<>();


        man2.setName("King");
        man2.setBloodType("A"); //선언시 스트링 타입으로 선언하여 스트링 데이터를 입력하였다.
        man2.setAge(25); //Integer 타입으로 받아 정수값을 선언해주었다.
        System.out.println(man2.getName());
        System.out.println(man2.getBloodType());
        System.out.println(man2.getAge());

    }
}
