package src.week5.practice4;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Goodbye!");
    }
}
