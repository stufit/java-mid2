package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i =10;
        Object object = GenericMethod.objMethod(i);
        System.out.println(object);
//        Integer casting = (Integer)GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i); // <Integer> 생략가능(추론)
        System.out.println("result = "+ result);
        Integer integerValue = GenericMethod.<Integer>numberMethod(i);
        Double doubleValue = GenericMethod.<Double>numberMethod(10.23);
        String s = GenericMethod.<String>genericMethod("hello");
//        String i = GenericMethod.<String>numberMethod("hi"); // extends Number라서 타입제한걸림

        System.out.println("타입추론");
        Integer result2 = GenericMethod.genericMethod(i); // <Integer> 생략가능(추론)
        Integer integerValue2 = GenericMethod.numberMethod(i);
        Double doubleValue2 = GenericMethod.numberMethod(10.23);


    }
}
