package com.example.HamburgerMenu.entity;

import java.util.List;

public class InsuranceSolutionsDatum {
	private String icons;
	private String title;
	private String kycStatus;
	private String notifyingLine;
	public String getNotifyingLine() {
		return notifyingLine;
	}
	public void setNotifyingLine(String notifyingLine) {
		this.notifyingLine = notifyingLine;
	}
	private List<Submenu> subMenu;
	public InsuranceSolutionsDatum(String icons, String title, String kycStatus, String notifyingLine, List<Submenu> subMenu) {
		super();
		this.icons = icons;
		this.title = title;
		this.kycStatus = kycStatus;
		this.subMenu = subMenu;
		this.notifyingLine = notifyingLine;
	}
	public InsuranceSolutionsDatum() {
		super();
		// TODO Auto-generated constructor stub
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
	public List<Submenu> getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(List<Submenu> subMenu) {
		this.subMenu = subMenu;
	}

	
}
