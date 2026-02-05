package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        // Animal 포함 상위 타입 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);
//        writeBox(dogBox); // Animal 보다 하위여서 안됨
//        writeBox(catBox); // Animal 보다 하위여서 안됨

    }

    // 하한 와일드카드 ( Animal 보다 위에 와야됨.)
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍스",30));
    }
}
