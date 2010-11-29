package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLotwWkfl entity provides the base persistence definition of the
 * LotwWkfl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLotwWkfl implements java.io.Serializable {

	// Fields

	private LotwWkflId id;
	private String lotwMfguser;
	private String lotwUserid;
	private String lotwUser1;
	private String lotwUser2;
	private String lotwQadc01;
	private Double oidLotwWkfl;

	// Constructors

	/** default constructor */
	public AbstractLotwWkfl() {
	}

	/** minimal constructor */
	public AbstractLotwWkfl(LotwWkflId id, Double oidLotwWkfl) {
		this.id = id;
		this.oidLotwWkfl = oidLotwWkfl;
	}

	/** full constructor */
	public AbstractLotwWkfl(LotwWkflId id, String lotwMfguser,
			String lotwUserid, String lotwUser1, String lotwUser2,
			String lotwQadc01, Double oidLotwWkfl) {
		this.id = id;
		this.lotwMfguser = lotwMfguser;
		this.lotwUserid = lotwUserid;
		this.lotwUser1 = lotwUser1;
		this.lotwUser2 = lotwUser2;
		this.lotwQadc01 = lotwQadc01;
		this.oidLotwWkfl = oidLotwWkfl;
	}

	// Property accessors

	public LotwWkflId getId() {
		return this.id;
	}

	public void setId(LotwWkflId id) {
		this.id = id;
	}

	public String getLotwMfguser() {
		return this.lotwMfguser;
	}

	public void setLotwMfguser(String lotwMfguser) {
		this.lotwMfguser = lotwMfguser;
	}

	public String getLotwUserid() {
		return this.lotwUserid;
	}

	public void setLotwUserid(String lotwUserid) {
		this.lotwUserid = lotwUserid;
	}

	public String getLotwUser1() {
		return this.lotwUser1;
	}

	public void setLotwUser1(String lotwUser1) {
		this.lotwUser1 = lotwUser1;
	}

	public String getLotwUser2() {
		return this.lotwUser2;
	}

	public void setLotwUser2(String lotwUser2) {
		this.lotwUser2 = lotwUser2;
	}

	public String getLotwQadc01() {
		return this.lotwQadc01;
	}

	public void setLotwQadc01(String lotwQadc01) {
		this.lotwQadc01 = lotwQadc01;
	}

	public Double getOidLotwWkfl() {
		return this.oidLotwWkfl;
	}

	public void setOidLotwWkfl(Double oidLotwWkfl) {
		this.oidLotwWkfl = oidLotwWkfl;
	}

}