package src.week5.practice4;

public class DateNowCommand implements Command{

    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
