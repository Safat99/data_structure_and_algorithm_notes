package data_structure_and_algorithm_notes.ds_codes_java.core.practice_problem;

import java.util.*;
import java.util.Objects;
import java.util.Stack;

/**
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 * A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
 * Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
 * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 */
public class Remove_Outermost_Parentheses {

    public String removeOuterParentheses(String s) {
        if (Objects.equals(s, "")) return "";

        Stack<Character> stack = new Stack<>();
        List<String> stringList = new ArrayList<>();
        int track = 0;

        StringBuilder output = new StringBuilder();


        stack.push('(');
        for (int i = 1; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(')
                stack.push('(');
            else stack.pop();

            if (stack.isEmpty()) {
                stringList.add(s.substring(track, i + 1));
                track = i + 1;
            }
        }

        for (String ns : stringList) {
            output.append(ns, 1, ns.length() - 1);
        }

        return output.toString();
    }

    public static void main(String[] args) {
        Remove_Outermost_Parentheses rop = new Remove_Outermost_Parentheses();
        System.out.println(rop.removeOuterParentheses("(((())))(())"));
        System.out.println(rop.removeOuterParentheses("(())"));
    }

}
