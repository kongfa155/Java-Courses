package chapter7;

public class SinhVienIT extends SinhVien {
	private double scoreHTML;
	private double scoreJava;

	double getDiem() {
		return (getScoreJava() * 2 + getScoreHTML()) / 3;
	}

	public SinhVienIT(double HTML, double Java) {
		super();
		this.scoreHTML = HTML;
		this.scoreJava = Java;
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

}
