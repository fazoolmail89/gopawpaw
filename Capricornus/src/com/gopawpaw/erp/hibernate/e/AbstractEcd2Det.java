package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcd2Det entity provides the base persistence definition of the
 * Ecd2Det entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd2Det implements java.io.Serializable {

	// Fields

	private Ecd2DetId id;
	private String ecd2StdOp;
	private String ecd2Desc;
	private String ecd2Wkctr;
	private Double ecd2Setup;
	private Double ecd2Run;
	private Double ecd2YieldPct;
	private String ecd2Tool;
	private String ecd2Vend;
	private Double ecd2SubCost;
	private Boolean ecd2Subcntrt;
	private String ecd2Mch;
	private Double ecd2SetupMen;
	private Double ecd2MenMch;
	private Integer ecd2MchOp;
	private Double ecd2Batch;
	private Double ecd2RunPerB;
	private Integer ecd2Cmtindx;
	private Integer ecd2Recindx;
	private String ecd2Process;
	private Boolean ecd2Qad01;
	private Date ecd2Qad02;
	private String ecd2Qad03;
	private String ecd2Qad04;
	private String ecd2Qad05;
	private Date ecd2ModDate;
	private String ecd2Userid;
	private String ecd2User1;
	private String ecd2User2;
	private Double oidEcd2Det;

	// Constructors

	/** default constructor */
	public AbstractEcd2Det() {
	}

	/** minimal constructor */
	public AbstractEcd2Det(Ecd2DetId id, Double oidEcd2Det) {
		this.id = id;
		this.oidEcd2Det = oidEcd2Det;
	}

	/** full constructor */
	public AbstractEcd2Det(Ecd2DetId id, String ecd2StdOp, String ecd2Desc,
			String ecd2Wkctr, Double ecd2Setup, Double ecd2Run,
			Double ecd2YieldPct, String ecd2Tool, String ecd2Vend,
			Double ecd2SubCost, Boolean ecd2Subcntrt, String ecd2Mch,
			Double ecd2SetupMen, Double ecd2MenMch, Integer ecd2MchOp,
			Double ecd2Batch, Double ecd2RunPerB, Integer ecd2Cmtindx,
			Integer ecd2Recindx, String ecd2Process, Boolean ecd2Qad01,
			Date ecd2Qad02, String ecd2Qad03, String ecd2Qad04,
			String ecd2Qad05, Date ecd2ModDate, String ecd2Userid,
			String ecd2User1, String ecd2User2, Double oidEcd2Det) {
		this.id = id;
		this.ecd2StdOp = ecd2StdOp;
		this.ecd2Desc = ecd2Desc;
		this.ecd2Wkctr = ecd2Wkctr;
		this.ecd2Setup = ecd2Setup;
		this.ecd2Run = ecd2Run;
		this.ecd2YieldPct = ecd2YieldPct;
		this.ecd2Tool = ecd2Tool;
		this.ecd2Vend = ecd2Vend;
		this.ecd2SubCost = ecd2SubCost;
		this.ecd2Subcntrt = ecd2Subcntrt;
		this.ecd2Mch = ecd2Mch;
		this.ecd2SetupMen = ecd2SetupMen;
		this.ecd2MenMch = ecd2MenMch;
		this.ecd2MchOp = ecd2MchOp;
		this.ecd2Batch = ecd2Batch;
		this.ecd2RunPerB = ecd2RunPerB;
		this.ecd2Cmtindx = ecd2Cmtindx;
		this.ecd2Recindx = ecd2Recindx;
		this.ecd2Process = ecd2Process;
		this.ecd2Qad01 = ecd2Qad01;
		this.ecd2Qad02 = ecd2Qad02;
		this.ecd2Qad03 = ecd2Qad03;
		this.ecd2Qad04 = ecd2Qad04;
		this.ecd2Qad05 = ecd2Qad05;
		this.ecd2ModDate = ecd2ModDate;
		this.ecd2Userid = ecd2Userid;
		this.ecd2User1 = ecd2User1;
		this.ecd2User2 = ecd2User2;
		this.oidEcd2Det = oidEcd2Det;
	}

	// Property accessors

	public Ecd2DetId getId() {
		return this.id;
	}

	public void setId(Ecd2DetId id) {
		this.id = id;
	}

	public String getEcd2StdOp() {
		return this.ecd2StdOp;
	}

	public void setEcd2StdOp(String ecd2StdOp) {
		this.ecd2StdOp = ecd2StdOp;
	}

	public String getEcd2Desc() {
		return this.ecd2Desc;
	}

	public void setEcd2Desc(String ecd2Desc) {
		this.ecd2Desc = ecd2Desc;
	}

	public String getEcd2Wkctr() {
		return this.ecd2Wkctr;
	}

	public void setEcd2Wkctr(String ecd2Wkctr) {
		this.ecd2Wkctr = ecd2Wkctr;
	}

	public Double getEcd2Setup() {
		return this.ecd2Setup;
	}

	public void setEcd2Setup(Double ecd2Setup) {
		this.ecd2Setup = ecd2Setup;
	}

	public Double getEcd2Run() {
		return this.ecd2Run;
	}

	public void setEcd2Run(Double ecd2Run) {
		this.ecd2Run = ecd2Run;
	}

	public Double getEcd2YieldPct() {
		return this.ecd2YieldPct;
	}

	public void setEcd2YieldPct(Double ecd2YieldPct) {
		this.ecd2YieldPct = ecd2YieldPct;
	}

	public String getEcd2Tool() {
		return this.ecd2Tool;
	}

	public void setEcd2Tool(String ecd2Tool) {
		this.ecd2Tool = ecd2Tool;
	}

	public String getEcd2Vend() {
		return this.ecd2Vend;
	}

	public void setEcd2Vend(String ecd2Vend) {
		this.ecd2Vend = ecd2Vend;
	}

	public Double getEcd2SubCost() {
		return this.ecd2SubCost;
	}

	public void setEcd2SubCost(Double ecd2SubCost) {
		this.ecd2SubCost = ecd2SubCost;
	}

	public Boolean getEcd2Subcntrt() {
		return this.ecd2Subcntrt;
	}

	public void setEcd2Subcntrt(Boolean ecd2Subcntrt) {
		this.ecd2Subcntrt = ecd2Subcntrt;
	}

	public String getEcd2Mch() {
		return this.ecd2Mch;
	}

	public void setEcd2Mch(String ecd2Mch) {
		this.ecd2Mch = ecd2Mch;
	}

	public Double getEcd2SetupMen() {
		return this.ecd2SetupMen;
	}

	public void setEcd2SetupMen(Double ecd2SetupMen) {
		this.ecd2SetupMen = ecd2SetupMen;
	}

	public Double getEcd2MenMch() {
		return this.ecd2MenMch;
	}

	public void setEcd2MenMch(Double ecd2MenMch) {
		this.ecd2MenMch = ecd2MenMch;
	}

	public Integer getEcd2MchOp() {
		return this.ecd2MchOp;
	}

	public void setEcd2MchOp(Integer ecd2MchOp) {
		this.ecd2MchOp = ecd2MchOp;
	}

	public Double getEcd2Batch() {
		return this.ecd2Batch;
	}

	public void setEcd2Batch(Double ecd2Batch) {
		this.ecd2Batch = ecd2Batch;
	}

	public Double getEcd2RunPerB() {
		return this.ecd2RunPerB;
	}

	public void setEcd2RunPerB(Double ecd2RunPerB) {
		this.ecd2RunPerB = ecd2RunPerB;
	}

	public Integer getEcd2Cmtindx() {
		return this.ecd2Cmtindx;
	}

	public void setEcd2Cmtindx(Integer ecd2Cmtindx) {
		this.ecd2Cmtindx = ecd2Cmtindx;
	}

	public Integer getEcd2Recindx() {
		return this.ecd2Recindx;
	}

	public void setEcd2Recindx(Integer ecd2Recindx) {
		this.ecd2Recindx = ecd2Recindx;
	}

	public String getEcd2Process() {
		return this.ecd2Process;
	}

	public void setEcd2Process(String ecd2Process) {
		this.ecd2Process = ecd2Process;
	}

	public Boolean getEcd2Qad01() {
		return this.ecd2Qad01;
	}

	public void setEcd2Qad01(Boolean ecd2Qad01) {
		this.ecd2Qad01 = ecd2Qad01;
	}

	public Date getEcd2Qad02() {
		return this.ecd2Qad02;
	}

	public void setEcd2Qad02(Date ecd2Qad02) {
		this.ecd2Qad02 = ecd2Qad02;
	}

	public String getEcd2Qad03() {
		return this.ecd2Qad03;
	}

	public void setEcd2Qad03(String ecd2Qad03) {
		this.ecd2Qad03 = ecd2Qad03;
	}

	public String getEcd2Qad04() {
		return this.ecd2Qad04;
	}

	public void setEcd2Qad04(String ecd2Qad04) {
		this.ecd2Qad04 = ecd2Qad04;
	}

	public String getEcd2Qad05() {
		return this.ecd2Qad05;
	}

	public void setEcd2Qad05(String ecd2Qad05) {
		this.ecd2Qad05 = ecd2Qad05;
	}

	public Date getEcd2ModDate() {
		return this.ecd2ModDate;
	}

	public void setEcd2ModDate(Date ecd2ModDate) {
		this.ecd2ModDate = ecd2ModDate;
	}

	public String getEcd2Userid() {
		return this.ecd2Userid;
	}

	public void setEcd2Userid(String ecd2Userid) {
		this.ecd2Userid = ecd2Userid;
	}

	public String getEcd2User1() {
		return this.ecd2User1;
	}

	public void setEcd2User1(String ecd2User1) {
		this.ecd2User1 = ecd2User1;
	}

	public String getEcd2User2() {
		return this.ecd2User2;
	}

	public void setEcd2User2(String ecd2User2) {
		this.ecd2User2 = ecd2User2;
	}

	public Double getOidEcd2Det() {
		return this.oidEcd2Det;
	}

	public void setOidEcd2Det(Double oidEcd2Det) {
		this.oidEcd2Det = oidEcd2Det;
	}

}