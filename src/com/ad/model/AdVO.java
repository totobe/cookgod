package com.ad.model;

import java.sql.Timestamp;

public class AdVO {
	private String ad_id;
	private int ad_status;
	private Timestamp ad_start;
	private Timestamp ad_end;
	private int ad_type;
	private String ad_title;
	private String ad_con;
	private byte[] ad_img;
	private String food_sup_id;
	public String getAd_id() {
		return ad_id;
	}
	public void setAd_id(String ad_id) {
		this.ad_id = ad_id;
	}
	public int getAd_status() {
		return ad_status;
	}
	public void setAd_status(int ad_status) {
		this.ad_status = ad_status;
	}
	public Timestamp getAd_start() {
		return ad_start;
	}
	public void setAd_start(Timestamp ad_start) {
		this.ad_start = ad_start;
	}
	public Timestamp getAd_end() {
		return ad_end;
	}
	public void setAd_end(Timestamp ad_end) {
		this.ad_end = ad_end;
	}
	public int getAd_type() {
		return ad_type;
	}
	public void setAd_type(int ad_type) {
		this.ad_type = ad_type;
	}
	public String getAd_title() {
		return ad_title;
	}
	public void setAd_title(String ad_title) {
		this.ad_title = ad_title;
	}
	public String getAd_con() {
		return ad_con;
	}
	public void setAd_con(String ad_con) {
		this.ad_con = ad_con;
	}
	public byte[] getAd_img() {
		return ad_img;
	}
	public void setAd_img(byte[] ad_img) {
		this.ad_img = ad_img;
	}
	public String getFood_sup_id() {
		return food_sup_id;
	}
	public void setFood_sup_id(String food_sup_id) {
		this.food_sup_id = food_sup_id;
	}
}
