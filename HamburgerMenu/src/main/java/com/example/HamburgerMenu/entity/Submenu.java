package com.example.HamburgerMenu.entity;

import java.util.HashMap;
import java.util.Map;
public class Submenu {
    private String icons;
    private String title;
    private String notifyLine;
    private boolean b;
	public Submenu(String icons, String title, String notifyLine) {
		super();
		this.icons = icons;
		this.title = title;
		this.notifyLine = notifyLine;
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