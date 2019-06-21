import javafx.beans.property.SimpleStringProperty;

public class Vaccine {

	public final SimpleStringProperty vaccineName;
	public final SimpleStringProperty vaccineDate;
	public final SimpleStringProperty vaccineContact;

	public Vaccine(String vName, String vDate, String vContact) {
		this.vaccineName = new SimpleStringProperty(vName);
		this.vaccineDate = new SimpleStringProperty(vDate);
		this.vaccineContact = new SimpleStringProperty(vContact);
	}

	public String getVaccineName() {
		return vaccineName.get();
	}

	public void setVaccineName(String vName) {
		vaccineName.set(vName);
	}

	public String getVaccineDate() {
		return vaccineDate.get();
	}

	public void setVaccineDate(String vDate) {
		vaccineDate.set(vDate);
	}

	public String getVaccineContact() {
		return vaccineContact.get();
	}

	public void setVaccineContact(String vContact) {
		vaccineContact.set(vContact);
	}
}	