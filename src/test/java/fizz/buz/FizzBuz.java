package fizz.buz;

import com.google.common.base.Strings;

public class FizzBuz {

    public String count(int number) {
        final boolean isExactDivisionByThree = number % 3 == 0;
        final boolean isExactDivisionByFive = number % 5 == 0;
        final boolean isExtractDivisionBySeven = number % 7 == 0;

        return generateSaying(number, isExactDivisionByThree, isExactDivisionByFive, isExtractDivisionBySeven);
    }

    private String generateSaying(int number, boolean isExactDivisionByThree, boolean isExactDivisionByFive, boolean isExtractDivisionBySeven) {
        String threeTimesSaying = threeTimesSaying(isExactDivisionByThree);
        String fiveTimeSaying = fiveTimesSaying(isExactDivisionByFive);
        String sevenTImeSaying = sevenTimesSaying(isExtractDivisionBySeven);

        final String timesResult = String.join("", threeTimesSaying, fiveTimeSaying, sevenTImeSaying);

        return Strings.isNullOrEmpty(timesResult) ? String.valueOf(number) : timesResult;
    }

    private String threeTimesSaying(boolean isExactDivisionByThree) {
        String threeSaying = "Fizz";
        return isExactDivisionByThree ? threeSaying : "";
    }

    private String fiveTimesSaying(boolean isExtractDivisionByFive) {
        String fiveSaying = "Buzz";
        return isExtractDivisionByFive ? fiveSaying : "";
    }

    private String sevenTimesSaying(boolean isExtractDivisionBySeven) {
        String sevenSaying = "Whizz";
        return isExtractDivisionBySeven ? sevenSaying : "";
    }
}
