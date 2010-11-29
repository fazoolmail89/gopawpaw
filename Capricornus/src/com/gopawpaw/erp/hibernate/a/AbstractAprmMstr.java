package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAprmMstr entity provides the base persistence definition of the
 * AprmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAprmMstr implements java.io.Serializable {

	// Fields

	private AprmMstrId id;
	private Date aprmModDate;
	private String aprmModUserid;
	private String aprmCode;
	private String aprmDesc;
	private String aprmVal;
	private String aprmUser1;
	private String aprmUser2;
	private Double aprmDec01;
	private Double aprmDec02;
	private Integer aprmInt01;
	private Integer aprmInt02;
	private Boolean aprmLog01;
	private Boolean aprmLog02;
	private Date aprmDte01;
	private Date aprmDte02;
	private String aprmQadc01;
	private String aprmQadc02;
	private String aprmQadc03;
	private String aprmQadc04;
	private Double aprmQadd01;
	private Double aprmQadd02;
	private Integer aprmQadi01;
	private Integer aprmQadi02;
	private Boolean aprmQadl01;
	private Boolean aprmQadl02;
	private Date aprmQadt01;
	private Date aprmQadt02;
	private Double oidAprmMstr;

	// Constructors

	/** default constructor */
	public AbstractAprmMstr() {
	}

	/** minimal constructor */
	public AbstractAprmMstr(AprmMstrId id, Double oidAprmMstr) {
		this.id = id;
		this.oidAprmMstr = oidAprmMstr;
	}

	/** full constructor */
	public AbstractAprmMstr(AprmMstrId id, Date aprmModDate,
			String aprmModUserid, String aprmCode, String aprmDesc,
			String aprmVal, String aprmUser1, String aprmUser2,
			Double aprmDec01, Double aprmDec02, Integer aprmInt01,
			Integer aprmInt02, Boolean aprmLog01, Boolean aprmLog02,
			Date aprmDte01, Date aprmDte02, String aprmQadc01,
			String aprmQadc02, String aprmQadc03, String aprmQadc04,
			Double aprmQadd01, Double aprmQadd02, Integer aprmQadi01,
			Integer aprmQadi02, Boolean aprmQadl01, Boolean aprmQadl02,
			Date aprmQadt01, Date aprmQadt02, Double oidAprmMstr) {
		this.id = id;
		this.aprmModDate = aprmModDate;
		this.aprmModUserid = aprmModUserid;
		this.aprmCode = aprmCode;
		this.aprmDesc = aprmDesc;
		this.aprmVal = aprmVal;
		this.aprmUser1 = aprmUser1;
		this.aprmUser2 = aprmUser2;
		this.aprmDec01 = aprmDec01;
		this.aprmDec02 = aprmDec02;
		this.aprmInt01 = aprmInt01;
		this.aprmInt02 = aprmInt02;
		this.aprmLog01 = aprmLog01;
		this.aprmLog02 = aprmLog02;
		this.aprmDte01 = aprmDte01;
		this.aprmDte02 = aprmDte02;
		this.aprmQadc01 = aprmQadc01;
		this.aprmQadc02 = aprmQadc02;
		this.aprmQadc03 = aprmQadc03;
		this.aprmQadc04 = aprmQadc04;
		this.aprmQadd01 = aprmQadd01;
		this.aprmQadd02 = aprmQadd02;
		this.aprmQadi01 = aprmQadi01;
		this.aprmQadi02 = aprmQadi02;
		this.aprmQadl01 = aprmQadl01;
		this.aprmQadl02 = aprmQadl02;
		this.aprmQadt01 = aprmQadt01;
		this.aprmQadt02 = aprmQadt02;
		this.oidAprmMstr = oidAprmMstr;
	}

	// Property accessors

	public AprmMstrId getId() {
		return this.id;
	}

	public void setId(AprmMstrId id) {
		this.id = id;
	}

	public Date getAprmModDate() {
		return this.aprmModDate;
	}

	public void setAprmModDate(Date aprmModDate) {
		this.aprmModDate = aprmModDate;
	}

	public String getAprmModUserid() {
		return this.aprmModUserid;
	}

	public void setAprmModUserid(String aprmModUserid) {
		this.aprmModUserid = aprmModUserid;
	}

	public String getAprmCode() {
		return this.aprmCode;
	}

	public void setAprmCode(String aprmCode) {
		this.aprmCode = aprmCode;
	}

	public String getAprmDesc() {
		return this.aprmDesc;
	}

	public void setAprmDesc(String aprmDesc) {
		this.aprmDesc = aprmDesc;
	}

	public String getAprmVal() {
		return this.aprmVal;
	}

	public void setAprmVal(String aprmVal) {
		this.aprmVal = aprmVal;
	}

	public String getAprmUser1() {
		return this.aprmUser1;
	}

	public void setAprmUser1(String aprmUser1) {
		this.aprmUser1 = aprmUser1;
	}

	public String getAprmUser2() {
		return this.aprmUser2;
	}

	public void setAprmUser2(String aprmUser2) {
		this.aprmUser2 = aprmUser2;
	}

	public Double getAprmDec01() {
		return this.aprmDec01;
	}

	public void setAprmDec01(Double aprmDec01) {
		this.aprmDec01 = aprmDec01;
	}

	public Double getAprmDec02() {
		return this.aprmDec02;
	}

	public void setAprmDec02(Double aprmDec02) {
		this.aprmDec02 = aprmDec02;
	}

	public Integer getAprmInt01() {
		return this.aprmInt01;
	}

	public void setAprmInt01(Integer aprmInt01) {
		this.aprmInt01 = aprmInt01;
	}

	public Integer getAprmInt02() {
		return this.aprmInt02;
	}

	public void setAprmInt02(Integer aprmInt02) {
		this.aprmInt02 = aprmInt02;
	}

	public Boolean getAprmLog01() {
		return this.aprmLog01;
	}

	public void setAprmLog01(Boolean aprmLog01) {
		this.aprmLog01 = aprmLog01;
	}

	public Boolean getAprmLog02() {
		return this.aprmLog02;
	}

	public void setAprmLog02(Boolean aprmLog02) {
		this.aprmLog02 = aprmLog02;
	}

	public Date getAprmDte01() {
		return this.aprmDte01;
	}

	public void setAprmDte01(Date aprmDte01) {
		this.aprmDte01 = aprmDte01;
	}

	public Date getAprmDte02() {
		return this.aprmDte02;
	}

	public void setAprmDte02(Date aprmDte02) {
		this.aprmDte02 = aprmDte02;
	}

	public String getAprmQadc01() {
		return this.aprmQadc01;
	}

	public void setAprmQadc01(String aprmQadc01) {
		this.aprmQadc01 = aprmQadc01;
	}

	public String getAprmQadc02() {
		return this.aprmQadc02;
	}

	public void setAprmQadc02(String aprmQadc02) {
		this.aprmQadc02 = aprmQadc02;
	}

	public String getAprmQadc03() {
		return this.aprmQadc03;
	}

	public void setAprmQadc03(String aprmQadc03) {
		this.aprmQadc03 = aprmQadc03;
	}

	public String getAprmQadc04() {
		return this.aprmQadc04;
	}

	public void setAprmQadc04(String aprmQadc04) {
		this.aprmQadc04 = aprmQadc04;
	}

	public Double getAprmQadd01() {
		return this.aprmQadd01;
	}

	public void setAprmQadd01(Double aprmQadd01) {
		this.aprmQadd01 = aprmQadd01;
	}

	public Double getAprmQadd02() {
		return this.aprmQadd02;
	}

	public void setAprmQadd02(Double aprmQadd02) {
		this.aprmQadd02 = aprmQadd02;
	}

	public Integer getAprmQadi01() {
		return this.aprmQadi01;
	}

	public void setAprmQadi01(Integer aprmQadi01) {
		this.aprmQadi01 = aprmQadi01;
	}

	public Integer getAprmQadi02() {
		return this.aprmQadi02;
	}

	public void setAprmQadi02(Integer aprmQadi02) {
		this.aprmQadi02 = aprmQadi02;
	}

	public Boolean getAprmQadl01() {
		return this.aprmQadl01;
	}

	public void setAprmQadl01(Boolean aprmQadl01) {
		this.aprmQadl01 = aprmQadl01;
	}

	public Boolean getAprmQadl02() {
		return this.aprmQadl02;
	}

	public void setAprmQadl02(Boolean aprmQadl02) {
		this.aprmQadl02 = aprmQadl02;
	}

	public Date getAprmQadt01() {
		return this.aprmQadt01;
	}

	public void setAprmQadt01(Date aprmQadt01) {
		this.aprmQadt01 = aprmQadt01;
	}

	public Date getAprmQadt02() {
		return this.aprmQadt02;
	}

	public void setAprmQadt02(Date aprmQadt02) {
		this.aprmQadt02 = aprmQadt02;
	}

	public Double getOidAprmMstr() {
		return this.oidAprmMstr;
	}

	public void setOidAprmMstr(Double oidAprmMstr) {
		this.oidAprmMstr = oidAprmMstr;
	}

}