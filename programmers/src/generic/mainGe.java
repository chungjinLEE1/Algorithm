package generic;

public class mainGe {
    public static void main(String[] args) {
        man<String> man1 = new man<>();

        man1.setName("King");
        man1.setBloodType("A");

        System.out.println(man1.getBloodType());
        System.out.println(man1.getName());

    }
}
