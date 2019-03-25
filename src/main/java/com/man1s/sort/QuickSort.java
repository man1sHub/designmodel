package com.man1s.sort;

public class QuickSort {
    public static void main(String[] args) {
        int [] array  = {19,28,73,633,15,422,13,22,1111};
        sort(array,0,array.length-1);
        for (int a:array){
            System.out.println(a);
        }

    }
    public  static  void sort(int [] sort,int start,int end){
        int value  = sort[start];
        int offset = start;
        for (int i = start+1;i<=end;i++){
            if(value>sort[i]){
                sort[start] = sort[i];
                start++;
                sort[i] = sort[start];
                sort[start]= value;
            }
        }
        if(offset!=start){
            sort(sort,offset,start-1);
        }
        if(start!=end){
            sort(sort,start+1,end);
        }

    }




}
