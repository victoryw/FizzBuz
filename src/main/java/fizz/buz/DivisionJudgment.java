package fizz.buz;

public class DivisionJudgment implements Judgment {
    private final int divisibility;
    private final String value;

    public DivisionJudgment(int divisibility, String value) {

        this.divisibility = divisibility;
        this.value = value;
    }

    public String judage(int number) {
        return value;
    }

    @Override
    public boolean canApply(int number) {
        return number % divisibility == 0;
    }
}
