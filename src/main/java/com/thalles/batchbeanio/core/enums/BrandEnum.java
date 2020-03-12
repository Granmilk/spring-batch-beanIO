package com.thalles.batchbeanio.core.enums;

public enum BrandEnum {
	
	VISA(1),
	MASTERCARD(2);
	
	private Integer code;
	
	BrandEnum(Integer code){
		this.code = code;
	}
	
	public Integer getCode(){
		return code;
	}
	
}
