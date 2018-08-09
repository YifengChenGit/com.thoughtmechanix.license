package com.thoughtmechanix.license;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/organizations/{organizationId}/licenses")
public class LicenseControl {
	
	@GetMapping("/{licenseId}")
	public License getLicense(
		@PathVariable("organizationId") String organizationId,
		@PathVariable("licenseId") String licenseId) {
		return new License().withLicenseId(licenseId).withOrganizationId(organizationId);
	}
}
