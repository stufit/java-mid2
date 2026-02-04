package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHostpitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("시유",30);
        Cat cat = new Cat("시유냥", 60);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
//        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류가 발생하지 않음

        // 문제2: 개 타입 변환
        dogHospital.set(dog);
        Dog biggerDog = (Dog)dogHospital.getBigger(new Dog("꾼꾼", 80));
        System.out.println("biggerDog: "+ biggerDog);
    }
}
