package backend;


import entity.innerClass.CPU;
import entity.innerClass.CPU.Processor;
import entity.innerClass.Car;


public class Excercise3 {
	public void question1(){
		CPU cpu = new CPU(1);
		CPU.Processor pro = cpu.new Processor(1,1);
		System.out.println("Cache: "+pro.getCache());
		
		CPU.Ram ram = cpu.new Ram(1,1);
		System.out.println("Clock Speed: "+ram.getClockSpeed());
	}
	public void question2(){
		Car car = new Car("Mazda","8WD");
		Car.Engine engine = car.new Engine();
		engine.setEngineType("Crysler");
		System.out.println("Engine type: "+engine.getEngineType());
	}
	


}
