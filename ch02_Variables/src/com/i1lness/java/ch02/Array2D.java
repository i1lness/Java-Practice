package com.i1lness.java.ch02;

public class Array2D {
    public static void main(String[] args) {
        int[][] grades = {
            {80, 95, 92, 70},
            {70, 99, 75, 100}
        };

        double sumJane = 0;
        for (int i=0; i < grades[0].length; ++i){
            int grade = grades[0][i];
            sumJane += grade;
        }

        double averageJane = sumJane / grades[0].length;

        double sumMike = 0;
        for(int grade : grades[1]){
            sumMike += grade;
        }

        double averageMike = sumMike / grades[1].length;
        System.out.println("전체 학생수는 " + grades.length);
        System.out.println("Jane의 평균 점수는 " + averageJane);
        System.out.println("Mike의 평균 점수는 " + averageMike);
    }
}