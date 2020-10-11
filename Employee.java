package letsupgrade;
public class Employee {
	int age;
	String name;
	String city;
	public void display() {
		System.out.println("The Name is "+name);
		System.out.println("The Age is "+age);
		System.out.println("The city is "+city);
		
	}
	
	public static void main(String[] args) {
		Employee e =new Employee();
		Employee e1 =new Employee();
		e.age=20;
		e.city="Guntur";
		e.name="Prakash";
		e1.age=21;
		e1.city="Vijayawada";
		e1.name="Hari";
		e.display();
		e1.display();
		
		
	}

}
