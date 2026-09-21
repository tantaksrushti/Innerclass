class Outer{
	static class Inner{
		void disp(){
			System.out.println("hi");
		}
	}
	public static void main(String[] args){
		Inner obj = new Inner();
		obj.disp();
	}
}
