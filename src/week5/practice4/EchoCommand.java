package src.week5.practice4;


public class EchoCommand implements Command {
    private String text = "";

    public EchoCommand (String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println(text);
    }
}
