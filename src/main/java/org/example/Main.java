package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};
        GradeManager manager = new GradeManager();

        System.out.println("Original grades:");
        manager.printGrades(grades);

        manager.sortGrades(grades);
        System.out.println("Sorted grades:");
        manager.printGrades(grades);

        int existingGrade = 90;
        int missingGrade = 100;

        System.out.println("Index of grade " + existingGrade + ": " + manager.searchGrade(grades, existingGrade));
        System.out.println("Index of grade " + missingGrade + ": " + manager.searchGrade(grades, missingGrade));

        // Valid index access
        System.out.println("Grade at index 2: " + manager.getGrade(grades, 2));

        // Invalid index access
        System.out.println("Grade at index 10: " + manager.getGrade(grades, 10));

        // Bonus Features
        System.out.println("Average grade: " + manager.calculateAverage(grades));
        System.out.println("Highest grade: " + manager.findHighestGrade(grades));
        System.out.println("Lowest grade: " + manager.findLowestGrade(grades));
    }
}
