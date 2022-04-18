package com.example.HamburgerMenu.entity;

import java.util.HashMap;
import java.util.Map;

public class ManageAppLockDatum {
	private String icons;
	private String title;
	private boolean b;

	public ManageAppLockDatum(String icons, String title, boolean b) {
		super();
		this.icons = icons;
		this.title = title;
		this.b = b;
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
}