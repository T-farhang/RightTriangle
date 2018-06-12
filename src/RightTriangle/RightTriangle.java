/*
                Tahereh Farhang , Barbod Accademy , 2nd session , 5th excercise.
                        Right triangle test
 */
package RightTriangle;

import java.util.Scanner;

/**
 *
 * @author Totia
 */
public class RightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your 3 numbers :");
        float[] Array = new float[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(String.format(" Number %d : ", i));
            Array[i] = sc.nextFloat();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Array[i] < Array[j]) {
                    float empt = Array[i];
                    Array[i] = Array[j];
                    Array[j] = empt;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            Array[i] *= Array[i];
        }
        if (Array[2] == (Array[0] + Array[1])) {
            System.out.println("It's right triangle.");
        } else {
            System.out.println("It's not triangle!");
        }
    }
}
