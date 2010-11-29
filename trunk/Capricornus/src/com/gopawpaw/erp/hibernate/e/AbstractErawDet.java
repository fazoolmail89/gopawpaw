package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractErawDet entity provides the base persistence definition of the
 * ErawDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractErawDet implements java.io.Serializable {

	// Fields

	private ErawDetId id;
	private Date erawModDate;
	private String erawModUserid;
	private String erawData;
	private String erawUser1;
	private String erawUser2;
	private Double erawDec01;
	private Double erawDec02;
	private Integer erawInt01;
	private Integer erawInt02;
	private Boolean erawLog01;
	private Boolean erawLog02;
	private Date erawDte01;
	private Date erawDte02;
	private String erawQadc01;
	private String erawQadc02;
	private String erawQadc03;
	private String erawQadc04;
	private Double erawQadd01;
	private Double erawQadd02;
	private Integer erawQadi01;
	private Integer erawQadi02;
	private Boolean erawQadl01;
	private Boolean erawQadl02;
	private Date erawQadt01;
	private Date erawQadt02;
	private Boolean erawLineCont;
	private Double oidErawDet;

	// Constructors

	/** default constructor */
	public AbstractErawDet() {
	}

	/** minimal constructor */
	public AbstractErawDet(ErawDetId id, Double oidErawDet) {
		this.id = id;
		this.oidErawDet = oidErawDet;
	}

	/** full constructor */
	public AbstractErawDet(ErawDetId id, Date erawModDate,
			String erawModUserid, String erawData, String erawUser1,
			String erawUser2, Double erawDec01, Double erawDec02,
			Integer erawInt01, Integer erawInt02, Boolean erawLog01,
			Boolean erawLog02, Date erawDte01, Date erawDte02,
			String erawQadc01, String erawQadc02, String erawQadc03,
			String erawQadc04, Double erawQadd01, Double erawQadd02,
			Integer erawQadi01, Integer erawQadi02, Boolean erawQadl01,
			Boolean erawQadl02, Date erawQadt01, Date erawQadt02,
			Boolean erawLineCont, Double oidErawDet) {
		this.id = id;
		this.erawModDate = erawModDate;
		this.erawModUserid = erawModUserid;
		this.erawData = erawData;
		this.erawUser1 = erawUser1;
		this.erawUser2 = erawUser2;
		this.erawDec01 = erawDec01;
		this.erawDec02 = erawDec02;
		this.erawInt01 = erawInt01;
		this.erawInt02 = erawInt02;
		this.erawLog01 = erawLog01;
		this.erawLog02 = erawLog02;
		this.erawDte01 = erawDte01;
		this.erawDte02 = erawDte02;
		this.erawQadc01 = erawQadc01;
		this.erawQadc02 = erawQadc02;
		this.erawQadc03 = erawQadc03;
		this.erawQadc04 = erawQadc04;
		this.erawQadd01 = erawQadd01;
		this.erawQadd02 = erawQadd02;
		this.erawQadi01 = erawQadi01;
		this.erawQadi02 = erawQadi02;
		this.erawQadl01 = erawQadl01;
		this.erawQadl02 = erawQadl02;
		this.erawQadt01 = erawQadt01;
		this.erawQadt02 = erawQadt02;
		this.erawLineCont = erawLineCont;
		this.oidErawDet = oidErawDet;
	}

	// Property accessors

	public ErawDetId getId() {
		return this.id;
	}

	public void setId(ErawDetId id) {
		this.id = id;
	}

	public Date getErawModDate() {
		return this.erawModDate;
	}

	public void setErawModDate(Date erawModDate) {
		this.erawModDate = erawModDate;
	}

	public String getErawModUserid() {
		return this.erawModUserid;
	}

	public void setErawModUserid(String erawModUserid) {
		this.erawModUserid = erawModUserid;
	}

	public String getErawData() {
		return this.erawData;
	}

	public void setErawData(String erawData) {
		this.erawData = erawData;
	}

	public String getErawUser1() {
		return this.erawUser1;
	}

	public void setErawUser1(String erawUser1) {
		this.erawUser1 = erawUser1;
	}

	public String getErawUser2() {
		return this.erawUser2;
	}

	public void setErawUser2(String erawUser2) {
		this.erawUser2 = erawUser2;
	}

	public Double getErawDec01() {
		return this.erawDec01;
	}

	public void setErawDec01(Double erawDec01) {
		this.erawDec01 = erawDec01;
	}

	public Double getErawDec02() {
		return this.erawDec02;
	}

	public void setErawDec02(Double erawDec02) {
		this.erawDec02 = erawDec02;
	}

	public Integer getErawInt01() {
		return this.erawInt01;
	}

	public void setErawInt01(Integer erawInt01) {
		this.erawInt01 = erawInt01;
	}

	public Integer getErawInt02() {
		return this.erawInt02;
	}

	public void setErawInt02(Integer erawInt02) {
		this.erawInt02 = erawInt02;
	}

	public Boolean getErawLog01() {
		return this.erawLog01;
	}

	public void setErawLog01(Boolean erawLog01) {
		this.erawLog01 = erawLog01;
	}

	public Boolean getErawLog02() {
		return this.erawLog02;
	}

	public void setErawLog02(Boolean erawLog02) {
		this.erawLog02 = erawLog02;
	}

	public Date getErawDte01() {
		return this.erawDte01;
	}

	public void setErawDte01(Date erawDte01) {
		this.erawDte01 = erawDte01;
	}

	public Date getErawDte02() {
		return this.erawDte02;
	}

	public void setErawDte02(Date erawDte02) {
		this.erawDte02 = erawDte02;
	}

	public String getErawQadc01() {
		return this.erawQadc01;
	}

	public void setErawQadc01(String erawQadc01) {
		this.erawQadc01 = erawQadc01;
	}

	public String getErawQadc02() {
		return this.erawQadc02;
	}

	public void setErawQadc02(String erawQadc02) {
		this.erawQadc02 = erawQadc02;
	}

	public String getErawQadc03() {
		return this.erawQadc03;
	}

	public void setErawQadc03(String erawQadc03) {
		this.erawQadc03 = erawQadc03;
	}

	public String getErawQadc04() {
		return this.erawQadc04;
	}

	public void setErawQadc04(String erawQadc04) {
		this.erawQadc04 = erawQadc04;
	}

	public Double getErawQadd01() {
		return this.erawQadd01;
	}

	public void setErawQadd01(Double erawQadd01) {
		this.erawQadd01 = erawQadd01;
	}

	public Double getErawQadd02() {
		return this.erawQadd02;
	}

	public void setErawQadd02(Double erawQadd02) {
		this.erawQadd02 = erawQadd02;
	}

	public Integer getErawQadi01() {
		return this.erawQadi01;
	}

	public void setErawQadi01(Integer erawQadi01) {
		this.erawQadi01 = erawQadi01;
	}

	public Integer getErawQadi02() {
		return this.erawQadi02;
	}

	public void setErawQadi02(Integer erawQadi02) {
		this.erawQadi02 = erawQadi02;
	}

	public Boolean getErawQadl01() {
		return this.erawQadl01;
	}

	public void setErawQadl01(Boolean erawQadl01) {
		this.erawQadl01 = erawQadl01;
	}

	public Boolean getErawQadl02() {
		return this.erawQadl02;
	}

	public void setErawQadl02(Boolean erawQadl02) {
		this.erawQadl02 = erawQadl02;
	}

	public Date getErawQadt01() {
		return this.erawQadt01;
	}

	public void setErawQadt01(Date erawQadt01) {
		this.erawQadt01 = erawQadt01;
	}

	public Date getErawQadt02() {
		return this.erawQadt02;
	}

	public void setErawQadt02(Date erawQadt02) {
		this.erawQadt02 = erawQadt02;
	}

	public Boolean getErawLineCont() {
		return this.erawLineCont;
	}

	public void setErawLineCont(Boolean erawLineCont) {
		this.erawLineCont = erawLineCont;
	}

	public Double getOidErawDet() {
		return this.oidErawDet;
	}

	public void setOidErawDet(Double oidErawDet) {
		this.oidErawDet = oidErawDet;
	}

}