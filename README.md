# 📝 Java 프로그래밍

<details>
<summary> :file_folder: ch 01. 자바기초 </summary>
<div markdown="1">
  
  ## 📖 자바 프로그래밍 시작
  ### 💡 프로그래밍이란
  - 프로그래밍: 컴픁가 일을 수행하도록 프로그래밍 언어로 명령어 집합(프로그램)을 만드는 일
  - 컴파일: 프로그래밍 언어를 컴퓨터가 실행 가능한 기계어로 만드는 일
  - 컴파일러: 기계어로 바꾸어 주는 프로그램(ex. 자바 컴파일러.gcc)
  ### 💡 자바프로그래밍의 특징
  - 플랫폼에 영향을 받지 않으므로 다양한 환경에서 사용할 수 있다.
  - 객체 지향 언어이기 때문에 유지보수가 쉽고 확장성이 좋다.
  - 프로그램이 안정적이다.
  - 풍부한 기능이 제공되는 오픈 소스이다.
  ### 💡 객체 지향 프로그래밍이 무엇인가?
  - 프로그램의 구현을 시간의 흐름순이 아닌 객체간의 관계와 협력을 기반으로 프로그램 하는 것
  - Object oriented programming(OOP) 이라고 함
  - 사용 하는 언어: Java, C++, C#, Python, Javascript 등 다수

  ## :book: 변하지 않는 상수와 리터럴, 변수의 형 변환
  ### 💡 상수(constant) 선언하기
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

  ### 💡 형변환
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

  | 연산자 | 기능 | 연산 예  |
  | :--: | -- | -- |
  | + | 두 항을 더한다. | 1+2  |
  | - | 앞에 있는 항에서 뒤에 있는 항을 뺀다. | 1-2  |
  | * | 두 항을 곱한다. | 1*2  |
  | / | 앞에 있는 항에서 뒤에 있는 항을 나우어 몫을 구한다. | 4/3  |
  | % | 앞에 있는 항에서 뒤에 있는 항을 나우어 나머지를 구한다. | 4%3  |

  ### 💡 논리 연산자
  - 관계 연산자와 혼합하여 많이 사용됨
  | 연산자 | 기능 | 연산 예  |
  | :--: | -- | -- |
  | && (논리곱) | 두 항이 모두 참인 경우에만 결과 값이 참이다. | booleanval = (5 > 3) && (5 > 2); |
  | (논리합) | 두 항 중 하나의 항만 참이면 결과 값은 참이다. | booleanval = (5 > 3) || (5 < 2); |
  | ! (부정) | 단항 연산자이다. 참인 경우는 거짓으로 바꾸고, 거짓인 경우 참으로 바꾼다. | booleanval = !(5 > 3); |

  ### 💡 조건 연산자
  - 삼항 연산자
  - 조건식의 결과가 true인 경우와 거짓은 경우에 따라 다른 결과가 수행됨
  - if 문을 간단히 표현할 때 사용할 수 있음
  | 연산자 | 기능 | 연산 예  |
  | :--: | -- | -- |
  | 조건식 ? 결과1 : 결과2 | 조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택된다. | int num = (5 > 3) ? 10 : 20; |

  ### 💡 비트 연산자
  - 대입연산자와 다른 연산자가 함께 쓰임

  | 연산자 | 기능 | 연산 예  |
  | :--: | -- | -- |
  | ~ | 비트의 반전(1의 보수) | a = ~a; |
  | & | 비트 단위 AND | 1 & 1 1반환 그 외는 0 |
  | (세로) | 비트 단위 OR | 0|0 0반환 그 외는 1 |
  | ^ | 비트 단위 XOP | 두개의 비트가 서로 다른 경우에 1을 반환 |
  | << | 왼쪽 shift | a<<2 변수 a를 2비트 만큼 왼쪽으로 이동 |
  | << | 오른쪽 shift | a>>2 변수 a를 2비트 만큼 오른쪽으로 이동 |
  
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
 ### 💡 객체 지향 프로그램 구현 방법
 1. 객체를 정의한다.
 2. 각 객체가 제공하는 기능들을 구현한다.
 3. 각 객체가 제공하는 기능들 간의 솥ㅇ(메세지 전달)을 통하여 객체간의 협력을 구현한다.
 ## ✏️ 생활 속에서 객체를 찾아 클래스 구현해보기
 ### 💡 클래스는 객체의 청사진이다.
  - 객체의 속성은 클래스의 멤버 변수(member variable)로 선언한다.
  - 학생 클래스
  ```java
  public class Student {
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
 - C나 C++ 언어에서는 사용한 동적 메모리를 프로그래머가 해제 시켜야함 (free()나 delete 이용)
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
    
## :book: 객체 자신을 가리키는 this
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
