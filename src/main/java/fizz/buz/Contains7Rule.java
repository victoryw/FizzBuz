package fizz.buz;

public class Contains7Rule implements Rule {
    private final Contains3Rule contains3Rule;
    private DivisionRule divisionRule;
    private DefaultRule defaultRule;

    public Contains7Rule(Contains3Rule contains3Rule, DivisionRule divisionRule, DefaultRule defaultRule) {
        this.contains3Rule = contains3Rule;
        this.divisionRule = divisionRule;
        this.defaultRule = defaultRule;
    }

    @Override
    public String value(int number) {
        if (contains3Rule.canApply(number)) {
            return contains3Rule.value(number);
        }

        if(divisionRule.canApply(number)) {
            return divisionRule.value(number);
        }

       return defaultRule.value(number);
    }

    @Override
    public boolean canApply(int number) {
        return String.valueOf(number).contains("7");
    }
}
