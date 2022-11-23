/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void next_permutation(int arr[]){
        int n=arr.length,i,j;
        for(i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                break;
            }
        }
        //   if the given arr is privided the last permutation then reverse all the element
        if(i<0){
            reverse(arr,0,n-1);
        }
        else{
            for(j=n-1;j>i;j--){
                if(arr[j]>arr[i]){
                    break;
                }
            }
            swap(arr,i,j);
            reverse(arr,i+1,n-1);
        }
    }// swap two element which just greater than the find out element
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //reverse the rest of element
    public static void reverse(int arr[],int start,int end){
       while (start < end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start ++;
        end --;
           
       }
    }
    
   
    
    
	public static void main(String[] args) {
	int arr[]={1,2,4,7,6,5,3};
	next_permutation(arr);
// 	System.out.print(Arrays.toString(arr));
	for (int i : arr) {
      System.out.print(i + " ");
    }
	
	}
}
