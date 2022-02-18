package generic;

public class specice <T>{
    private String name;
    private T[] specices;

    public specice(String name, int num) {
        this.name = name;
        this.specices = (T[])(new Object[num]);
    }

    public String getName() {
        return name;
    }

    public T[] getSpecices() {
        return specices;
    }

    public void add(T t){
        for(int i=0; i<specices.length; i++){
            if(specices[i] == null){
                specices[i] = t;
                break;
            }
        }
    }

}
