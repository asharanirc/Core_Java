package collectionFramework;

public class Array {

public static void main(String[] args) {
	Demo d[]= new Demo[10];
	d[0]= new Demo();
	d[1]= new Demo();
	d[2]= new Demo();
	d[3]=new Demo();
	d[4]= new Demo();
	d[5]= new Demo();
	d[6]= new Demo();
	d[7]= new Demo();
	d[8]= new Demo();
	d[9]= new Demo();
	//d[10]= new Teacher();   saying incompatible type or create new class.
	d[11]= new Demo();

	
	// arrayOutOfBiundException showing eg
	
	int a[]=new int[5];
	//int a=[]=[10,20,30,25,40,];
	a[0] = 10;
	a[1] = 60;
	a[2] = 30;
	a[3] = 80;
	a[4] = 50;
	a[5] = 90;
	a[6] = 50;
	
	
}
}
