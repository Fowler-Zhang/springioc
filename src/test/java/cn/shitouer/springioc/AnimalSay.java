package cn.shitouer.springioc;

public class AnimalSay {
	private Animal animal;

	public void say() {
		animal.say();
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
