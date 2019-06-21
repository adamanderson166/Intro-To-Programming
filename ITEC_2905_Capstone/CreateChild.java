import java.time.*;

public class CreateChild {

	private String firstName;
	private String dateString;
	private int weight;
	private int height;
	private String bloodType;
	private String chickenpox1;
	private String chickenpox2;
	private String diphteria;
	private String haemophilus;
	private String hepatitisA;
	private String hepatitisB;
	private String influenza;
	private String mmr;
	private String mening;
	private String polio;
	private String rotavirus;

	public CreateChild() {
		
	}

	public CreateChild (String firstName, String dateString, int weight, int height, String bloodType, String chickenpox1, String chickenpox2, String diphteria, String haemophilus, String hepatitisA, String hepatitisB, String influenza, String mmr, String mening, String polio, String rotavirus) {

		this.firstName = firstName;
		this.dateString = dateString;
		this.weight = weight;
		this.height = height;
		this.bloodType = bloodType;
		this.chickenpox1 = chickenpox1;
		this.chickenpox2 = chickenpox2;
		this.diphteria = diphteria;
		this.haemophilus = haemophilus;
		this.hepatitisA = hepatitisA;
		this.hepatitisB = hepatitisB;
		this.influenza = influenza;
		this.mmr = mmr;
		this.mening = mening;
		this.polio = polio;
		this.rotavirus = rotavirus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAge() {
		return dateString;
	}

	public void setAge(String dateString) {
		this.dateString = dateString;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	public String getChickenpox1() {
		return chickenpox1;
	}

	public void setChickenpox1(String chickenpox1) {
		this.chickenpox1 = chickenpox1;
	}
	
	public String getChickenpox2() {
		return chickenpox2;
	}

	public void setChickenpox2(String chickenpox2) {
		this.chickenpox2 = chickenpox2;
	}
	
	public String getDiphteria() {
		return diphteria;
	}

	public void setDiphteria(String diphteria) {
		this.diphteria = diphteria;
	}
	
	public String getHaemophilus() {
		return haemophilus;
	}

	public void setHaemophilus(String haemophilus) {
		this.haemophilus = haemophilus;
	}
	
	public String getHepatitisA() {
		return hepatitisA;
	}

	public void setHepatitisA(String hepatitisA) {
		this.hepatitisA = hepatitisA;
	}
	
	public String getHepatitisB() {
		return hepatitisB;
	}

	public void setHepatitisB(String hepatitisB) {
		this.hepatitisB = hepatitisB;
	}
	
	public String getInfluenza() {
		return influenza;
	}

	public void setInfluenza(String influenza) {
		this.influenza = influenza;
	}
	
	public String getMmr() {
		return mmr;
	}

	public void setMmr(String mmr) {
		this.mmr = mmr;
	}
	
	public String getMening() {
		return mening;
	}

	public void setMening(String mening) {
		this.mening = mening;
	}
	
	public String getPolio() {
		return polio;
	}

	public void setPolio(String polio) {
		this.polio = polio;
	}
	
	public String getRotavirus() {
		return rotavirus;
	}

	public void setRotavirus(String rotavirus) {
		this.rotavirus = rotavirus;
	}
	
	@Override
	public String toString() {
		return "Child [name=" + firstName + ", age=" + dateString
				+ ", age=" + dateString + ", weight=" + weight + ", bloodType="
				+ bloodType + "Chickenpox1=" + chickenpox1 + "Chickenpox2=" + chickenpox2 + "Diphteria=" + diphteria + "Haemophilus=" + haemophilus + "HepatatisA=" + hepatitisA + "HepatatisB=" + hepatitisB + "Influenza=" + influenza + "MMR=" + mmr + "Meningitis=" + mening + "Polio=" + polio + "Rotavirus=" + rotavirus + "]";
	}
}
