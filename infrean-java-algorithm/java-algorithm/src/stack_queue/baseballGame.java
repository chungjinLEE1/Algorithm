package stack_queue;


import java.util.Stack;

public class baseballGame {

    public static void main(String[] args) {
        String[] input= {"5", "-2", "4", "C", "D", "9", "+", "+"};

        System.out.println(solution(input));
    }
    // 5 -2 -4 9 5 14
    public static int solution(String[] strs){

        Stack<Integer> s = new Stack<Integer>();
        for(int i=0; i<strs.length; i++){
            switch(strs[i]){
                case "C" :
                    s.pop();
                    break;

                case "D" :
                    s.push(s.peek()* 2);
                    break;

                case "+":
                    int x = s.pop();
                    int y = s.pop();
                    s.push(y);
                    s.push(x);
                    s.push(x + y);

                    break;

                default:
                    s.push(Integer.valueOf(strs[i]));
            }
        }
        int sum =0;
        while(!s.isEmpty()){
            sum += s.pop();
        }
        return sum;
    }


}
