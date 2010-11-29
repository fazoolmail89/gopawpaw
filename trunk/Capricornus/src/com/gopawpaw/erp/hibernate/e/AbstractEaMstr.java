package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEaMstr entity provides the base persistence definition of the EaMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEaMstr implements java.io.Serializable {

	// Fields

	private EaMstrId id;
	private String eaDesc;
	private String eaType;
	private Double eaRate;
	private Boolean eaFedYn;
	private Boolean eaQad01;
	private Boolean eaQad02;
	private Boolean eaQad05;
	private Boolean eaQad04;
	private Boolean eaQad06;
	private Boolean eaQad03;
	private String eaUser1;
	private String eaUser2;
	private String eaAcc;
	private String eaCc;
	private Boolean eaPiece;
	private String eaRegEarn;
	private String eaUserid;
	private Date eaModDate;
	private String eaSub;
	private Double oidEaMstr;

	// Constructors

	/** default constructor */
	public AbstractEaMstr() {
	}

	/** minimal constructor */
	public AbstractEaMstr(EaMstrId id, Double oidEaMstr) {
		this.id = id;
		this.oidEaMstr = oidEaMstr;
	}

	/** full constructor */
	public AbstractEaMstr(EaMstrId id, String eaDesc, String eaType,
			Double eaRate, Boolean eaFedYn, Boolean eaQad01, Boolean eaQad02,
			Boolean eaQad05, Boolean eaQad04, Boolean eaQad06, Boolean eaQad03,
			String eaUser1, String eaUser2, String eaAcc, String eaCc,
			Boolean eaPiece, String eaRegEarn, String eaUserid, Date eaModDate,
			String eaSub, Double oidEaMstr) {
		this.id = id;
		this.eaDesc = eaDesc;
		this.eaType = eaType;
		this.eaRate = eaRate;
		this.eaFedYn = eaFedYn;
		this.eaQad01 = eaQad01;
		this.eaQad02 = eaQad02;
		this.eaQad05 = eaQad05;
		this.eaQad04 = eaQad04;
		this.eaQad06 = eaQad06;
		this.eaQad03 = eaQad03;
		this.eaUser1 = eaUser1;
		this.eaUser2 = eaUser2;
		this.eaAcc = eaAcc;
		this.eaCc = eaCc;
		this.eaPiece = eaPiece;
		this.eaRegEarn = eaRegEarn;
		this.eaUserid = eaUserid;
		this.eaModDate = eaModDate;
		this.eaSub = eaSub;
		this.oidEaMstr = oidEaMstr;
	}

	// Property accessors

	public EaMstrId getId() {
		return this.id;
	}

	public void setId(EaMstrId id) {
		this.id = id;
	}

	public String getEaDesc() {
		return this.eaDesc;
	}

	public void setEaDesc(String eaDesc) {
		this.eaDesc = eaDesc;
	}

	public String getEaType() {
		return this.eaType;
	}

	public void setEaType(String eaType) {
		this.eaType = eaType;
	}

	public Double getEaRate() {
		return this.eaRate;
	}

	public void setEaRate(Double eaRate) {
		this.eaRate = eaRate;
	}

	public Boolean getEaFedYn() {
		return this.eaFedYn;
	}

	public void setEaFedYn(Boolean eaFedYn) {
		this.eaFedYn = eaFedYn;
	}

	public Boolean getEaQad01() {
		return this.eaQad01;
	}

	public void setEaQad01(Boolean eaQad01) {
		this.eaQad01 = eaQad01;
	}

	public Boolean getEaQad02() {
		return this.eaQad02;
	}

	public void setEaQad02(Boolean eaQad02) {
		this.eaQad02 = eaQad02;
	}

	public Boolean getEaQad05() {
		return this.eaQad05;
	}

	public void setEaQad05(Boolean eaQad05) {
		this.eaQad05 = eaQad05;
	}

	public Boolean getEaQad04() {
		return this.eaQad04;
	}

	public void setEaQad04(Boolean eaQad04) {
		this.eaQad04 = eaQad04;
	}

	public Boolean getEaQad06() {
		return this.eaQad06;
	}

	public void setEaQad06(Boolean eaQad06) {
		this.eaQad06 = eaQad06;
	}

	public Boolean getEaQad03() {
		return this.eaQad03;
	}

	public void setEaQad03(Boolean eaQad03) {
		this.eaQad03 = eaQad03;
	}

	public String getEaUser1() {
		return this.eaUser1;
	}

	public void setEaUser1(String eaUser1) {
		this.eaUser1 = eaUser1;
	}

	public String getEaUser2() {
		return this.eaUser2;
	}

	public void setEaUser2(String eaUser2) {
		this.eaUser2 = eaUser2;
	}

	public String getEaAcc() {
		return this.eaAcc;
	}

	public void setEaAcc(String eaAcc) {
		this.eaAcc = eaAcc;
	}

	public String getEaCc() {
		return this.eaCc;
	}

	public void setEaCc(String eaCc) {
		this.eaCc = eaCc;
	}

	public Boolean getEaPiece() {
		return this.eaPiece;
	}

	public void setEaPiece(Boolean eaPiece) {
		this.eaPiece = eaPiece;
	}

	public String getEaRegEarn() {
		return this.eaRegEarn;
	}

	public void setEaRegEarn(String eaRegEarn) {
		this.eaRegEarn = eaRegEarn;
	}

	public String getEaUserid() {
		return this.eaUserid;
	}

	public void setEaUserid(String eaUserid) {
		this.eaUserid = eaUserid;
	}

	public Date getEaModDate() {
		return this.eaModDate;
	}

	public void setEaModDate(Date eaModDate) {
		this.eaModDate = eaModDate;
	}

	public String getEaSub() {
		return this.eaSub;
	}

	public void setEaSub(String eaSub) {
		this.eaSub = eaSub;
	}

	public Double getOidEaMstr() {
		return this.oidEaMstr;
	}

	public void setOidEaMstr(Double oidEaMstr) {
		this.oidEaMstr = oidEaMstr;
	}

}