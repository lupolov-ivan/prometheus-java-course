package src.week6.practice5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RLEdecoder {
    public static void main(String[] args) {

        /*validation*/

        if (args==null || args.length==0) {
            System.out.println("");
        } else if (args[0]==null || args[0].equals("")) {
            System.out.println("");
        } else {

            Pattern p1 = Pattern.compile("^[0-9]"); // проверка на цифру вначале
            Pattern p2 = Pattern.compile("([A-Za-z])\\1{1}"); // проверка на пары
            Pattern p3 = Pattern.compile("[0-9]{2,}"); // проверка несколько цифр идущих подряд

            Matcher m1 =  p1.matcher(args[0]);
            Matcher m2 =  p2.matcher(args[0]);
            Matcher m3 =  p3.matcher(args[0]);

            if (m1.find() || m2.find() || m3.find()) {
                System.out.println("");
            } else {

        /* end validation */

        /* decoding (работает только с валидной строкой) */

                StringBuilder stringBuilder = new StringBuilder();
                char[] chars = args[0].toCharArray();

                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] >= '0' && chars[i] <= '9') { // проверка символа на число
                        for (int j = 0; j < Character.digit(chars[i], 10) - 1; j++) {
                            stringBuilder.append(chars[i - 1]);  // если следующий символ число, то добавляем в последовательность предыдущий символ (число-1) раз
                        }
                    } else {
                        stringBuilder.append(chars[i]); // если нет то просто добавляем символ в последовательность
                    }
                }

        /* end decoding */

                System.out.println(stringBuilder.toString());
            }
        }
    }
}
