/* class Assessment {
	
	String name;
	int duration;
	String typeOfQuestion;
	String batchName;
	

	void assignToBatch(){
		System.out.println(name + " is " + "assingn to this" + batchName);
	}

	void start(){
		System.out.println(name + " start from: 31" + "to" + duration + " days" );
	}

	void end(){
		System.out.println(name + " start from: 20" + "at" + duration + " days" );
	}
}

class Main {
	public static void main(String[] args){
		Assessment a1 = new Assessment();	
		Assessment a2= new Assessment();		
		Assessment a3 = new Assessment();	
		Assessment a4 = new Assessment();		
		Assessment a5 = new Assessment();


		a2.name = "Ass 1";
		a2.duration = 50;
		a2.typeOfQuestion = "MCQ";
		a2.batchName = "A1";



		a3.name = "Ass 1";
		a3.duration = 50;
		a3.typeOfQuestion = "MCQ";
		a3.batchName = "A1";

		a4.name = "Ass 1";
		a4.duration = 50;
		a4.typeOfQuestion = "MCQ";
		a4.batchName = "A1";

		a5.name = "Ass 1";
		a5.duration = 50;
		a5.typeOfQuestion = "MCQ";
		a5.batchName = "A1";


}
} */


class Main
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

	}
}