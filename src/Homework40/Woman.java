package Homework40;
/*
Создайте класс "Женщина",
+ которые будут наследниками класса "Человек".
Попытка вывести их на экран должна приводить к выводу строку
"Женщина по имени …"
Метод "приветствие" класса "Женщина" должен выводить строку:
"Я родилась!"
 */

public class Woman extends Human{
  public Woman(String name) {
    super(name);
  }
  public void womanName() {
    System.out.println("Женщина по имени" + super.name);
  }
  @Override
  public void greeting() {
    System.out.println("Я родилась!");
  }
}
