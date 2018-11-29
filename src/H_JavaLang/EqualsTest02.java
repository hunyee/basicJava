package H_JavaLang;

public class EqualsTest02 {
	public static void main(String[] args) {
		Person p1 = new Person(9301231234567L);
		Person p2 = new Person(9301231234567L);
		
		if(p1==p2) {
			System.out.println("같은사람");
		} else {
			System.out.println("다른사람");
		}
		
		if(p1.equals(p2)) {
			System.out.println("같은사람");
		} else {
			System.out.println("다른사람");
		}
	}

	
}

class Person {
	
	long id;
	
	Person(long id) {
		this.id = id;
	}

	@Override //alt + shift + s => v => space => enter
	public boolean equals(Object obj) {
		boolean result = false;
		//1. obj가 null이면 안된다
		//2. obj가 Person인스턴스인지 확인
		if(obj!=null&&obj instanceof Person) {
			Person pp = (Person)obj;
			result  =  id==pp.id;
		}
		return result;
	}
	
}