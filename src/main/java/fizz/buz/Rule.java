package fizz.buz;

public interface Rule {
    String value(int number);

    boolean canApply(int number);
}
