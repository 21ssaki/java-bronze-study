// Java Bronze 対策 - Chapter3: 演算子と分岐文
// 学習目標: Javaの演算子の使い方と条件分岐(if/switch)の書き方を理解する

public class Chapter03Java {
    public static void main(String[] args) {

        // 1. 算術演算子の例
        System.out.println("=== 算術演算子の例 ===");
        int a = 10;
        int b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println(); // 空行

        // 2. 比較演算子の例
        System.out.println("=== 比較演算子の例 ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println(); // 空行

        // 3. 論理演算子の例
        System.out.println("=== 論理演算子の例 ===");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println(); // 空行

        // 4. if文の例（条件による分岐）
        System.out.println("=== if文の例 ===");
        int score = 75;
        System.out.println("点数: " + score);

        if (score >= 90) {
            System.out.println("評価: A");
        } else if (score >= 80) {
            System.out.println("評価: B");
        } else if (score >= 70) {
            System.out.println("評価: C");
        } else {
            System.out.println("評価: D");
        }

        System.out.println(); // 空行

        // 5. switch文の例（複数の選択肢）
        System.out.println("=== switch文の例 ===");
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            default:
                System.out.println("土日または不明な曜日");
                break;
        }

        System.out.println(); // 空行
        System.out.println("Chapter3 完了！");
    }
}
