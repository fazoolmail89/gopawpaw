package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcd9Det entity provides the base persistence definition of the
 * Ecd9Det entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd9Det implements java.io.Serializable {

	// Fields

	private Ecd9DetId id;
	private Boolean ecd9Approved;
	private Date ecd9ApprDate;
	private Integer ecd9Seq;
	private Integer ecd9Cmtindx;
	private String ecd9Status;
	private String ecd9User1;
	private String ecd9User2;
	private Boolean ecd9Qad01;
	private Date ecd9Qad02;
	private String ecd9Qad03;
	private String ecd9Qad04;
	private String ecd9Qad05;
	private Date ecd9ModDate;
	private String ecd9Userid;
	private Double oidEcd9Det;

	// Constructors

	/** default constructor */
	public AbstractEcd9Det() {
	}

	/** minimal constructor */
	public AbstractEcd9Det(Ecd9DetId id, Double oidEcd9Det) {
		this.id = id;
		this.oidEcd9Det = oidEcd9Det;
	}

	/** full constructor */
	public AbstractEcd9Det(Ecd9DetId id, Boolean ecd9Approved,
			Date ecd9ApprDate, Integer ecd9Seq, Integer ecd9Cmtindx,
			String ecd9Status, String ecd9User1, String ecd9User2,
			Boolean ecd9Qad01, Date ecd9Qad02, String ecd9Qad03,
			String ecd9Qad04, String ecd9Qad05, Date ecd9ModDate,
			String ecd9Userid, Double oidEcd9Det) {
		this.id = id;
		this.ecd9Approved = ecd9Approved;
		this.ecd9ApprDate = ecd9ApprDate;
		this.ecd9Seq = ecd9Seq;
		this.ecd9Cmtindx = ecd9Cmtindx;
		this.ecd9Status = ecd9Status;
		this.ecd9User1 = ecd9User1;
		this.ecd9User2 = ecd9User2;
		this.ecd9Qad01 = ecd9Qad01;
		this.ecd9Qad02 = ecd9Qad02;
		this.ecd9Qad03 = ecd9Qad03;
		this.ecd9Qad04 = ecd9Qad04;
		this.ecd9Qad05 = ecd9Qad05;
		this.ecd9ModDate = ecd9ModDate;
		this.ecd9Userid = ecd9Userid;
		this.oidEcd9Det = oidEcd9Det;
	}

	// Property accessors

	public Ecd9DetId getId() {
		return this.id;
	}

	public void setId(Ecd9DetId id) {
		this.id = id;
	}

	public Boolean getEcd9Approved() {
		return this.ecd9Approved;
	}

	public void setEcd9Approved(Boolean ecd9Approved) {
		this.ecd9Approved = ecd9Approved;
	}

	public Date getEcd9ApprDate() {
		return this.ecd9ApprDate;
	}

	public void setEcd9ApprDate(Date ecd9ApprDate) {
		this.ecd9ApprDate = ecd9ApprDate;
	}

	public Integer getEcd9Seq() {
		return this.ecd9Seq;
	}

	public void setEcd9Seq(Integer ecd9Seq) {
		this.ecd9Seq = ecd9Seq;
	}

	public Integer getEcd9Cmtindx() {
		return this.ecd9Cmtindx;
	}

	public void setEcd9Cmtindx(Integer ecd9Cmtindx) {
		this.ecd9Cmtindx = ecd9Cmtindx;
	}

	public String getEcd9Status() {
		return this.ecd9Status;
	}

	public void setEcd9Status(String ecd9Status) {
		this.ecd9Status = ecd9Status;
	}

	public String getEcd9User1() {
		return this.ecd9User1;
	}

	public void setEcd9User1(String ecd9User1) {
		this.ecd9User1 = ecd9User1;
	}

	public String getEcd9User2() {
		return this.ecd9User2;
	}

	public void setEcd9User2(String ecd9User2) {
		this.ecd9User2 = ecd9User2;
	}

	public Boolean getEcd9Qad01() {
		return this.ecd9Qad01;
	}

	public void setEcd9Qad01(Boolean ecd9Qad01) {
		this.ecd9Qad01 = ecd9Qad01;
	}

	public Date getEcd9Qad02() {
		return this.ecd9Qad02;
	}

	public void setEcd9Qad02(Date ecd9Qad02) {
		this.ecd9Qad02 = ecd9Qad02;
	}

	public String getEcd9Qad03() {
		return this.ecd9Qad03;
	}

	public void setEcd9Qad03(String ecd9Qad03) {
		this.ecd9Qad03 = ecd9Qad03;
	}

	public String getEcd9Qad04() {
		return this.ecd9Qad04;
	}

	public void setEcd9Qad04(String ecd9Qad04) {
		this.ecd9Qad04 = ecd9Qad04;
	}

	public String getEcd9Qad05() {
		return this.ecd9Qad05;
	}

	public void setEcd9Qad05(String ecd9Qad05) {
		this.ecd9Qad05 = ecd9Qad05;
	}

	public Date getEcd9ModDate() {
		return this.ecd9ModDate;
	}

	public void setEcd9ModDate(Date ecd9ModDate) {
		this.ecd9ModDate = ecd9ModDate;
	}

	public String getEcd9Userid() {
		return this.ecd9Userid;
	}

	public void setEcd9Userid(String ecd9Userid) {
		this.ecd9Userid = ecd9Userid;
	}

	public Double getOidEcd9Det() {
		return this.oidEcd9Det;
	}

	public void setOidEcd9Det(Double oidEcd9Det) {
		this.oidEcd9Det = oidEcd9Det;
	}

}