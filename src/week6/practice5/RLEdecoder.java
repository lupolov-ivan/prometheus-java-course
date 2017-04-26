package src.week6.practice5;

public class RLEdecoder {
    public static void main(String[] args) {
        String str = "f3g5gd5lupolovivan";

        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = str.toCharArray();

        /* add validation for input string*/

        for (int i = 0; i < chars.length; i++) { // алгоритм работает только с валидной строкой
            if (String.valueOf(chars[i]).matches("[0-9]")){
                for (int j = 0; j < Character.digit(chars[i], 10) - 1; j++) {
                    stringBuilder.append(chars[i-1]);  // если следующий символ число, то добавляем в последовательность предыдущий символ (число-1) раз
                }
            } else {
                stringBuilder.append(chars[i]); // если нет то просто добавляем символ в последовательность
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
