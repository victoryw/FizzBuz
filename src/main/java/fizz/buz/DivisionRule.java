package fizz.buz;

import java.util.List;
import java.util.stream.Collectors;

public class DivisionRule implements Rule {
    private List<DivisionJudgment> judgments;

    public DivisionRule(List<DivisionJudgment> judgments) {
        this.judgments = judgments;
    }

    @Override
    public String value(int number) {
        return judgments.stream().map(judgment -> {
            if (judgment.canApply(number)) {
                return judgment.judage(number);
            }
            return "";
        }).collect(Collectors.joining(""));
    }

    @Override
    public boolean canApply(int number) {
        return judgments.stream().anyMatch(judgment -> judgment.canApply(number));
    }
}
