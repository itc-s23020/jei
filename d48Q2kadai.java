//s23020
class Animal {
    public void makeSound() {
        System.out.println("動物の音");
    }
    public void test(){
        System.out.println("テスト出力");
    }
}

// 継承したサブクラスDogの定義
class Dog extends Animal {
    public void makeSound() {
        System.out.println("わんわん");
    }
}

class Cat extends Animal {
    public void makeSound(){
        System.out.println("ニャーニャー");
    }
}

public class d48Q2kadai {
    public static void main(String[] args) {
        Animal a = new Dog(); // インスタンス化
        a.makeSound(); // DogクラスのmakeSoundメソッドが呼び出されます
        a.test(); // Animalクラスのtestメソッドが呼び出されます
        Animal c = new Cat();
        c.makeSound();
        c.test();
    }
}

