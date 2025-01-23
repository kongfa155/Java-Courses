package Chapter6;

public class SinhVienIT extends SinhVien {
	private String languages;
	private double scoreHTML;
	private double scoreJava;

	double getDiem() {
		return (getScoreJava() * 2 + getScoreHTML()) / 3;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public SinhVienIT(String languages, String id, String ten, double price, double tax) {
		super(id, ten, price, tax);
		this.languages = languages;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

}
