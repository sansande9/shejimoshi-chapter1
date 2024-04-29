package edu.cqie.shiyan3;

public class ScoreOperationAdapter implements ScoreOperation {

    // 适配器持有算法类的引用
    private QuickSortClass quickSorterClass = new QuickSortClass();
    private BinarySearchClass binarySearcherClass = new BinarySearchClass();

    @Override
    public void sort(int[] scores) {
        // 使用QuickSortClass的quickSort方法对成绩数组进行排序
        quickSorterClass.quickSort(scores);
    }

    @Override
    public int search(int[] scores, int target) {
        // 使用BinarySearchClass的binarySearch方法在成绩数组中查找特定成绩
        return binarySearcherClass.binarySearch(scores, target);
    }
}
