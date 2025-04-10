package org.example;
import java.util.Arrays;

public class GradeManager {

    public void printGrades(int[] grades) {
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

    public void sortGrades(int[] grades) {

        Arrays.sort(grades);
    }

    public int searchGrade(int[] grades, int target) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == target) {
                return i;
            }
        }
        return -1; // Grade not found
    }

    public int getGrade(int[] grades, int index) {
        try {
            return grades[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
            return -1; // fallback value
        }
    }

    public double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public int findHighestGrade(int[] grades) {
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public int findLowestGrade(int[] grades) {
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }
}