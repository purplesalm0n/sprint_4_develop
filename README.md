
В проекте реализованы базовые тесты для учебного проекта Яндекс.Практикум

 Технология           Версия      
 Java                 11          
 JUnit                4.13.2    
 Maven                3.9.0       
 Selenium             4.20.0      
 WebDriverManager     5.9.3       


1. Создайте Maven проект 
2. Поставьте/переключите на java11
3. Добавьте зависимости в пом
   <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.20.0</version>
    </dependency>
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>5.9.3</version>
    </dependency>
      <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>4.13.2</version>
          <scope>test</scope>
      </dependency>



Запуск тестов выполняется с помощью 
   mvn clean test

