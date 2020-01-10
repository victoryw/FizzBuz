package fizz.buz;

public class FizzBuz {
    public String count(int number) {


        final boolean isExactDivisionByThree = number % 3 == 0;
        final boolean isExactDivisionByFive = number % 5 == 0;
        final boolean isExtractDivisionBySeven = number % 7 == 0;

        return generateSaying(number, isExactDivisionByThree, isExactDivisionByFive, isExtractDivisionBySeven);
    }

    private String generateSaying(int number, boolean isExactDivisionByThree, boolean isExactDivisionByFive, boolean isExtractDivisionBySeven) {
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String Whizz = "Whizz";
        String result;
        if (isExactDivisionByFive && isExtractDivisionBySeven) {
            result = String.join("", Fizz, Whizz);
            return result;
        }
        if (isExactDivisionByThree && isExtractDivisionBySeven) {
            result = String.join("", Fizz, Whizz);
            return result;
        }
        if (isExactDivisionByFive && isExactDivisionByThree) {
            result = String.join("", Fizz, Buzz);
            return result;
        }
        if (isExactDivisionByThree) {
            result = Fizz;
            return result;
        } else if (isExactDivisionByFive) {
            result = Buzz;
            return result;
        }
        if (isExtractDivisionBySeven) {
            result = Whizz;
            return result;
        }

        result = String.valueOf(number);
        return result;
    }
}
