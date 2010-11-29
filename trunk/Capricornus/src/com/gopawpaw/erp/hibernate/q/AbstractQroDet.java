package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQroDet entity provides the base persistence definition of the QroDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQroDet implements java.io.Serializable {

	// Fields

	private QroDetId id;
	private Integer qroCmtindx;
	private String qroDesc;
	private String qroMch;
	private Integer qroMchOp;
	private Double qroQueue;
	private String qroTool;
	private String qroUser1;
	private String qroUser2;
	private String qroWkctr;
	private String qroChr01;
	private String qroChr02;
	private String qroChr03;
	private String qroChr04;
	private String qroChr05;
	private Double qroDec01;
	private Double qroDec02;
	private Date qroDte01;
	private Date qroDte02;
	private Boolean qroLog01;
	private Double oidQroDet;

	// Constructors

	/** default constructor */
	public AbstractQroDet() {
	}

	/** minimal constructor */
	public AbstractQroDet(QroDetId id, Double oidQroDet) {
		this.id = id;
		this.oidQroDet = oidQroDet;
	}

	/** full constructor */
	public AbstractQroDet(QroDetId id, Integer qroCmtindx, String qroDesc,
			String qroMch, Integer qroMchOp, Double qroQueue, String qroTool,
			String qroUser1, String qroUser2, String qroWkctr, String qroChr01,
			String qroChr02, String qroChr03, String qroChr04, String qroChr05,
			Double qroDec01, Double qroDec02, Date qroDte01, Date qroDte02,
			Boolean qroLog01, Double oidQroDet) {
		this.id = id;
		this.qroCmtindx = qroCmtindx;
		this.qroDesc = qroDesc;
		this.qroMch = qroMch;
		this.qroMchOp = qroMchOp;
		this.qroQueue = qroQueue;
		this.qroTool = qroTool;
		this.qroUser1 = qroUser1;
		this.qroUser2 = qroUser2;
		this.qroWkctr = qroWkctr;
		this.qroChr01 = qroChr01;
		this.qroChr02 = qroChr02;
		this.qroChr03 = qroChr03;
		this.qroChr04 = qroChr04;
		this.qroChr05 = qroChr05;
		this.qroDec01 = qroDec01;
		this.qroDec02 = qroDec02;
		this.qroDte01 = qroDte01;
		this.qroDte02 = qroDte02;
		this.qroLog01 = qroLog01;
		this.oidQroDet = oidQroDet;
	}

	// Property accessors

	public QroDetId getId() {
		return this.id;
	}

	public void setId(QroDetId id) {
		this.id = id;
	}

	public Integer getQroCmtindx() {
		return this.qroCmtindx;
	}

	public void setQroCmtindx(Integer qroCmtindx) {
		this.qroCmtindx = qroCmtindx;
	}

	public String getQroDesc() {
		return this.qroDesc;
	}

	public void setQroDesc(String qroDesc) {
		this.qroDesc = qroDesc;
	}

	public String getQroMch() {
		return this.qroMch;
	}

	public void setQroMch(String qroMch) {
		this.qroMch = qroMch;
	}

	public Integer getQroMchOp() {
		return this.qroMchOp;
	}

	public void setQroMchOp(Integer qroMchOp) {
		this.qroMchOp = qroMchOp;
	}

	public Double getQroQueue() {
		return this.qroQueue;
	}

	public void setQroQueue(Double qroQueue) {
		this.qroQueue = qroQueue;
	}

	public String getQroTool() {
		return this.qroTool;
	}

	public void setQroTool(String qroTool) {
		this.qroTool = qroTool;
	}

	public String getQroUser1() {
		return this.qroUser1;
	}

	public void setQroUser1(String qroUser1) {
		this.qroUser1 = qroUser1;
	}

	public String getQroUser2() {
		return this.qroUser2;
	}

	public void setQroUser2(String qroUser2) {
		this.qroUser2 = qroUser2;
	}

	public String getQroWkctr() {
		return this.qroWkctr;
	}

	public void setQroWkctr(String qroWkctr) {
		this.qroWkctr = qroWkctr;
	}

	public String getQroChr01() {
		return this.qroChr01;
	}

	public void setQroChr01(String qroChr01) {
		this.qroChr01 = qroChr01;
	}

	public String getQroChr02() {
		return this.qroChr02;
	}

	public void setQroChr02(String qroChr02) {
		this.qroChr02 = qroChr02;
	}

	public String getQroChr03() {
		return this.qroChr03;
	}

	public void setQroChr03(String qroChr03) {
		this.qroChr03 = qroChr03;
	}

	public String getQroChr04() {
		return this.qroChr04;
	}

	public void setQroChr04(String qroChr04) {
		this.qroChr04 = qroChr04;
	}

	public String getQroChr05() {
		return this.qroChr05;
	}

	public void setQroChr05(String qroChr05) {
		this.qroChr05 = qroChr05;
	}

	public Double getQroDec01() {
		return this.qroDec01;
	}

	public void setQroDec01(Double qroDec01) {
		this.qroDec01 = qroDec01;
	}

	public Double getQroDec02() {
		return this.qroDec02;
	}

	public void setQroDec02(Double qroDec02) {
		this.qroDec02 = qroDec02;
	}

	public Date getQroDte01() {
		return this.qroDte01;
	}

	public void setQroDte01(Date qroDte01) {
		this.qroDte01 = qroDte01;
	}

	public Date getQroDte02() {
		return this.qroDte02;
	}

	public void setQroDte02(Date qroDte02) {
		this.qroDte02 = qroDte02;
	}

	public Boolean getQroLog01() {
		return this.qroLog01;
	}

	public void setQroLog01(Boolean qroLog01) {
		this.qroLog01 = qroLog01;
	}

	public Double getOidQroDet() {
		return this.oidQroDet;
	}

	public void setOidQroDet(Double oidQroDet) {
		this.oidQroDet = oidQroDet;
	}

}