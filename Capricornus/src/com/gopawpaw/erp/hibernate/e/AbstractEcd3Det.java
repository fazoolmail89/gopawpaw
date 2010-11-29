package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcd3Det entity provides the base persistence definition of the
 * Ecd3Det entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd3Det implements java.io.Serializable {

	// Fields

	private Ecd3DetId id;
	private Integer ecd3Order;
	private String ecd3Process;
	private Boolean ecd3Qad01;
	private Date ecd3Qad02;
	private String ecd3Qad03;
	private String ecd3Qad04;
	private String ecd3Qad05;
	private Date ecd3ModDate;
	private String ecd3Userid;
	private String ecd3User1;
	private String ecd3User2;
	private Double oidEcd3Det;

	// Constructors

	/** default constructor */
	public AbstractEcd3Det() {
	}

	/** minimal constructor */
	public AbstractEcd3Det(Ecd3DetId id, Double oidEcd3Det) {
		this.id = id;
		this.oidEcd3Det = oidEcd3Det;
	}

	/** full constructor */
	public AbstractEcd3Det(Ecd3DetId id, Integer ecd3Order, String ecd3Process,
			Boolean ecd3Qad01, Date ecd3Qad02, String ecd3Qad03,
			String ecd3Qad04, String ecd3Qad05, Date ecd3ModDate,
			String ecd3Userid, String ecd3User1, String ecd3User2,
			Double oidEcd3Det) {
		this.id = id;
		this.ecd3Order = ecd3Order;
		this.ecd3Process = ecd3Process;
		this.ecd3Qad01 = ecd3Qad01;
		this.ecd3Qad02 = ecd3Qad02;
		this.ecd3Qad03 = ecd3Qad03;
		this.ecd3Qad04 = ecd3Qad04;
		this.ecd3Qad05 = ecd3Qad05;
		this.ecd3ModDate = ecd3ModDate;
		this.ecd3Userid = ecd3Userid;
		this.ecd3User1 = ecd3User1;
		this.ecd3User2 = ecd3User2;
		this.oidEcd3Det = oidEcd3Det;
	}

	// Property accessors

	public Ecd3DetId getId() {
		return this.id;
	}

	public void setId(Ecd3DetId id) {
		this.id = id;
	}

	public Integer getEcd3Order() {
		return this.ecd3Order;
	}

	public void setEcd3Order(Integer ecd3Order) {
		this.ecd3Order = ecd3Order;
	}

	public String getEcd3Process() {
		return this.ecd3Process;
	}

	public void setEcd3Process(String ecd3Process) {
		this.ecd3Process = ecd3Process;
	}

	public Boolean getEcd3Qad01() {
		return this.ecd3Qad01;
	}

	public void setEcd3Qad01(Boolean ecd3Qad01) {
		this.ecd3Qad01 = ecd3Qad01;
	}

	public Date getEcd3Qad02() {
		return this.ecd3Qad02;
	}

	public void setEcd3Qad02(Date ecd3Qad02) {
		this.ecd3Qad02 = ecd3Qad02;
	}

	public String getEcd3Qad03() {
		return this.ecd3Qad03;
	}

	public void setEcd3Qad03(String ecd3Qad03) {
		this.ecd3Qad03 = ecd3Qad03;
	}

	public String getEcd3Qad04() {
		return this.ecd3Qad04;
	}

	public void setEcd3Qad04(String ecd3Qad04) {
		this.ecd3Qad04 = ecd3Qad04;
	}

	public String getEcd3Qad05() {
		return this.ecd3Qad05;
	}

	public void setEcd3Qad05(String ecd3Qad05) {
		this.ecd3Qad05 = ecd3Qad05;
	}

	public Date getEcd3ModDate() {
		return this.ecd3ModDate;
	}

	public void setEcd3ModDate(Date ecd3ModDate) {
		this.ecd3ModDate = ecd3ModDate;
	}

	public String getEcd3Userid() {
		return this.ecd3Userid;
	}

	public void setEcd3Userid(String ecd3Userid) {
		this.ecd3Userid = ecd3Userid;
	}

	public String getEcd3User1() {
		return this.ecd3User1;
	}

	public void setEcd3User1(String ecd3User1) {
		this.ecd3User1 = ecd3User1;
	}

	public String getEcd3User2() {
		return this.ecd3User2;
	}

	public void setEcd3User2(String ecd3User2) {
		this.ecd3User2 = ecd3User2;
	}

	public Double getOidEcd3Det() {
		return this.oidEcd3Det;
	}

	public void setOidEcd3Det(Double oidEcd3Det) {
		this.oidEcd3Det = oidEcd3Det;
	}

}