package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEmapDet entity provides the base persistence definition of the
 * EmapDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmapDet implements java.io.Serializable {

	// Fields

	private EmapDetId id;
	private Boolean emapLineCont;
	private String emapData;
	private Date emapModDate;
	private String emapModUserid;
	private String emapUser1;
	private String emapUser2;
	private Double emapDec01;
	private Double emapDec02;
	private Integer emapInt01;
	private Integer emapInt02;
	private Boolean emapLog01;
	private Boolean emapLog02;
	private Date emapDte01;
	private Date emapDte02;
	private String emapQadc01;
	private String emapQadc02;
	private String emapQadc03;
	private String emapQadc04;
	private Double emapQadd01;
	private Double emapQadd02;
	private Integer emapQadi01;
	private Integer emapQadi02;
	private Boolean emapQadl01;
	private Boolean emapQadl02;
	private Date emapQadt01;
	private Date emapQadt02;
	private Double oidEmapDet;

	// Constructors

	/** default constructor */
	public AbstractEmapDet() {
	}

	/** minimal constructor */
	public AbstractEmapDet(EmapDetId id, Double oidEmapDet) {
		this.id = id;
		this.oidEmapDet = oidEmapDet;
	}

	/** full constructor */
	public AbstractEmapDet(EmapDetId id, Boolean emapLineCont, String emapData,
			Date emapModDate, String emapModUserid, String emapUser1,
			String emapUser2, Double emapDec01, Double emapDec02,
			Integer emapInt01, Integer emapInt02, Boolean emapLog01,
			Boolean emapLog02, Date emapDte01, Date emapDte02,
			String emapQadc01, String emapQadc02, String emapQadc03,
			String emapQadc04, Double emapQadd01, Double emapQadd02,
			Integer emapQadi01, Integer emapQadi02, Boolean emapQadl01,
			Boolean emapQadl02, Date emapQadt01, Date emapQadt02,
			Double oidEmapDet) {
		this.id = id;
		this.emapLineCont = emapLineCont;
		this.emapData = emapData;
		this.emapModDate = emapModDate;
		this.emapModUserid = emapModUserid;
		this.emapUser1 = emapUser1;
		this.emapUser2 = emapUser2;
		this.emapDec01 = emapDec01;
		this.emapDec02 = emapDec02;
		this.emapInt01 = emapInt01;
		this.emapInt02 = emapInt02;
		this.emapLog01 = emapLog01;
		this.emapLog02 = emapLog02;
		this.emapDte01 = emapDte01;
		this.emapDte02 = emapDte02;
		this.emapQadc01 = emapQadc01;
		this.emapQadc02 = emapQadc02;
		this.emapQadc03 = emapQadc03;
		this.emapQadc04 = emapQadc04;
		this.emapQadd01 = emapQadd01;
		this.emapQadd02 = emapQadd02;
		this.emapQadi01 = emapQadi01;
		this.emapQadi02 = emapQadi02;
		this.emapQadl01 = emapQadl01;
		this.emapQadl02 = emapQadl02;
		this.emapQadt01 = emapQadt01;
		this.emapQadt02 = emapQadt02;
		this.oidEmapDet = oidEmapDet;
	}

	// Property accessors

	public EmapDetId getId() {
		return this.id;
	}

	public void setId(EmapDetId id) {
		this.id = id;
	}

	public Boolean getEmapLineCont() {
		return this.emapLineCont;
	}

	public void setEmapLineCont(Boolean emapLineCont) {
		this.emapLineCont = emapLineCont;
	}

	public String getEmapData() {
		return this.emapData;
	}

	public void setEmapData(String emapData) {
		this.emapData = emapData;
	}

	public Date getEmapModDate() {
		return this.emapModDate;
	}

	public void setEmapModDate(Date emapModDate) {
		this.emapModDate = emapModDate;
	}

	public String getEmapModUserid() {
		return this.emapModUserid;
	}

	public void setEmapModUserid(String emapModUserid) {
		this.emapModUserid = emapModUserid;
	}

	public String getEmapUser1() {
		return this.emapUser1;
	}

	public void setEmapUser1(String emapUser1) {
		this.emapUser1 = emapUser1;
	}

	public String getEmapUser2() {
		return this.emapUser2;
	}

	public void setEmapUser2(String emapUser2) {
		this.emapUser2 = emapUser2;
	}

	public Double getEmapDec01() {
		return this.emapDec01;
	}

	public void setEmapDec01(Double emapDec01) {
		this.emapDec01 = emapDec01;
	}

	public Double getEmapDec02() {
		return this.emapDec02;
	}

	public void setEmapDec02(Double emapDec02) {
		this.emapDec02 = emapDec02;
	}

	public Integer getEmapInt01() {
		return this.emapInt01;
	}

	public void setEmapInt01(Integer emapInt01) {
		this.emapInt01 = emapInt01;
	}

	public Integer getEmapInt02() {
		return this.emapInt02;
	}

	public void setEmapInt02(Integer emapInt02) {
		this.emapInt02 = emapInt02;
	}

	public Boolean getEmapLog01() {
		return this.emapLog01;
	}

	public void setEmapLog01(Boolean emapLog01) {
		this.emapLog01 = emapLog01;
	}

	public Boolean getEmapLog02() {
		return this.emapLog02;
	}

	public void setEmapLog02(Boolean emapLog02) {
		this.emapLog02 = emapLog02;
	}

	public Date getEmapDte01() {
		return this.emapDte01;
	}

	public void setEmapDte01(Date emapDte01) {
		this.emapDte01 = emapDte01;
	}

	public Date getEmapDte02() {
		return this.emapDte02;
	}

	public void setEmapDte02(Date emapDte02) {
		this.emapDte02 = emapDte02;
	}

	public String getEmapQadc01() {
		return this.emapQadc01;
	}

	public void setEmapQadc01(String emapQadc01) {
		this.emapQadc01 = emapQadc01;
	}

	public String getEmapQadc02() {
		return this.emapQadc02;
	}

	public void setEmapQadc02(String emapQadc02) {
		this.emapQadc02 = emapQadc02;
	}

	public String getEmapQadc03() {
		return this.emapQadc03;
	}

	public void setEmapQadc03(String emapQadc03) {
		this.emapQadc03 = emapQadc03;
	}

	public String getEmapQadc04() {
		return this.emapQadc04;
	}

	public void setEmapQadc04(String emapQadc04) {
		this.emapQadc04 = emapQadc04;
	}

	public Double getEmapQadd01() {
		return this.emapQadd01;
	}

	public void setEmapQadd01(Double emapQadd01) {
		this.emapQadd01 = emapQadd01;
	}

	public Double getEmapQadd02() {
		return this.emapQadd02;
	}

	public void setEmapQadd02(Double emapQadd02) {
		this.emapQadd02 = emapQadd02;
	}

	public Integer getEmapQadi01() {
		return this.emapQadi01;
	}

	public void setEmapQadi01(Integer emapQadi01) {
		this.emapQadi01 = emapQadi01;
	}

	public Integer getEmapQadi02() {
		return this.emapQadi02;
	}

	public void setEmapQadi02(Integer emapQadi02) {
		this.emapQadi02 = emapQadi02;
	}

	public Boolean getEmapQadl01() {
		return this.emapQadl01;
	}

	public void setEmapQadl01(Boolean emapQadl01) {
		this.emapQadl01 = emapQadl01;
	}

	public Boolean getEmapQadl02() {
		return this.emapQadl02;
	}

	public void setEmapQadl02(Boolean emapQadl02) {
		this.emapQadl02 = emapQadl02;
	}

	public Date getEmapQadt01() {
		return this.emapQadt01;
	}

	public void setEmapQadt01(Date emapQadt01) {
		this.emapQadt01 = emapQadt01;
	}

	public Date getEmapQadt02() {
		return this.emapQadt02;
	}

	public void setEmapQadt02(Date emapQadt02) {
		this.emapQadt02 = emapQadt02;
	}

	public Double getOidEmapDet() {
		return this.oidEmapDet;
	}

	public void setOidEmapDet(Double oidEmapDet) {
		this.oidEmapDet = oidEmapDet;
	}

}