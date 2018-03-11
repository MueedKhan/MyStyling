class Simple{
	int a=10;
	int b=20;
}
class Simp extends Simple{
	int a = 100;
	int b = 200;
	void m1(int a,int b){
		System.out.println(a + b);
		System.out.println(this.a + this.b);
		System.out.println(super.a + super.b);
	}
	public static void main(String[] args) {
		Simp s = new Simp();
		s.m1(1000,2000);
	}
}