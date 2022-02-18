package generic;

import java.util.Arrays;

public class mainGe4 {

    public static void defineSpecice(specice<?> specice){
        System.out.println(specice.getName() + " " + Arrays.toString(specice.getSpecices()));
    }

    public static void defineSpeciceSimian(specice<? extends simian> specice){
        System.out.println(specice.getName() +  " " + Arrays.toString(specice.getSpecices()));
    }

    public static void defineSpeciceLion(specice<? super lion> specice){
        System.out.println(specice.getName() +  " " + Arrays.toString(specice.getSpecices()));
    }


    public static void main(String[] args) {
        specice<animal> sAnimal = new specice<animal>("종족 : ", 4);
        sAnimal.add(new animal("동물"));
        sAnimal.add(new simian("유인원"));
        sAnimal.add(new human("사람"));
        sAnimal.add(new lion("사자"));

        specice<simian> sSimian = new specice<simian>("종족 : ", 2);
        sSimian.add(new simian("유인원"));
        sSimian.add(new simian("사람"));


        specice<human> sHuman = new specice<human>("종족 : ", 1);
        sHuman.add(new human("사람"));


        specice<lion> sLion = new specice<lion>("종족 : ", 2);
        sLion.add(new lion("사자"));

        defineSpecice(sAnimal);
        defineSpecice(sSimian);
        defineSpecice(sHuman);
        defineSpecice(sLion);
        System.out.println();

        defineSpeciceSimian(sSimian);
        defineSpeciceSimian(sHuman);
        System.out.println();

        defineSpeciceLion(sAnimal);
        defineSpeciceLion(sLion);
        System.out.println();
    }
}
