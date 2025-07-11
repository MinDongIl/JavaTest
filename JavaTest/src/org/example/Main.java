package org.example;
//Java 실습

public class Main {

    //if문 예제
    public static String ifTest(int num) {
        String result = "";
        if(num > 0){
            result = "양수";
        }
        else if(num == 0){
            result = "0";
        }
        else if(num < 0){
            result = "음수";
        }

        return result;
    }

    //switch 메소드
    public static String switchTest(int num) {
        String result = "";
        switch (num) {
            case 80:
                result = "C";
                break;
            case 90:
                result = "B";
                break;
            case 100:
                result = "A";
                break;

        }
        return result;
    }

    //배열 메소드
    public static void arrayTest() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = (i+1);
        }
    }

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");

        //조건문
        int a = 2;
        String str = ifTest(a);
        System.out.println(str + "입니다.");


        //조건문 (switch)
        int score = 90;
        String str2 = switchTest(score);
        System.out.println("등급: " + str2);

        //반복문
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        //반복문(while)
        int count = 0;
        while(count <= 10){
            count++;
        }
        System.out.println("count = " + count);


    }
}