package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxzMstr entity provides the base persistence definition of the
 * TxzMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxzMstr implements java.io.Serializable {

	// Fields

	private TxzMstrId id;
	private String txzDesc;
	private String txzCtryCode;
	private String txzState;
	private String txzCounty;
	private String txzCity;
	private String txzZip;
	private String txzQad01;
	private String txzQad02;
	private Boolean txzQad03;
	private String txzUser1;
	private String txzUser2;
	private Boolean txzLog01;
	private Double oidTxzMstr;

	// Constructors

	/** default constructor */
	public AbstractTxzMstr() {
	}

	/** minimal constructor */
	public AbstractTxzMstr(TxzMstrId id, String txzCtryCode, String txzState,
			String txzCounty, String txzCity, String txzZip, Double oidTxzMstr) {
		this.id = id;
		this.txzCtryCode = txzCtryCode;
		this.txzState = txzState;
		this.txzCounty = txzCounty;
		this.txzCity = txzCity;
		this.txzZip = txzZip;
		this.oidTxzMstr = oidTxzMstr;
	}

	/** full constructor */
	public AbstractTxzMstr(TxzMstrId id, String txzDesc, String txzCtryCode,
			String txzState, String txzCounty, String txzCity, String txzZip,
			String txzQad01, String txzQad02, Boolean txzQad03,
			String txzUser1, String txzUser2, Boolean txzLog01,
			Double oidTxzMstr) {
		this.id = id;
		this.txzDesc = txzDesc;
		this.txzCtryCode = txzCtryCode;
		this.txzState = txzState;
		this.txzCounty = txzCounty;
		this.txzCity = txzCity;
		this.txzZip = txzZip;
		this.txzQad01 = txzQad01;
		this.txzQad02 = txzQad02;
		this.txzQad03 = txzQad03;
		this.txzUser1 = txzUser1;
		this.txzUser2 = txzUser2;
		this.txzLog01 = txzLog01;
		this.oidTxzMstr = oidTxzMstr;
	}

	// Property accessors

	public TxzMstrId getId() {
		return this.id;
	}

	public void setId(TxzMstrId id) {
		this.id = id;
	}

	public String getTxzDesc() {
		return this.txzDesc;
	}

	public void setTxzDesc(String txzDesc) {
		this.txzDesc = txzDesc;
	}

	public String getTxzCtryCode() {
		return this.txzCtryCode;
	}

	public void setTxzCtryCode(String txzCtryCode) {
		this.txzCtryCode = txzCtryCode;
	}

	public String getTxzState() {
		return this.txzState;
	}

	public void setTxzState(String txzState) {
		this.txzState = txzState;
	}

	public String getTxzCounty() {
		return this.txzCounty;
	}

	public void setTxzCounty(String txzCounty) {
		this.txzCounty = txzCounty;
	}

	public String getTxzCity() {
		return this.txzCity;
	}

	public void setTxzCity(String txzCity) {
		this.txzCity = txzCity;
	}

	public String getTxzZip() {
		return this.txzZip;
	}

	public void setTxzZip(String txzZip) {
		this.txzZip = txzZip;
	}

	public String getTxzQad01() {
		return this.txzQad01;
	}

	public void setTxzQad01(String txzQad01) {
		this.txzQad01 = txzQad01;
	}

	public String getTxzQad02() {
		return this.txzQad02;
	}

	public void setTxzQad02(String txzQad02) {
		this.txzQad02 = txzQad02;
	}

	public Boolean getTxzQad03() {
		return this.txzQad03;
	}

	public void setTxzQad03(Boolean txzQad03) {
		this.txzQad03 = txzQad03;
	}

	public String getTxzUser1() {
		return this.txzUser1;
	}

	public void setTxzUser1(String txzUser1) {
		this.txzUser1 = txzUser1;
	}

	public String getTxzUser2() {
		return this.txzUser2;
	}

	public void setTxzUser2(String txzUser2) {
		this.txzUser2 = txzUser2;
	}

	public Boolean getTxzLog01() {
		return this.txzLog01;
	}

	public void setTxzLog01(Boolean txzLog01) {
		this.txzLog01 = txzLog01;
	}

	public Double getOidTxzMstr() {
		return this.oidTxzMstr;
	}

	public void setOidTxzMstr(Double oidTxzMstr) {
		this.oidTxzMstr = oidTxzMstr;
	}

}