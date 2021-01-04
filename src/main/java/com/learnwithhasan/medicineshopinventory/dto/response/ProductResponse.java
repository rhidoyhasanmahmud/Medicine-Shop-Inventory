package com.learnwithhasan.medicineshopinventory.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class ProductResponse {
	private String id;

	private String name;

	private String description;

	private BigDecimal purchasePrice;

	private LocalDate expire;

	private BigDecimal stock;
}
