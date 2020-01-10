package fizz.buz;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FizzBuz {
    private final List<Rule> rules;

    public FizzBuz() {
        Judgment threeJudgment = new DivisionJudgment(3, "Fizz");
        Judgment fiveJudgment = new DivisionJudgment(5, "Buzz");
        Judgment sevenJudgment = new DivisionJudgment(7, "Whizz");

        List<Judgment> judgments = Arrays.asList(threeJudgment, fiveJudgment, sevenJudgment);

        DivisionRule divisionRule = new DivisionRule(judgments);
        DefaultRule defaultRule = new DefaultRule();
        Contains3Rule contains3Rule = new Contains3Rule();
        rules = Arrays.asList(contains3Rule, divisionRule, defaultRule);
    }

    public String count(int number) {
        final Optional<Rule> first = rules.stream().filter(rule -> rule.canApply(number)).findFirst();
        return first.orElseThrow(() -> new RuntimeException("No Rule ??")).value(number);
    }
}
