package Chapter6;

public class SinhVienCoKhi extends SinhVien {
	private String skills;
	private double scorePLC;
	private double scoreCNC;

	double getDiem() {
		return (getScoreCNC() + getScorePLC()) / 2;
	}

	public SinhVienCoKhi(String skills, String id, String ten, double price, double tax) {
		super(id, ten, price, tax);
		this.skills = skills;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

}
