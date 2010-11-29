package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcd1Det entity provides the base persistence definition of the
 * Ecd1Det entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd1Det implements java.io.Serializable {

	// Fields

	private Ecd1DetId id;
	private String ecd1QtyType;
	private Double ecd1QtyPer;
	private Double ecd1ScrpPct;
	private String ecd1Rmks;
	private Integer ecd1Op;
	private Integer ecd1ItemNo;
	private Double ecd1QtyPerB;
	private Double ecd1BatchPct;
	private Double ecd1Batch;
	private String ecd1BatchUm;
	private Integer ecd1Cmtindx;
	private Integer ecd1Recindx;
	private String ecd1Process;
	private Boolean ecd1Qad01;
	private Date ecd1Qad02;
	private String ecd1Qad03;
	private String ecd1Qad04;
	private String ecd1Qad05;
	private Date ecd1ModDate;
	private String ecd1Userid;
	private String ecd1User1;
	private String ecd1User2;
	private Boolean ecd1Deactivate;
	private Date ecd1Start;
	private String ecd1PsCode;
	private Boolean ecd1Mandatory;
	private Boolean ecd1Default;
	private Integer ecd1LtOff;
	private Double ecd1FcstPct;
	private String ecd1Group;
	private String ecd1Psprocess;
	private Double oidEcd1Det;

	// Constructors

	/** default constructor */
	public AbstractEcd1Det() {
	}

	/** minimal constructor */
	public AbstractEcd1Det(Ecd1DetId id, Double ecd1QtyPer, String ecd1BatchUm,
			Boolean ecd1Deactivate, String ecd1PsCode, Boolean ecd1Mandatory,
			Boolean ecd1Default, Integer ecd1LtOff, Double ecd1FcstPct,
			String ecd1Group, String ecd1Psprocess, Double oidEcd1Det) {
		this.id = id;
		this.ecd1QtyPer = ecd1QtyPer;
		this.ecd1BatchUm = ecd1BatchUm;
		this.ecd1Deactivate = ecd1Deactivate;
		this.ecd1PsCode = ecd1PsCode;
		this.ecd1Mandatory = ecd1Mandatory;
		this.ecd1Default = ecd1Default;
		this.ecd1LtOff = ecd1LtOff;
		this.ecd1FcstPct = ecd1FcstPct;
		this.ecd1Group = ecd1Group;
		this.ecd1Psprocess = ecd1Psprocess;
		this.oidEcd1Det = oidEcd1Det;
	}

	/** full constructor */
	public AbstractEcd1Det(Ecd1DetId id, String ecd1QtyType, Double ecd1QtyPer,
			Double ecd1ScrpPct, String ecd1Rmks, Integer ecd1Op,
			Integer ecd1ItemNo, Double ecd1QtyPerB, Double ecd1BatchPct,
			Double ecd1Batch, String ecd1BatchUm, Integer ecd1Cmtindx,
			Integer ecd1Recindx, String ecd1Process, Boolean ecd1Qad01,
			Date ecd1Qad02, String ecd1Qad03, String ecd1Qad04,
			String ecd1Qad05, Date ecd1ModDate, String ecd1Userid,
			String ecd1User1, String ecd1User2, Boolean ecd1Deactivate,
			Date ecd1Start, String ecd1PsCode, Boolean ecd1Mandatory,
			Boolean ecd1Default, Integer ecd1LtOff, Double ecd1FcstPct,
			String ecd1Group, String ecd1Psprocess, Double oidEcd1Det) {
		this.id = id;
		this.ecd1QtyType = ecd1QtyType;
		this.ecd1QtyPer = ecd1QtyPer;
		this.ecd1ScrpPct = ecd1ScrpPct;
		this.ecd1Rmks = ecd1Rmks;
		this.ecd1Op = ecd1Op;
		this.ecd1ItemNo = ecd1ItemNo;
		this.ecd1QtyPerB = ecd1QtyPerB;
		this.ecd1BatchPct = ecd1BatchPct;
		this.ecd1Batch = ecd1Batch;
		this.ecd1BatchUm = ecd1BatchUm;
		this.ecd1Cmtindx = ecd1Cmtindx;
		this.ecd1Recindx = ecd1Recindx;
		this.ecd1Process = ecd1Process;
		this.ecd1Qad01 = ecd1Qad01;
		this.ecd1Qad02 = ecd1Qad02;
		this.ecd1Qad03 = ecd1Qad03;
		this.ecd1Qad04 = ecd1Qad04;
		this.ecd1Qad05 = ecd1Qad05;
		this.ecd1ModDate = ecd1ModDate;
		this.ecd1Userid = ecd1Userid;
		this.ecd1User1 = ecd1User1;
		this.ecd1User2 = ecd1User2;
		this.ecd1Deactivate = ecd1Deactivate;
		this.ecd1Start = ecd1Start;
		this.ecd1PsCode = ecd1PsCode;
		this.ecd1Mandatory = ecd1Mandatory;
		this.ecd1Default = ecd1Default;
		this.ecd1LtOff = ecd1LtOff;
		this.ecd1FcstPct = ecd1FcstPct;
		this.ecd1Group = ecd1Group;
		this.ecd1Psprocess = ecd1Psprocess;
		this.oidEcd1Det = oidEcd1Det;
	}

	// Property accessors

	public Ecd1DetId getId() {
		return this.id;
	}

	public void setId(Ecd1DetId id) {
		this.id = id;
	}

	public String getEcd1QtyType() {
		return this.ecd1QtyType;
	}

	public void setEcd1QtyType(String ecd1QtyType) {
		this.ecd1QtyType = ecd1QtyType;
	}

	public Double getEcd1QtyPer() {
		return this.ecd1QtyPer;
	}

	public void setEcd1QtyPer(Double ecd1QtyPer) {
		this.ecd1QtyPer = ecd1QtyPer;
	}

	public Double getEcd1ScrpPct() {
		return this.ecd1ScrpPct;
	}

	public void setEcd1ScrpPct(Double ecd1ScrpPct) {
		this.ecd1ScrpPct = ecd1ScrpPct;
	}

	public String getEcd1Rmks() {
		return this.ecd1Rmks;
	}

	public void setEcd1Rmks(String ecd1Rmks) {
		this.ecd1Rmks = ecd1Rmks;
	}

	public Integer getEcd1Op() {
		return this.ecd1Op;
	}

	public void setEcd1Op(Integer ecd1Op) {
		this.ecd1Op = ecd1Op;
	}

	public Integer getEcd1ItemNo() {
		return this.ecd1ItemNo;
	}

	public void setEcd1ItemNo(Integer ecd1ItemNo) {
		this.ecd1ItemNo = ecd1ItemNo;
	}

	public Double getEcd1QtyPerB() {
		return this.ecd1QtyPerB;
	}

	public void setEcd1QtyPerB(Double ecd1QtyPerB) {
		this.ecd1QtyPerB = ecd1QtyPerB;
	}

	public Double getEcd1BatchPct() {
		return this.ecd1BatchPct;
	}

	public void setEcd1BatchPct(Double ecd1BatchPct) {
		this.ecd1BatchPct = ecd1BatchPct;
	}

	public Double getEcd1Batch() {
		return this.ecd1Batch;
	}

	public void setEcd1Batch(Double ecd1Batch) {
		this.ecd1Batch = ecd1Batch;
	}

	public String getEcd1BatchUm() {
		return this.ecd1BatchUm;
	}

	public void setEcd1BatchUm(String ecd1BatchUm) {
		this.ecd1BatchUm = ecd1BatchUm;
	}

	public Integer getEcd1Cmtindx() {
		return this.ecd1Cmtindx;
	}

	public void setEcd1Cmtindx(Integer ecd1Cmtindx) {
		this.ecd1Cmtindx = ecd1Cmtindx;
	}

	public Integer getEcd1Recindx() {
		return this.ecd1Recindx;
	}

	public void setEcd1Recindx(Integer ecd1Recindx) {
		this.ecd1Recindx = ecd1Recindx;
	}

	public String getEcd1Process() {
		return this.ecd1Process;
	}

	public void setEcd1Process(String ecd1Process) {
		this.ecd1Process = ecd1Process;
	}

	public Boolean getEcd1Qad01() {
		return this.ecd1Qad01;
	}

	public void setEcd1Qad01(Boolean ecd1Qad01) {
		this.ecd1Qad01 = ecd1Qad01;
	}

	public Date getEcd1Qad02() {
		return this.ecd1Qad02;
	}

	public void setEcd1Qad02(Date ecd1Qad02) {
		this.ecd1Qad02 = ecd1Qad02;
	}

	public String getEcd1Qad03() {
		return this.ecd1Qad03;
	}

	public void setEcd1Qad03(String ecd1Qad03) {
		this.ecd1Qad03 = ecd1Qad03;
	}

	public String getEcd1Qad04() {
		return this.ecd1Qad04;
	}

	public void setEcd1Qad04(String ecd1Qad04) {
		this.ecd1Qad04 = ecd1Qad04;
	}

	public String getEcd1Qad05() {
		return this.ecd1Qad05;
	}

	public void setEcd1Qad05(String ecd1Qad05) {
		this.ecd1Qad05 = ecd1Qad05;
	}

	public Date getEcd1ModDate() {
		return this.ecd1ModDate;
	}

	public void setEcd1ModDate(Date ecd1ModDate) {
		this.ecd1ModDate = ecd1ModDate;
	}

	public String getEcd1Userid() {
		return this.ecd1Userid;
	}

	public void setEcd1Userid(String ecd1Userid) {
		this.ecd1Userid = ecd1Userid;
	}

	public String getEcd1User1() {
		return this.ecd1User1;
	}

	public void setEcd1User1(String ecd1User1) {
		this.ecd1User1 = ecd1User1;
	}

	public String getEcd1User2() {
		return this.ecd1User2;
	}

	public void setEcd1User2(String ecd1User2) {
		this.ecd1User2 = ecd1User2;
	}

	public Boolean getEcd1Deactivate() {
		return this.ecd1Deactivate;
	}

	public void setEcd1Deactivate(Boolean ecd1Deactivate) {
		this.ecd1Deactivate = ecd1Deactivate;
	}

	public Date getEcd1Start() {
		return this.ecd1Start;
	}

	public void setEcd1Start(Date ecd1Start) {
		this.ecd1Start = ecd1Start;
	}

	public String getEcd1PsCode() {
		return this.ecd1PsCode;
	}

	public void setEcd1PsCode(String ecd1PsCode) {
		this.ecd1PsCode = ecd1PsCode;
	}

	public Boolean getEcd1Mandatory() {
		return this.ecd1Mandatory;
	}

	public void setEcd1Mandatory(Boolean ecd1Mandatory) {
		this.ecd1Mandatory = ecd1Mandatory;
	}

	public Boolean getEcd1Default() {
		return this.ecd1Default;
	}

	public void setEcd1Default(Boolean ecd1Default) {
		this.ecd1Default = ecd1Default;
	}

	public Integer getEcd1LtOff() {
		return this.ecd1LtOff;
	}

	public void setEcd1LtOff(Integer ecd1LtOff) {
		this.ecd1LtOff = ecd1LtOff;
	}

	public Double getEcd1FcstPct() {
		return this.ecd1FcstPct;
	}

	public void setEcd1FcstPct(Double ecd1FcstPct) {
		this.ecd1FcstPct = ecd1FcstPct;
	}

	public String getEcd1Group() {
		return this.ecd1Group;
	}

	public void setEcd1Group(String ecd1Group) {
		this.ecd1Group = ecd1Group;
	}

	public String getEcd1Psprocess() {
		return this.ecd1Psprocess;
	}

	public void setEcd1Psprocess(String ecd1Psprocess) {
		this.ecd1Psprocess = ecd1Psprocess;
	}

	public Double getOidEcd1Det() {
		return this.oidEcd1Det;
	}

	public void setOidEcd1Det(Double oidEcd1Det) {
		this.oidEcd1Det = oidEcd1Det;
	}

}