//Problem Link : https://www.hackerrank.com/challenges/runningtime
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class RunningTimeOfAlgorithms {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            int low=0;
            int hi=j;
            int mid=0;
            int pos=0;
            while(hi>=low){
                mid=low+(hi-low)/2;
                if(arr[mid]==key){
                    break;
                }
                else if(arr[mid]>key){
                    hi=mid-1;
                }
                else if(arr[mid]<key){
                    low=mid+1;
                }
            }
            mid=(hi+low)/2;
            if(key>=arr[mid]){
                pos=mid+1;
            }
            else{
                pos=mid;
            }
            for(;j>=pos;j--){
                if(key!=arr[j]) {
                    arr[j + 1] = arr[j];
                    count++;
                }
            }
            arr[pos]=key;

        }
        System.out.println(count);

    }
}
