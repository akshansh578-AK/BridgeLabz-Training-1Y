// Demonstrates method overriding in inheritance.
class Human {
	void sound() {
		System.out.println("Its Human");
	}
}

class Kids extends Human {
	@Override
	void sound() {
		System.out.println("It was a Kid");
	}
}

public class MethodOverridingDemo {
	public static void main(String[] args) {
		Human a1 = new Human();
		Human a2 = new Kids();

		a1.sound();
		a2.sound();
	}
}
