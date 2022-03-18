# 📝 Java 프로그래밍

<details>
<summary> 자바 프로그래밍 시작 </summary>
<div markdown="1">

  ## 프로그래밍이란
  - 프로그래밍: 컴픁가 일을 수행하도록 프로그래밍 언어로 명령어 집합(프로그램)을 만드는 일
  - 컴파일: 프로그래밍 언어를 컴퓨터가 실행 가능한 기계어로 만드는 일
  - 컴파일러: 기계어로 바꾸어 주는 프로그램(ex. 자바 컴파일러.gcc)
  
  ## 자바프로그래밍의 특징
  - 플랫폼에 영향을 받지 않으므로 다양한 환경에서 사용할 수 있다.
  - 객체 지향 언어이기 때문에 유지보수가 쉽고 확장성이 좋다.
  - 프로그램이 안정적이다.
  - 풍부한 기능이 제공되는 오픈 소스이다.
  
  ## 객체 지향 프로그래밍이 무엇인가?
  - 프로그램의 구현을 시간의 흐름순이 아닌 객체간의 관계와 협력을 기반으로 프로그램 하는 것
  - Object oriented programming(OOP) 이라고 함
  - 사용 하는 언어: Java, C++, C#, Python, Javascript 등 다수

</div>
</details>


<details>
<summary> 변하지 않는 상수와 리터럴, 변수의 형 변환 </summary>
<div markdown="1">

  ## 상수(constant) 선언하기
  - 상수는 변하지 않는 수
  - ```final``` 예약어를 사용하여 선언
  - 상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고 변하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없다.
  ```java
  package ch10;
  
  public class ConstantTest{
    public static void main(String[] args){
      
      final int MAX_NUM = 100;
      final int MIN_NUM;
      
      MIN_NUM = 0;
  
      System.out.println(MAX_NUM);
      System.out.println(MIN_NUM);
    }
  }
  ```
  
  ## 형변환
  - 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
  - 묵시적 형 변환(explicit type conversion, 자동 현변환)과 명시적 형 변환(implicit tpye conversion, 강제 형변환)이 있음
  - 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어 짐
  - 덜 정밀한 자료형(정수)에서 더 정밀한 자료형(실수)으로 형 변환은 자동으로 이루어 짐
  ```java
  package ch10;
  
  public class TypeConversionTest {
    public static void main(String[] args){
      
      double dNum = 1.2;
      float fNum = 0.9F;
  
      int iNum1 = (int)dNum + (int)fNum;
      int iNum2 = (int)(dNum + fNum);
  
      System.out.println(iNum1);
      System.out.println(iNum2);
    }
  }
  ```

</div>
</details>


<details>
<summary> 연산자 </summary>
<div markdown="1">

  ## 대입연산자 (assignment operator)
  - 변수에 다른 변수나 값을 대입하는 연산자
  - 이항 연산자 중 우선 순위가 가장 낮은 연산자들
  - 왼족 변수 = 오른쪽 변수
  
  ## 부호 연산자
  - 단항 연산자
  - 변수의 부호를 유지하거나 바꿈
  - 실제 변수의 부호가 변하려면 대입 연산자를 사용해야함
  
  ## 산술 연산자
  - 사칙 연산자
  
  | 연산자 | 기능 | 연산 예  |
  | :--: | -- | -- |
  | + | 두 항을 더한다. | 1+2  |
  | - | 앞에 있는 항에서 뒤에 있는 항을 뺀다. | 1-2  |
  | * | 두 항을 곱한다. | 1*2  |
  | / | 앞에 있는 항에서 뒤에 있는 항을 나우어 몫을 구한다. | 4/3  |
  | % | 앞에 있는 항에서 뒤에 있는 항을 나우어 나머지를 구한다. | 4%3  |
  
  ## 논리 연산자
  - 관계 연산자와 혼합하여 많이 사용됨
  
  | 연산자 | 기능 | 연산 예  |
  | :--: | -- | -- |
  | && (논리곱) | 두 항이 모두 참인 경우에만 결과 값이 참이다. | booleanval = (5 > 3) && (5 > 2); |
  | (논리합) | 두 항 중 하나의 항만 참이면 결과 값은 참이다. | booleanval = (5 > 3) || (5 < 2); |
  | ! (부정) | 단항 연산자이다. 참인 경우는 거짓으로 바꾸고, 거짓인 경우 참으로 바꾼다. | booleanval = !(5 > 3); |
  
  ## 조건 연산자
  - 삼항 연산자
  - 조건식의 결과가 true인 경우와 거짓은 경우에 따라 다른 결과가 수행됨
  - if 문을 간단히 표현할 때 사용할 수 있음
  
  | 연산자 | 기능 | 연산 예  |
  | :--: | -- | -- |
  | 조건식 ? 결과1 : 결과2 | 조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택된다. | int num = (5 > 3) ? 10 : 20; |
  
  ## 비트 연산자
  - 대입연산자와 다른 연산자가 함께 쓰임
  
  | 연산자 | 기능 | 연산 예  |
  | :--: | -- | -- |
  | ~ | 비트의 반전(1의 보수) | a = ~a; |
  | & | 비트 단위 AND | 1 & 1 1반환 그 외는 0 |
  | (세로) | 비트 단위 OR | 0|0 0반환 그 외는 1 |
  | ^ | 비트 단위 XOP | 두개의 비트가 서로 다른 경우에 1을 반환 |
  | << | 왼쪽 shift | a<<2 변수 a를 2비트 만큼 왼쪽으로 이동 |
  | << | 오른쪽 shift | a>>2 변수 a를 2비트 만큼 오른쪽으로 이동 |
  

</div>
</details>

  
<details>
<summary> 조건문 </summary>
<div markdown="1">

  ## if 문 (만약에... 라면)
  - 주어진 조건에 따라 다른 실행이 이루어 지도록 구현
  
  ## switch-case 문
  - 비교 조건이 특정 값이나 문자열인 경우 사용
  - break 문을 사용하여 각 조건이 만족되면 switch 블럭을 빠져나오도록 함
  ```java
  package ch16;
  
  import java.util.Scanner;
  
  public class SwitchCaseTest {
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      int month = sc.nextInt();
  
      int day;
      switch(month){
        case 1, 3, 5, 7, 8, 10, 12 ->
          day = 31;
        case 2 ->
          day = 28;
        case 4, 6, 9, 11 ->
          day = 30;
        default -> {
          System.out.println("존재하지 않는 달 입니다.");
          day = -1;
        }
      }
      
     System.out.println(month + "월은 " + day + "일 입니다.");
    }
  }
  ```
  
  ```java
  package ch16;
  
  import java.util.Scanner;
  
  public class SwitchCaseTest {
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      int month = sc.nextInt();
  
      int day = switch(month){
        case 1, 3, 5, 7, 8, 10, 12 ->
          31;
        case 2 ->
          28;
        case 4, 6, 9, 11 ->
          30;
        default -> {
          System.out.println("존재하지 않는 달 입니다.");
          yield -1;
        }
      }
      
     System.out.println(month + "월은 " + day + "일 입니다.");
    }
  }
  ```

</div>
</details>
  
  
  
<details>
<summary> 반복문 </summary>
<div markdown="1">
  
  ## while 문
  - 주어진 조건에 맞는 동안 지정된 수행문을 반복적으로 수행하는 제어문
  - 조건이 맞지 않으면 반복하던 수행을 멈추게 됨
  - 조건은 주로 반복 횟수나 값을 비교의 결과에 따라 true, false 판단됨
  
  ```java
  package ch18;
  
  import java.util.Scanner;
  
  public class WhileTest {
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      int input;
      int sum = 0;
  
      input = sc.nextInt();
      while(input != 0){
        sum += input;
        input = sc.nextInt();
      }
  
      System.out.println(sum);
    }
  }
  ``` 
  
  ## do - while 문
  - while문은 조건을 먼저 체크하고 반복 수행이 된다면, do-while문은 조건에 상관 없이 한번 수행하고 나서 조건을 체크
  
  ```java
  package ch18;
  
  import java.util.Scanner;
  
  public class WhileTest {
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      int input;
      int sum = 0;
  
      do{
        input = sc.nextInt();
        sum += input;
      }while(input != 0);
  
      System.out.println(sum);
    }
  }
  ``` 
 
</div>
</details>
  
  
<details>
<summary> 자바 입출력 - bufferedreader, bufferedwriter </summary>
<div markdown="1">
  
  ## 개념
  #### 📌버퍼(buffer)
  > - 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역  
  > - 입출력 속도 향상을 위해 버퍼 사용
  > - 속도가 빠르다
  
  ## 주요 용어
  #### 📌버퍼 플러시(buffer flush)
  ###### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;버퍼에 남아 있는 데이터를 출력(버퍼를 비우는 동작)
  #### 📌버퍼를 이용한 입력: `BufferedReader`
  #### 📌버퍼를 이용한 출력: `BufferedWriter`
  
  ## BufferedReader
  
  ## BufferedWriter
 
</div>
</details>
