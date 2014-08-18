package cn.shitouer.springioc;

import cn.shitouer.springioc.ApplicationContext;
import cn.shitouer.springioc.FileSystemXmlApplicationContext;

public class AnimalSayApp {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"applicationContext.xml");
		AnimalSay animalSay = (AnimalSay) context.getBean("animalSay");
		animalSay.say();
	}
}
