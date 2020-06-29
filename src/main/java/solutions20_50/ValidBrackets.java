package solutions20_50;

import java.util.HashMap;
import java.util.Stack;

/**
 * question 20
 * created by Nelson Peng on 2020/6/25
 **/
public class ValidBrackets {

    private static HashMap<Character,Character> mappings = new HashMap<Character, Character>(){{
        put('}','{');
        put(']','[');
        put(')','(');
    }};

    public ValidBrackets() {

    }

    private static boolean isValid(String s) {
        // initialize a stack to be used in algorithm
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String brackets = "{}[[{}]]";
        System.out.println(isValid(brackets));
    }
}


