import java.util.Scanner;
public class ArrayMaxMin{
  public static void main(String args[]){
    scanner sc=new scanner(system.in);
    system.out.println("Enter the array size");
    int n =sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
      system.out.println("Enter the value"+(i+1));
      arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
      if(max<arr[i])
      max=arr[i];
      else if (min>arr[i])
      min=arr[i];
    }
    system.out.println("Max value="+max+"Min value ="+min);
  }
}