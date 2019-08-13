package session7;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="This is a String";
		test=test.toLowerCase();
		String[] split=test.split(" ");
		Arrays.sort(split);
		for(String i:split) {
			System.out.println(i);
			
		}
		for(int i=0;i<split.length;i++) {
			
			split[i]=selSort(split[i].toCharArray(),split[i].length());
		}
		for(int i=0;i<split.length;i++) {
			for(int j=0;j<split[i].length();j++)
			System.out.println(split[i]);
			
		}
		
		/*
		String[][] arr=new [split.length][];
		for(int i=0;i<split.length;i++) {
			arr[i]=split[i].toCharArray();
		}
		
		for(int i=0;i<split.length;i++) {
			for(int j=0;j<split[i].length();j++) {
				arr[i][j]=split[i].substring(j,j+1);
			}
		}
		for(int i=0;i<split.length;i++) {
			Arrays.Sort(arr[i]));
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+",");
			}
		}*/
		
		/*for(int i=0;i<split.length;i++) {
			for(int j=0;j<split;j++) {
				
			}
		}*/
	}
	public static String selSort(char[] sort,int len) {
		if(len==1) {
			return sort.toString();
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
