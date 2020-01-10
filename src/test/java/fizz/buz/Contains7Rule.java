package fizz.buz;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Contains7Rule implements Rule {
    private final Contains3Rule contains3Rule;
    private DivisionRule divisionRule;

    public Contains7Rule(Contains3Rule contains3Rule, DivisionRule divisionRule) {
        this.contains3Rule = contains3Rule;
        this.divisionRule = divisionRule;
    }

    @Override
    public String value(int number) {
        if (contains3Rule.canApply(number)) {
            return contains3Rule.value(number);
        }

        if(divisionRule.canApply(number)) {
            return divisionRule.value(number);
        }

        throw new NotImplementedException();
    }

    @Override
    public boolean canApply(int number) {
        return String.valueOf(number).contains("7")
                && (contains3Rule.canApply(number) || divisionRule.canApply(number));
    }
}
