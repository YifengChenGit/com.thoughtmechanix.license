package com.thoughtmechanix.licenseservice;

public class License {

	private String licenseId;
	
	public License(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getLicenseId() {
		return licenseId;
	}
}
