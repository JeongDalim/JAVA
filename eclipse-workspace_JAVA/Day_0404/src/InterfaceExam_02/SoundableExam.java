package InterfaceExam_02;

import InterfaceExam_02.Soundable;

public class SoundableExam {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		printSound(cat);
		printSound(dog);
		System.out.println("============");
		Soundable sound = new Cat();
		System.out.println(sound.hashCode());
		printSound(cat);
		sound = new Cat();
		printSound(dog);
		System.out.println("============");
		// �͸�����ü
		Soundable sound2 = new Soundable() {
			@Override
			public String sound() {
				// TODO Auto-generated method stub
				return "����";
			}
		};
		printSound(sound2);
	}
}