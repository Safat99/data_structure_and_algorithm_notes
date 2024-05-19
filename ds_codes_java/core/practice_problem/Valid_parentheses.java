package data_structure_and_algorithm_notes.ds_codes_java.core.practice_problem;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 3. Every close bracket has a corresponding open bracket of the same type.
 */
public class Valid_parentheses {

    /**
     * @param s the given string
     * @return true if the string is valid
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);

            } else {
                if ((c == ']' || c == '}' || c == ')') && stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{') ||
                    (c == ')' && top != '(')
                )
                  return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Valid_parentheses vp = new Valid_parentheses();
        System.out.println(vp.isValid("[]"));
        System.out.println(vp.isValid("([])"));
    }

}
