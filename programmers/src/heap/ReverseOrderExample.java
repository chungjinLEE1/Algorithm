package heap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOrderExample {

    public static void main(String[] args) {
        int[] intArray = new int[]{5,4,2,1,3};

        // 순차 정렬
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        // reverse 정렬
        Arrays.sort(new int[][]{intArray}, Collections.reverseOrder()); // 컴파일 에러.
        System.out.println(Arrays.toString(intArray));


//        Integer integerArray = Arrays.stream(intArray).boxed().toArray(Integer::new);
//        Arrays.sort(integerArray, Collections.reverseOrder());
//        System.out.println(Arrays.toString(intArray));


    }






}
