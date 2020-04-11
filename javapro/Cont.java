class Cont{

public void Mypub(){

	System.out.println("hi i m public");

}
static void Myst(){

	System.out.println("hlo i m static");
}

	public static void main(String[] args) {
		
		Myst();
		Cont nn = new Cont();
		nn.Mypub();
	}
}