package com.learnwithhasan.medicineshopinventory.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class ProductCreateRequest {
	
	@NotNull
	@Size(min = 2, max = 30)
	private String name;

	@NotNull
	@Size(min = 1, max = 3000)
	private String description;

	@NotNull
	@DecimalMin(value = "0.0", inclusive = false)
	@Digits(integer = 5, fraction = 2)
	private BigDecimal price;

	@NotNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate expireDate;
}
