import java.util.*;
public class Main{

    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Test case you want to enter : ");
        int c = sc.nextInt();
        for (int i=0;i<c;i++){
            System.out.println("Enter the number which representing the number of elements in list : ");
            int l = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j=0;j<l;j++){
                System.out.println("Enter number "+(i+1)+" : ");
                list.add(sc.nextInt());
            }
            reversort(list);
            System.out.println(list);
            System.out.println("Total Cost is : "+sum);
        }

    }

    private static void reversort(ArrayList<Integer> list) {

        for (int i=0;i<list.size()-1;i++){
            int minIndex = findminimum(list,i,list.size());
            sum += minIndex-i +1;
            System.out.println(minIndex-i+1);
            Collections.swap(list,i,minIndex);
        }
    }

    private static int findminimum(ArrayList<Integer> list, int i, int size) {
        int min = Integer.MAX_VALUE;
        int index=0;
        for (int j=i;j<list.size();j++){
            if (list.get(j) <min){
                min = list.get(j);
                index = j;
            }
        }
        return index;
    }
}