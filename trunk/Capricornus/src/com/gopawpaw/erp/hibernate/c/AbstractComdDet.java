package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractComdDet entity provides the base persistence definition of the
 * ComdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractComdDet implements java.io.Serializable {

	// Fields

	private ComdDetId id;
	private String comdUser1;
	private String comdUser2;
	private String comdUser3;
	private String comdUser4;
	private String comdQadc01;
	private String comdQadc02;
	private String comdQadc03;
	private String comdQadc04;
	private Double comdQadd01;
	private Double comdQadd02;
	private Boolean comdQadl01;
	private Boolean comdQadl02;
	private Date comdQadt01;
	private Date comdQadt02;
	private Integer comdQadi01;
	private Integer comdQadi02;
	private Double oidComdDet;

	// Constructors

	/** default constructor */
	public AbstractComdDet() {
	}

	/** minimal constructor */
	public AbstractComdDet(ComdDetId id, Double oidComdDet) {
		this.id = id;
		this.oidComdDet = oidComdDet;
	}

	/** full constructor */
	public AbstractComdDet(ComdDetId id, String comdUser1, String comdUser2,
			String comdUser3, String comdUser4, String comdQadc01,
			String comdQadc02, String comdQadc03, String comdQadc04,
			Double comdQadd01, Double comdQadd02, Boolean comdQadl01,
			Boolean comdQadl02, Date comdQadt01, Date comdQadt02,
			Integer comdQadi01, Integer comdQadi02, Double oidComdDet) {
		this.id = id;
		this.comdUser1 = comdUser1;
		this.comdUser2 = comdUser2;
		this.comdUser3 = comdUser3;
		this.comdUser4 = comdUser4;
		this.comdQadc01 = comdQadc01;
		this.comdQadc02 = comdQadc02;
		this.comdQadc03 = comdQadc03;
		this.comdQadc04 = comdQadc04;
		this.comdQadd01 = comdQadd01;
		this.comdQadd02 = comdQadd02;
		this.comdQadl01 = comdQadl01;
		this.comdQadl02 = comdQadl02;
		this.comdQadt01 = comdQadt01;
		this.comdQadt02 = comdQadt02;
		this.comdQadi01 = comdQadi01;
		this.comdQadi02 = comdQadi02;
		this.oidComdDet = oidComdDet;
	}

	// Property accessors

	public ComdDetId getId() {
		return this.id;
	}

	public void setId(ComdDetId id) {
		this.id = id;
	}

	public String getComdUser1() {
		return this.comdUser1;
	}

	public void setComdUser1(String comdUser1) {
		this.comdUser1 = comdUser1;
	}

	public String getComdUser2() {
		return this.comdUser2;
	}

	public void setComdUser2(String comdUser2) {
		this.comdUser2 = comdUser2;
	}

	public String getComdUser3() {
		return this.comdUser3;
	}

	public void setComdUser3(String comdUser3) {
		this.comdUser3 = comdUser3;
	}

	public String getComdUser4() {
		return this.comdUser4;
	}

	public void setComdUser4(String comdUser4) {
		this.comdUser4 = comdUser4;
	}

	public String getComdQadc01() {
		return this.comdQadc01;
	}

	public void setComdQadc01(String comdQadc01) {
		this.comdQadc01 = comdQadc01;
	}

	public String getComdQadc02() {
		return this.comdQadc02;
	}

	public void setComdQadc02(String comdQadc02) {
		this.comdQadc02 = comdQadc02;
	}

	public String getComdQadc03() {
		return this.comdQadc03;
	}

	public void setComdQadc03(String comdQadc03) {
		this.comdQadc03 = comdQadc03;
	}

	public String getComdQadc04() {
		return this.comdQadc04;
	}

	public void setComdQadc04(String comdQadc04) {
		this.comdQadc04 = comdQadc04;
	}

	public Double getComdQadd01() {
		return this.comdQadd01;
	}

	public void setComdQadd01(Double comdQadd01) {
		this.comdQadd01 = comdQadd01;
	}

	public Double getComdQadd02() {
		return this.comdQadd02;
	}

	public void setComdQadd02(Double comdQadd02) {
		this.comdQadd02 = comdQadd02;
	}

	public Boolean getComdQadl01() {
		return this.comdQadl01;
	}

	public void setComdQadl01(Boolean comdQadl01) {
		this.comdQadl01 = comdQadl01;
	}

	public Boolean getComdQadl02() {
		return this.comdQadl02;
	}

	public void setComdQadl02(Boolean comdQadl02) {
		this.comdQadl02 = comdQadl02;
	}

	public Date getComdQadt01() {
		return this.comdQadt01;
	}

	public void setComdQadt01(Date comdQadt01) {
		this.comdQadt01 = comdQadt01;
	}

	public Date getComdQadt02() {
		return this.comdQadt02;
	}

	public void setComdQadt02(Date comdQadt02) {
		this.comdQadt02 = comdQadt02;
	}

	public Integer getComdQadi01() {
		return this.comdQadi01;
	}

	public void setComdQadi01(Integer comdQadi01) {
		this.comdQadi01 = comdQadi01;
	}

	public Integer getComdQadi02() {
		return this.comdQadi02;
	}

	public void setComdQadi02(Integer comdQadi02) {
		this.comdQadi02 = comdQadi02;
	}

	public Double getOidComdDet() {
		return this.oidComdDet;
	}

	public void setOidComdDet(Double oidComdDet) {
		this.oidComdDet = oidComdDet;
	}

}