package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점의 T의 타입이 결정
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println(integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println(string);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();

    }
}
