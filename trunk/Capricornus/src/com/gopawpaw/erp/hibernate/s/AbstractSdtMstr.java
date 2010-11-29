package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSdtMstr entity provides the base persistence definition of the
 * SdtMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSdtMstr implements java.io.Serializable {

	// Fields

	private SdtMstrId id;
	private String sdtDesc;
	private String sdtModUserid;
	private Date sdtModDate;
	private String sdtUser1;
	private String sdtUser2;
	private String sdtChr01;
	private String sdtChr02;
	private Double sdtDec01;
	private Double sdtDec02;
	private Date sdtDte01;
	private Date sdtDte02;
	private Boolean sdtLog01;
	private Boolean sdtLog02;
	private String sdtQadc01;
	private String sdtQadc02;
	private Double sdtQadd01;
	private Double sdtQadd02;
	private Boolean sdtQadl01;
	private Boolean sdtQadl02;
	private Date sdtQadt01;
	private Date sdtQadt02;
	private Integer sdtQadi01;
	private Integer sdtQadi02;
	private Double oidSdtMstr;

	// Constructors

	/** default constructor */
	public AbstractSdtMstr() {
	}

	/** minimal constructor */
	public AbstractSdtMstr(SdtMstrId id, Double oidSdtMstr) {
		this.id = id;
		this.oidSdtMstr = oidSdtMstr;
	}

	/** full constructor */
	public AbstractSdtMstr(SdtMstrId id, String sdtDesc, String sdtModUserid,
			Date sdtModDate, String sdtUser1, String sdtUser2, String sdtChr01,
			String sdtChr02, Double sdtDec01, Double sdtDec02, Date sdtDte01,
			Date sdtDte02, Boolean sdtLog01, Boolean sdtLog02,
			String sdtQadc01, String sdtQadc02, Double sdtQadd01,
			Double sdtQadd02, Boolean sdtQadl01, Boolean sdtQadl02,
			Date sdtQadt01, Date sdtQadt02, Integer sdtQadi01,
			Integer sdtQadi02, Double oidSdtMstr) {
		this.id = id;
		this.sdtDesc = sdtDesc;
		this.sdtModUserid = sdtModUserid;
		this.sdtModDate = sdtModDate;
		this.sdtUser1 = sdtUser1;
		this.sdtUser2 = sdtUser2;
		this.sdtChr01 = sdtChr01;
		this.sdtChr02 = sdtChr02;
		this.sdtDec01 = sdtDec01;
		this.sdtDec02 = sdtDec02;
		this.sdtDte01 = sdtDte01;
		this.sdtDte02 = sdtDte02;
		this.sdtLog01 = sdtLog01;
		this.sdtLog02 = sdtLog02;
		this.sdtQadc01 = sdtQadc01;
		this.sdtQadc02 = sdtQadc02;
		this.sdtQadd01 = sdtQadd01;
		this.sdtQadd02 = sdtQadd02;
		this.sdtQadl01 = sdtQadl01;
		this.sdtQadl02 = sdtQadl02;
		this.sdtQadt01 = sdtQadt01;
		this.sdtQadt02 = sdtQadt02;
		this.sdtQadi01 = sdtQadi01;
		this.sdtQadi02 = sdtQadi02;
		this.oidSdtMstr = oidSdtMstr;
	}

	// Property accessors

	public SdtMstrId getId() {
		return this.id;
	}

	public void setId(SdtMstrId id) {
		this.id = id;
	}

	public String getSdtDesc() {
		return this.sdtDesc;
	}

	public void setSdtDesc(String sdtDesc) {
		this.sdtDesc = sdtDesc;
	}

	public String getSdtModUserid() {
		return this.sdtModUserid;
	}

	public void setSdtModUserid(String sdtModUserid) {
		this.sdtModUserid = sdtModUserid;
	}

	public Date getSdtModDate() {
		return this.sdtModDate;
	}

	public void setSdtModDate(Date sdtModDate) {
		this.sdtModDate = sdtModDate;
	}

	public String getSdtUser1() {
		return this.sdtUser1;
	}

	public void setSdtUser1(String sdtUser1) {
		this.sdtUser1 = sdtUser1;
	}

	public String getSdtUser2() {
		return this.sdtUser2;
	}

	public void setSdtUser2(String sdtUser2) {
		this.sdtUser2 = sdtUser2;
	}

	public String getSdtChr01() {
		return this.sdtChr01;
	}

	public void setSdtChr01(String sdtChr01) {
		this.sdtChr01 = sdtChr01;
	}

	public String getSdtChr02() {
		return this.sdtChr02;
	}

	public void setSdtChr02(String sdtChr02) {
		this.sdtChr02 = sdtChr02;
	}

	public Double getSdtDec01() {
		return this.sdtDec01;
	}

	public void setSdtDec01(Double sdtDec01) {
		this.sdtDec01 = sdtDec01;
	}

	public Double getSdtDec02() {
		return this.sdtDec02;
	}

	public void setSdtDec02(Double sdtDec02) {
		this.sdtDec02 = sdtDec02;
	}

	public Date getSdtDte01() {
		return this.sdtDte01;
	}

	public void setSdtDte01(Date sdtDte01) {
		this.sdtDte01 = sdtDte01;
	}

	public Date getSdtDte02() {
		return this.sdtDte02;
	}

	public void setSdtDte02(Date sdtDte02) {
		this.sdtDte02 = sdtDte02;
	}

	public Boolean getSdtLog01() {
		return this.sdtLog01;
	}

	public void setSdtLog01(Boolean sdtLog01) {
		this.sdtLog01 = sdtLog01;
	}

	public Boolean getSdtLog02() {
		return this.sdtLog02;
	}

	public void setSdtLog02(Boolean sdtLog02) {
		this.sdtLog02 = sdtLog02;
	}

	public String getSdtQadc01() {
		return this.sdtQadc01;
	}

	public void setSdtQadc01(String sdtQadc01) {
		this.sdtQadc01 = sdtQadc01;
	}

	public String getSdtQadc02() {
		return this.sdtQadc02;
	}

	public void setSdtQadc02(String sdtQadc02) {
		this.sdtQadc02 = sdtQadc02;
	}

	public Double getSdtQadd01() {
		return this.sdtQadd01;
	}

	public void setSdtQadd01(Double sdtQadd01) {
		this.sdtQadd01 = sdtQadd01;
	}

	public Double getSdtQadd02() {
		return this.sdtQadd02;
	}

	public void setSdtQadd02(Double sdtQadd02) {
		this.sdtQadd02 = sdtQadd02;
	}

	public Boolean getSdtQadl01() {
		return this.sdtQadl01;
	}

	public void setSdtQadl01(Boolean sdtQadl01) {
		this.sdtQadl01 = sdtQadl01;
	}

	public Boolean getSdtQadl02() {
		return this.sdtQadl02;
	}

	public void setSdtQadl02(Boolean sdtQadl02) {
		this.sdtQadl02 = sdtQadl02;
	}

	public Date getSdtQadt01() {
		return this.sdtQadt01;
	}

	public void setSdtQadt01(Date sdtQadt01) {
		this.sdtQadt01 = sdtQadt01;
	}

	public Date getSdtQadt02() {
		return this.sdtQadt02;
	}

	public void setSdtQadt02(Date sdtQadt02) {
		this.sdtQadt02 = sdtQadt02;
	}

	public Integer getSdtQadi01() {
		return this.sdtQadi01;
	}

	public void setSdtQadi01(Integer sdtQadi01) {
		this.sdtQadi01 = sdtQadi01;
	}

	public Integer getSdtQadi02() {
		return this.sdtQadi02;
	}

	public void setSdtQadi02(Integer sdtQadi02) {
		this.sdtQadi02 = sdtQadi02;
	}

	public Double getOidSdtMstr() {
		return this.oidSdtMstr;
	}

	public void setOidSdtMstr(Double oidSdtMstr) {
		this.oidSdtMstr = oidSdtMstr;
	}

}