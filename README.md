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
  
  ## 복합 연산자
  - 대입 연산자와 다른 연산자가 함께 쓰임
  

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
</detils>
