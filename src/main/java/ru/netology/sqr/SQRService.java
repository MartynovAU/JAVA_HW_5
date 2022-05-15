package ru.netology.sqr;

public class SQRService {

    public int squareRoot(int limMin, int limMax) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i) >= limMin) {
                if ((i * i) <= limMax) {
                    count++;
                }
            }
        }
        return count;
    }

}
