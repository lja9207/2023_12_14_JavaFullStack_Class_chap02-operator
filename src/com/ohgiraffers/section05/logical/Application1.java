package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {
        /*
        *  [ 논리 연산자 ]
        * 논리값(true/flase)를 취급하는 연산자이다.
        *
        *  [ 논리 연산자의 종류 ]
        *  1. 논리 연결 연산자 : 두 개의 피 연산자를 가지는 이항 연산자이며, 결합 방향은 왼쪽에서 오른쪽이다. 두 개의 논리식으로 참/거짓을 판단한다.
        *     1-1. &&(논리 AND) 연산자 : 두 개의 논리식 모두 참일 경우 참을 반환, 둘 중 하나라고 거짓이면 거짓을 반환
        *     1-2. ||(논리 OR) 연산자 : 두 개의 논리식 중 둘 중 하나라고 참일 경우 참을 반환, 모두 거짓일 경우 거짓을 반환
        *  2. 논리 부정 연산자 : 피연산자가 하나인 단항 연산자로, 결합 방향은 왼쪽에서 오른쪽이다.
        *     !(논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환한다.
        * */

        /* 1. 논리 연산자 결과값 확인*/
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));
        System.out.println("false && false : " + (false && false));

        System.out.println("-------------------------");
        System.out.println("true || true : " + (true || true));
        System.out.println("true || false : " + (true || false));
        System.out.println("false  true : " + (false || true));
        System.out.println("false || false : " + (false || false));

        System.out.println("-------------------------");
        System.out.println("true -> not : " + (!true));
        System.out.println("false -> not : " + (!false));
    }
}
