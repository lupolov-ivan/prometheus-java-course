package src.week5.practice4;

public class Application {

    private Command command;

    public Command getCommand(String[] args){

        if(args == null) {
            return null;
        } else if(args.length == 1) {
            if (args[0] == null) {
                return null;
            } if (args[0].equals("")) {
                return null;
            } else if (args[0].equals("help")) {
                return new HelpCommand();
            } else if (args[0].equals("exit")) {
                return new ExitCommand();
            } else {
                return null;
            }
        } else if (args.length > 1) {
            if (args[0] == null) {
                return null;
            } if (args[0].equals("")) {
                return null;
            } else if (args[0].equals("date") && args.length == 2) {
                if(args[1] == null) {
                    return null;
                } else if (args[1].equals("now")) {
                    return new DateNowCommand();
                }
            } else if (args[0].equals("echo")) {
                String text = "";
                for (int i = 1; i < args.length; i++) {
                    if(args[i] == null) {
                        return null;
                    }
                    text += args[i] + " ";
                }
                return new EchoCommand(text);
            } else {
                return null;
            }
        }
        return null;
    }

    public void executeCommand(String[] arr){

        Command command = getCommand(arr);
        if(command == null) {
            System.out.println("Error");
        } else {
            command.execute();
        }
    }

    public static void main(String[] args) {

        Application app = new Application();

        app.executeCommand(args);

        /*T E S T*/
        System.out.println("Test case: args == null");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(null);
        String[] app_args = new String[1];
        app_args[0] = null;
        System.out.println("Test case: args[0] == null");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args);
        app_args[0] = "";
        System.out.println("Test case: args[0] is empty");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args);
        app_args[0] = "help";
        System.out.println("Test case: correct command help");
        System.out.println("Right answer: Help executed");
        System.out.print("Your answer: ");
        app.executeCommand(app_args);
        app_args[0] = "echo";
        System.out.println("Test case: incorrect command echo");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args);
        app_args[0] = "date";
        System.out.println("Test case: incorrect command date");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args);
        app_args[0] = "exit";
        System.out.println("Test case: correct command exit");
        System.out.println("Right answer: Goodbye!");
        System.out.print("Your answer: ");
        app.executeCommand(app_args);
        String[] app_args1 = new String[2];
        app_args1[0] = "help";
        app_args1[1] = "error";
        System.out.println("Test case: incorrect command help");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args1);
        app_args1[0] = "echo";
        app_args1[1] = "Bingo!";
        System.out.println("Test case: correct command echo");
        System.out.println("Right answer: Bingo!");
        System.out.print("Your answer: ");
        app_args1[1] = null;
        System.out.println("Test case: correct command echo");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args1);
        app_args1[0] = "date";
        app_args1[1] = "now";
        System.out.println("Test case: correct command date");
        System.out.println("Right answer: " + System.currentTimeMillis());
        System.out.print("Your answer: ");
        app.executeCommand(app_args1);
        app_args1[1] = "error";
        System.out.println("Test case: incorrect command date");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args1);
        app_args1[1] = null;
        System.out.println("Test case: incorrect command date");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args1);
        app_args1[0] = "exit";
        System.out.println("Test case: incorrect command exit");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args1);
        String[] app_args2 = new String[3];
        app_args2[0] = "help";
        app_args2[1] = "error";
        app_args2[2] = "error";
        System.out.println("Test case: incorrect command help");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args2);
        app_args2[0] = "echo";
        app_args2[1] = "Bingo!";
        System.out.println("Test case: incorrect command echo");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args2);
        app_args2[0] = "date";
        app_args2[1] = "now";
        System.out.println("Test case: incorrect command date");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args2);
        app_args2[1] = "error";
        System.out.println("Test case: incorrect command date");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args2);
        app_args2[0] = "exit";
        System.out.println("Test case: incorrect command exit");
        System.out.println("Right answer: Error");
        System.out.print("Your answer: ");
        app.executeCommand(app_args2);
        /*T E S T*/

    }
}
