package generic;


// 제네릭 메서드 : 매개변수의 타입과 리턴 타입을 제네릭 타입으로 받는 메서드를 말한다.
public class Info {
    public static <T,T2> void info(T t, T2 t2){
        // 타입 파라미터 / 리턴 타입 파라미터 or void / 메서드명 매개변수 타입
        man2<T, T2> man2 = new man2<>();
        man2.setName(t);
        man2.setAge(t2);

        System.out.println("나의 이름은 : " + man2.getName() + " 입니다.");
        System.out.println("나이는 : " + man2.getAge() + " 입니다.");
    }
}
