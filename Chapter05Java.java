// Java Bronze 対策 - Chapter5: オブジェクト指向の基本（クラス、インスタンス、継承、ポリモーフィズム、カプセル化、has-a, is-a, 具象クラス）
// 学習目標: クラスとオブジェクトの基礎、継承、ポリモーフィズム、カプセル化、設計関係を理解する

// 1.オブジェクト指向
//モノ＝オブジェクトを使ってプログラミングを組み立てる考え方
//現実世界のものや概念をプログラムで表現する実体
//Javaではクラスから作られたインスタンスがオブジェクト
// 2.4大要素
//  1.)クラス:オブジェクトの型。オブジェクトはクラスから作成する
//  2.)カプセル化:データを隠し、安全に操作させる(private+getter/setter)
//  3.)継承:既存クラスの機能を引き継ぎ、新しいクラスを作る
//  4.)ポリモーフィズム:同じメソッド名で異なる動作を実現する(オーバーライドや多態性)

public class Chapter05Java {
  public static void main(String[] args){
    Dog dog = new Dog("ポチ");
    Cat cat = new Cat("ミケ");

    Animal animal1 = dog;
    Animal animal2 = cat;

    animal1.speak(); //ポチ:ワンワン!
    animal2.speak(); //ミケ:ニャー!

    dog.setName("ポチ太郎");
    System.out.println("犬の名前を変更 → " + dog.getName());
      }
}

// クラス: 基本のAnimalクラス
class Animal {
    private String name;  // カプセル化（private）

    public Animal(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // ポリモーフィズムのためのメソッド
    public void speak() {
        System.out.println(name + "：鳴く");
    }
}

// 継承: DogはAnimalを継承
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // オーバーライド（ポリモーフィズム）
    @Override
    public void speak() {
        System.out.println(getName() + "：ワンワン！");
    }
}

// 継承: CatはAnimalを継承
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "：ニャー！");
    }
}
