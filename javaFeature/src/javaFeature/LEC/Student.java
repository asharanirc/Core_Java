package javaFeature.LEC;


public class Student {

	int sId;
	String sName;
	public Student(int sId, String sName)
	{
		this.sId = sId;
		this.sName= sName;
		
	}
	
	public String toString()
	{
		return (" sid:" +sId +" SName:"+sName);
		
	}
}
