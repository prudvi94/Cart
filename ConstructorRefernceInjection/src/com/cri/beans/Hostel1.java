package com.cri.beans;

public class Hostel1 {
	@Override
	public String toString() {
		return "Hostel1 [hRegNo=" + hRegNo + ", hName=" + hName + ", location=" + location + ", phnNo=" + phnNo + "]";
	}
	private String hRegNo;
	 private String hName;
	 private String location;
	 private int phnNo;
	public Hostel1(String hRegNo, String hName, String location, int phnNo) {
		super();
		this.hRegNo = hRegNo;
		this.hName = hName;
		this.location = location;
		this.phnNo = phnNo;
	}
}
