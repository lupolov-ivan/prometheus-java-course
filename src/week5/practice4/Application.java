package src.week5.practice4;

public class Application {

    public static void main(String[] args) {

        if(args == null) {
            printError();
        } else {

            if (!(args[0].equals("help")) && !(args[0].equals("exit")) && !(args[0].equals("echo")) && !(args[0].equals("date"))) {
                System.out.println("Error");
            }

            if (args[0].equals("help")) {
                new HelpCommand().execute();
            }


        }
    }

    public static void printError() {
        System.out.println("Error");
    }
}
