package Homework40;
/*
Создайте классы "Мужчина",
+ который будет наследниками класса "Человек".
+ Попытка вывести их на экран должна приводить к выводу строки
+ "Мужчина по имени …"
 */

public class Man extends Human {
  public Man(String name) {
    super(name);
  }
  public void mansName() {
    System.out.println("Мужчина по имени" + super.name);//name было ошибкой, не понял, почему
  }
}
