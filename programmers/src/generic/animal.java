package generic;

public class animal {
    private String name;

    public animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
