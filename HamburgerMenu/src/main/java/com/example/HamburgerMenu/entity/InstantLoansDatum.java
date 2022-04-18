package com.example.HamburgerMenu.entity;

import java.util.HashMap;
import java.util.Map;
public class InstantLoansDatum {
    private String icons;
    private String title;
    private String kycStatus;
    

	private String notifyLine;
    private boolean b;
    public InstantLoansDatum(String icons, String title, String kycStatus, String notifyLine) {
		super();
		this.icons = icons;
		this.title = title;
		this.notifyLine = notifyLine;
		this.kycStatus=kycStatus;
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
    public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}
	public String getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}
}