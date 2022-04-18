package com.example.HamburgerMenu.entity;
public class Datum {
    private String icons;
    private String title;
    private String kycStatus;
    private boolean b;
    
	

	public Datum(String icons, String title, String kycStatus) {
		super();
		this.icons = icons;
		this.title = title;
		this.kycStatus = kycStatus;
		this.b= b;
		
	}

	@Override
	public String toString() {
		return "Datum [icons=" + icons + ", title=" + title + ", kycStatus=" + kycStatus + "]";
	}
	public String getIcons() {
        return icons;
    }
    public void setIcons(String icons) {
        this.icons = icons;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getKycStatus() {
        return kycStatus;
    }
    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }
    public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}
}