package com.telco.demo.domain;

import lombok.Data;

@Data
public class RelatedEntity {
	private String id;
	private String href;
	private String name;
	private String role;
	private String type;
	private String refferedType;

}
