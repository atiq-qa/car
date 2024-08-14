package car.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import car.pojo.Car;

public class CarMain {

	public static void main(String[] args) {
		//creating container
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("car.xml");
		
		Car car=(Car)applicationContext.getBean("car");
		System.out.println(car);

	}

}
