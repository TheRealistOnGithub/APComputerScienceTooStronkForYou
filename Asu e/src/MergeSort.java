import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nitin "Like a Sweater" Armstrong
 * @version 4.20
 * does a sick merge sort I hope
 */

public class mergeSortTooStrongForYou {
    public static ArrayList<Integer> initialArray = new ArrayList<>();
    public static ArrayList<Integer> firstHalf = new ArrayList<>();
    public static ArrayList<Integer> secondHalf = new ArrayList<>();
    public static ArrayList<Integer> output = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan;


        File file = new File("input");
        scan = new Scanner(file);
        while (scan.hasNextLine()) {
            initialArray.add(scan.nextInt());
        }
        scan.close();
        divide(initialArray);

    }


    public static void divide(ArrayList<Integer>input){

    }
}