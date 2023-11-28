package javaFeature.Setget;

public class SetGet {

	private String sName;
	private int sId;
	private String sDepartment;
	private int sScore;
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsDepartment() {
		return sDepartment;
	}
	public void setsDepartment(String sDepartment) {
		this.sDepartment = sDepartment;
	}
	public int getsScore() {
		return sScore;
	}
	public void setsScore(int sScore) {
		this.sScore = sScore;
	}
	@Override
	public String toString() {
		return "SetGet [sName:" + sName + ", sId:" + sId + ", sDepartment:" + sDepartment + ", sScore:" + sScore + "]";
	}
	
}
	