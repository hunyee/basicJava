package H_JavaLang;

public class EqualsTest01 {
	public static void main(String[] args) {

		Value v1 = new Value(10);
//		System.out.println(v1.hashCode());
		System.out.println(v1);
		Value v2 = new Value(10);
		System.out.println(v2);
		System.out.println(v1==v2);
		System.out.println(v1.equals(v2)); //기본적인 메서드는
		

	}
}

class Value {
	int value;
	
	public Value(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		//obj null이면 안되고
		//obj가 value인스턴스인지 확인해야한다.
		if(obj!=null&&obj instanceof Value) {
			Value vl = (Value)obj;
			result = value==vl.value;
		}
		return result;
	}
	
}
