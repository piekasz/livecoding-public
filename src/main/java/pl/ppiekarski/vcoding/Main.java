package pl.ppiekarski.vcoding;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    ArrayList<Integer> solution(int[] inputArray) {
        var n = inputArray.length;
        var bits = new BitSet(n);

        for (int i : inputArray) {
            bits.set(i);
        }
        // all - bits = result
        var result = new ArrayList<Integer>();

        for (var i = 1; i <= n; i++) {
            if (!bits.get(i)) {
                result.add(i);
            }
        }

        return result;
    }

    /*
    Input: s = "([)]" vs "()[]" validate that {string} -> string is also valid
     */
    boolean isValid(String string) {
        Map<Character, Character> startToEnd = Map.of(
                '(', ')',
                '{', '}',
                '[', ']'
        );
        var starts = startToEnd.keySet();

        var stack = new ArrayDeque<Character>();

        for (char character : string.toCharArray()) {
            if (starts.contains(character)) {
                stack.push(startToEnd.get(character));
            } else {
                if (stack.isEmpty() || stack.pop() != character) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
/*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.

Open brackets must be closed in the correct order.

Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]" vs "()[]" validate that {string} -> string is also valid

Output: false


     */

}

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]

Output: [5,6]

Example 2:

Input: nums = [1,1]

Output: [2]


 */