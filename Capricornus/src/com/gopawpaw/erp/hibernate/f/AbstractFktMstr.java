package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFktMstr entity provides the base persistence definition of the
 * FktMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFktMstr implements java.io.Serializable {

	// Fields

	private FktMstrId id;
	private String fktBomCode;
	private Boolean fktInUse;
	private String fktEngCode;
	private String fktCurrSite;
	private String fktCurrLoc;
	private String fktLoc;
	private Date fktModDate;
	private String fktPart;
	private Boolean fktComplete;
	private String fktRev;
	private String fktType;
	private String fktSite;
	private Boolean fktOrder;
	private String fktChr01;
	private String fktChr02;
	private String fktChr03;
	private String fktChr04;
	private Double fktDec01;
	private Double fktDec02;
	private Double fktDec03;
	private Date fktDte01;
	private Date fktDte02;
	private Date fktDte03;
	private Boolean fktLog01;
	private Boolean fktLog02;
	private Boolean fktLog03;
	private String fktQadc01;
	private String fktQadc02;
	private String fktQadc03;
	private String fktQadc04;
	private Date fktQadd01;
	private Date fktQadd02;
	private Date fktQadd03;
	private Double fktQadde01;
	private Double fktQadde02;
	private Double fktQadde03;
	private Boolean fktQadl01;
	private Boolean fktQadl02;
	private Boolean fktQadl03;
	private Date fktEffDate;
	private String fktModUserid;
	private String fktUser1;
	private String fktUser2;
	private Double oidFktMstr;

	// Constructors

	/** default constructor */
	public AbstractFktMstr() {
	}

	/** minimal constructor */
	public AbstractFktMstr(FktMstrId id, Double oidFktMstr) {
		this.id = id;
		this.oidFktMstr = oidFktMstr;
	}

	/** full constructor */
	public AbstractFktMstr(FktMstrId id, String fktBomCode, Boolean fktInUse,
			String fktEngCode, String fktCurrSite, String fktCurrLoc,
			String fktLoc, Date fktModDate, String fktPart,
			Boolean fktComplete, String fktRev, String fktType, String fktSite,
			Boolean fktOrder, String fktChr01, String fktChr02,
			String fktChr03, String fktChr04, Double fktDec01, Double fktDec02,
			Double fktDec03, Date fktDte01, Date fktDte02, Date fktDte03,
			Boolean fktLog01, Boolean fktLog02, Boolean fktLog03,
			String fktQadc01, String fktQadc02, String fktQadc03,
			String fktQadc04, Date fktQadd01, Date fktQadd02, Date fktQadd03,
			Double fktQadde01, Double fktQadde02, Double fktQadde03,
			Boolean fktQadl01, Boolean fktQadl02, Boolean fktQadl03,
			Date fktEffDate, String fktModUserid, String fktUser1,
			String fktUser2, Double oidFktMstr) {
		this.id = id;
		this.fktBomCode = fktBomCode;
		this.fktInUse = fktInUse;
		this.fktEngCode = fktEngCode;
		this.fktCurrSite = fktCurrSite;
		this.fktCurrLoc = fktCurrLoc;
		this.fktLoc = fktLoc;
		this.fktModDate = fktModDate;
		this.fktPart = fktPart;
		this.fktComplete = fktComplete;
		this.fktRev = fktRev;
		this.fktType = fktType;
		this.fktSite = fktSite;
		this.fktOrder = fktOrder;
		this.fktChr01 = fktChr01;
		this.fktChr02 = fktChr02;
		this.fktChr03 = fktChr03;
		this.fktChr04 = fktChr04;
		this.fktDec01 = fktDec01;
		this.fktDec02 = fktDec02;
		this.fktDec03 = fktDec03;
		this.fktDte01 = fktDte01;
		this.fktDte02 = fktDte02;
		this.fktDte03 = fktDte03;
		this.fktLog01 = fktLog01;
		this.fktLog02 = fktLog02;
		this.fktLog03 = fktLog03;
		this.fktQadc01 = fktQadc01;
		this.fktQadc02 = fktQadc02;
		this.fktQadc03 = fktQadc03;
		this.fktQadc04 = fktQadc04;
		this.fktQadd01 = fktQadd01;
		this.fktQadd02 = fktQadd02;
		this.fktQadd03 = fktQadd03;
		this.fktQadde01 = fktQadde01;
		this.fktQadde02 = fktQadde02;
		this.fktQadde03 = fktQadde03;
		this.fktQadl01 = fktQadl01;
		this.fktQadl02 = fktQadl02;
		this.fktQadl03 = fktQadl03;
		this.fktEffDate = fktEffDate;
		this.fktModUserid = fktModUserid;
		this.fktUser1 = fktUser1;
		this.fktUser2 = fktUser2;
		this.oidFktMstr = oidFktMstr;
	}

	// Property accessors

	public FktMstrId getId() {
		return this.id;
	}

	public void setId(FktMstrId id) {
		this.id = id;
	}

	public String getFktBomCode() {
		return this.fktBomCode;
	}

	public void setFktBomCode(String fktBomCode) {
		this.fktBomCode = fktBomCode;
	}

	public Boolean getFktInUse() {
		return this.fktInUse;
	}

	public void setFktInUse(Boolean fktInUse) {
		this.fktInUse = fktInUse;
	}

	public String getFktEngCode() {
		return this.fktEngCode;
	}

	public void setFktEngCode(String fktEngCode) {
		this.fktEngCode = fktEngCode;
	}

	public String getFktCurrSite() {
		return this.fktCurrSite;
	}

	public void setFktCurrSite(String fktCurrSite) {
		this.fktCurrSite = fktCurrSite;
	}

	public String getFktCurrLoc() {
		return this.fktCurrLoc;
	}

	public void setFktCurrLoc(String fktCurrLoc) {
		this.fktCurrLoc = fktCurrLoc;
	}

	public String getFktLoc() {
		return this.fktLoc;
	}

	public void setFktLoc(String fktLoc) {
		this.fktLoc = fktLoc;
	}

	public Date getFktModDate() {
		return this.fktModDate;
	}

	public void setFktModDate(Date fktModDate) {
		this.fktModDate = fktModDate;
	}

	public String getFktPart() {
		return this.fktPart;
	}

	public void setFktPart(String fktPart) {
		this.fktPart = fktPart;
	}

	public Boolean getFktComplete() {
		return this.fktComplete;
	}

	public void setFktComplete(Boolean fktComplete) {
		this.fktComplete = fktComplete;
	}

	public String getFktRev() {
		return this.fktRev;
	}

	public void setFktRev(String fktRev) {
		this.fktRev = fktRev;
	}

	public String getFktType() {
		return this.fktType;
	}

	public void setFktType(String fktType) {
		this.fktType = fktType;
	}

	public String getFktSite() {
		return this.fktSite;
	}

	public void setFktSite(String fktSite) {
		this.fktSite = fktSite;
	}

	public Boolean getFktOrder() {
		return this.fktOrder;
	}

	public void setFktOrder(Boolean fktOrder) {
		this.fktOrder = fktOrder;
	}

	public String getFktChr01() {
		return this.fktChr01;
	}

	public void setFktChr01(String fktChr01) {
		this.fktChr01 = fktChr01;
	}

	public String getFktChr02() {
		return this.fktChr02;
	}

	public void setFktChr02(String fktChr02) {
		this.fktChr02 = fktChr02;
	}

	public String getFktChr03() {
		return this.fktChr03;
	}

	public void setFktChr03(String fktChr03) {
		this.fktChr03 = fktChr03;
	}

	public String getFktChr04() {
		return this.fktChr04;
	}

	public void setFktChr04(String fktChr04) {
		this.fktChr04 = fktChr04;
	}

	public Double getFktDec01() {
		return this.fktDec01;
	}

	public void setFktDec01(Double fktDec01) {
		this.fktDec01 = fktDec01;
	}

	public Double getFktDec02() {
		return this.fktDec02;
	}

	public void setFktDec02(Double fktDec02) {
		this.fktDec02 = fktDec02;
	}

	public Double getFktDec03() {
		return this.fktDec03;
	}

	public void setFktDec03(Double fktDec03) {
		this.fktDec03 = fktDec03;
	}

	public Date getFktDte01() {
		return this.fktDte01;
	}

	public void setFktDte01(Date fktDte01) {
		this.fktDte01 = fktDte01;
	}

	public Date getFktDte02() {
		return this.fktDte02;
	}

	public void setFktDte02(Date fktDte02) {
		this.fktDte02 = fktDte02;
	}

	public Date getFktDte03() {
		return this.fktDte03;
	}

	public void setFktDte03(Date fktDte03) {
		this.fktDte03 = fktDte03;
	}

	public Boolean getFktLog01() {
		return this.fktLog01;
	}

	public void setFktLog01(Boolean fktLog01) {
		this.fktLog01 = fktLog01;
	}

	public Boolean getFktLog02() {
		return this.fktLog02;
	}

	public void setFktLog02(Boolean fktLog02) {
		this.fktLog02 = fktLog02;
	}

	public Boolean getFktLog03() {
		return this.fktLog03;
	}

	public void setFktLog03(Boolean fktLog03) {
		this.fktLog03 = fktLog03;
	}

	public String getFktQadc01() {
		return this.fktQadc01;
	}

	public void setFktQadc01(String fktQadc01) {
		this.fktQadc01 = fktQadc01;
	}

	public String getFktQadc02() {
		return this.fktQadc02;
	}

	public void setFktQadc02(String fktQadc02) {
		this.fktQadc02 = fktQadc02;
	}

	public String getFktQadc03() {
		return this.fktQadc03;
	}

	public void setFktQadc03(String fktQadc03) {
		this.fktQadc03 = fktQadc03;
	}

	public String getFktQadc04() {
		return this.fktQadc04;
	}

	public void setFktQadc04(String fktQadc04) {
		this.fktQadc04 = fktQadc04;
	}

	public Date getFktQadd01() {
		return this.fktQadd01;
	}

	public void setFktQadd01(Date fktQadd01) {
		this.fktQadd01 = fktQadd01;
	}

	public Date getFktQadd02() {
		return this.fktQadd02;
	}

	public void setFktQadd02(Date fktQadd02) {
		this.fktQadd02 = fktQadd02;
	}

	public Date getFktQadd03() {
		return this.fktQadd03;
	}

	public void setFktQadd03(Date fktQadd03) {
		this.fktQadd03 = fktQadd03;
	}

	public Double getFktQadde01() {
		return this.fktQadde01;
	}

	public void setFktQadde01(Double fktQadde01) {
		this.fktQadde01 = fktQadde01;
	}

	public Double getFktQadde02() {
		return this.fktQadde02;
	}

	public void setFktQadde02(Double fktQadde02) {
		this.fktQadde02 = fktQadde02;
	}

	public Double getFktQadde03() {
		return this.fktQadde03;
	}

	public void setFktQadde03(Double fktQadde03) {
		this.fktQadde03 = fktQadde03;
	}

	public Boolean getFktQadl01() {
		return this.fktQadl01;
	}

	public void setFktQadl01(Boolean fktQadl01) {
		this.fktQadl01 = fktQadl01;
	}

	public Boolean getFktQadl02() {
		return this.fktQadl02;
	}

	public void setFktQadl02(Boolean fktQadl02) {
		this.fktQadl02 = fktQadl02;
	}

	public Boolean getFktQadl03() {
		return this.fktQadl03;
	}

	public void setFktQadl03(Boolean fktQadl03) {
		this.fktQadl03 = fktQadl03;
	}

	public Date getFktEffDate() {
		return this.fktEffDate;
	}

	public void setFktEffDate(Date fktEffDate) {
		this.fktEffDate = fktEffDate;
	}

	public String getFktModUserid() {
		return this.fktModUserid;
	}

	public void setFktModUserid(String fktModUserid) {
		this.fktModUserid = fktModUserid;
	}

	public String getFktUser1() {
		return this.fktUser1;
	}

	public void setFktUser1(String fktUser1) {
		this.fktUser1 = fktUser1;
	}

	public String getFktUser2() {
		return this.fktUser2;
	}

	public void setFktUser2(String fktUser2) {
		this.fktUser2 = fktUser2;
	}

	public Double getOidFktMstr() {
		return this.oidFktMstr;
	}

	public void setOidFktMstr(Double oidFktMstr) {
		this.oidFktMstr = oidFktMstr;
	}

}