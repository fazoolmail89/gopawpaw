package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSoccMstr entity provides the base persistence definition of the
 * SoccMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSoccMstr implements java.io.Serializable {

	// Fields

	private SoccMstrId id;
	private String soccCcNbrTail;
	private Date soccCcExpireDate;
	private String soccCardType;
	private Date soccAuthDate;
	private String soccAuthNbr;
	private Double soccAuthAmt;
	private Date soccAuthExpireDate;
	private String soccBillingName;
	private String soccBillingAddr1;
	private String soccBillingAddr2;
	private String soccBillingAddr3;
	private String soccBillingCity;
	private String soccBillingZip;
	private String soccBillingState;
	private String soccBillingCountry;
	private String soccBillingCtry;
	private String soccModUserid;
	private Date soccModDate;
	private String soccUser1;
	private String soccUser2;
	private String soccQadc01;
	private Integer soccQadi01;
	private Double soccQadd01;
	private Boolean soccQadl01;
	private Date soccQadt01;
	private Double oidSoccMstr;

	// Constructors

	/** default constructor */
	public AbstractSoccMstr() {
	}

	/** minimal constructor */
	public AbstractSoccMstr(SoccMstrId id, String soccCcNbrTail,
			Date soccCcExpireDate, String soccCardType, Date soccAuthDate,
			String soccAuthNbr, Double soccAuthAmt, Date soccAuthExpireDate,
			String soccBillingName, String soccBillingAddr1,
			String soccBillingAddr2, String soccBillingAddr3,
			String soccBillingCity, String soccBillingZip,
			String soccBillingState, String soccBillingCountry,
			String soccModUserid, Date soccModDate, Double oidSoccMstr) {
		this.id = id;
		this.soccCcNbrTail = soccCcNbrTail;
		this.soccCcExpireDate = soccCcExpireDate;
		this.soccCardType = soccCardType;
		this.soccAuthDate = soccAuthDate;
		this.soccAuthNbr = soccAuthNbr;
		this.soccAuthAmt = soccAuthAmt;
		this.soccAuthExpireDate = soccAuthExpireDate;
		this.soccBillingName = soccBillingName;
		this.soccBillingAddr1 = soccBillingAddr1;
		this.soccBillingAddr2 = soccBillingAddr2;
		this.soccBillingAddr3 = soccBillingAddr3;
		this.soccBillingCity = soccBillingCity;
		this.soccBillingZip = soccBillingZip;
		this.soccBillingState = soccBillingState;
		this.soccBillingCountry = soccBillingCountry;
		this.soccModUserid = soccModUserid;
		this.soccModDate = soccModDate;
		this.oidSoccMstr = oidSoccMstr;
	}

	/** full constructor */
	public AbstractSoccMstr(SoccMstrId id, String soccCcNbrTail,
			Date soccCcExpireDate, String soccCardType, Date soccAuthDate,
			String soccAuthNbr, Double soccAuthAmt, Date soccAuthExpireDate,
			String soccBillingName, String soccBillingAddr1,
			String soccBillingAddr2, String soccBillingAddr3,
			String soccBillingCity, String soccBillingZip,
			String soccBillingState, String soccBillingCountry,
			String soccBillingCtry, String soccModUserid, Date soccModDate,
			String soccUser1, String soccUser2, String soccQadc01,
			Integer soccQadi01, Double soccQadd01, Boolean soccQadl01,
			Date soccQadt01, Double oidSoccMstr) {
		this.id = id;
		this.soccCcNbrTail = soccCcNbrTail;
		this.soccCcExpireDate = soccCcExpireDate;
		this.soccCardType = soccCardType;
		this.soccAuthDate = soccAuthDate;
		this.soccAuthNbr = soccAuthNbr;
		this.soccAuthAmt = soccAuthAmt;
		this.soccAuthExpireDate = soccAuthExpireDate;
		this.soccBillingName = soccBillingName;
		this.soccBillingAddr1 = soccBillingAddr1;
		this.soccBillingAddr2 = soccBillingAddr2;
		this.soccBillingAddr3 = soccBillingAddr3;
		this.soccBillingCity = soccBillingCity;
		this.soccBillingZip = soccBillingZip;
		this.soccBillingState = soccBillingState;
		this.soccBillingCountry = soccBillingCountry;
		this.soccBillingCtry = soccBillingCtry;
		this.soccModUserid = soccModUserid;
		this.soccModDate = soccModDate;
		this.soccUser1 = soccUser1;
		this.soccUser2 = soccUser2;
		this.soccQadc01 = soccQadc01;
		this.soccQadi01 = soccQadi01;
		this.soccQadd01 = soccQadd01;
		this.soccQadl01 = soccQadl01;
		this.soccQadt01 = soccQadt01;
		this.oidSoccMstr = oidSoccMstr;
	}

	// Property accessors

	public SoccMstrId getId() {
		return this.id;
	}

	public void setId(SoccMstrId id) {
		this.id = id;
	}

	public String getSoccCcNbrTail() {
		return this.soccCcNbrTail;
	}

	public void setSoccCcNbrTail(String soccCcNbrTail) {
		this.soccCcNbrTail = soccCcNbrTail;
	}

	public Date getSoccCcExpireDate() {
		return this.soccCcExpireDate;
	}

	public void setSoccCcExpireDate(Date soccCcExpireDate) {
		this.soccCcExpireDate = soccCcExpireDate;
	}

	public String getSoccCardType() {
		return this.soccCardType;
	}

	public void setSoccCardType(String soccCardType) {
		this.soccCardType = soccCardType;
	}

	public Date getSoccAuthDate() {
		return this.soccAuthDate;
	}

	public void setSoccAuthDate(Date soccAuthDate) {
		this.soccAuthDate = soccAuthDate;
	}

	public String getSoccAuthNbr() {
		return this.soccAuthNbr;
	}

	public void setSoccAuthNbr(String soccAuthNbr) {
		this.soccAuthNbr = soccAuthNbr;
	}

	public Double getSoccAuthAmt() {
		return this.soccAuthAmt;
	}

	public void setSoccAuthAmt(Double soccAuthAmt) {
		this.soccAuthAmt = soccAuthAmt;
	}

	public Date getSoccAuthExpireDate() {
		return this.soccAuthExpireDate;
	}

	public void setSoccAuthExpireDate(Date soccAuthExpireDate) {
		this.soccAuthExpireDate = soccAuthExpireDate;
	}

	public String getSoccBillingName() {
		return this.soccBillingName;
	}

	public void setSoccBillingName(String soccBillingName) {
		this.soccBillingName = soccBillingName;
	}

	public String getSoccBillingAddr1() {
		return this.soccBillingAddr1;
	}

	public void setSoccBillingAddr1(String soccBillingAddr1) {
		this.soccBillingAddr1 = soccBillingAddr1;
	}

	public String getSoccBillingAddr2() {
		return this.soccBillingAddr2;
	}

	public void setSoccBillingAddr2(String soccBillingAddr2) {
		this.soccBillingAddr2 = soccBillingAddr2;
	}

	public String getSoccBillingAddr3() {
		return this.soccBillingAddr3;
	}

	public void setSoccBillingAddr3(String soccBillingAddr3) {
		this.soccBillingAddr3 = soccBillingAddr3;
	}

	public String getSoccBillingCity() {
		return this.soccBillingCity;
	}

	public void setSoccBillingCity(String soccBillingCity) {
		this.soccBillingCity = soccBillingCity;
	}

	public String getSoccBillingZip() {
		return this.soccBillingZip;
	}

	public void setSoccBillingZip(String soccBillingZip) {
		this.soccBillingZip = soccBillingZip;
	}

	public String getSoccBillingState() {
		return this.soccBillingState;
	}

	public void setSoccBillingState(String soccBillingState) {
		this.soccBillingState = soccBillingState;
	}

	public String getSoccBillingCountry() {
		return this.soccBillingCountry;
	}

	public void setSoccBillingCountry(String soccBillingCountry) {
		this.soccBillingCountry = soccBillingCountry;
	}

	public String getSoccBillingCtry() {
		return this.soccBillingCtry;
	}

	public void setSoccBillingCtry(String soccBillingCtry) {
		this.soccBillingCtry = soccBillingCtry;
	}

	public String getSoccModUserid() {
		return this.soccModUserid;
	}

	public void setSoccModUserid(String soccModUserid) {
		this.soccModUserid = soccModUserid;
	}

	public Date getSoccModDate() {
		return this.soccModDate;
	}

	public void setSoccModDate(Date soccModDate) {
		this.soccModDate = soccModDate;
	}

	public String getSoccUser1() {
		return this.soccUser1;
	}

	public void setSoccUser1(String soccUser1) {
		this.soccUser1 = soccUser1;
	}

	public String getSoccUser2() {
		return this.soccUser2;
	}

	public void setSoccUser2(String soccUser2) {
		this.soccUser2 = soccUser2;
	}

	public String getSoccQadc01() {
		return this.soccQadc01;
	}

	public void setSoccQadc01(String soccQadc01) {
		this.soccQadc01 = soccQadc01;
	}

	public Integer getSoccQadi01() {
		return this.soccQadi01;
	}

	public void setSoccQadi01(Integer soccQadi01) {
		this.soccQadi01 = soccQadi01;
	}

	public Double getSoccQadd01() {
		return this.soccQadd01;
	}

	public void setSoccQadd01(Double soccQadd01) {
		this.soccQadd01 = soccQadd01;
	}

	public Boolean getSoccQadl01() {
		return this.soccQadl01;
	}

	public void setSoccQadl01(Boolean soccQadl01) {
		this.soccQadl01 = soccQadl01;
	}

	public Date getSoccQadt01() {
		return this.soccQadt01;
	}

	public void setSoccQadt01(Date soccQadt01) {
		this.soccQadt01 = soccQadt01;
	}

	public Double getOidSoccMstr() {
		return this.oidSoccMstr;
	}

	public void setOidSoccMstr(Double oidSoccMstr) {
		this.oidSoccMstr = oidSoccMstr;
	}

}