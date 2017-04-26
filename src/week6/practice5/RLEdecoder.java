package src.week6.practice5;

public class RLEdecoder {
    public static void main(String[] args) {
        String str = "f3g5gd9y9y9ylupolovivan";
        char ch;
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length-1; i++) {
            ch = chars[i];
            if (String.valueOf(chars[i+1]).matches("[0-9]")){
                for (int j = 0; j < Character.digit(chars[i+1], 10); j++) {
                    stringBuilder.append(ch);
                }
                i++;
            } else {
                stringBuilder.append(ch);
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
