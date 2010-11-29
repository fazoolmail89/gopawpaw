package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUsrwWkfl entity provides the base persistence definition of the
 * UsrwWkfl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsrwWkfl implements java.io.Serializable {

	// Fields

	private UsrwWkflId id;
	private String usrwKey3;
	private String usrwKey4;
	private String usrwKey5;
	private String usrwKey6;
	private String usrwCharfld;
	private String usrwDecfld;
	private String usrwDatefld;
	private String usrwUser1;
	private String usrwUser2;
	private String usrwQadc01;
	private String usrwLogfld;
	private String usrwIntfld;
	private Double oidUsrwWkfl;

	// Constructors

	/** default constructor */
	public AbstractUsrwWkfl() {
	}

	/** minimal constructor */
	public AbstractUsrwWkfl(UsrwWkflId id, Double oidUsrwWkfl) {
		this.id = id;
		this.oidUsrwWkfl = oidUsrwWkfl;
	}

	/** full constructor */
	public AbstractUsrwWkfl(UsrwWkflId id, String usrwKey3, String usrwKey4,
			String usrwKey5, String usrwKey6, String usrwCharfld,
			String usrwDecfld, String usrwDatefld, String usrwUser1,
			String usrwUser2, String usrwQadc01, String usrwLogfld,
			String usrwIntfld, Double oidUsrwWkfl) {
		this.id = id;
		this.usrwKey3 = usrwKey3;
		this.usrwKey4 = usrwKey4;
		this.usrwKey5 = usrwKey5;
		this.usrwKey6 = usrwKey6;
		this.usrwCharfld = usrwCharfld;
		this.usrwDecfld = usrwDecfld;
		this.usrwDatefld = usrwDatefld;
		this.usrwUser1 = usrwUser1;
		this.usrwUser2 = usrwUser2;
		this.usrwQadc01 = usrwQadc01;
		this.usrwLogfld = usrwLogfld;
		this.usrwIntfld = usrwIntfld;
		this.oidUsrwWkfl = oidUsrwWkfl;
	}

	// Property accessors

	public UsrwWkflId getId() {
		return this.id;
	}

	public void setId(UsrwWkflId id) {
		this.id = id;
	}

	public String getUsrwKey3() {
		return this.usrwKey3;
	}

	public void setUsrwKey3(String usrwKey3) {
		this.usrwKey3 = usrwKey3;
	}

	public String getUsrwKey4() {
		return this.usrwKey4;
	}

	public void setUsrwKey4(String usrwKey4) {
		this.usrwKey4 = usrwKey4;
	}

	public String getUsrwKey5() {
		return this.usrwKey5;
	}

	public void setUsrwKey5(String usrwKey5) {
		this.usrwKey5 = usrwKey5;
	}

	public String getUsrwKey6() {
		return this.usrwKey6;
	}

	public void setUsrwKey6(String usrwKey6) {
		this.usrwKey6 = usrwKey6;
	}

	public String getUsrwCharfld() {
		return this.usrwCharfld;
	}

	public void setUsrwCharfld(String usrwCharfld) {
		this.usrwCharfld = usrwCharfld;
	}

	public String getUsrwDecfld() {
		return this.usrwDecfld;
	}

	public void setUsrwDecfld(String usrwDecfld) {
		this.usrwDecfld = usrwDecfld;
	}

	public String getUsrwDatefld() {
		return this.usrwDatefld;
	}

	public void setUsrwDatefld(String usrwDatefld) {
		this.usrwDatefld = usrwDatefld;
	}

	public String getUsrwUser1() {
		return this.usrwUser1;
	}

	public void setUsrwUser1(String usrwUser1) {
		this.usrwUser1 = usrwUser1;
	}

	public String getUsrwUser2() {
		return this.usrwUser2;
	}

	public void setUsrwUser2(String usrwUser2) {
		this.usrwUser2 = usrwUser2;
	}

	public String getUsrwQadc01() {
		return this.usrwQadc01;
	}

	public void setUsrwQadc01(String usrwQadc01) {
		this.usrwQadc01 = usrwQadc01;
	}

	public String getUsrwLogfld() {
		return this.usrwLogfld;
	}

	public void setUsrwLogfld(String usrwLogfld) {
		this.usrwLogfld = usrwLogfld;
	}

	public String getUsrwIntfld() {
		return this.usrwIntfld;
	}

	public void setUsrwIntfld(String usrwIntfld) {
		this.usrwIntfld = usrwIntfld;
	}

	public Double getOidUsrwWkfl() {
		return this.oidUsrwWkfl;
	}

	public void setOidUsrwWkfl(Double oidUsrwWkfl) {
		this.oidUsrwWkfl = oidUsrwWkfl;
	}

}