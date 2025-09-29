package oops_encapsulation;

public class OopsConceptDemo {
	private int serialNum; // integer, string, boolean, float = Primitive Data types
	@Override
	public String toString() {
		return "OopsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}


	private String name; // private , public, protected and default = Access modifiers / specifiers
	private int age;


	public int getSerialNum() {
		return serialNum;
	}


	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
