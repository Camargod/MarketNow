package com.marketnow.Product.entity;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table

public class Product
{
	@Column(name = "id_product")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private Float price;

	@ManyToOne
	@JoinColumn(name = "id_category")
	private Category category;

	private String description;

	private List<String> images;
}