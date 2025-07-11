package org.example;

public class Calculate {

    private static int a;
    private static int b;

    //숫자설정
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    //덧셈
    public int plus(int a, int b) {
        return a + b;
    }

    //뺄셈
    public int minus(int a, int b) {
        return a - b;
    }

    //곱셈
    public int multiply(int a, int b) {
        return a * b;
    }

    //나눗셈
    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculate c = new Calculate();
        c.setA(5);
        c.setB(3);
        System.out.println("덧셈 결과: " + c.plus(5, 3));
        System.out.println("뺄셈 결과: " + c.minus(5, 3));
        System.out.println("곱셈 결과: " + c.multiply(5, 3));
        System.out.println("나눗셈 결과(정수로 표현): " + c.divide(5, 3));
    }

    //feature 브랜치 생성해서 올리기
    //pr에서 리뷰어 추가
    //git checkout -b feature/calculate
    //git add .
    //git commit -m "feat: ~~"
    //git push java feature/calculate
    //git hub 화면에서 pull request 생성
}
