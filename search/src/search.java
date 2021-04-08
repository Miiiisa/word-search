import java.io.*;
import java.util.*;

public class search {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("5K_sents.txt"));
        ArrayList<String> listS = new ArrayList<String>();
        int[] i1;
        int[] i2;
        int[] i3;
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        while(sc.hasNextLine()) {
            listS.add(sc.nextLine());
        }

        String[] data = listS.toArray(new String[]{});

        System.out.println("United:");
        for(int i = 0; i<5000; i++){
            if(data[i].contains("United")){
                System.out.println(i+1);
                counter1++;
            }
        }

        System.out.println("States:");
        for(int i = 0; i<5000; i++){
            if(data[i].contains("States")){
                System.out.println(i+1);
                counter2++;
            }
        }

        System.out.println("Kingdom:");
        for(int i = 0; i<5000; i++){
            if(data[i].contains("Kingdom")){
                System.out.println(i+1);
                counter3++;
            }
        }

        i1 = new int[counter1];
        i2 = new int[counter2];
        i3 = new int[counter3];

        System.out.println("United States:");
        for(int i = 0; i<5000; i++){
            if(data[i].contains("United")){
                i1[counter]= i+1;
                counter++;
            }
        }

        counter = 0;
        for(int i = 0; i<5000; i++){
            if(data[i].contains("States")){
                i2[counter]= i+1;
                counter++;
            }
        }

        int m = i1.length;
        int n = i2.length;
        printIntersection(i1, i2, m, n);

        System.out.println("United Kingdom:");

        counter = 0;
        for(int i = 0; i<5000; i++){
            if(data[i].contains("Kingdom")){
                i3[counter]= i+1;
                counter++;
            }
        }

        int o = i3.length;
        printIntersection(i1, i3, m, o);

    }

    static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n)
        {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else
            {
                System.out.println(arr2[j++]+" ");
                i++;
            }
        }
    }

}
