package com.i1lness.java.ch02;

public class ArrayDouble {
    public static void main(String[] args) {
        double[] sensorData;
        sensorData= new double[] {
            1.0,
            2.2,
            3.1,
        };

        int firstTndex = 0;
        int lastIndex = sensorData.length -1;

        System.out.println("첫 번째 센서 데이터: " + sensorData[firstTndex]);
        System.out.println("마지막 센서 데이터: " + sensorData[lastIndex]);
        System.out.println("센서 데이터 개수: " + sensorData.length);
    };
}
