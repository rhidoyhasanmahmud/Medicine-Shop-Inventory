package com.learnwithhasan.medicineshopinventory.db.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

/**
 * The persistent class for the Base Entity.
 *
 * @author Hasan Mahmud
 * @since 2021-01-03
 */

@Data
@Entity
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@CreatedBy
	@Column(updatable = false)
	private String createdBy;

	@CreatedDate
	@Column(nullable = false, updatable = false)
	private LocalDateTime createdAt;

	@LastModifiedBy
	@Column(nullable = false)
	private String updatedBy;

	@LastModifiedDate
	@Column(nullable = false)
	private LocalDateTime updatedAt;
}
