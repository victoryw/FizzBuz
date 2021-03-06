package fizz.buz;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FizzBuz {
    private final List<Rule> rules;

    public FizzBuz() {
        DivisionJudgment threeJudgment = new DivisionJudgment(3, "Fizz");
        DivisionJudgment fiveJudgment = new DivisionJudgment(5, "Buzz");
        DivisionJudgment sevenJudgment = new DivisionJudgment(7, "Whizz");

        DivisionRule divisionRule = new DivisionRule(Arrays.asList(threeJudgment, fiveJudgment, sevenJudgment));
        DefaultRule defaultRule = new DefaultRule();
        Contains3Rule contains3Rule = new Contains3Rule();
        Contains5Rule contains5Rule = new Contains5Rule(new DivisionRule(Arrays.asList(fiveJudgment, sevenJudgment)), defaultRule);
        Contains7Rule contains7Rule = new Contains7Rule(new Contains3Rule(), new DivisionRule(Arrays.asList(threeJudgment, sevenJudgment)), defaultRule);
        rules = Arrays.asList(contains7Rule, contains5Rule, contains3Rule, divisionRule, defaultRule);
    }

    public String count(int number) {
        final Optional<Rule> first = rules.stream().filter(rule -> rule.canApply(number)).findFirst();
        return first.orElseThrow(() -> new RuntimeException("No Rule ??")).value(number);
    }
}
