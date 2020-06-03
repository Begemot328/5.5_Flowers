package by.module5.task5;

import java.util.Calendar;
import java.util.Locale;

import by.module5.task5.command.AddElementCommand;
import by.module5.task5.command.Invoker;
import by.module5.task5.command.RemoveElementCommand;
import by.module5.task5.entity.Bouquet;
import by.module5.task5.entity.factory.FlowerFactory;
import by.module5.task5.entity.factory.WrapperFactory;
import by.module5.task5.entity.flower.FlowerType;


/*  @author Yury Zmushko

 * Задача 5.
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Корректно спроектируйте и реализуйте предметную область задачи.
 * • Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
 * проектирования.
 * • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * • для проверки корректности переданных данных можно применить регулярные выражения.
 * • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 * Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
 * (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
 * и упаковка.
 */

public class Runner {
	
	public static void main(String[] args) {
		FlowerFactory flowerFactory = new FlowerFactory();
		WrapperFactory wrapperFactory = new WrapperFactory();
		Invoker invoker = new Invoker();
		
		Bouquet bouquet = new Bouquet();
		
		invoker.setCommand(new AddElementCommand(bouquet, flowerFactory.getElement(FlowerType.ROSE, 10)));
		invoker.run();
		System.out.println(bouquet);
		
		invoker.setCommand(new AddElementCommand(bouquet, flowerFactory.getElement(FlowerType.ROSE, 10)));
		invoker.setCommand(new AddElementCommand(bouquet, flowerFactory.getElement(FlowerType.ORCHID, 5)));
		invoker.setCommand(new AddElementCommand(bouquet, flowerFactory.getElement(FlowerType.TULIP, 2)));
		invoker.setCommand(new AddElementCommand(bouquet, flowerFactory.getElement(FlowerType.DAFFODIL, 3)));
		invoker.setCommand(new AddElementCommand(bouquet, flowerFactory.getElement(FlowerType.VIOLET, 10)));
		invoker.setCommand(new RemoveElementCommand(bouquet, flowerFactory.getElement(FlowerType.VIOLET, 10)));
		invoker.run();
		System.out.println(bouquet);
	}	
}


