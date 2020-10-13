package service;

import java.util.Arrays;

/**
 * 二叉堆测试
 */

public class Heap {
    public static void upAdjust(int [] arr){
        int childIndex=arr.length-1;
        int parentIndex=(childIndex-1)/2;
        //使用中间数保存子结点的值
        int temp=arr[childIndex];
        while (childIndex>0&&temp<arr[parentIndex]){
            arr[childIndex]=arr[parentIndex];
            childIndex=parentIndex;
            parentIndex=(parentIndex-1)/2;
        }
        arr[childIndex]=temp;
    }

    public static void main(String[] args) {
        int []array=new int[]{1,3,2,6,5,7,8,9,10,0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));
    }
}
