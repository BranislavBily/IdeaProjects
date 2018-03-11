package tasks;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * and will be punished
 * This code is proprietary and confidential of the person stated bellow
 * Created by Branislav Bilý on 11.03.2018
 * If you are confused, feel free to ask me <branislav.bily@gmail.com>
 */
public class Task8StudentsAgain {

    static int[][] students;
    static String[] names;
    static Scanner sc = new Scanner(System.in);
    static int[] max;

    public static void main(String[] args) {
        creatingArrayOfStudetsAndMarks();
        double[] AM = calculatingAM();
        searchingForAStudent(AM);
    }

    public static void creatingArrayOfStudetsAndMarks() {
        System.out.print("Input amount of students: ");
        int amountOfStudents = sc.nextInt(), amountOfMarks;
        students = new int[amountOfStudents][];
        names = new String[amountOfStudents];
        for(int i = 0; i < amountOfStudents; i++) {
            System.out.print("Input name of student: ");
            names[i] = sc.next();
            System.out.print("Input amount of marks of "+names[i]+": ");
            amountOfMarks = sc.nextInt();
            students[i] = new int[amountOfMarks];
            for (int j = 0; j < amountOfMarks; j++) {
                j++;
                System.out.print("Input "+j+". mark "+names[i]+". student: ");
                j--;
                students[i][j] = sc.nextInt();
            }
        }
    }

    public static double[] calculatingAM() {
        max = new int[students.length];
        Arrays.fill(max, 1);
        double[] AM = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            double sum = 0;
            for (int j = 0; j < students[i].length; j++) {
                sum += students[i][j];
                if( students[i][j] > max[i]) {
                    max[i] = students[i][j];
                }
            }
            AM[i] = (double) Math.round(sum / students[i].length * 100) / 100;
        }
        return AM;
    }

    public static void searchingForAStudent(double[] AM) {
        System.out.print("Input AM you want to find student to???: ");
        double userFindingThisAM = sc.nextDouble();
        int index = Search.linearSearchDouble(AM, userFindingThisAM);
        if(index == -1) {
            System.out.print("There's no student with this AM.");
        } else {
            System.out.print("Student named "+names[index]+" has AM of"+AM[index]);
            if (AM[index] <= 1.5 && max[index] <= 2) {
                System.out.print(", he PV.");
            } else if (AM[index] <= 2 && max[index] <= 3) {
                System.out.print(", he PVD");
            } else if (max[index] <= 4) {
                System.out.print(", he P");
            } else {
                System.out.print(", he N");
            }
        }
    }
}

