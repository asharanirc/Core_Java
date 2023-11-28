package SecondaryAssignment;

public class Trainer {

	String CourseName;
	String InstituteAdress;
	String InstituteName;
	String TrainerName;
     String getCourseName() {
		return CourseName;
	}
    public void setCourseName(String courseName) {
		CourseName = courseName;
	}
    public String getInstituteAdress() {
		return InstituteAdress;
	}
    public void setInstituteAdress(String instituteAdress) {
		InstituteAdress = instituteAdress;
	}
    public String getInstituteName() {
		return InstituteName;
	}
    public void setInstituteName(String instituteName) {
		InstituteName = instituteName;
	}
    public String getTrainerName() {
		return TrainerName;
	}
    public void setTrainerName(String trainerName) {
		TrainerName = trainerName;
	}
     @Override
	public String toString() {
		return "Trainer [CourseName=" + CourseName + ", InstituteAdress=" + InstituteAdress + ", InstituteName="
				+ InstituteName + ", TrainerName=" + TrainerName + "]";
	}

}