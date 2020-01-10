package fizz.buz;

public class Contains3Rule implements Rule {

    public Contains3Rule() {
    }

    @Override
    public String value(int number) {
        return "Fizz";
    }

    @Override
    public boolean canApply(int number) {
        return isContainThree(number);
    }

    private boolean isContainThree(int number) {
        return String.valueOf(number).contains("3");
    }
}
