package com.thalles.batchbeanio.core.entity;

import com.thalles.batchbeanio.core.enums.TransactionStatusEnum;
import com.thalles.batchbeanio.core.enums.BrandEnum;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {
	
	@Id
	@GeneratedValue
	@Column(name = "TRANSACTION_ID")
	private Long transactionId;
	
	@Column(name = "TRANSACTION_CODE")
	private Long transactionCode;
	
	@Column(name = "TRANSACTION_STATUS")
	private TransactionStatusEnum transactionStatusEnum;
	
	@Column(name = "VALUE")
	private Double value;
	
	@Column(name = "TRANSACTION_DATE")
	private Date transactionDate;
	
	@Column(name = "TRANSACTION_BRAND")
	private BrandEnum transactionBrand;
	
	@Column(name = "PROCESS_DATE")
	private Date processDate;
	
	@Column(name = "TRANSACTION_COUNTRY")
	private String transactionCountry;
	
	@Column(name = "TRANSACTION_CITY")
	private String transactionCity;
	
	@Column(name = "CARDHOLDER_IDENTIFIER")
	private String cardholderIdentifier;
	
	@Column(name = "TRANSACTION_IDENTIFIER")
	private String transactionIdentifier;
	
	@Column(name = "MARKET_IDENTIFIER")
	private String marketIdentifier;
	
	
	public Long getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(final Long transactionId) {
		this.transactionId = transactionId;
	}
	
	public Long getTransactionCode() {
		return transactionCode;
	}
	
	public void setTransactionCode(final Long transactionCode) {
		this.transactionCode = transactionCode;
	}
	
	public TransactionStatusEnum getTransactionStatusEnum() {
		return transactionStatusEnum;
	}
	
	public void setTransactionStatusEnum(final TransactionStatusEnum transactionStatusEnum) {
		this.transactionStatusEnum = transactionStatusEnum;
	}
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(final Double value) {
		this.value = value;
	}
	
	public Date getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(final Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public BrandEnum getTransactionBrand() {
		return transactionBrand;
	}
	
	public void setTransactionBrand(final BrandEnum transactionBrand) {
		this.transactionBrand = transactionBrand;
	}
	
	public Date getProcessDate() {
		return processDate;
	}
	
	public void setProcessDate(final Date processDate) {
		this.processDate = processDate;
	}
	
	public String getTransactionCountry() {
		return transactionCountry;
	}
	
	public void setTransactionCountry(final String transactionCountry) {
		this.transactionCountry = transactionCountry;
	}
	
	public String getTransactionCity() {
		return transactionCity;
	}
	
	public void setTransactionCity(final String transactionCity) {
		this.transactionCity = transactionCity;
	}
	
	public String getCardholderIdentifier() {
		return cardholderIdentifier;
	}
	
	public void setCardholderIdentifier(final String cardholderIdentifier) {
		this.cardholderIdentifier = cardholderIdentifier;
	}
}
