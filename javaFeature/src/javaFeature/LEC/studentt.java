package javaFeature.LEC;

public class studentt {

	int sId;
	String sName;
	String sSub;
	int sScore;
	
	
	public studentt(int sId, String sName, String sSub, int sScore) {
		
		this.sId = sId;
		this.sName = sName;
		this.sSub = sSub;
		this.sScore = sScore;
	}
 
	public String toString()
	{
		return("SName:"+sName + "  SId:"+sId+"  SSub:"+sSub+" SScore: " +sScore );
		
	}

}




