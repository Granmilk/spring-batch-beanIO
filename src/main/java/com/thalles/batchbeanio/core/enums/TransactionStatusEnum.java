package com.thalles.batchbeanio.core.enums;

public enum TransactionStatusEnum {
	
	APPROVED(1),
	DECLINED(2),
	CANCELED(3);
	
	private Integer code;
	
	TransactionStatusEnum(Integer code){
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
}
