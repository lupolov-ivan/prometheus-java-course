package src.week6.practice5;

public class RLEdecoder {
    public static void main(String[] args) {
        String str = "f3g5gd5lupolovivan";
        char ch;
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).matches("[0-9]")){
                for (int j = 0; j < Character.digit(chars[i], 10)-1; j++) {
                    stringBuilder.append(chars[i-1]);
                }
            } else {
                stringBuilder.append(chars[i]);
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
