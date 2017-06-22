package src.week7.practice6.task1;

import java.util.LinkedList;

public class Application {

    public static double parse(String rpnString) {

        String[] rpnArray = rpnString.split(" ");

        LinkedList<Double> stack = new LinkedList<>();

        for (int i = 0; i < rpnArray.length; i++) {
            if(rpnArray.length%2 == 0) {
                throw new RPNParserException();
            } else if(rpnArray.length == 2) {
                throw new RPNParserException();
            } else if(rpnArray[i].matches("^-?[0-9]*[.]?[0-9]+$")) {
                stack.push(Double.parseDouble(rpnArray[i]));
            } else if (rpnArray[i].equals("+") && (i >= 2)) {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b+a);
            } else if (rpnArray[i].equals("-") && (i >= 2)) {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b-a);
            } else if (rpnArray[i].equals("*") && (i >= 2)) {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b*a);
            } else if (rpnArray[i].equals("/") && (i >= 2)) {
                double a = stack.pop();
                double b = stack.pop();
                if(Double.isInfinite(b/a) | Double.isNaN(b/a)) {
                    throw new ArithmeticException();
                }
                stack.push(b/a);
            } else {
                throw new RPNParserException();
            }
        }
        return stack.pop();
    }
}