class Outer{
	static class Inner{
		void disp(){
			System.out.println("In disp");
		}
	}
}
class Display{
	public static void main(String[] args){
		Outer.Inner obj = new Outer.Inner();
		obj.disp();
	}
}
