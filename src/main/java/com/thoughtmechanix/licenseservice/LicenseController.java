package com.thoughtmechanix.licenseservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/licenses")
public class LicenseController {

	@GetMapping("/{licenseId}")
	public License getLicense(@PathVariable("licenseId") String licenseId) {
		return new License(licenseId);
	}
}
