import java.util.Stack;

public class Checkifa_ParenthesesString_CanBeValid_2116 {
    public boolean canBeValid(String s, String locked) {
        if(s.length() %2 != 0){
            return false;
        }
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0'){
                stk2.push(i);
            }
            else if(s.charAt(i)=='('){
                stk1.push(i);
            }
            else if(s.charAt(i)==')'){
                if(!stk1.isEmpty()){
                    stk1.pop();
                }
                else if(!stk2.isEmpty()){
                    stk2.pop();
                }
                else{
                    return false;
                }
            }
        }

        while(!stk1.isEmpty() && !stk2.isEmpty() && stk1.peek() < stk2.peek()){
            stk1.pop();
            stk2.pop();
        }

        return stk1.isEmpty();
    }
    public static void main(String[] args) {
        String s = "))()))";
        String locked = "010100";
        Checkifa_ParenthesesString_CanBeValid_2116 obj = new Checkifa_ParenthesesString_CanBeValid_2116();
        System.out.println("ANS: "+ obj.canBeValid(s,locked));

    }
}
