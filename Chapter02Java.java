// Java Bronze 対策 - Chapter2: データ型とマルチスレッド
// 学習目標: Javaのデータ型とマルチスレッドの基本・動かし方を理解する 

// スレッド用のクラス（Threadを継承）
class MyThread extends Thread {
    public void run() {
        // スレッドで実行される処理
        for (int i = 1; i <= 5; i++) {
            System.out.println("スレッド実行中: " + i);
            try {
                Thread.sleep(500); // 0.5秒待つ（スリープ）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("スレッド終了！");
    }
}
public class Chapter02Java{
    public static void main(String[] args){
        // データ型の説明とサンプル処理
        runDateTypesDemo(); // 先にデータ型を学習

        System.out.println();

        // マルチスレッドの実行
        runMultithreadDemo(); // マルチスレッドを動かす

        System.out.println(); 
        System.out.println("Chapter2完了");
    }

    // データ型の説明と動作例
    static void runDateTypesDemo() {
        System.out.println("===データ型の例 ===");

        // 整数型
        int i = 10;
        long l = 10000000000L;

        // 浮動小数点型
        float f = 3.14f;
        double d = 3.1415926535;

        // 暗黙の型変換
        int a = 50;
        double b = a;

        // 明示的な型変換
        double x = 5.9;
        int y =(int) x;

        // 文字型
        char c = 'A';

        // 真偽値型
        boolean boolTrue = true;
        boolean boolFalse = false;

        // 文字列（参照型）
        String s = "Java";

        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        
        System.out.println("暗黙の型変換 int a → double b: " + b); //int=50
        
        System.out.println("明示的な型変換 double x → int y: ");
        System.out.println(" double x: " + x ); 
        System.out.println(" int y: "+ y);
        
        System.out.println("char: " + c);
        System.out.println("boolean true: " + boolTrue);
        System.out.println("boolean false: " + boolFalse);
        System.out.println("String: " + s);
    }

    // マルチスレッドの実行例
    static void runMultithreadDemo() {
        System.out.println("=== マルチスレッドの例 ===");
        System.out.println("メインスレッド開始");

        MyThread thread = new MyThread(); // 新しいスレッドを作る
        thread.start();                   // スレッドを動かす

        // メインスレッドは別の処理を続ける
        for (int i = 1; i <= 5; i++) {
            System.out.println("メインスレッド実行中: " + i);
            try {
                Thread.sleep(700); // 0.7秒待つ
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("メインスレッド終了");
    }
}




# Chapter2 学習ポイント

1.マルチスレッドの基礎
- class MyThread extends Thread {
  // Javaには元々Threadクラスがあり、
  // これを継承すると自分のクラスが新しいスレッドとして動けるようになる
}
- run()
  // ()の中の処理がスレッドの仕事になる(スレッドがやることを書く)
- thread.start()でスレッドを動かし始める
- メインスレッドと別々に処理が進むので同時に動くように見える(＝マルチスレッド)  
1.データ型

├─ プリミティブ型
│   ├─ 整数型: byte, short, int, long
│   ├─ 小数型: float, double
│   ├─ 文字型: char
│   └─ 真偽値型: boolean
└─ 参照型
    ├─ 文字列型: String
    └─ 配列型: int[], String[]

暗黙の型変換、明示的な型変換
・""で囲まれた部分は文字列として扱われる。    
・double型はintよりも表現できる範囲が広いため、intからdoubleへの変換は自動で行われる(暗黙)
・doubleからintに変更する場合は大きな型から小さな型への変換となるため明示的に指定する必要があり、小数点以下が強制的に切り捨てられる可能性がある(明示的)
    
# =======================
