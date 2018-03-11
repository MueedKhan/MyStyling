class Const{
	Const(){
		System.out.println("Inside Parent class");
	}
}
class Const1 extends Const{
	Const1(){
		System.out.println("Inside child class");
	}
}
class Const2 extends Const1{
	Const2(){
		System.out.println("Inside ");
	}
	public static void main(String[] args) {
		Const2 c = new Const2();
	}
}