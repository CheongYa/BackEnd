# 기본 설정

1. h2 데이터베이스 1.4.200 버전 사용
2. Intellij IDEA Community Edition 사용
3. Java 11 사용
4. Spring 사용
   - Project : Gradle - Groovy
   - Language : Java
   - Spring Boot : 2.7.15 (Java 11이 2.x.x 버전에서 까지만 호환)
     - 만일 3.0 이상을 선택하게 된다면?
       1. Java 17 이상을 사용해야 한다.
       2. javax 패키지 이름을 jakarta로 변경해야 한다.
       3. H2 데이터베이스를 2.1.214 버전 이상으로 사용해야 한다.
5. Project Metadata
   - Group : hello
   - artufactkd : hello-spring
6. Dependencies : Spring Web, Thymeleaf

# 명령 프롬프트를 사용해 빌드하는 방법 (윈도우)

1. 명령 프롬프트(cmd) 실행
2. spring을 이용해 만든 폴더로 이동 / cd 명령어를 이용해 명령 프롬프트에서 폴더 이동이 가능하다.
3. 명령 프롬프트에서 gradlew.bat을 실행하기 위해 gradlew build를 작성 후 엔터를 친다.
4. build/libs 폴더로 들어간다.
5. java -jar hello-spring-0.0.1-SNAPSHOT.jar을 작성해 실행한다.

# MVC(Model, View, Controller)란 무엇일까?

웹 계층에 서블릿(Servlet) API를 기반으로 클라이언트의 요청을 처리하는 모듈을 스프링 웹 MVC 또는 스프링 MVC라고 한다. 이는 클라이언트의 요청을 편리하게 해주는 기능을 제공한다.

> 서블릿 : 클라이언트의 요청을 처리하도록 특정 규약에 맞춰 Java 코드로 작성하는 클래스 파일이다.  
> 아파치 톰캣(Apach Tomcat)은 이러한 서블릿들이 웹 애플리케이션으로 실행할 수 있도록 해주는 서블릿 컨테이너 중 하나이다.

MVC 패턴은 애플리케이션을 개발할 때 사용하는 디자인 패턴이다.  
애플리케이션의 개발 영역을 MVC(Model, View, Controller)로 구분하여 각 역할에 맞게 코드를 작성하는 개발 방식이다.  
MVC패턴을 도입하면서 UI 영역과 도메인(비즈니스 로직) 영역으로 구분되어 서로에게 영향을 주지 않으면서 개발과 유지보수를 가능하게 되었다.

**Model(모델)**  
Spring MVC 기반의 웹 애플리케이션이 클라이언트의 요청을 전달받으면 요청 사항을 처리하기 위한 작업을 한다.  
처리한 작업의 결과 데이터를 클라이언트에게 응답을 돌려주어야 하는데, 이때 클라이언트에게 응답으로 돌려주는 **작업의 처리 결과 데이터**를 Model이라 한다.

클라이언트의 요청 사항을 구체적으로 처리하는 영역을 서비스 계층(Service layer)라고 하며, 요청 사항을 처리하기 위해 Java 코드로 구현한 것을 비즈니스 로직(Business Logic)이라 한다.

**View(뷰)**  
View는 Model을 이용하여 웹 브라우저와 같은 애플리케이션의 화면에 보이는 리소스(Resource)를 제공하는 역할을 한다.

Spring MVC에는 다양한 View 기술이 포함되어 있다.

- HTML 페이지 출력
- PDF, Excel 등의 문서 형태로 출력
- XML, JSON 등 특정 형식의 포맷으로 변환

**Controller(컨트롤러)**  
컨트롤러는 클라이언트 측의 요청을 직접적으로 전달받는 엔트포인트(Endpoint)로써 Model과 View의 중간에서 상호작용을 해주는 역할을 한다.

클라이언트 측의 요청을 전달받아 비즈니스 로직을 거친 후, Model 데이터가 만들어지면, 이 Model 데이터를 View로 전달하는 역할을 한다.

**MVC패턴의 구조**
MVC 패턴에서도 여러 가지 구조를 가진다.  
![Spring MVC](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbAdB0R%2FbtrQPjHTCQR%2F9r4fBFffmaTRHQVztREdc0%2Fimg.png)  
여러 가지 구조를 가진 MVC 패턴 중 위 그림의 구조를 그대로 사용하고 있는 것이 Spring MVC이다.  
일반 MVC 패턴도 유지보수하기에 좋은 패턴이지만, 구조가 복잡해지는 한계가 있다.  
이러한 한계를 극복하게 해주는 것이 Spring MVC이다.  
[참고링크](https://ittrue.tistory.com/234)

# 테스트케이스란?
