package ru.netology.sqr;

public class SQRService {

    public int sqrtCeil(int lowNum, int highNum) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrtNum = i * i;
            if (sqrtNum >= lowNum && sqrtNum <= highNum) {
                count = count + 1;
            }
        }
        return count;
    }
}
