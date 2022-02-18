package generic;

public class man2 <T, T2> {
    private T name;
    private T bloodType;
    private T2 age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getBloodType() {
        return bloodType;
    }

    public void setBloodType(T bloodType) {
        this.bloodType = bloodType;
    }

    public T2 getAge() {
        return age;
    }

    public void setAge(T2 age) {
        this.age = age;
    }
}
