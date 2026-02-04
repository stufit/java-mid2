package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospital {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("시유",30);
        Cat cat = new Cat("시유냥", 60);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
//        dogHospital.set(cat); // 컴파일 오류 발생

        // 문제2: 개 타입 변환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("꾼꾼", 80));
        System.out.println("biggerDog: "+ biggerDog);
    }
}
