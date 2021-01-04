package com.learnwithhasan.medicineshopinventory.dto.response;

import java.util.List;

import lombok.Data;

@Data
public class ProductsResponse {
	private int page;

	private int size;

	private int totalPages;

	private long totalElements;

	private List<ProductResponse> items;
}
