
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;


public class SumOfEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> lists = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            lists.add(sc.nextInt());
        }
        System.out.println("The list of elements are: "+ Arrays.toString(new ArrayList[]{lists}));

        lists.stream()
                .filter(c->c%2==0)

                .reduce(0,(c1,c2)->c1*c2);

        System.out.println(lists);
    }
}











