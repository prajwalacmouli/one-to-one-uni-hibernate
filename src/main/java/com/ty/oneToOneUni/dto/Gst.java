package com.ty.oneToOneUni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long gstNumber;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(long gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Gst [id=" + id + ", gstNumber=" + gstNumber + ", status=" + status + "]";
	}
	

}
