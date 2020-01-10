package fizz.buz;

public class DefaultRule implements Rule {

    @Override
    public String value(int number) {
        return String.valueOf(number);
    }

    @Override
    public boolean canApply(int number) {
        return true;
    }
}
