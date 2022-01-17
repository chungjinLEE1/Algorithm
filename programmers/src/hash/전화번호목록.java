package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 전화번호목록 {

    public static void main(String[] args) {

        전화번호목록 a = new 전화번호목록();
        a.solution(new String[]{"119, 97674223, 1195524421"});
    }

    public boolean solution(String[] phone_book){
        System.out.println(phone_book.length);

        Arrays.sort(phone_book);

        System.out.println(phone_book);

        for(int i=0; i<phone_book.length -1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }


        return true;
    }
}
