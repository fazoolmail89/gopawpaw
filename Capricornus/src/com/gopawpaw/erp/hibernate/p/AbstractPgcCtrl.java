package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPgcCtrl entity provides the base persistence definition of the
 * PgcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPgcCtrl implements java.io.Serializable {

	// Fields

	private PgcCtrlId id;
	private String pgcPhone;
	private Boolean pgcAppendCa;
	private String pgcAddr;
	private String pgcWaitStatus;
	private String pgcPagedStatus;
	private String pgcPreControl;
	private String pgcPostControl;
	private String pgcPort1;
	private String pgcPort2;
	private String pgcPort3;
	private String pgcPort4;
	private String pgcProgram;
	private String pgcUser1;
	private String pgcUser2;
	private String pgcQadc01;
	private Double oidPgcCtrl;

	// Constructors

	/** default constructor */
	public AbstractPgcCtrl() {
	}

	/** minimal constructor */
	public AbstractPgcCtrl(PgcCtrlId id, Double oidPgcCtrl) {
		this.id = id;
		this.oidPgcCtrl = oidPgcCtrl;
	}

	/** full constructor */
	public AbstractPgcCtrl(PgcCtrlId id, String pgcPhone, Boolean pgcAppendCa,
			String pgcAddr, String pgcWaitStatus, String pgcPagedStatus,
			String pgcPreControl, String pgcPostControl, String pgcPort1,
			String pgcPort2, String pgcPort3, String pgcPort4,
			String pgcProgram, String pgcUser1, String pgcUser2,
			String pgcQadc01, Double oidPgcCtrl) {
		this.id = id;
		this.pgcPhone = pgcPhone;
		this.pgcAppendCa = pgcAppendCa;
		this.pgcAddr = pgcAddr;
		this.pgcWaitStatus = pgcWaitStatus;
		this.pgcPagedStatus = pgcPagedStatus;
		this.pgcPreControl = pgcPreControl;
		this.pgcPostControl = pgcPostControl;
		this.pgcPort1 = pgcPort1;
		this.pgcPort2 = pgcPort2;
		this.pgcPort3 = pgcPort3;
		this.pgcPort4 = pgcPort4;
		this.pgcProgram = pgcProgram;
		this.pgcUser1 = pgcUser1;
		this.pgcUser2 = pgcUser2;
		this.pgcQadc01 = pgcQadc01;
		this.oidPgcCtrl = oidPgcCtrl;
	}

	// Property accessors

	public PgcCtrlId getId() {
		return this.id;
	}

	public void setId(PgcCtrlId id) {
		this.id = id;
	}

	public String getPgcPhone() {
		return this.pgcPhone;
	}

	public void setPgcPhone(String pgcPhone) {
		this.pgcPhone = pgcPhone;
	}

	public Boolean getPgcAppendCa() {
		return this.pgcAppendCa;
	}

	public void setPgcAppendCa(Boolean pgcAppendCa) {
		this.pgcAppendCa = pgcAppendCa;
	}

	public String getPgcAddr() {
		return this.pgcAddr;
	}

	public void setPgcAddr(String pgcAddr) {
		this.pgcAddr = pgcAddr;
	}

	public String getPgcWaitStatus() {
		return this.pgcWaitStatus;
	}

	public void setPgcWaitStatus(String pgcWaitStatus) {
		this.pgcWaitStatus = pgcWaitStatus;
	}

	public String getPgcPagedStatus() {
		return this.pgcPagedStatus;
	}

	public void setPgcPagedStatus(String pgcPagedStatus) {
		this.pgcPagedStatus = pgcPagedStatus;
	}

	public String getPgcPreControl() {
		return this.pgcPreControl;
	}

	public void setPgcPreControl(String pgcPreControl) {
		this.pgcPreControl = pgcPreControl;
	}

	public String getPgcPostControl() {
		return this.pgcPostControl;
	}

	public void setPgcPostControl(String pgcPostControl) {
		this.pgcPostControl = pgcPostControl;
	}

	public String getPgcPort1() {
		return this.pgcPort1;
	}

	public void setPgcPort1(String pgcPort1) {
		this.pgcPort1 = pgcPort1;
	}

	public String getPgcPort2() {
		return this.pgcPort2;
	}

	public void setPgcPort2(String pgcPort2) {
		this.pgcPort2 = pgcPort2;
	}

	public String getPgcPort3() {
		return this.pgcPort3;
	}

	public void setPgcPort3(String pgcPort3) {
		this.pgcPort3 = pgcPort3;
	}

	public String getPgcPort4() {
		return this.pgcPort4;
	}

	public void setPgcPort4(String pgcPort4) {
		this.pgcPort4 = pgcPort4;
	}

	public String getPgcProgram() {
		return this.pgcProgram;
	}

	public void setPgcProgram(String pgcProgram) {
		this.pgcProgram = pgcProgram;
	}

	public String getPgcUser1() {
		return this.pgcUser1;
	}

	public void setPgcUser1(String pgcUser1) {
		this.pgcUser1 = pgcUser1;
	}

	public String getPgcUser2() {
		return this.pgcUser2;
	}

	public void setPgcUser2(String pgcUser2) {
		this.pgcUser2 = pgcUser2;
	}

	public String getPgcQadc01() {
		return this.pgcQadc01;
	}

	public void setPgcQadc01(String pgcQadc01) {
		this.pgcQadc01 = pgcQadc01;
	}

	public Double getOidPgcCtrl() {
		return this.oidPgcCtrl;
	}

	public void setOidPgcCtrl(Double oidPgcCtrl) {
		this.oidPgcCtrl = oidPgcCtrl;
	}

}