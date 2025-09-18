package Hw_250918;

public class PersonMain {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		person1.setName("김");
		person1.setAge(20);
		person2.setName("이");
		person2.setAge(21);
		person3.setName("박");
		person3.setAge(22);
		person4.setName("권");
		person4.setAge(23);
		person5.setName("최");
		person5.setAge(24);
		
		System.out.println("이름: "+ person1.getName()+", 나이: "+person1.getAge());
		System.out.println("이름: "+ person2.getName()+", 나이: "+person2.getAge());
		System.out.println("이름: "+ person3.getName()+", 나이: "+person3.getAge());
		System.out.println("이름: "+ person4.getName()+", 나이: "+person4.getAge());
		System.out.println("이름: "+ person5.getName()+", 나이: "+person5.getAge());
	}

}
