// Java Bronze 対策 - Chapter1: Javaの基礎の基礎
// 学習目標: Javaプログラムの基本構造を理解する

// クラスの定義（ファイル名と同じ名前にする）
public class Chapter01Java {

// mainメソッド - プログラムの開始点
public static void main(String[] args) {
    
    // 1. 最初のJavaプログラム - Hello World
    System.out.println("Hello World");
    System.out.println("Javaの学習を始めます！");
    
    // 改行を入れる
    System.out.println(); // 空行
    
    // 2. 変数とは何か - データを入れる箱
    // 年齢を入れる箱
    int age = 25;
    // 名前を入れる箱
    String name = "田中";
    
    // 変数の中身を表示
    System.out.println("名前: " + name);
    System.out.println("年齢: " + age);
    
    System.out.println(); // 空行
    
    // 3. 基本的なデータ型
    int number = 100;           // 整数
    double price = 150.5;       // 小数
    char initial = 'A';         // 1文字
    boolean isTrue = true;      // true または false
    String message = "こんにちは"; // 文字列
    
    System.out.println("整数: " + number);
    System.out.println("小数: " + price);
    System.out.println("文字: " + initial);
    System.out.println("真偽値: " + isTrue);
    System.out.println("文字列: " + message);
    
    System.out.println(); // 空行
    
    // 4. 簡単な計算
    int a = 10;
    int b = 3;
    
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    
    System.out.println(); // 空行
    
    // 5. if文 - 条件によって処理を変える(80以上で合格と表示)
    int score = 80;
    
    System.out.println("点数: " + score);
    
    if (score >= 80) {
        System.out.println("合格です！");
    } else {
        System.out.println("不合格です。");
    }
    
    System.out.println(); // 空行
    
    // 6. for文 - 繰り返し処理
    System.out.println("1から5まで数える:");
    
    for (int i = 1; i <= 5; i++) {
        System.out.println(i);
    }
    
    System.out.println(); // 空行
    
    // 7. 配列 - 複数のデータをまとめて管理(値=要素・インデックス=0から始まる)
    int[] numbers = {10, 20, 30, 40, 50};
    
    System.out.println("配列の中身:");
    System.out.println("1番目: " + numbers[0]);
    System.out.println("2番目: " + numbers[1]);
    System.out.println("3番目: " + numbers[2]);
    
    System.out.println(); // 空行
    
    // 8. 配列の全要素を表示
    System.out.println("配列の全要素:");
    for (int i = 0; i < numbers.length; i++) {
        System.out.println((i + 1) + "番目: " + numbers[i]);
    }
    
    System.out.println(); // 空行
    
    // 9. 文字列の基本操作
    String text = "Java";
    
    System.out.println("文字列: " + text);
    System.out.println("文字数: " + text.length());
    System.out.println("大文字: " + text.toUpperCase());
    System.out.println("小文字: " + text.toLowerCase());
    
    System.out.println(); // 空行
    System.out.println("Chapter1 完了！");
}
```

}

# /*

# Chapter1 学習ポイント

1. Javaプログラムの基本構造
- public class クラス名
- public static void main(String[] args)
- System.out.println() で出力
1. 変数の基本
- int: 整数を入れる箱
- double: 小数を入れる箱
- char: 1文字を入れる箱
- boolean: true/falseを入れる箱
- String: 文字列を入れる箱
1. 基本的な演算
- - (足し算)
- - (引き算)
- - (掛け算)
- / (割り算)
1. if文
- 条件によって処理を分ける
- if (条件) { 処理 } else { 処理 }
1. for文
- 繰り返し処理
- for (初期値; 条件; 増減) { 処理 }
1. 配列
- 複数のデータをまとめて管理
- int[] 配列名 = {値1, 値2, 値3}
- 配列[番号] でアクセス（0から始まる）
1. 文字列操作
- length(): 文字数を取得
- toUpperCase(): 大文字に変換
- toLowerCase(): 小文字に変換

# ==================================================
次のステップ

- このコードを実行して動作を確認
- 値を変更して実験
- Chapter2でメソッドとクラスを学習
  */
