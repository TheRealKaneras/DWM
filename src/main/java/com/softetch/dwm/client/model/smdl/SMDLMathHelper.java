package com.softetch.dwm.client.model.smdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SMDLMathHelper {
    private static final int LEFT_ASSOC = 0;
    private static final int RIGHT_ASSOC = 1;

    private static final Map<String, int[]> OPERATORS = new HashMap<>();
    static {
        OPERATORS.put("+", new int[] { 0, LEFT_ASSOC });
        OPERATORS.put("-", new int[] { 0, LEFT_ASSOC });
        OPERATORS.put("*", new int[] { 5, LEFT_ASSOC });
        OPERATORS.put("/", new int[] { 5, LEFT_ASSOC });
    }

    public static double parseExpression(String string) {
        String[] output = infixToRPN(string.split(" "));
        return RPNtoDouble(output);
    }

    private static boolean isOperator(String token) {
        return OPERATORS.containsKey(token);
    }

    private static boolean isAssociative(String token, int type) {
        if (!isOperator(token)) {
            throw new IllegalArgumentException("Invalid token: " + token);
        }
        if (OPERATORS.get(token)[1] == type) {
            return true;
        }
        return false;
    }

    private static final int comparePrecedence(String tokenA, String tokenB) {
        if (!isOperator(tokenA) || !isOperator(tokenB)) {
            throw new IllegalArgumentException("Invalid tokens: " + tokenA + ", " + tokenB);
        }
        return OPERATORS.get(tokenA)[0] - OPERATORS.get(tokenB)[0];
    }


    private static String[] infixToRPN(String[] inputTokens) {
        ArrayList<String> out = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();
        for (String token : inputTokens) {
            if (isOperator(token)) {
                while (!stack.empty() && isOperator(stack.peek())) {
                    if ((isAssociative(token, LEFT_ASSOC) && comparePrecedence(token, stack.peek()) <=0)
                    || (isAssociative(token, RIGHT_ASSOC) && comparePrecedence(token, stack.peek()) < 0)) {
                        out.add(stack.pop());
                        continue;
                    }
                    break;
                }
                stack.push(token);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.empty() && !stack.peek().equals("(")) {
                    out.add(stack.pop());
                }
                stack.pop();
            } else {
                // token is a number
                out.add(token);
            }
        }
        while(!stack.empty()) {
            out.add(stack.pop());
        }

        return out.toArray(new String[out.size()]);
    }

    private static double RPNtoDouble(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        for (String token : tokens) {
            if (!isOperator(token)) {
                stack.push(token);
            } else {
                Double d2 = Double.valueOf(stack.pop());
                Double d1 = Double.valueOf(stack.pop());
                Double result;
                if (token.compareTo("+") == 0) {
                    result = d1 + d2;
                } else if (token.compareTo("-") == 0) {
                    result = d1 - d2;
                } else if (token.compareTo("*") == 0) {
                    result = d1 * d2;
                } else {
                    result = d1 / d2;
                }
                stack.push(String.valueOf(result));
            }
        }
        return Double.valueOf(stack.pop());
    }
}
