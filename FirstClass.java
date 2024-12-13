class FirstClass
{
	public static void main(String[] args){
		var a = 2;
		var res1 = a<<1;
		var res2 = a<<2;
		var res3 = a<<3;

		System.out.println("2 << 1 ? " + res1);
		System.out.println("2 << 2 ? " + res2);
		System.out.println("2 << 3 ? " + res3);

		var b = 8;
		var res4 = b>>1;
		var res5 = b>>2;
		var res6 = b>>3;

		System.out.println("8 << 1 ? " + res4);
		System.out.println("8 << 2 ? " + res5);
		System.out.println("8 << 3 ? " + res6);

		System.out.println("*****************************************************************************");

		var t = true;
		var f = false;

		var res7 = t && t;
		var res8 = t && f;
		var res9 = f && t;
		var res10 = f && f;

		System.out.println("True && True" + res7);
		System.out.println("True && False" + res8);
		System.out.println("False && True" + res9);
		System.out.println("False && False" + res10);

		var res11 = t || t;
		var res12 = t || f;
		var res13 = f || t;
		var res14 = f || f;

		System.out.println("True || True" + res11);
		System.out.println("True || False" + res12);
		System.out.println("False || True" + res13);
		System.out.println("False || False" + res14);

		System.out.println("*****************************************************************************");


		var x = 100;
		var y = 150;
		
//		System.out.println(x > y ? X +"is Greater" : Y + "is Greater");

	}
}