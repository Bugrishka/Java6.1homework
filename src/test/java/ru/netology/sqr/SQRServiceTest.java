package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "5,300,500",
            "7,300,600",
    })
    public void numberOfSquaresInTheRange(int expected, int lower, int upper) {
        SQRService service = new SQRService();

        int actual = service.calcIteration(lower, upper);

        Assertions.assertEquals(expected, actual);
    }



//    @Test
//    public void numberOfSquaresInTheRange() {
//        SQRService service = new SQRService();
//
//        int expected = 3;
//        int actual = service.calcIteration(200,300);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void numberOfSquaresInTheRange1() {
//        SQRService service = new SQRService();
//
//        int expected = 5;
//        int actual = service.calcIteration(300,500);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
