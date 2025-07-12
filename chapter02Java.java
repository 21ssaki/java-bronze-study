// Java Bronze 対策 - Chapter2: データ型と演算子
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


        // 1. マルチスレッドの実行例
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
        System.out.println("Chapter1 完了！");
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

# =======================

  データ型については後日学習予定
