package edu.cqie.shiyan3;

public class QuickSortClass {
    public static void quickSort(int[] args) {
        sort(args, 0, args.length - 1);
    }

    public static void sort(int[] arr,int leftBound,int rightBound) {
        if(leftBound >= rightBound) return;
        int mid= partition(arr, leftBound, rightBound); //得到轴的位置
        sort(arr, leftBound, mid-1); //左边排序
        sort(arr, mid+1, rightBound); //右边排序
    }
    static int partition(int[] arr, int leftBound,int rightBound) {
        int pivot = arr[rightBound]; //指定数组最右边的数是用来比较的值 轴
        int left = leftBound;
        int right = rightBound - 1;

        while (left <= right) {
            while(left <= right && arr[left] <= pivot) left++;
            while(left <= right && arr[right] > pivot) right--;

            if (left < right) {
                //如果 左边的数比右边的数小  两个数交换
                swap(arr, left, right);
            }
        }
        //把left最后一次指向的位置与pivot（轴）的位置交换
        swap(arr, left, rightBound);

        return left; //返回轴的位置
    }

    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
