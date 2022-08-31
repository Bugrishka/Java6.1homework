package ru.netology.sqr;

public class SQRService {

    public int calcIteration(int lower, int upper) {

        int iteration = 0;

        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square > upper) {
                break;
            }
            if (square >= lower && square <= upper) {
                iteration++;
            }
        }
        return iteration;
        //return -1;???
    }
}