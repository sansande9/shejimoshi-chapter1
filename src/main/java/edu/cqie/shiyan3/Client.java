package edu.cqie.shiyan3;

public class Client {
    public static void main(String[] args) {
        ScoreOperation scoreOperation = new ScoreOperationAdapter();
        int[] studentScores = {78, 92, 67, 85, 91};
        // 对成绩进行排序
        scoreOperation.sort(studentScores);
        // 打印排序后的成绩
        for (int score : studentScores) {
            System.out.print(score + " ");
        }
        System.out.println();
        // 查找特定成绩的索引
        int targetScore = 85;
        int index = scoreOperation.search(studentScores, targetScore);
        if (index != -1) {
            System.out.println("找到了成绩 " + targetScore + "，其索引是: " + index);
        } else {
            System.out.println("没有找到成绩 " + targetScore);
        }
    }
}
