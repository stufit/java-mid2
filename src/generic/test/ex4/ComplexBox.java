package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("t.className = " + z.getClass().getName());
        return z;
    }

    // 제너럴 타입(클래스) 보다 제너럴 메서드가 우선순위를 가짐.
    public <T> T printAndReturn2(T z) {
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("t.className = " + z.getClass().getName());
        return z;
    }
}
