package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        /*
        *  [ 비교 연산자 ]
        *  비교 연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        *  연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항 연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
        *
        *  [ 비교 연산자의 종류 ]
        *   ==  : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true, 다르면 false를 반환
        *   !=  : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true, 같으면 false를 반환
        *   >   : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true, 작거나 같으면 false를 반환
        *   >=  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true, 작으면 false를 반환
        *   <   : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true, 크거나 같으면 false를 반환
        *   <=  : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true, 크면 false를 반환
        * */

        /* 1. 숫자값 비교 */
        /* 1-1. 정수 비교 */
        int inum1 = 12;
        int inum2 = 2023;

        System.out.println("========== 정수값 비교 ==========");
        System.out.println("inum1 == inum2 : " + (inum1 == inum2));     //false
        System.out.println("inum1 != inum2 : " + (inum1 != inum2));     //true
        System.out.println("inum1 > inum2 : " + (inum1 > inum2));       //false
        System.out.println("inum1 >= inum2 : " + (inum1 >= inum2));     //false
        System.out.println("inum1 < inum2 : " + (inum1 < inum2));       //true
        System.out.println("inum1 <= inum2 : " + (inum1 <= inum2));     //true

        /* 1-2. 실수 비교 */
        double dnum1 = 12.0;
        double dnum2 = 20.23;

        System.out.println("========== 실수값 비교 ==========");
        System.out.println("dnum1 == dnum2 : " + (dnum1 == dnum2));     //false
        System.out.println("dnum1 != dnum2 : " + (dnum1 != dnum2));     //true
        System.out.println("dnum1 > dnum2 : " + (dnum1 > dnum2));       //false
        System.out.println("dnum1 >= dnum2 : " + (dnum1 >= dnum2));     //false
        System.out.println("dnum1 < dnum2 : " + (dnum1 < dnum2));       //true
        System.out.println("dnum1 <= dnum2 : " + (dnum1 <= dnum2));     //true


        /* 2. 문자값 비교 */
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("========== 문자값 비교 ==========");
        System.out.println("ch1 == ch2 : " + (ch1 == ch2));         //false
        System.out.println("ch1 != ch2 : " + (ch1 != ch2));         //true
        System.out.println("ch1 > ch2 : " + (ch1 > ch2));           //false // 정답 : true
        System.out.println("ch1 >= ch2 : " + (ch1 >= ch2));         //false // 정답 : true
        System.out.println("ch1 < ch2 : " + (ch1 < ch2));           //true  // 정답 : false
        System.out.println("ch1 <= ch2 : " + (ch1 <= ch2));         //true  // 정답 : false

        //유니코드표에서 대문자가 소문자보다 항상 먼저 옴. -> 숫자가 더 작음


        /* 3. 논리값 비교 */
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("========== 논리값 비교 ==========");
        System.out.println("bool1 == bool2 : " + (bool1 == bool2)); // false
        System.out.println("bool1 != bool2 : " + (bool1 != bool2)); // true
//        System.out.println("bool1 > bool2 : " + (bool1 > bool2)); // boolean은 >,<연산을 할 수 없다.
//        System.out.println("bool1 >= bool2 : " + (bool1 >= bool2));
//        System.out.println("bool1 < bool2 : " + (bool1 < bool2));
//        System.out.println("bool1 <= bool2 : " + (bool1 <= bool2));


        /* 4. 문자열 비교 */
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");


        System.out.println("========== 문자열 비교 ==========");
        System.out.println("str1 == str2 : " + (str1 == str2)); // false    //정답 : true // JVM에서 지원하는 String Pool에 문자열에 대한 주소값을 저장해 같은 문자열이 들어오면 해당 주소값을 불러옴 -> 주소값이 같아서 true
        System.out.println("str1 != str2 : " + (str1 != str2)); // true     //정답 : false
//        System.out.println("str1 > str2 : " + (str1 > str2));   // String은 >,< 연산을 할 수 없다.
        System.out.println("str1 == str3 : " + (str1 == str3)); // false    // 새로 부여한 주소값이라 주소값이 다름

    }
}
