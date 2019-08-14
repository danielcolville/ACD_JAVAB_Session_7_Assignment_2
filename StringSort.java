package session7;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String with spaces to be sorted");
		String test=sc.nextLine();
		test=test.toLowerCase();
		String[] split=test.split(" ");
		Arrays.sort(split);
		int maxStrLen=0;
		System.out.println("The words after sorting:");
		for(String i:split) {
			System.out.println(i);
			if(i.length()>maxStrLen) {
				maxStrLen=i.length();
			}
		}
		char[][] arr=new char[split.length][maxStrLen];
		for(int i=0;i<split.length;i++) {
			arr[i]=selSort(split[i].toCharArray(),split[i].length());
		}
		System.out.println("The words and characters after sorting");
		for(int i=0;i<split.length;i++) {
			for(int j=0;j<split[i].length();j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public static char[] selSort(char[] sort,int len) {
		if(len==1) {
			return sort;
		}
		int currMinInd=sort.length-len;
		for(int j=sort.length-len+1;j<sort.length;j++) {
			if(sort[j]<sort[currMinInd]) {
				currMinInd=j;
			}
		}
		char[] next=new char[sort.length];
		int j;
		
		for(j=0;j<(sort.length-len);j++) {
			next[j]=sort[j];
		}
		char temp=sort[j];
		next[j++]=sort[currMinInd];
		
		for(int i=j;i<sort.length;i++) {
			if(i!=currMinInd) {
				next[i]=sort[i];
			}
			else {
				next[i]=temp;
			}
		}
		return selSort(next,len-1);
	}
}
