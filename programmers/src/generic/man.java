package generic;

public class man<T>{

    private T name;

    // 이름 필드.
    private T bloodType;

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
}
