package generic.test.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이1",100));
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV2(dogBox);
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        System.out.println("뿌엑:"+dog);

        System.out.println("와일드카드");
        // wildcard
        WildcardEx.printWildCardV1(dogBox);
        WildcardEx.printWildcardV2(dogBox);
        WildcardEx.printAndReturnWildcard(dogBox);





    }
}
