package com.example.HamburgerMenu.entity;

import java.util.HashMap;
import java.util.Map;
public class AboutUsDatum {
    private String icons;
    private String title;
    private boolean b;
    
    @Override
	public String toString() {
		return "AboutUsDatum [icons=" + icons + ", title=" + title + ", b=" + b + "]";
	}

	
	
	public AboutUsDatum(String icons, String title) {
		super();
		this.icons = icons;
		this.title = title;
		this.b=b;
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
