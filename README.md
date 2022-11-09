# 📝 Java 프로그래밍

<details>
<summary> :file_folder: ch 01. 자바기초 </summary>
<div markdown="1">
  
## 📖 자바 프로그래밍 시작
### 💡 프로그래밍이란
- 프로그래밍: 컴퓨터가 일을 수행하도록 프로그래밍 언어로 명령어 집합(프로그램)을 만드는 일
- 컴파일: 프로그래밍 언어를 컴퓨터가 실행 가능한 기계어로 만드는 일
- 컴파일러: 기계어로 바꾸어 주는 프로그램(ex. 자바 컴파일러.gcc)

### 💡 자바프로그래밍의 특징
- 플랫폼에 영향을 받지 않으므로 다양한 환경에서 사용할 수 있다.
- 객체 지향 언어이기 때문에 유지보수가 쉽고 확장성이 좋다.
- 프로그램이 안정적이다.
- 풍부한 기능이 제공되는 오픈 소스이다.

### 💡 객체 지향 프로그래밍이 무엇인가?
- 프로그램의 구현을 시간의 흐름순이 아닌 객체간의 관계와 협력을 기반으로 프로그램 하는 것
- Object Oriented Programming(OOP) 이라고 함
- 사용 하는 언어: Java, C++, C#, Python, Javascript 등 다수

## 📖 변하지 않는 상수와 리터럴, 변수의 형 변환

### 💡 상수(constant) 선언하기

- 상수는 변하지 않는 수
- `final` 예약어를 사용하여 선언
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

### 💡 형 변환

- 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
- 묵시적 형 변환(explicit type conversion, 자동 현변환)과 명시적 형 변환(implicit tpye conversion, 강제 형변환)이 있음
- 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어짐
- 덜 정밀한 자료형(정수)에서 더 정밀한 자료형(실수)으로 형 변환은 자동으로 이루어짐

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

## 📖 연산자

### 💡 대입연산자 (assignment operator)

- 변수에 다른 변수나 값을 대입하는 연산자
- 이항 연산자 중 우선 순위가 가장 낮은 연산자들
- 왼족 변수 = 오른쪽 변수

### 💡 부호 연산자

- 단항 연산자
- 변수의 부호를 유지하거나 바꿈
- 실제 변수의 부호가 변하려면 대입 연산자를 사용해야함

### 💡 산술 연산자

- 사칙 연산자

| 연산자 | 기능                                                    | 연산 예 |
| :----: | ------------------------------------------------------- | ------- |
|   +    | 두 항을 더한다.                                         | 1+2     |
|   -    | 앞에 있는 항에서 뒤에 있는 항을 뺀다.                   | 1-2     |
|   \*   | 두 항을 곱한다.                                         | 1\*2    |
|   /    | 앞에 있는 항에서 뒤에 있는 항을 나우어 몫을 구한다.     | 4/3     |
|   %    | 앞에 있는 항에서 뒤에 있는 항을 나우어 나머지를 구한다. | 4%3     |

### 💡 논리 연산자

- 관계 연산자와 혼합하여 많이 사용됨
  | 연산자 | 기능 | 연산 예 |
  | :--: | -- | -- |
  | && (논리곱) | 두 항이 모두 참인 경우에만 결과 값이 참이다. | booleanval = (5 > 3) && (5 > 2); |
  | (논리합) | 두 항 중 하나의 항만 참이면 결과 값은 참이다. | booleanval = (5 > 3) || (5 < 2); |
  | ! (부정) | 단항 연산자이다. 참인 경우는 거짓으로 바꾸고, 거짓인 경우 참으로 바꾼다. | booleanval = !(5 > 3); |

### 💡 조건 연산자

- 삼항 연산자
- 조건식의 결과가 true인 경우와 거짓은 경우에 따라 다른 결과가 수행됨
- if 문을 간단히 표현할 때 사용할 수 있음
  | 연산자 | 기능 | 연산 예 |
  | :--: | -- | -- |
  | 조건식 ? 결과1 : 결과2 | 조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택된다. | int num = (5 > 3) ? 10 : 20; |

### 💡 비트 연산자

- 대입연산자와 다른 연산자가 함께 쓰임

| 연산자 | 기능                  | 연산 예                                  | |
| :----: | --------------------- | ---------------------------------------- | ----------------- |
|   ~    | 비트의 반전(1의 보수) | a = ~a;                                  | |
|   &    | 비트 단위 AND         | 1 & 1 1반환 그 외는 0                    | |
| (세로) | 비트 단위 OR          | 0                                        | 0 0반환 그 외는 1 |
|   ^    | 비트 단위 XOP         | 두개의 비트가 서로 다른 경우에 1을 반환  | |
|   <<   | 왼쪽 shift            | a<<2 변수 a를 2비트 만큼 왼쪽으로 이동   | |
|   <<   | 오른쪽 shift          | a>>2 변수 a를 2비트 만큼 오른쪽으로 이동 | |

## 📖 조건문

### 💡 if 문 (만약에... 라면)

- 주어진 조건에 따라 다른 실행이 이루어 지도록 구현

### 💡 switch-case 문

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

## 📖 반복문

### 💡 while 문

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

### 💡 do - while 문

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

## 📖 중간에 멈추는 break문, 무시하고 계속 진행하는 continue문

### 💡 break문 사용하기

- 감싸고 있는 제어문의 블록을 빠져 나오는 기능 (Switch문 에서도 사용)
- 반복문에서는 주로 조건문(if)와 같이 사용하여 조건에 해당되는 경우 반복수행을 멈추고 반복문 외부로 수행이 이동
- 여러 반복문이 중첩되어 있는 경우엔 break 문이 포함되어 있는 반복문만 빠져 나옴

```java
package ch21;

public class BreakTest {

  public static void main(String[] args){

    int sum = 0;
    int num;
    for(num = 1; num++) {
      sum += num;
      if(sum >= 100)
        break;
    }

    System.out.println(sum);
    System.out.println(num);
  }
}
```

### 💡 continue 문 사용하기

- 반복문 내부에서 조건문(if)와 같이 사용하며, 조건이 맞는 경우 (true 이면) 이후 반복문 블럭 내부의 다른 수행문들을 수행하지 않음

```java
// 1부터 100까지 숫자 중 3의 배수를 출력하는 코드

package ch21;

public class ContinueTest {

  public static void main(String[] args){

    int num;
    for(num = 1; num <= 100; num++) {

      if((num % 3) !=0) continue;

      System.out.println(num);
    }

  }

}

```

</div>
</details>

<details>
  <summary> :file_folder: ch 02. 객체지향 입문 </summary>
  <div markdown="1">
    
 ## 📖 객체와 객체지향 프로그래밍

### 💡 객체 (object)

- 의사나 행위가 미치는 대상 (사전적 의미)
- 구체적, 추상적 데이터의 단위 (학생, 회원, 생산, 주문, 배송)
- 물리적으로 존재하거나 추상적으로 생각할 수 잇는 것 중에서 자신의 속성을 가지고 있고 다른 것과 식별 가능한 것을 말한다.
- 객체는 속성과 동작으로 구성되어있다고 생각하면 되는데, 자바에서는 속성과 동작을 각각 필드(field)와 메소드(method)라고 생각하면 된다.

### 💡 객체 지향 프로그램 구현 방법

1.  객체를 정의한다.
2.  각 객체가 제공하는 기능들을 구현한다.
3.  각 객체가 제공하는 기능들 간의 (메세지 전달)을 통하여 객체간의 협력을 구현한다.

## ✏️ 생활 속에서 객체를 찾아 클래스 구현해보기

### 💡 클래스 (Class)

- 유사한 특징을 지닌 객체들의 속성을 묶어 놓은 집합이다.
- 객체를 만드는 기능을 수행한다.

```java
public class Student {

}
```

### 💡 클래스 특징

1. 캡슐화 + 정보은닉 (Encapsulation + Hiding information)

- 캡슐화란 관련있는 데이터와 합수를 하나로 묶는 것을 말한다.
- 정보은닉은 데이터를 보호하기 위해 클래스 외부에서 오픈하지 않은 것이다. (외부에서 멤버변수에 직접적인 접근이 불가능하게 만든다.)

2. 상속성 (Inheritance)

- 클래스의 멤버변수나 멤버 메소드를 상속해주거나 상속 받게 한다.

3. 다형성 (Polymorphism)

- 클래스이 다양한 모양이나 성질
- 부포 클래스로부터 상속받은 클래스의 다양한 형태를 제어할 수 있으며 이벤트 처리가 가능하다.

### 💡 클래스의 기본형식

```java
class 클래스명 {
  멤버필드 // 데이터 선언, 저장
  생성자 // 멤버필드 초기화
  메소드 // 데이터 입력, 연산, 출력
}
```

### 💡 클래스는 객체의 청사진이다.

- 객체의 속성은 클래스의 멤버 변수(member variable)로 선언한다.
- 학생 클래스

```java
public class Student {
  // 선언: 변수 만들기
  int studentNumber;
  String studentName;
  int majorCode;
  String majorName;
  int grade;
}
```

- 주문 클래스

```java
public class Oreder {
  int orderId;
  String buyerId;
  String sellerId;
  int productId;
  String orderDate;
}
```

### 💡 main 문에서 객체를 생성하면...

```java
public class StudentTest {
  public static void main(String[] args) {
    Student s = new Student();

    s.studentNumber = 1000;
    s.majorCode = 100;
    s.grade = 4;
  }
}
```

#### 생성과정

1. new 연산자가 s 객체에 저장될 메모리 공간 할당
2. 생성자가 s 객체를 초기화 (위에서는 default 생성자가 동작)
3. new 연산자가 새로 생성된 객체의 주소 s 변수에 저장
4. s 를 통해 Student 에 접근 가능

### 💡 클래스 메소드 정의

- 사용이유: 중복되는 코드의 반복적인 사용을 피할 수 있기 때문이다. 또한, 모듈화로 인하여 코드의 가독성이 좋아진다.
- 메소드를 작성할 때는 되도록 하나의 메소드가 하나의 기능만 수행하도록 작성하는 것이 좋다.
  <br>

- Student 를 예제로 학년을 변경하는 메소드를 정의 해보았다.

```java
void changeGrade(int newGrade) {
  grade = newGrade;
}
```

### 💡 객체 지향 프로그램을 구현할 때는

- 객체를 정의한다.
- 각 객체의 속성을 멤버 변수로 역할을 메서드로 구현한다.
- 각 객체간의 협력을 구현한다.

### 💡 클래스 코딩

- 클래스는 대문자로 시작하는 것이 좋다.
- java 파일 하나에 클래스는 여러 개가 있을 수 있지만, public 클래스는 하나이고, public 클래스와 java 파일의 이름은 동일하다.
- cannel notation 방식으로 하는 것이 좋다.

## 📖 함수와 메서드

### 💡 함수 (function)

- 하나의 기능을 수행하는 일련의 코드
- 구현된 함수는 호출하여 사용하고 호출된 함수는 기능이 끝나면 제어가 반환된다.
- 함수로 구현된 하나의 기능은 여러 곳에서 동일한 방식으로 호출되어 사용될 수 있다.

### 💡 함수 정의하기

```java
int add(int num1, int num2) {
// 반환값에 대한 데이터 타입: int 함수명()
// 반환을 안하는 경우: void 함수명()
  int result;
  result = num1 + num2;
  return result;
}
```

### 💡 함수 예제

```java
package ch03;
  public class FunctionTest {
      public static int addNaum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
      }

      public statuc void sayHello(string greeting) {
        System.out.println(greeting);
      }

      public statuc int clacSum() {
        int sum = 0;
        int i;

        for(i = 0; i <= 100; i++) {
          sum+=1;
        }

        return sum;
      }

    public static void main(String[] args) {

      int n1 = 10;
      int n2 = 20;

      int total = addNum(n1, n2);
      System.out.println(total);

      sayHello("안녕하세요");

      total = calcSum();
      System.out.println(total);

    }
}

```

### 💡 함수 호출과 스택 메모리

- 스택: 함수가 호출될 때 지역 변수들이 사용하는 메모리
- 함수의 수행이 끝나면 자동으로 반환되는 메모리

### 💡 메서드 (method)

- 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
- 멤버 함수(member function)이라고 함
- 메서드를 구현함으로써 객체의 기능이 구현됨
- 메서드의 이름은 그 객체를 사용하는 객체(클라이언트)에 맞게 짓는 것이 좋음

## 📖 멤버변수, 메서드 구현

### 💡 학생 클래스를 정의하고 이를 사용해보자

- 학생 클래스의 속성을 멤버 변수로 선언하고 메서드를 구현

```java
   public class Student {

       public int studentID;
       public String studentName;
       public String address;

       public void showStudentInfo() {
           Sustem.out.println(studentID + "학번 학생의 이름은" studentName + "이고, 주소는" + address + "입니다.");
       }

       public String getStudentName() {
           return studentName;
       }

       public String setStudentName(String name) {
           studentName = name;
       }
   }

    public class StudentTest {

        public static void main(String[] args) {

            Student studentLee = new Student(); // 생성자
            // 생성된 객체 studentLee: 인스턴스

            // 참조변수를 이용하여 호출
            studentLee.studentID = 12345;
            studentLee.setStudentName("Lee");
            studentLee.address = "서울 강남구";
            // 힙이라는 동적 메모리에 데이터를 저장

            studentLee.showStudentInfo();

    }


```

## 📖 인스턴스 생성과 힙 메모리

### 💡 인스턴스 (instance)

- 클래스는 객체의 속성을 정의하고, 기능을 구현하여 만들어 놓은 코드 상태
- 실제 클래스 기반으로 생성된 객체(인스턴스)는 각각 다른 멤버 변수값을 가지게 됨
- new 키워드를 사용하여 인스턴스 생성

### 💡 힙 메모리

- 생성된 인스턴스는 동적 메모리(heap memory)에 할당됨
- C나 C++ 언어에서는 사용한 동적 메모리를 프로그래머가 해제 시켜야함 (free나 delete 이용)
- 자바에서 Garbage Collector 가 주기적으로 사용하지 않는 메모리를 수거
- 하나의 클래스로 부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게 됨

### 💡 참조 변수, 참조 값

```java

   Student studentLee = new Student();
   studentLee.studentName = "홍길동";

   System.out.println(studentLee);

```

### 💡 용어정리

- 객체: 객체 지향 프로그램의 대상, 생성된 인스턴스
- 클래스: 객체를 프로그래밍 하리 위해 코드로 정의해 놓은 상태
- 인스턴스: new 키워드를 사용하여 클래스를 메모리에 생성한 상태
- 멤버 변수: 클래스의 속성, 특성
- 메서드: 멤버 변수를 이용하여 클래싀 기능을 구현한 함수
- 참조변수: 메모리에 생성된 인스턴스를 가리키는 변수
- 참조 값: 생성된 인스턴스의 메모리 주소 값

## 📖 생성자 (constructor)

### 💡 생성자

- 생성자 기본 문법 <class_name> ([<argument_list>]) {[<statements>]}
- 객체를 생성할 때 new 키워드와 함께 사용 - new Student();
- 생성자는 일반 함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new와 함께 호출됨
- 객체가 생성될 때 변수나 상수를 초기화하거나 다른 초기화 기능을 수행하는 메서드를 호출함
- 생성자는 반환 값이 없고, 클래스의 이름과 동일
- 대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private으로 선언되는 경우도 있음

### 💡 기본생성자(default constructor)

- 클래스에는 반드시 적어도 하나 이상의 생성자가 존재
- 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있음
- 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어줌
- 매개 변수가 없음. 구현부가 없음

## :book: 여러가지 생성자를 정의하는 생성자 오버로딩 (overloading)

### 💡 생성자 정의하기

- 생성자를 구현해서 사용할 수 있음
- 클래스에 생성자를 따로 구현하면 기본 생성자 (default constructor)는 제공되지 않음
- 생성자를 호출하는 코드에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있음

  UserInfo.java

  ```java

  public class UserInfo (

      public String userId;
      public String userPassWord;
      public String userName;
      public String userAddress;
      public String phoneNumber;

      public UserInfo(){}

      public String UserInfo(Sting userIc, String userPassWord, String userName) {
          // 객체가 생성될 때 필요한 정보들을 생성
          this.userId = userId;
          this.userPassWord = userPassWord;
          this.userName = userName;
      }

      public String showUserInfo() {
          return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
      }
  }

  ```

  UserInfoTest.java

  ```java

  public class UserInfoTest {
      public static void main(String[] args) {

          UserInfo userLee = new UserInfo();
          userLee.userId = "a12345";
          userLee.userPassWord = "zxsaqw12345";
          userLee.userName = "Lee";
          userLee.phoneNumber = "00012345678";
          userLee.userAddress = "Seoul, Korea";

          System.out.println(userLee.showUserInfo());

          UserInfo userKim = new UserInfo("b12345, "98760awsk", "Kim"");
          System.out.println(userKim.showUserInfo());
      }
  }

  ```

## 📖 참조 자료형 변수

### 💡 참조 자료형

- 변수의 자료형
  - 기본 자료형: int, long, float, double 등
  - 참조 자료형: String, Date, Student 등
- 클래스형으로 변수를 선언
- 기본 자료형은 사용하는 메모리의 크기가 정해져 있지만, 참조 자료형은 클래스에 따라 다름
- 참조 자료형을 사용할 때는 해당 변수에 대해 생성하여야 함(String 클래스는 예외적으로 생성하지 않고 사용할 수 있음)

## 📖 접근 제어 지시자(access modifier)와 정보은닉(imformation hiding)

### 💡 접근 제어 지시자 (access modifier)

- 클래외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
- `private` : 같은 클래스 내부에서만 접근 가능 (외부클래스, 상속 관계도 패키지가 다르면 접근불가
- 아무것도 없음 (default): 같은 패키지 내부에서만 접근 가능 (상속 관계라도 패키지가 다르면 접근 불가)
- `protected` : 같은 패키지나 상속 관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근할 수 없음
- `public` : 클래스의 외부 어디서나 접근할 수 있음

### 💡 get() / set() 메서드

- private 으로 선언된 멤버 변수 (필드)에 대해 접근, 수정할 수 있는 메서드를 public으로 제공
- get() 메서드만 제공되는 경우 read-only 필드
- 이클립스에서 자동으로 생성

```java
public class BirthDay {
    private int day;
    private int month;
    private int year;

    private boolean isValid; // default 값 = false

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            isValid = false;
        }
        else {
            isValid = true;
            this.month = month;
        }

    }

    public int getYear() {
       return year;
    }

    public void setYear(int year) {
       this.year = year;
    }

    public void showDate() {
        if(isValid) {
            System.out.println(year + " " + month + " " + day);
        }
        else {
           System.out.println("유효하지 않는 날짜입니다.");
        }
    }
}
```

```java
public class BirthDayTest {

    public static void main(String[] args) {
        BirthDay date = new BirthDay();

        date.setYear(2019);
        date.setMonth(12);
        date.setDay(30);

        date.showDate();
    }
}
```

### 💡 정보은닉

- private으로 제어한 멤버 변수도 public 메서드가 제공되면 접근 가능하지만 변수가 public 으로 공개되었을 때보다 pivate 일 때 각 변수에 대한 제한을 public 메서드에서 제어할 수 있다.

```java
public void setMonth(int month) {
    if(month < 1 || month > 12) {
        isValid = false;
    }
    else {
        isValid = true;
        this.month = month;
    }

}
```

## 📖 캡슐화

### 💡 정보 은닉을 활용한 캡슐화

- 꼭 필요한 정보와 기능만 외부에 오픈함
- 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여 일관된 기능을 구현하게 함
- 각각의 메서드나 멤버변수를 접근함으로써 발생하는 오류를 최소화 한다.

## :book: 객체 자신을 가리키는 `this`

### 💡 this의 역할

- 인스턴스 자신의 메모리를 가리킴
- 생성자에서 또 다른 생성자를 호출할 때 사용
- 자신의 주소(참조값)을 반환함
- 생성된 인스턴스 메모리의 주소를 가짐
  - 클래스 내에서 참조변수가 가지는 주소 값과 동일한 주소값을 가지는 키워드

### 💡 생성자에서 다른 생성자를 호출하는 this

- 클래스에 생성자가 여러개인 경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
- 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없음

```java
public class Person{

    String name;
    int age;

    // 아래에 같은 함수가 있으므로 this로 호출하여 초기 설정을 해주는 것이다.
    public Person() {
        this("이름없음", 1);
        // 이것이 호출되는 순간에는 인스턴스가 아직 생성되지 않은 상태이다.
`        // 이것 이전에 코드를 넣게 되면 오류가 나게 된다.
    }

    public Person(String name, int age){ // 함수의 호출이 끝나야 인스턴스가 생성되는 것이다
        this.name = name;
        this.age = age;
    }

}
```

## 📖 여러 인스턴스에서 공통으로 사용하는 변수를 선언 - static 변수

### 💡 공통으로 사용하는 변수의 필요성

- 여러 인스턴스가 공유하는 기준 값이 필요한 경우
- 학생마다 새로운 학번 생성할 경우
- 카드 회사에서 카드를 새로 발급할 때마다 새로운 카드 번호를 부여할 경우
- 회사에 사원이 입사할 때 마다 새로운 사번이 필요한 경우

### 💡 static 변수 선언과 사용하기

- 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
- 클래스 변수, 정적 변수 라고 하기도 함
- 인스턴스 생성과 상관없이 사용 가능하므로 클래스 이름으로 직접 참조

## 📖 변수의 유효 범위와 메모리

- 변수의 유효 범위와 생성과 솜ㄹ은 각 변수의 종류마다 다름
- 지역변수, 멤버변수, 클래스 변수는 유효범위와 life cycle, 사용하는 메모리도 다름
<table>
  <tr>
    <td>변수 유형</td>
    <td>선언 위치</td>
    <td>사용 범위</td>
    <td>메모리</td>
    <td>생성과 소멸</td>
  </tr>
  <tr>
    <td>
      지역변수  
      (로컬변수)
    </td>
    <td>함수 내부에 선언</td>
    <td>함수 내부에서만 사용</td>
    <td>스택</td>
    <td>함수가 호출될 때 생성되고 함수가 끝나면 소멸함</td>
  </tr>
  <tr>
    <td>
      멤버 변수  
      (인스턴스 변수)
    </td>
    <td>클래스 멤버 변수로 선언</td>
    <td>클래스 내부에서 사용하고 private이 아니면 참조 변수로 다른 클래스에서 사용 가능</td>
    <td>힙</td>
    <td>인스턴스가 생성될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸 됨</td>
  </tr>
  <tr>
    <td>
      static 변수  
      (쿨래스 변수)
    </td>
    <td>static 예약어를 사용하여 클래스 내부에 선언</td>
    <td>클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에서 사용 가능</td>
    <td>데이터 영역</td>
    <td>프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸됨</td>
  </tr>
</table>
- static 변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
- 클래스 내부의 여러 메서드에서 사용하는 변수는 멤버변수로 선언하는 것이 좋음
- 멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데없는 메모리가 할당됩

## 📖 static 응용 - 싱글톤 패턴(singleton pattern)

### 💡 싱글톤 패턴이란?

- 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
- static 변수, 메서드를 활용하여 구현 할 수 있음

## 📖 자료를 순차적으로 한꺼번에 관리하는 방법 - 배열(array)

### 💡 배열이란

- 동일한 자료형의 순차적 자료 구조
- 인덱스 연산자를 이용하여 빠른 참조가 가능
- 물리적 위치와 논리적 위치가 동일
- 배열의 순서는 0부터 시작
- 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함

### 💡 배열 선언과 초기화

- 배열 선언하기

```java
  int[] arr1 = new int[10];
  int arr2[] =new int[10];
```

- 배열 초기화하기

```java
  int[] numbers = new int[] {10, 20, 30}; // 개수 생략해야함

  int[] numbers = (10, 20, 30); // new int[] 생략가능

  int[] ids;
  ids = new int[] {10, 20, 30}; // 선언 후 배열을 생성하는 경우는 new int[] 생략할 수 있음
```

### 💡 배열 사용하기

- 인덱스 연산자 활용 - 배열 요소가 저장된 메모리의 위치를 연산하여 찾아줌
- 배열을 이용하여 합을 구하기

```java
  int[] arr = new int[10];
  int total = 0;

  for(int i = 0, num = 1; i < arr.length; i++, num++) {
    arr[i] = num;
   }
    for(int num : arr) {
    total += num;
  }
  System.out.println(total);
```

## 📖 객체 배열 사용하기

### 💡 객체 배열 선언과 구현

- 기본 자료형 배열은 선언과 동시에 배열의 크기만큼의 메모리가 할당되지만, 객체 배열의 경우엔 요소가 되는 객체의 주소가 들어갈(4바이트, 8바이트)메모리만 할당되고 각 요소 객체는 생성하여 저장함
- null로 초기화

### 💡 객체 배열 복사하기

- System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드

## 📖 객체 배열을 구현한 클래스 ArrayList

### 💡 ArrayList의 주요 메서드

 <table>
    <tr>
     <td>메서드</td>
     <td>설명</td>
    </tr>
     <tr>
     <td>boolean add(E e)</td>
     <td>요소 하나를 배열에 추가합니다. E는 요소의 자료형을 의미합니다.</td>
    </tr>
     <tr>
     <td>int size()</td>
     <td>배열에 추가된 요소 전체 개수를 반환합니다.</td>
    </tr>
     <tr>
     <td>E get(int index)</td>
     <td>배열의 index 위치에 있는 요소 값을 반환합니다.</td>
    </tr>
     <tr>
     <td>E remeve(int index)</td>
     <td>배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환합니다.</td>
    </tr>
     <tr>
     <td>boolean isEmpty()</td>
     <td>배열이 비어있는지 확인합니다.</td>
    </tr>
 </table>
  </div>
</details>
    
<details>
<summary> 📁 ch 03. 객체지향 핵심  </summary>
<div markdown="1">
  
## 📖 객체간의 상속은 어떤 의미일까
### 💡 클래스 상송
- 새로운 클래스를 정의할 때 이미 구현된 클래스를 상속 받아서 속성이나 기능을 확장하여 클래스를 구현함
- 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야할 때 기본 클래스를 상속함
```text
  상속하는 클래스: 상위 클래스, parent class, base class, super class
  상속받는 클래스: 하위 클래스, child class, derived class, subclass
```
- 상속의 문법
```java
class B extends A {

}

```

extends 키워드 뒤에는 단 하나의 클래스만 올 수 있다, 자바는 단일 상속만을 지원한다.

### 💡 상속을 구현하는 경우
- 상위 클래스는 하위 클래스 보다 더 일반적인 개념과 기능을 가짐
- 하위 클래스는 상위 클래스 보다 더 구체적인 개념과 기능을 가짐
- 하위 클래스가 상위 클래스의 속성과 기능을 확장한다는 의미

## 📖 메서드 재정의하기(overriding)
### 💡 하위 클래스에서 메서드 재정의 하기
- 오버라이딩: 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음
- 재정의하여 구현해야함

```java
  @Override
  public int calcPrice(int price) {
  bonusPoint += price * bonusRatio;
  return price - (int price * salesRatio);
```

### 💡 @overriding 애노테이션

- 애노테이션은 원래 주석이라는 의미
- 컴파일러에게 특별한 정보를 제공해주는 역할
<table>
  <tr>
    <td>애노테이션</td>
    <td>설명</td>
  </tr>
  <tr>
    <td>@Override</td>
    <td>재정의된 메서드라는 정보 제공</td>
  </tr>
  <tr>
    <td>@Functionallnteface</td>
    <td>함수형 인터페이스라는 정보 제공</td>
  </tr>
  <tr>
    <td>@Deprecated</td>
    <td>이후 버전에서 사용되지 않을 수 있는 변수, 메서드에 사용됨</td>
  </tr>
  <tr>
    <td>@SuppressWarnings</td>
    <td>특정 경고가 나타나지 않도록 함</td>
  </tr>
</table>
- @Overriding 애노테이션은 재정의 된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 엘가 남

## 📖 메서드 재정의와 가상 메서드 원리

### 💡 메서드는 어떻게 호출되고 실행되는가?

- 메서드(함수)의 이름은 주소값을 나타냄
- 메서드는 명령어의 set 이고 프로그램이 로드되면 메서드 영역(코드 영역)에 명령어 set이 위치
- 해당 메서드가 호출 되면 명령어 set 이 있는 주소를 찾아 명령어가 실행됨
- 이때 메서드에서 사용하는 변수들은 스택 메모리에 위치 하게됨
- 따라서 다른 인스턴스라도 같은 메서드의 코드는 같으므로 같은 메서드가 호출됨
- 인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만, 메서드 명령어 set은 처음 한번만 로드됨

### 💡 가상메서드의 원리

- 가상 메서드 테이블에서 해당 메서드에 대한 주소를 가지고 있음
- 재정의된 경우는 재정의된 메서드의 주소를 가리킴

## 📖 다형성과 다형성을 사용하는 이유

### 💡 다형성이란?

- 하나의 코드가 여러 자료형으로 구현되어 실행하는 것
- 같은 코드에서 여러 다른 실행 결과가 나옴
- 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
- 다형성을 잘 활용한다면 유연하고 확장성있고, 유지봇가 편리한 프로그램을 만들 수 잇음

## 📖 상속에서 클래스 생성 과정과 형 변환

### 💡 super 키워드

- 하위클래스에서 가지는 사우이클래스에 대한 참조값
- super()는 상위클래스의 기본 생성자를 호출함
- 하위클래스에서 명시적으로 상위클래스의 생성자를 호출하지 않으면 super()가 호출됨

## 📖 다운캐스팅과 instanceof

### 💡 다운캐스팅(downcasting)

- 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
- 하위 클래스로의 형 변환은 명시적으로 해야함

```java
Customer vc = new VIPCustomer();    // 묵시적
VIPCustomer vCustomer = (VIPCustomer)vc;       // 명시적
```

### 💡 instanceof를 이용하여 인스턴스의 형 체크

- 원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드 맞으면 true 아니면 false를 반환
</div>
</details>

<details>
<summary> :file_folder: ch 04. 자바의 유용한 클래스들 </summary>
<div markdown="1">

## 01. Object 클래스 - 모든 클래스의 최상위 클래스

### 💡 toSring() 메서드

- 객체의 정보를 String 으로 바꾸어서 사용할 때 쓰임
- String 이나 Integer 클래스는 이미 재정의되어 있음

## 02. Object 클래스의 메서드 활용

### 💡 equals() 메서드

- 두 인스턴스의 주소값을 비교하여 true/false 반환
- 재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 구현
- 인스턴스가 다르더라도 논리적으로 동릴한 경우 true를 반환하도록 재정의 할 수 있음

### 💡 hashCode() 메서드

- hashCode()는 인스턴의 저장 주소를 반환
- 힙메모리에 인스턴스가 저장되는 방식이 hash 방식
- hash: 정보를 저장, 검색하는 자료구조

### 💡 clone() 메서드

- 객체의 원본을 복제하는데 사용하는 메서드
- 생성과정의 복잡한 과정을 반복하지 않고 복제할 수 잇음
- 객체보호관점에서 위배될 수 있음 -> `implements Cloneable`을 명시해줘야함

## 03. String, StringBuilder, StringBuffer 클래스, text block

### 💡 String 클래스

- 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀에 있는 주소를 참조하는 두 가지 방법
- 힙 메모리는 생성될 때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐
- 한번 생성된 String은 불변

### 💡 StringBuilder, StringBuffer 활용하기

- concat 함수를 사용하여 두 문자를 합치면 메모리 낭비발생 -> `StringBuilder, StringBuffer 활용`
- 내부적으로 가변적인 char[]를 멤버변수로 가짐
- 단일 Thread 프로그램에서는 StringBuilder 사용을 권장
- toString() 메서드로 String 반환

## 04. class 클래스 사용하기

### 💡 Class 클래스

- 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨
- Classs 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공됨
- ClassforName("클래스이름") 메서드로 클래스를 동적으로 로드함

```java
Class c = Class.forName("java.lang.String");
```

- 생성된 인스턴스에서 Class 클래스 가져오기

```java
String s = new String();
Class c = s.getClass();
```

### 💡 동적 로딩

- 컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행 중에 데이터 타입을 binding 하는 방법
- 컴파일 시에 타입이 정해지지 않으므로 동적 로딩 시 오류가 발생하면 프로그램의 심각한 장개가 발생 가능

### 💡 Class의 newInstance() 메서드로 인스턴스 생성

new 키워드를 사용하지 않고 클래스 정보를 활용하여 인스턴스 생성

</div>
</details>

<details>
<summary> :file_folder: ch 05. 자바와 자료구조 </summary>
<div markdown="1">

## 📖 01. 여러가지 자료구조에 대해 알아보기

### :one: 자료구조란 무엇일까

- 프로그램에서 사용할 많은 데이터를 메모리 상에서 관리하는 여러 구현방법들
- 효율적인 자료구조가 성능 좋은 알고리즘의 기반이 됨
- 자료의 효율적인 관리는 프로그램의 수행속도와 일접한 관련이 있음

### :two: 자료구조의 종류

- `배열`: 선형으로 자료를 관리. 정해진 크기의 메모리를 먼저 할당받아 사용하고, 자료의 물리적 위치와 논리적 위치가 같음
- `연결리스트`: 선형으로 자료를 관리. 자료가 추가될때마다 메모리를 할당 받고, 자료는 링트로 연결됨. 자료의 물리적 위치와 논리적 위치가 다를 수 있음
- `스택`: 가장 나중에 입력된 자료가 가장 먼저 출력되는 자료구조 (Last in Firsr Out)
- `큐`: 가장 먼저 입력된 자료가 가장먼저 출력되는 자료구조(First in First Ouut)
- `트리`: 부모 노드와 자식 노드 간의 연결로 이루어진 자료구조
  - <b>힙(heap)</b> : priority queue를 구현 (우선 큐)
  - <b>이진 트리(binary tree)</b> : 부모노드에 자식노드가 두개 이하인 트리
- `해싱`: 자료를 검색하기 위한 자료구조
  - 검색을 위한 자료구조
  - key에 대한 자료를 검색하기 위한 사전 개념의 자료구조
  - key는 유일하고 이에 대한 value를 쌍으로 저장
  - 들어오는 순서와는 상관없음
  - jdk 클래스: HashMap, Properties

## 📖 배열의 특징

- 동일한 데이터 타입을 순서에 따라 관리하는 자료구조
- 정해진 크기가 있음
- 요소의 추가와 제거 시 다른 요소들의 이동이 필요함
- jdk 클래스: ArrayList, Vector

## 📖 연결리스트의 특징

- 동일한 데이터 타입을 순서에 따라 관리하는 자료구조
- 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 잇음
- 자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결함 (정해진 크기가 없음)
- 연결 리스트의 i 번째 요소를 찾는게 걸리는 시간은 요소의 개수에 비례 : O(n)

## 📖 스택(Stack)의 특징

- 맨 마지막 위치(top)에서만 자료를 추가,삭제, 꺼내올 수 있음 ( 중간의 자료를 꺼낼 수 없음)
- Last In First Out ( 후입선출 ) 구조
- 상자가 쌓여있는 모양
- 가장 최근의 자료를 찾아오거나 게임에서 히스토리를 유지하고 이를 무를때 사용할 수 있음
- 함수의 메모리는 호출 순서에 따른 stack 구조

## 📖 큐(Queue)의 특징

- 맨 앞(front) 에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 추가
- Fist In First Out (선입선출) 구조
- 일렬로 줄 서 있는 모양
- 순차적으로 입력된 자료를 순서대로 처리하는데 많이 사용되는 자료구조
- 콜센터에 들어온 문의 전화, 메세지 큐 등에 활용됨
</div>
</details>

<details>
<summary> 📁 개인공부  </summary>
<div markdown="1">
  <br>
  <details>
  <summary> 📖 자바 입출력 - bufferedreader, bufferedwriter </summary>

## 📖 자바 입출력 - bufferedreader, bufferedwriter

### 💡 개념

#### 버퍼(buffer)

> - 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
> - 입출력 속도 향상을 위해 버퍼 사용
> - 속도가 빠르다

### 💡 주요 용어

#### 버퍼 플러시(buffer flush)

###### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;버퍼에 남아 있는 데이터를 출력(버퍼를 비우는 동작)

#### 버퍼를 이용한 입력: `BufferedReader`

#### 버퍼를 이용한 출력: `BufferedWriter`

### BufferedReader

### BufferedWriter

  </details>

  <details>
  <summary> 📖 백트래킹(Baktracking) </summary>

## 📖 백트래킹(Baktracking)

- 해를 찾아가는 도중, 진행 중인 지금의 경로가 해가 될 것 같지 않으면 그 경로를 더이상 가지 않고 되돌아가는 것
- 모든 경우의 수를 전부 고려하는 알고리즘
- 상태공간을 트리로 나타낼수 있을 때 적합한 방식이다.
- 반복문의 횟수까지 줄일 수 있으므로 효율적이다.
- 가지치기라고도 한다.
- 모든 가능한 경우의 수 중 특정 조건을 만족하는 경우만을 살펴본다.
- 그 값이 답이 되는 값인지 판단한다. 그렇지 않으면 그 부분까지 탐색하지 않고 가지치기를 한다.

### 💡 백트래킹 동작 방식

    1. 백트래킹은 상태공간트리에서 DFS를 실시한다.
    2. 이때 이 노드가 유망한 노드인지, 즉 해가 될 가능성이 있는 노드인지 확인한다.
    3. 유망한 노드일 경우 그 자식 노드를 계속 탐색한다.
    4. 유망하지 않은 노드일 경우 그 자식노드를 탐색하지 않고 중단한다.

  </details>
  
  
</div>
</details>
