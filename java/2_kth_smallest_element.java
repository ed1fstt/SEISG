import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declare variables
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int numTest = in.nextInt();
        int[] result = new int[numTest];
        for (int g = 0; g<numTest; g++ ) {
            int sizeArray = in2.nextInt();
            String stringArray = sc.nextLine();
            int k = in2.nextInt();
            //create an array if integers
            String[] integerStrings = stringArray.split(" ");
            int[] integers = new int[integerStrings.length];
            for (int i = 0; i < integers.length; i++) {
                integers[i] = Integer.parseInt(integerStrings[i]);
            }
            //sorting array
            for (int i = 0; i < integers.length; i++) {
                int min = integers[i];
                int imin = i;
                for (int j = i + 1; j < integers.length; j++) {
                    if (integers[j] < min) {
                        min = integers[j];
                        imin = j;
                    }
                }
                if (i != imin) {
                    int temp = integers[i];
                    integers[i] = integers[imin];
                    integers[imin] = temp;
                }
            }
            result[g] = integers[k-1];
        }
        for (int i = 0; i < result.length; i++) {
             System.out.println(result[i]);
        }
        in.close();
        in2.close();
        sc.close();
}
}
