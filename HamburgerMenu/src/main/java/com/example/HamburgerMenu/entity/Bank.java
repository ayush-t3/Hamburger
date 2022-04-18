package com.example.HamburgerMenu.entity;
public class Bank {
    private String icons;
    private String title;
    private String kycStatus;
    private String notifyLine;
    private boolean b;
    
    
	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public Bank(String icons, String title, String notifyLine, String kycStatus) {
		super();
		this.icons = icons;
		this.title = title;
		this.kycStatus=kycStatus;
		this.notifyLine = notifyLine;
		this.b =b;
	}

	public String getKycStatus() {
        return kycStatus;
    }
    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
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
    public String getNotifyLine() {
        return notifyLine;
    }
    public void setNotifyLine(String notifyLine) {
        this.notifyLine = notifyLine;
    }
}