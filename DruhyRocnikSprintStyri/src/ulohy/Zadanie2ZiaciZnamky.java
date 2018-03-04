package ulohy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 08.02.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Zadanie2ZiaciZnamky {

    public static int inputOfNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public static double calculationOfAritheticMean(int arrayOfMarks[]) {
        double sum = 0, amount = arrayOfMarks.length;
        for (int i = 0; i < arrayOfMarks.length; i++) {
            sum += arrayOfMarks[i];
        }
        double result = (double) Math.round(sum / amount * 100) / 100;
        return result;
    }

    public static void printingStudentBasedOnAM(double AM[], double sortedAM[]) {
        int indexOfStudent;
        for (int i = 0; i < AM.length; i++) {
            indexOfStudent = (int)Vyhladavania.linearSearchDouble(AM, sortedAM[i]);
            System.out.println();
            System.out.printf("%1d. student was student number %1d with AM of %.2f", i, indexOfStudent, sortedAM[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Input number of students: ");
        int numberOfStudents = inputOfNumber();
        int studentsAndMarks[][] = new int[numberOfStudents][];
        for (int i = 0; i < studentsAndMarks.length; i++) {
            System.out.printf("Input amount of marks of student number %1d: ", i);
            studentsAndMarks[i] = new int[inputOfNumber()];
            for (int j = 0; j < studentsAndMarks[i].length; j++) {
                System.out.printf("Input %1d. mark of student %1d: ",j, i);
                studentsAndMarks[i][j] = inputOfNumber();
                while(studentsAndMarks[i][j] > 5 || studentsAndMarks[i][j] < 0) {
                    System.out.print("Input correct number: ");
                    studentsAndMarks[i][j] = inputOfNumber();
                }
            }
        }
        double AM[] = new double[studentsAndMarks.length];
        for (int i = 0; i < AM.length; i++) {
            AM[i] = calculationOfAritheticMean(studentsAndMarks[i]);
        }
        double sortedAM[] = Sorty.bubbleSortAscending(AM.clone());
        for (int i = 0; i < sortedAM.length; i++) {
        }
        printingStudentBasedOnAM(AM, sortedAM);
    }
}
