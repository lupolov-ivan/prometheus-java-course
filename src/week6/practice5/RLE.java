package src.week6.practice5;

public class RLE {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        int countMod = 0;
        int countDiv = 0;

        if (args == null) {
            System.out.println("Error");
        } else if (args[0] == null) {
            System.out.println("Error");
        } else if (args[0].equals("")) {
            System.out.println("");
        } else {

            char[] chars = args[0].toCharArray();

            for (int i = 0; i < chars.length; i++) {

                char ch = chars[i];

                for (int j = i; j < chars.length; j++) { // вычисляем число повторений каждого символа
                    if (ch == chars[j]) { // если следующий элемент такой же добавляем счетчик
                        count++;
                        i = j; // запоминаем индекс текущего элемента в масиве чтобы продолжить выполнение внешнего цикла с данного элемента
                    } else {
                        break;
                    }
                }

                if(count !=1) {
                    if (count <= 9) {
                        stringBuilder.append(ch);
                        stringBuilder.append(count);
                    } else {
                        countDiv = count/9;
                        if (countDiv == 1) {
                            countMod = count%9;
                            if (countMod > 1) {
                                stringBuilder.append(ch);
                                stringBuilder.append(9);
                                stringBuilder.append(ch);
                                stringBuilder.append(countMod);
                            } else {
                                stringBuilder.append(ch);
                                stringBuilder.append(9);
                                stringBuilder.append(ch);
                            }
                        } else {
                            countMod = count%9;
                            if (countMod == 0) {
                                for (int j = 0; j < countDiv; j++) {
                                    stringBuilder.append(ch);
                                    stringBuilder.append(9);
                                }
                            } else if (countMod > 1){
                                for (int j = 0; j < countDiv; j++) {
                                    stringBuilder.append(ch);
                                    stringBuilder.append(9);
                                }
                                stringBuilder.append(ch);
                                stringBuilder.append(countMod);
                            } else {
                                for (int j = 0; j < countDiv; j++) {
                                    stringBuilder.append(ch);
                                    stringBuilder.append(9);
                                }
                                stringBuilder.append(ch);
                            }
                        }
                    }
                } else {
                    stringBuilder.append(ch);
                }
                count = 0;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
