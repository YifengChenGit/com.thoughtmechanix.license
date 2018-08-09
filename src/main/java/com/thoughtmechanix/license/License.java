package com.thoughtmechanix.license;

public class License {

	private String licenseId;
	private String organizationId;

	public License withLicenseId(String licenseId) {
		this.licenseId = licenseId;
		return this;
	}

	public License withOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		return this;
	}

	public String getLicenseId() {
		return licenseId;
	}

	public String getOrganizationId() {
		return organizationId;
	}
}
