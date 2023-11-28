package SecondaryAssignment;

public class Student {
	
	 int sId;
	 String sName;
	 String email;
	 String address;
	 Trainer tr;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Trainer getTr() {
		return tr;
	}
	public void setTr(Trainer tr) {
		this.tr = tr;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", email=" + email + ", address=" + address + ", tr=" + tr
				+ "]";
	}
	
}