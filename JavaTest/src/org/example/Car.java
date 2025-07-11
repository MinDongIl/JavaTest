package org.example;

public class Car {
    private String model;
    private String brand;
    private int year;

    //브랜드 설정,조회
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    //모델 설정,조회
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    //연식 설정,조회
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    //작동
    public void move() {
        System.out.println("차가 움직입니다.");
    }
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("kia");
        System.out.println("브랜드: " + myCar.getBrand());

        myCar.setModel("K5");
        System.out.println("모델: " + myCar.getModel());

        myCar.setYear(2025);
        System.out.println("연식: " + myCar.getYear());

        myCar.move();
        myCar.stop();

    }
}
