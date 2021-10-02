package Exercise06;

/*
 *@author Ruhi Kansagara (20CS022)
 *(Pattern recognition: consecutive four equal numbers) Write the following
 *method that tests whether the array has four consecutive numbers with the same
 *value.
 *       public static boolean isConsecutiveFour(int[] values)
 *Write a test program that prompts the user to enter a series of integers and displays
 *true if the series contains four consecutive numbers with the same value.
 *Otherwise, display false. Your program should first prompt the user to enter the input
 *size—i.e., the number of values in the series
 */
import java.util.Scanner;

public class Exercise06_30 {
    //method to check if the number series has four consecutive numbers
    public static boolean isConsecutiveFour(int[] values)
    {
        //to store count
        int count=0;
        //for loop to check if the array has four consecutive numbers
        for(int i=0; i<values.length - 3; i++)
        {
            if (values[i] == values[i + 1] && values[i + 1] == values[i + 2] && values[i + 2] == values[i + 3])
            {
                count++;
            }
        }
        //if count>0 -> the array has four consecutive numbers
        //else       -> the array does not have four consecutive numbers
        if(count>0)
        {
            System.out.println("The array has four consecutive numbers.");
        }
        else
        {
            System.out.println("The array has no four consecutive numbers");
        }
        return true;
    }
    //main method
    public static void main(String[] args) {
        //input from user
        Scanner sc = new Scanner(System.in);
        //to store size of array
        int size;
        System.out.println("Enter size of array: ");
        //Scanning the value of size
        size = sc.nextInt();
        int[] array0fNum = new int[size];
        //User entering the array elements
        System.out.print("Enter the elements of the array :");
        for(int i=0; i<array0fNum.length; i++)
        {
            array0fNum[i] = sc.nextInt();
        }
        //Printing values of array
        System.out.println("Array elements are :");
        for(int i=0; i< array0fNum.length; i++)
        {
            System.out.println(array0fNum[i]);
        }
        //Calling the method
        isConsecutiveFour(array0fNum);
    }

}