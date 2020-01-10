/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fizz.buz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 8, 41})
    void should_report_as_number_when_count_is_normal_case(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals(String.valueOf(number), answer);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void should_be_said_fiz_when_count_is_3_times(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals("Fizz", answer);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 40})
    void should_be_said_Buzz_when_count_is_5_times(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals("Buzz", answer);
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 14, 49})
    void should_be_said_Whizz_when_count_is_7_times(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals("Whizz", answer);
    }

    @ParameterizedTest
    @ValueSource(ints = {60, 90, 120})
    void should_be_said_FizzBuzz_when_count_is_same_as_3_and_5_times(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals("FizzBuzz", answer);
    }

    @ParameterizedTest
    @ValueSource(ints = {21, 189, 147})
    void should_be_said_FizzBuzz_when_count_is_same_as_3_and_7_times(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals("FizzWhizz", answer);
    }

    @ParameterizedTest
    @ValueSource(ints = {35})
    void should_be_said_FizzBuzz_when_count_is_same_as_5_and_7_times(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals("BuzzWhizz", answer);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 13, 113})
    void should_be_said_Fizz_when_count_is_contain_3(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals("Fizz", answer);
    }

    @ParameterizedTest
    @ValueSource(ints = {56})
    void should_be_follow_the_division_7_rule_when_count_is_contain_5(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals("Whizz", answer);
    }

    @Test
    void should_be_follow_the_ignore_division_3_rule_when_count_is_contain_5() {
        FizzBuz fizzBuz = new FizzBuz();

        String division5Answer = fizzBuz.count(15);
        assertEquals("Buzz", division5Answer);

        String division5and7Answer = fizzBuz.count(105);
        assertEquals("BuzzWhizz", division5and7Answer);

        String defaultAnswer = fizzBuz.count(54);
        assertEquals("54", defaultAnswer);
    }

    @Test
    void should_be_follow_contain_3_rule_when_count_is_contain_7() {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(73);

        assertEquals("Fizz", answer);
    }

    @ParameterizedTest
    @ValueSource(ints = {17, 71})
    void should_be_follow_default_rule_when_count_is_contain_7(int number) {
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(number);

        assertEquals(String.valueOf(number), answer);
    }

    @Test
    void should_be_ignore_5_times_when_count_is_contain_7() {
        //75, 70, 175
        FizzBuz fizzBuz = new FizzBuz();

        String answer = fizzBuz.count(70);

        assertEquals("Whizz", answer);



        answer = fizzBuz.count(175);

        assertEquals("Whizz", answer);

        answer = fizzBuz.count(75);

        assertEquals("Fizz", answer);

        answer = fizzBuz.count(170);

        assertEquals("170", answer);
    }


}
