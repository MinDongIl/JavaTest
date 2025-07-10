//Java 실습

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");

        //조건문
        int a = 2;
        int b = 3;
        if(a+b == 5){
            System.out.println("True");
        }
        else if(a+b != 5){
            System.out.println("False");
        }

        //조건문 (switch)
        int score = 90;
        switch (score) {
            case 80:
                System.out.println("C");
                break;
            case 90:
                System.out.println("B");
                break;
            case 100:
                System.out.println("A");
                break;

        }

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