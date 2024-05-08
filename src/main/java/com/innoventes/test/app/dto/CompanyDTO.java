package com.innoventes.test.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	private Long id;

	@NotNull
	@Size(min = 5)
	private String companyName;

	@NotNull
	private String email;


	@PositiveOrZero
	private Integer strength;
	
	private String webSiteURL;

	@Size(min=5)
	private String companyCode;
}
