package fizz.buz;

public class FizzBuz {
    public String count(int number) {
        String result;

        if (number % 3 == 0) {
            result = "Fizz";
        }
        else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(number);
        }
        return result;
    }
}
