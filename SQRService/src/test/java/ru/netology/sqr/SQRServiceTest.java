package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @ParameterizedTest
    @CsvSource (value = {"`200-300`, 200, 300, 3 ", "`200-500`, 200, 500, 8"})
    public void shouldSqrtCeil(String testName, int lowNum, int highNum, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrtCeil(lowNum, highNum);

        assertEquals(expected, actual);
    }
}