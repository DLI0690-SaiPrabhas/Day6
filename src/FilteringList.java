import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FilteringList {

   List<String> list = new ArrayList<>();

    Scanner sc=new Scanner(System.in);
    public void ListPrinting() {
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<=n;i++){
            list.add(sc.nextLine());
        }
        list.stream().filter(e ->
                    e.startsWith("A")||e.startsWith("a"))
                    .forEach(System.out::println);
    }

     public static void main (String[]args){

        FilteringList obj=new FilteringList();
            obj.ListPrinting();

        }
    }
