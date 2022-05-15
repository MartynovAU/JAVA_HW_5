package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "200,400,6",
            "0, 100, 1"
    })
    public void test(int limMin, int limMax, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareRoot(limMin, limMax);

        Assertions.assertEquals(expected, actual);

    }
}
