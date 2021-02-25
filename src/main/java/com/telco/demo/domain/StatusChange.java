package com.telco.demo.domain;

import lombok.Data;

@Data
public class StatusChange {
	
	private String changeDate;
	private String changeReason;
	private String status;
	private String type;


}
