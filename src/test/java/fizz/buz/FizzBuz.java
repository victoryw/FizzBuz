package fizz.buz;

public class FizzBuz {
    public String count(int number) {


        final boolean isExactDivisionByThree = number % 3 == 0;
        final boolean isExactDivisionByFive = number % 5 == 0;
        final boolean isExtractDivisionBySeven = number % 7 == 0;

        return generateSaying(number, isExactDivisionByThree, isExactDivisionByFive, isExtractDivisionBySeven);
    }

    private String generateSaying(int number, boolean isExactDivisionByThree, boolean isExactDivisionByFive, boolean isExtractDivisionBySeven) {
        String threeSaying = "Fizz";
        String fiveSaying = "Buzz";
        String sevenSaying = "Whizz";

        if (isExactDivisionByThree && isExactDivisionByFive && isExtractDivisionBySeven) {
            return String.join("", threeSaying, fiveSaying, sevenSaying);
        }

        if (isExactDivisionByFive && isExtractDivisionBySeven) {
            return String.join("", fiveSaying, sevenSaying);
        }
        if (isExactDivisionByThree && isExtractDivisionBySeven) {
            return String.join("", threeSaying, sevenSaying);
        }
        if (isExactDivisionByFive && isExactDivisionByThree) {
            return String.join("", threeSaying, fiveSaying);
        }
        if (isExactDivisionByThree) {
            return threeSaying;
        }

        if (isExactDivisionByFive) {
            return fiveSaying;
        }
        if (isExtractDivisionBySeven) {
            return sevenSaying;
        }

        return String.valueOf(number);
    }
}
