package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCilMstr entity provides the base persistence definition of the
 * CilMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCilMstr implements java.io.Serializable {

	// Fields

	private CilMstrId id;
	private String cilCorRsn;
	private String cilModUserid;
	private Date cilModDate;
	private String cilMstrInv;
	private String cilPrevSoNbr;
	private String cilPrevInv;
	private String cilUser1;
	private String cilUser2;
	private String cilQadc01;
	private String cilQadc02;
	private Double oidCilMstr;

	// Constructors

	/** default constructor */
	public AbstractCilMstr() {
	}

	/** full constructor */
	public AbstractCilMstr(CilMstrId id, String cilCorRsn, String cilModUserid,
			Date cilModDate, String cilMstrInv, String cilPrevSoNbr,
			String cilPrevInv, String cilUser1, String cilUser2,
			String cilQadc01, String cilQadc02, Double oidCilMstr) {
		this.id = id;
		this.cilCorRsn = cilCorRsn;
		this.cilModUserid = cilModUserid;
		this.cilModDate = cilModDate;
		this.cilMstrInv = cilMstrInv;
		this.cilPrevSoNbr = cilPrevSoNbr;
		this.cilPrevInv = cilPrevInv;
		this.cilUser1 = cilUser1;
		this.cilUser2 = cilUser2;
		this.cilQadc01 = cilQadc01;
		this.cilQadc02 = cilQadc02;
		this.oidCilMstr = oidCilMstr;
	}

	// Property accessors

	public CilMstrId getId() {
		return this.id;
	}

	public void setId(CilMstrId id) {
		this.id = id;
	}

	public String getCilCorRsn() {
		return this.cilCorRsn;
	}

	public void setCilCorRsn(String cilCorRsn) {
		this.cilCorRsn = cilCorRsn;
	}

	public String getCilModUserid() {
		return this.cilModUserid;
	}

	public void setCilModUserid(String cilModUserid) {
		this.cilModUserid = cilModUserid;
	}

	public Date getCilModDate() {
		return this.cilModDate;
	}

	public void setCilModDate(Date cilModDate) {
		this.cilModDate = cilModDate;
	}

	public String getCilMstrInv() {
		return this.cilMstrInv;
	}

	public void setCilMstrInv(String cilMstrInv) {
		this.cilMstrInv = cilMstrInv;
	}

	public String getCilPrevSoNbr() {
		return this.cilPrevSoNbr;
	}

	public void setCilPrevSoNbr(String cilPrevSoNbr) {
		this.cilPrevSoNbr = cilPrevSoNbr;
	}

	public String getCilPrevInv() {
		return this.cilPrevInv;
	}

	public void setCilPrevInv(String cilPrevInv) {
		this.cilPrevInv = cilPrevInv;
	}

	public String getCilUser1() {
		return this.cilUser1;
	}

	public void setCilUser1(String cilUser1) {
		this.cilUser1 = cilUser1;
	}

	public String getCilUser2() {
		return this.cilUser2;
	}

	public void setCilUser2(String cilUser2) {
		this.cilUser2 = cilUser2;
	}

	public String getCilQadc01() {
		return this.cilQadc01;
	}

	public void setCilQadc01(String cilQadc01) {
		this.cilQadc01 = cilQadc01;
	}

	public String getCilQadc02() {
		return this.cilQadc02;
	}

	public void setCilQadc02(String cilQadc02) {
		this.cilQadc02 = cilQadc02;
	}

	public Double getOidCilMstr() {
		return this.oidCilMstr;
	}

	public void setOidCilMstr(Double oidCilMstr) {
		this.oidCilMstr = oidCilMstr;
	}

}