import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element of array: ");
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr) map.put(num,map.getOrDefault(num,0)+1);


        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1) {
                System.out.print(entry.getKey()+" ");
            }
        }
        System.out.println("Original Array: "+Arrays.toString(arr));
    }
}
