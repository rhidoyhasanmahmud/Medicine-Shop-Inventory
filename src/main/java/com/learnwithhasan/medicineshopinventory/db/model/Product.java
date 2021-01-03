package com.learnwithhasan.medicineshopinventory.db.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * The persistent class for the rdms_product database table.
 *
 * @author Hasan Mahmud
 * @since 2021-01-03
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="rdms_product")
@ToString(callSuper = true)
public class Product extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@NotBlank
	@Column(length = 30)
	private String name;

	@Column(columnDefinition = "TEXT")
	private String description;

	private BigDecimal purchasePrice = BigDecimal.ZERO;

	private LocalDate expire;

	private BigDecimal stock = BigDecimal.ZERO;
}
