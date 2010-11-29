package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFpstMstr entity provides the base persistence definition of the
 * FpstMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFpstMstr implements java.io.Serializable {

	// Fields

	private FpstMstrId id;
	private Boolean fpstReturn;
	private String fpstDesc;
	private Boolean fpstExchange;
	private Boolean fpstGood;
	private Boolean fpstScrap;
	private Boolean fpstPending;
	private Date fpstModDate;
	private String fpstModUserid;
	private String fpstUser1;
	private String fpstUser2;
	private String fpstChr01;
	private String fpstChr02;
	private Boolean fpstLog01;
	private Boolean fpstLog02;
	private Date fpstDte01;
	private Double fpstDec01;
	private String fpstQadc01;
	private String fpstQadc02;
	private Boolean fpstQadl01;
	private Boolean fpstQadl02;
	private Date fpstQadt01;
	private Double fpstQade01;
	private Double oidFpstMstr;

	// Constructors

	/** default constructor */
	public AbstractFpstMstr() {
	}

	/** minimal constructor */
	public AbstractFpstMstr(FpstMstrId id, Double oidFpstMstr) {
		this.id = id;
		this.oidFpstMstr = oidFpstMstr;
	}

	/** full constructor */
	public AbstractFpstMstr(FpstMstrId id, Boolean fpstReturn, String fpstDesc,
			Boolean fpstExchange, Boolean fpstGood, Boolean fpstScrap,
			Boolean fpstPending, Date fpstModDate, String fpstModUserid,
			String fpstUser1, String fpstUser2, String fpstChr01,
			String fpstChr02, Boolean fpstLog01, Boolean fpstLog02,
			Date fpstDte01, Double fpstDec01, String fpstQadc01,
			String fpstQadc02, Boolean fpstQadl01, Boolean fpstQadl02,
			Date fpstQadt01, Double fpstQade01, Double oidFpstMstr) {
		this.id = id;
		this.fpstReturn = fpstReturn;
		this.fpstDesc = fpstDesc;
		this.fpstExchange = fpstExchange;
		this.fpstGood = fpstGood;
		this.fpstScrap = fpstScrap;
		this.fpstPending = fpstPending;
		this.fpstModDate = fpstModDate;
		this.fpstModUserid = fpstModUserid;
		this.fpstUser1 = fpstUser1;
		this.fpstUser2 = fpstUser2;
		this.fpstChr01 = fpstChr01;
		this.fpstChr02 = fpstChr02;
		this.fpstLog01 = fpstLog01;
		this.fpstLog02 = fpstLog02;
		this.fpstDte01 = fpstDte01;
		this.fpstDec01 = fpstDec01;
		this.fpstQadc01 = fpstQadc01;
		this.fpstQadc02 = fpstQadc02;
		this.fpstQadl01 = fpstQadl01;
		this.fpstQadl02 = fpstQadl02;
		this.fpstQadt01 = fpstQadt01;
		this.fpstQade01 = fpstQade01;
		this.oidFpstMstr = oidFpstMstr;
	}

	// Property accessors

	public FpstMstrId getId() {
		return this.id;
	}

	public void setId(FpstMstrId id) {
		this.id = id;
	}

	public Boolean getFpstReturn() {
		return this.fpstReturn;
	}

	public void setFpstReturn(Boolean fpstReturn) {
		this.fpstReturn = fpstReturn;
	}

	public String getFpstDesc() {
		return this.fpstDesc;
	}

	public void setFpstDesc(String fpstDesc) {
		this.fpstDesc = fpstDesc;
	}

	public Boolean getFpstExchange() {
		return this.fpstExchange;
	}

	public void setFpstExchange(Boolean fpstExchange) {
		this.fpstExchange = fpstExchange;
	}

	public Boolean getFpstGood() {
		return this.fpstGood;
	}

	public void setFpstGood(Boolean fpstGood) {
		this.fpstGood = fpstGood;
	}

	public Boolean getFpstScrap() {
		return this.fpstScrap;
	}

	public void setFpstScrap(Boolean fpstScrap) {
		this.fpstScrap = fpstScrap;
	}

	public Boolean getFpstPending() {
		return this.fpstPending;
	}

	public void setFpstPending(Boolean fpstPending) {
		this.fpstPending = fpstPending;
	}

	public Date getFpstModDate() {
		return this.fpstModDate;
	}

	public void setFpstModDate(Date fpstModDate) {
		this.fpstModDate = fpstModDate;
	}

	public String getFpstModUserid() {
		return this.fpstModUserid;
	}

	public void setFpstModUserid(String fpstModUserid) {
		this.fpstModUserid = fpstModUserid;
	}

	public String getFpstUser1() {
		return this.fpstUser1;
	}

	public void setFpstUser1(String fpstUser1) {
		this.fpstUser1 = fpstUser1;
	}

	public String getFpstUser2() {
		return this.fpstUser2;
	}

	public void setFpstUser2(String fpstUser2) {
		this.fpstUser2 = fpstUser2;
	}

	public String getFpstChr01() {
		return this.fpstChr01;
	}

	public void setFpstChr01(String fpstChr01) {
		this.fpstChr01 = fpstChr01;
	}

	public String getFpstChr02() {
		return this.fpstChr02;
	}

	public void setFpstChr02(String fpstChr02) {
		this.fpstChr02 = fpstChr02;
	}

	public Boolean getFpstLog01() {
		return this.fpstLog01;
	}

	public void setFpstLog01(Boolean fpstLog01) {
		this.fpstLog01 = fpstLog01;
	}

	public Boolean getFpstLog02() {
		return this.fpstLog02;
	}

	public void setFpstLog02(Boolean fpstLog02) {
		this.fpstLog02 = fpstLog02;
	}

	public Date getFpstDte01() {
		return this.fpstDte01;
	}

	public void setFpstDte01(Date fpstDte01) {
		this.fpstDte01 = fpstDte01;
	}

	public Double getFpstDec01() {
		return this.fpstDec01;
	}

	public void setFpstDec01(Double fpstDec01) {
		this.fpstDec01 = fpstDec01;
	}

	public String getFpstQadc01() {
		return this.fpstQadc01;
	}

	public void setFpstQadc01(String fpstQadc01) {
		this.fpstQadc01 = fpstQadc01;
	}

	public String getFpstQadc02() {
		return this.fpstQadc02;
	}

	public void setFpstQadc02(String fpstQadc02) {
		this.fpstQadc02 = fpstQadc02;
	}

	public Boolean getFpstQadl01() {
		return this.fpstQadl01;
	}

	public void setFpstQadl01(Boolean fpstQadl01) {
		this.fpstQadl01 = fpstQadl01;
	}

	public Boolean getFpstQadl02() {
		return this.fpstQadl02;
	}

	public void setFpstQadl02(Boolean fpstQadl02) {
		this.fpstQadl02 = fpstQadl02;
	}

	public Date getFpstQadt01() {
		return this.fpstQadt01;
	}

	public void setFpstQadt01(Date fpstQadt01) {
		this.fpstQadt01 = fpstQadt01;
	}

	public Double getFpstQade01() {
		return this.fpstQade01;
	}

	public void setFpstQade01(Double fpstQade01) {
		this.fpstQade01 = fpstQade01;
	}

	public Double getOidFpstMstr() {
		return this.oidFpstMstr;
	}

	public void setOidFpstMstr(Double oidFpstMstr) {
		this.oidFpstMstr = oidFpstMstr;
	}

}