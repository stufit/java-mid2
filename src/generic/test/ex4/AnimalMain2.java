package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("시유", 4);
        Cat cat = new Cat("냐옹1", 1);

        AnimalMethod.checkup(dog); // AnimalMethod.<Dog>checkup(dog); 랑 똑같은 코드임
        AnimalMethod.checkup(cat);

        System.out.println("이건 두번째 레슨");
        Dog dog2 = new Dog("꾼꾼", 9);
        Cat cat2 = new Cat("냐옹2", 12);
        Dog bigger = AnimalMethod.getBigger(dog, dog2);
        System.out.println(bigger);
    }
}
