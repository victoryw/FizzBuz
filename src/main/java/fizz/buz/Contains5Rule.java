package fizz.buz;

public class Contains5Rule implements Rule {
    private final DivisionRule divisionRule;
    private final DefaultRule defaultRule;

    public Contains5Rule(DivisionRule divisionRule, DefaultRule defaultRule) {

        this.divisionRule = divisionRule;
        this.defaultRule = defaultRule;
    }

    @Override
    public String value(int number) {
        if (divisionRule.canApply(number)) {
            return divisionRule.value(number);
        }
        return defaultRule.value(number);
    }

    @Override
    public boolean canApply(int number) {
        return String.valueOf(number).contains("5");
    }
}
