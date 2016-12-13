package com.cri.beans;

public class PayingGuest1 {
	@Override
	public String toString() {
		return "PayingGuest1 [pgName=" + pgName + ", address=" + address + ", contactNo=" + contactNo + ", hostel1="
				+ hostel1 + "]";
	}
	
	private String pgName;
	  private String address;
	  private int contactNo;
	  private Hostel1 hostel1;
	public PayingGuest1(String pgName, String address, int contactNo, Hostel1 hostel1) {
		super();
		this.pgName = pgName;
		this.address = address;
		this.contactNo = contactNo;
		this.hostel1 = hostel1;
	}
}
	
