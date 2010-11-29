package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQrTest entity provides the base persistence definition of the QrTest
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQrTest implements java.io.Serializable {

	// Fields

	private QrTestId id;
	private Double qrOpTime;
	private Double qrActOp;
	private Integer qrCmtindx;
	private String qrDesc;
	private Date qrDue;
	private String qrPart;
	private Double qrQtyAccpt;
	private Double qrQtyOrd;
	private Double qrQtyRjct;
	private Date qrStart;
	private String qrStatus;
	private String qrTool;
	private String qrUser1;
	private String qrUser2;
	private String qrWkctr;
	private String qrChr01;
	private String qrChr02;
	private String qrChr03;
	private String qrChr04;
	private String qrChr05;
	private Double qrDec01;
	private Double qrDec02;
	private Date qrDte01;
	private Date qrDte02;
	private Boolean qrLog01;
	private String qrMch;
	private Double oidQrTest;

	// Constructors

	/** default constructor */
	public AbstractQrTest() {
	}

	/** minimal constructor */
	public AbstractQrTest(QrTestId id, Double oidQrTest) {
		this.id = id;
		this.oidQrTest = oidQrTest;
	}

	/** full constructor */
	public AbstractQrTest(QrTestId id, Double qrOpTime, Double qrActOp,
			Integer qrCmtindx, String qrDesc, Date qrDue, String qrPart,
			Double qrQtyAccpt, Double qrQtyOrd, Double qrQtyRjct, Date qrStart,
			String qrStatus, String qrTool, String qrUser1, String qrUser2,
			String qrWkctr, String qrChr01, String qrChr02, String qrChr03,
			String qrChr04, String qrChr05, Double qrDec01, Double qrDec02,
			Date qrDte01, Date qrDte02, Boolean qrLog01, String qrMch,
			Double oidQrTest) {
		this.id = id;
		this.qrOpTime = qrOpTime;
		this.qrActOp = qrActOp;
		this.qrCmtindx = qrCmtindx;
		this.qrDesc = qrDesc;
		this.qrDue = qrDue;
		this.qrPart = qrPart;
		this.qrQtyAccpt = qrQtyAccpt;
		this.qrQtyOrd = qrQtyOrd;
		this.qrQtyRjct = qrQtyRjct;
		this.qrStart = qrStart;
		this.qrStatus = qrStatus;
		this.qrTool = qrTool;
		this.qrUser1 = qrUser1;
		this.qrUser2 = qrUser2;
		this.qrWkctr = qrWkctr;
		this.qrChr01 = qrChr01;
		this.qrChr02 = qrChr02;
		this.qrChr03 = qrChr03;
		this.qrChr04 = qrChr04;
		this.qrChr05 = qrChr05;
		this.qrDec01 = qrDec01;
		this.qrDec02 = qrDec02;
		this.qrDte01 = qrDte01;
		this.qrDte02 = qrDte02;
		this.qrLog01 = qrLog01;
		this.qrMch = qrMch;
		this.oidQrTest = oidQrTest;
	}

	// Property accessors

	public QrTestId getId() {
		return this.id;
	}

	public void setId(QrTestId id) {
		this.id = id;
	}

	public Double getQrOpTime() {
		return this.qrOpTime;
	}

	public void setQrOpTime(Double qrOpTime) {
		this.qrOpTime = qrOpTime;
	}

	public Double getQrActOp() {
		return this.qrActOp;
	}

	public void setQrActOp(Double qrActOp) {
		this.qrActOp = qrActOp;
	}

	public Integer getQrCmtindx() {
		return this.qrCmtindx;
	}

	public void setQrCmtindx(Integer qrCmtindx) {
		this.qrCmtindx = qrCmtindx;
	}

	public String getQrDesc() {
		return this.qrDesc;
	}

	public void setQrDesc(String qrDesc) {
		this.qrDesc = qrDesc;
	}

	public Date getQrDue() {
		return this.qrDue;
	}

	public void setQrDue(Date qrDue) {
		this.qrDue = qrDue;
	}

	public String getQrPart() {
		return this.qrPart;
	}

	public void setQrPart(String qrPart) {
		this.qrPart = qrPart;
	}

	public Double getQrQtyAccpt() {
		return this.qrQtyAccpt;
	}

	public void setQrQtyAccpt(Double qrQtyAccpt) {
		this.qrQtyAccpt = qrQtyAccpt;
	}

	public Double getQrQtyOrd() {
		return this.qrQtyOrd;
	}

	public void setQrQtyOrd(Double qrQtyOrd) {
		this.qrQtyOrd = qrQtyOrd;
	}

	public Double getQrQtyRjct() {
		return this.qrQtyRjct;
	}

	public void setQrQtyRjct(Double qrQtyRjct) {
		this.qrQtyRjct = qrQtyRjct;
	}

	public Date getQrStart() {
		return this.qrStart;
	}

	public void setQrStart(Date qrStart) {
		this.qrStart = qrStart;
	}

	public String getQrStatus() {
		return this.qrStatus;
	}

	public void setQrStatus(String qrStatus) {
		this.qrStatus = qrStatus;
	}

	public String getQrTool() {
		return this.qrTool;
	}

	public void setQrTool(String qrTool) {
		this.qrTool = qrTool;
	}

	public String getQrUser1() {
		return this.qrUser1;
	}

	public void setQrUser1(String qrUser1) {
		this.qrUser1 = qrUser1;
	}

	public String getQrUser2() {
		return this.qrUser2;
	}

	public void setQrUser2(String qrUser2) {
		this.qrUser2 = qrUser2;
	}

	public String getQrWkctr() {
		return this.qrWkctr;
	}

	public void setQrWkctr(String qrWkctr) {
		this.qrWkctr = qrWkctr;
	}

	public String getQrChr01() {
		return this.qrChr01;
	}

	public void setQrChr01(String qrChr01) {
		this.qrChr01 = qrChr01;
	}

	public String getQrChr02() {
		return this.qrChr02;
	}

	public void setQrChr02(String qrChr02) {
		this.qrChr02 = qrChr02;
	}

	public String getQrChr03() {
		return this.qrChr03;
	}

	public void setQrChr03(String qrChr03) {
		this.qrChr03 = qrChr03;
	}

	public String getQrChr04() {
		return this.qrChr04;
	}

	public void setQrChr04(String qrChr04) {
		this.qrChr04 = qrChr04;
	}

	public String getQrChr05() {
		return this.qrChr05;
	}

	public void setQrChr05(String qrChr05) {
		this.qrChr05 = qrChr05;
	}

	public Double getQrDec01() {
		return this.qrDec01;
	}

	public void setQrDec01(Double qrDec01) {
		this.qrDec01 = qrDec01;
	}

	public Double getQrDec02() {
		return this.qrDec02;
	}

	public void setQrDec02(Double qrDec02) {
		this.qrDec02 = qrDec02;
	}

	public Date getQrDte01() {
		return this.qrDte01;
	}

	public void setQrDte01(Date qrDte01) {
		this.qrDte01 = qrDte01;
	}

	public Date getQrDte02() {
		return this.qrDte02;
	}

	public void setQrDte02(Date qrDte02) {
		this.qrDte02 = qrDte02;
	}

	public Boolean getQrLog01() {
		return this.qrLog01;
	}

	public void setQrLog01(Boolean qrLog01) {
		this.qrLog01 = qrLog01;
	}

	public String getQrMch() {
		return this.qrMch;
	}

	public void setQrMch(String qrMch) {
		this.qrMch = qrMch;
	}

	public Double getOidQrTest() {
		return this.oidQrTest;
	}

	public void setOidQrTest(Double oidQrTest) {
		this.oidQrTest = oidQrTest;
	}

}