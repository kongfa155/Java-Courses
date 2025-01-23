package chapter7;

public class SinhVienCoKhi extends SinhVien {
	private double scorePLC;
	private double scoreCNC;

	double getDiem() {
		return (getScoreCNC() + getScorePLC()) / 2;
	}

	public SinhVienCoKhi(double PLC, double CNC) {
		super();
		this.scorePLC = PLC;
		this.scoreCNC = CNC;
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
