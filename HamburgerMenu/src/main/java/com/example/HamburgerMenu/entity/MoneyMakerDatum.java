package com.example.HamburgerMenu.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MoneyMakerDatum {
    private String icons;
    private String title;
    private String kycStatus;
    private String notifyLine;
    private List<Submenu> submenu = new ArrayList<Submenu>();
    private boolean b;
    
	
    
	public MoneyMakerDatum(String icons, String title, String notifyLine, String kycStatus, List<Submenu> submenu, boolean b) {
		super();
		this.icons = icons;
		this.title = title;
		this.notifyLine = notifyLine;
		this.submenu = submenu;
		this.b= b;
		this.kycStatus= kycStatus;
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
    public List<Submenu> getSubmenu() {
        return submenu;
    }
    public void setSubmenu(List<Submenu> submenu) {
        this.submenu = submenu;
    }
}
