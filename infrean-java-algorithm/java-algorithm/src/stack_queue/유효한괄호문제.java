package stack_queue;

import java.util.Stack;

public class 유효한괄호문제 {
    public static void main(String[] args) {
        String[] s = {"(", ")", "{", "}", "[", "]"};

        System.out.println(solution(s));


    }

    public static String solution(String[] strs){

        Stack<String> s = new Stack<>();

        for(int i=0; i<strs.length; i++){

            switch(strs[i]){
                case "{":
                    s.push(strs[i]);
                    break;
                case "[":
                    s.push(strs[i]);
                    break;
                case "(":

                    break;

                default :

            }
        }


        return
    }
}
