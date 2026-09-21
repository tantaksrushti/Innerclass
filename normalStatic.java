class Outer{
	int x= 20;
	static int y = 30;
	class Inner{
		int z = 90;
		void disp(){
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
	public static void main(String[] args){
		Outer outobj = new Outer();
		Inner innobj = outobj.new Inner();
		innobj.disp();
	}
}
