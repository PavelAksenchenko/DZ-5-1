package ru.netology.sqr;

public class main {
    public static void Main(String[] args) {
        int lowerLimit = 200;
        int upperLimit = 300;
        SQRService sqrService = new SQRService();
        sqrService.rangeOfValues(lowerLimit, upperLimit);
        System.out.println("Расчет завершен");
    }
}