package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIrawDet entity provides the base persistence definition of the
 * IrawDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIrawDet implements java.io.Serializable {

	// Fields

	private IrawDetId id;
	private Boolean irawLineCont;
	private Date irawModDate;
	private String irawModUserid;
	private String irawData;
	private String irawUser1;
	private String irawUser2;
	private Double irawDec01;
	private Double irawDec02;
	private Integer irawInt01;
	private Integer irawInt02;
	private Boolean irawLog01;
	private Boolean irawLog02;
	private Date irawDte01;
	private Date irawDte02;
	private String irawQadc01;
	private String irawQadc02;
	private String irawQadc03;
	private String irawQadc04;
	private Double irawQadd01;
	private Double irawQadd02;
	private Integer irawQadi01;
	private Integer irawQadi02;
	private Boolean irawQadl01;
	private Boolean irawQadl02;
	private Date irawQadt01;
	private Date irawQadt02;
	private Double oidIrawDet;

	// Constructors

	/** default constructor */
	public AbstractIrawDet() {
	}

	/** minimal constructor */
	public AbstractIrawDet(IrawDetId id, Double oidIrawDet) {
		this.id = id;
		this.oidIrawDet = oidIrawDet;
	}

	/** full constructor */
	public AbstractIrawDet(IrawDetId id, Boolean irawLineCont,
			Date irawModDate, String irawModUserid, String irawData,
			String irawUser1, String irawUser2, Double irawDec01,
			Double irawDec02, Integer irawInt01, Integer irawInt02,
			Boolean irawLog01, Boolean irawLog02, Date irawDte01,
			Date irawDte02, String irawQadc01, String irawQadc02,
			String irawQadc03, String irawQadc04, Double irawQadd01,
			Double irawQadd02, Integer irawQadi01, Integer irawQadi02,
			Boolean irawQadl01, Boolean irawQadl02, Date irawQadt01,
			Date irawQadt02, Double oidIrawDet) {
		this.id = id;
		this.irawLineCont = irawLineCont;
		this.irawModDate = irawModDate;
		this.irawModUserid = irawModUserid;
		this.irawData = irawData;
		this.irawUser1 = irawUser1;
		this.irawUser2 = irawUser2;
		this.irawDec01 = irawDec01;
		this.irawDec02 = irawDec02;
		this.irawInt01 = irawInt01;
		this.irawInt02 = irawInt02;
		this.irawLog01 = irawLog01;
		this.irawLog02 = irawLog02;
		this.irawDte01 = irawDte01;
		this.irawDte02 = irawDte02;
		this.irawQadc01 = irawQadc01;
		this.irawQadc02 = irawQadc02;
		this.irawQadc03 = irawQadc03;
		this.irawQadc04 = irawQadc04;
		this.irawQadd01 = irawQadd01;
		this.irawQadd02 = irawQadd02;
		this.irawQadi01 = irawQadi01;
		this.irawQadi02 = irawQadi02;
		this.irawQadl01 = irawQadl01;
		this.irawQadl02 = irawQadl02;
		this.irawQadt01 = irawQadt01;
		this.irawQadt02 = irawQadt02;
		this.oidIrawDet = oidIrawDet;
	}

	// Property accessors

	public IrawDetId getId() {
		return this.id;
	}

	public void setId(IrawDetId id) {
		this.id = id;
	}

	public Boolean getIrawLineCont() {
		return this.irawLineCont;
	}

	public void setIrawLineCont(Boolean irawLineCont) {
		this.irawLineCont = irawLineCont;
	}

	public Date getIrawModDate() {
		return this.irawModDate;
	}

	public void setIrawModDate(Date irawModDate) {
		this.irawModDate = irawModDate;
	}

	public String getIrawModUserid() {
		return this.irawModUserid;
	}

	public void setIrawModUserid(String irawModUserid) {
		this.irawModUserid = irawModUserid;
	}

	public String getIrawData() {
		return this.irawData;
	}

	public void setIrawData(String irawData) {
		this.irawData = irawData;
	}

	public String getIrawUser1() {
		return this.irawUser1;
	}

	public void setIrawUser1(String irawUser1) {
		this.irawUser1 = irawUser1;
	}

	public String getIrawUser2() {
		return this.irawUser2;
	}

	public void setIrawUser2(String irawUser2) {
		this.irawUser2 = irawUser2;
	}

	public Double getIrawDec01() {
		return this.irawDec01;
	}

	public void setIrawDec01(Double irawDec01) {
		this.irawDec01 = irawDec01;
	}

	public Double getIrawDec02() {
		return this.irawDec02;
	}

	public void setIrawDec02(Double irawDec02) {
		this.irawDec02 = irawDec02;
	}

	public Integer getIrawInt01() {
		return this.irawInt01;
	}

	public void setIrawInt01(Integer irawInt01) {
		this.irawInt01 = irawInt01;
	}

	public Integer getIrawInt02() {
		return this.irawInt02;
	}

	public void setIrawInt02(Integer irawInt02) {
		this.irawInt02 = irawInt02;
	}

	public Boolean getIrawLog01() {
		return this.irawLog01;
	}

	public void setIrawLog01(Boolean irawLog01) {
		this.irawLog01 = irawLog01;
	}

	public Boolean getIrawLog02() {
		return this.irawLog02;
	}

	public void setIrawLog02(Boolean irawLog02) {
		this.irawLog02 = irawLog02;
	}

	public Date getIrawDte01() {
		return this.irawDte01;
	}

	public void setIrawDte01(Date irawDte01) {
		this.irawDte01 = irawDte01;
	}

	public Date getIrawDte02() {
		return this.irawDte02;
	}

	public void setIrawDte02(Date irawDte02) {
		this.irawDte02 = irawDte02;
	}

	public String getIrawQadc01() {
		return this.irawQadc01;
	}

	public void setIrawQadc01(String irawQadc01) {
		this.irawQadc01 = irawQadc01;
	}

	public String getIrawQadc02() {
		return this.irawQadc02;
	}

	public void setIrawQadc02(String irawQadc02) {
		this.irawQadc02 = irawQadc02;
	}

	public String getIrawQadc03() {
		return this.irawQadc03;
	}

	public void setIrawQadc03(String irawQadc03) {
		this.irawQadc03 = irawQadc03;
	}

	public String getIrawQadc04() {
		return this.irawQadc04;
	}

	public void setIrawQadc04(String irawQadc04) {
		this.irawQadc04 = irawQadc04;
	}

	public Double getIrawQadd01() {
		return this.irawQadd01;
	}

	public void setIrawQadd01(Double irawQadd01) {
		this.irawQadd01 = irawQadd01;
	}

	public Double getIrawQadd02() {
		return this.irawQadd02;
	}

	public void setIrawQadd02(Double irawQadd02) {
		this.irawQadd02 = irawQadd02;
	}

	public Integer getIrawQadi01() {
		return this.irawQadi01;
	}

	public void setIrawQadi01(Integer irawQadi01) {
		this.irawQadi01 = irawQadi01;
	}

	public Integer getIrawQadi02() {
		return this.irawQadi02;
	}

	public void setIrawQadi02(Integer irawQadi02) {
		this.irawQadi02 = irawQadi02;
	}

	public Boolean getIrawQadl01() {
		return this.irawQadl01;
	}

	public void setIrawQadl01(Boolean irawQadl01) {
		this.irawQadl01 = irawQadl01;
	}

	public Boolean getIrawQadl02() {
		return this.irawQadl02;
	}

	public void setIrawQadl02(Boolean irawQadl02) {
		this.irawQadl02 = irawQadl02;
	}

	public Date getIrawQadt01() {
		return this.irawQadt01;
	}

	public void setIrawQadt01(Date irawQadt01) {
		this.irawQadt01 = irawQadt01;
	}

	public Date getIrawQadt02() {
		return this.irawQadt02;
	}

	public void setIrawQadt02(Date irawQadt02) {
		this.irawQadt02 = irawQadt02;
	}

	public Double getOidIrawDet() {
		return this.oidIrawDet;
	}

	public void setOidIrawDet(Double oidIrawDet) {
		this.oidIrawDet = oidIrawDet;
	}

}