// Java Bronze 対策 - Chapter4: ループ文（for, while, do-while, 拡張for, continue, break, ネスト）
// 学習目標: 基本的なループ文の使い方と制御文を理解する

public class Chapter04Java {
    public static void main(String[] args) {

        // 1. for文の例
        System.out.println("=== for文の例 ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();

        // 2. while文の例
        System.out.println("=== while文の例 ===");
        int w = 1;
        while (w <= 5) {
            System.out.println("w = " + w);
            w++;
        }
        System.out.println();

        // 3. do-while文の例
        System.out.println("=== do-while文の例 ===");
        int d = 1;
        do {
            System.out.println("d = " + d);
            d++;
        } while (d <= 5);
        System.out.println();

        // 4. 拡張for文の例
        System.out.println("=== 拡張for文の例 ===");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("num = " + num);
        }
        System.out.println();

        // 5. continue文の例
        System.out.println("=== continue文の例 ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("i = 3 のためスキップ");
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println();

        // 6. break文の例
        System.out.println("=== break文の例 ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                System.out.println("i = 4 でループ終了");
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println();

        // 7. ネストしたループの例
        System.out.println("=== ネストしたループの例 ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println();
        System.out.println("Chapter4 完了！");
    }
}
