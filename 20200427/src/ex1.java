class Person{

	String name = "";
	void doStudy() {
		System.out.println(name + "씨가 공부하고 있습니다.");
	}
	void setName(String input) {
		name = input;
	}
}

public class ex1 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.doStudy();
		
		Person p2 = new Person();
		p2.setName("옿길동");
		p2.doStudy();
	}
}
