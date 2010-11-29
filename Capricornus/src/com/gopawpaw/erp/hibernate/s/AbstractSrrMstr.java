package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSrrMstr entity provides the base persistence definition of the
 * SrrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSrrMstr implements java.io.Serializable {

	// Fields

	private SrrMstrId id;
	private Integer srrProbidx;
	private Integer srrResidx;
	private String srrDesc;
	private Date srrDate;
	private String srrUpdate;
	private String srrProblem;
	private String srrType;
	private String srrStarted;
	private String srrChr01;
	private String srrChr02;
	private String srrChr03;
	private String srrChr04;
	private String srrChr05;
	private String srrChr06;
	private String srrChr07;
	private String srrChr08;
	private String srrChr09;
	private String srrChr10;
	private Date srrDte01;
	private Date srrDte02;
	private Double srrDec01;
	private Double srrDec02;
	private Boolean srrLog01;
	private String srrAssign;
	private String srrStatus;
	private String srrCaNbr;
	private String srrSeverity;
	private String srrPart;
	private String srrEuNbr;
	private Integer srrPri;
	private Date srrClsDate;
	private Double srrActHrs;
	private Double srrEstHrs;
	private String srrQue;
	private Date srrTdate;
	private String srrTfix;
	private String srrUser1;
	private String srrUser2;
	private String srrEco;
	private String srrNote;
	private String srrPhone;
	private String srrRequestor;
	private String srrResolution;
	private Double oidSrrMstr;

	// Constructors

	/** default constructor */
	public AbstractSrrMstr() {
	}

	/** minimal constructor */
	public AbstractSrrMstr(SrrMstrId id, Double oidSrrMstr) {
		this.id = id;
		this.oidSrrMstr = oidSrrMstr;
	}

	/** full constructor */
	public AbstractSrrMstr(SrrMstrId id, Integer srrProbidx, Integer srrResidx,
			String srrDesc, Date srrDate, String srrUpdate, String srrProblem,
			String srrType, String srrStarted, String srrChr01,
			String srrChr02, String srrChr03, String srrChr04, String srrChr05,
			String srrChr06, String srrChr07, String srrChr08, String srrChr09,
			String srrChr10, Date srrDte01, Date srrDte02, Double srrDec01,
			Double srrDec02, Boolean srrLog01, String srrAssign,
			String srrStatus, String srrCaNbr, String srrSeverity,
			String srrPart, String srrEuNbr, Integer srrPri, Date srrClsDate,
			Double srrActHrs, Double srrEstHrs, String srrQue, Date srrTdate,
			String srrTfix, String srrUser1, String srrUser2, String srrEco,
			String srrNote, String srrPhone, String srrRequestor,
			String srrResolution, Double oidSrrMstr) {
		this.id = id;
		this.srrProbidx = srrProbidx;
		this.srrResidx = srrResidx;
		this.srrDesc = srrDesc;
		this.srrDate = srrDate;
		this.srrUpdate = srrUpdate;
		this.srrProblem = srrProblem;
		this.srrType = srrType;
		this.srrStarted = srrStarted;
		this.srrChr01 = srrChr01;
		this.srrChr02 = srrChr02;
		this.srrChr03 = srrChr03;
		this.srrChr04 = srrChr04;
		this.srrChr05 = srrChr05;
		this.srrChr06 = srrChr06;
		this.srrChr07 = srrChr07;
		this.srrChr08 = srrChr08;
		this.srrChr09 = srrChr09;
		this.srrChr10 = srrChr10;
		this.srrDte01 = srrDte01;
		this.srrDte02 = srrDte02;
		this.srrDec01 = srrDec01;
		this.srrDec02 = srrDec02;
		this.srrLog01 = srrLog01;
		this.srrAssign = srrAssign;
		this.srrStatus = srrStatus;
		this.srrCaNbr = srrCaNbr;
		this.srrSeverity = srrSeverity;
		this.srrPart = srrPart;
		this.srrEuNbr = srrEuNbr;
		this.srrPri = srrPri;
		this.srrClsDate = srrClsDate;
		this.srrActHrs = srrActHrs;
		this.srrEstHrs = srrEstHrs;
		this.srrQue = srrQue;
		this.srrTdate = srrTdate;
		this.srrTfix = srrTfix;
		this.srrUser1 = srrUser1;
		this.srrUser2 = srrUser2;
		this.srrEco = srrEco;
		this.srrNote = srrNote;
		this.srrPhone = srrPhone;
		this.srrRequestor = srrRequestor;
		this.srrResolution = srrResolution;
		this.oidSrrMstr = oidSrrMstr;
	}

	// Property accessors

	public SrrMstrId getId() {
		return this.id;
	}

	public void setId(SrrMstrId id) {
		this.id = id;
	}

	public Integer getSrrProbidx() {
		return this.srrProbidx;
	}

	public void setSrrProbidx(Integer srrProbidx) {
		this.srrProbidx = srrProbidx;
	}

	public Integer getSrrResidx() {
		return this.srrResidx;
	}

	public void setSrrResidx(Integer srrResidx) {
		this.srrResidx = srrResidx;
	}

	public String getSrrDesc() {
		return this.srrDesc;
	}

	public void setSrrDesc(String srrDesc) {
		this.srrDesc = srrDesc;
	}

	public Date getSrrDate() {
		return this.srrDate;
	}

	public void setSrrDate(Date srrDate) {
		this.srrDate = srrDate;
	}

	public String getSrrUpdate() {
		return this.srrUpdate;
	}

	public void setSrrUpdate(String srrUpdate) {
		this.srrUpdate = srrUpdate;
	}

	public String getSrrProblem() {
		return this.srrProblem;
	}

	public void setSrrProblem(String srrProblem) {
		this.srrProblem = srrProblem;
	}

	public String getSrrType() {
		return this.srrType;
	}

	public void setSrrType(String srrType) {
		this.srrType = srrType;
	}

	public String getSrrStarted() {
		return this.srrStarted;
	}

	public void setSrrStarted(String srrStarted) {
		this.srrStarted = srrStarted;
	}

	public String getSrrChr01() {
		return this.srrChr01;
	}

	public void setSrrChr01(String srrChr01) {
		this.srrChr01 = srrChr01;
	}

	public String getSrrChr02() {
		return this.srrChr02;
	}

	public void setSrrChr02(String srrChr02) {
		this.srrChr02 = srrChr02;
	}

	public String getSrrChr03() {
		return this.srrChr03;
	}

	public void setSrrChr03(String srrChr03) {
		this.srrChr03 = srrChr03;
	}

	public String getSrrChr04() {
		return this.srrChr04;
	}

	public void setSrrChr04(String srrChr04) {
		this.srrChr04 = srrChr04;
	}

	public String getSrrChr05() {
		return this.srrChr05;
	}

	public void setSrrChr05(String srrChr05) {
		this.srrChr05 = srrChr05;
	}

	public String getSrrChr06() {
		return this.srrChr06;
	}

	public void setSrrChr06(String srrChr06) {
		this.srrChr06 = srrChr06;
	}

	public String getSrrChr07() {
		return this.srrChr07;
	}

	public void setSrrChr07(String srrChr07) {
		this.srrChr07 = srrChr07;
	}

	public String getSrrChr08() {
		return this.srrChr08;
	}

	public void setSrrChr08(String srrChr08) {
		this.srrChr08 = srrChr08;
	}

	public String getSrrChr09() {
		return this.srrChr09;
	}

	public void setSrrChr09(String srrChr09) {
		this.srrChr09 = srrChr09;
	}

	public String getSrrChr10() {
		return this.srrChr10;
	}

	public void setSrrChr10(String srrChr10) {
		this.srrChr10 = srrChr10;
	}

	public Date getSrrDte01() {
		return this.srrDte01;
	}

	public void setSrrDte01(Date srrDte01) {
		this.srrDte01 = srrDte01;
	}

	public Date getSrrDte02() {
		return this.srrDte02;
	}

	public void setSrrDte02(Date srrDte02) {
		this.srrDte02 = srrDte02;
	}

	public Double getSrrDec01() {
		return this.srrDec01;
	}

	public void setSrrDec01(Double srrDec01) {
		this.srrDec01 = srrDec01;
	}

	public Double getSrrDec02() {
		return this.srrDec02;
	}

	public void setSrrDec02(Double srrDec02) {
		this.srrDec02 = srrDec02;
	}

	public Boolean getSrrLog01() {
		return this.srrLog01;
	}

	public void setSrrLog01(Boolean srrLog01) {
		this.srrLog01 = srrLog01;
	}

	public String getSrrAssign() {
		return this.srrAssign;
	}

	public void setSrrAssign(String srrAssign) {
		this.srrAssign = srrAssign;
	}

	public String getSrrStatus() {
		return this.srrStatus;
	}

	public void setSrrStatus(String srrStatus) {
		this.srrStatus = srrStatus;
	}

	public String getSrrCaNbr() {
		return this.srrCaNbr;
	}

	public void setSrrCaNbr(String srrCaNbr) {
		this.srrCaNbr = srrCaNbr;
	}

	public String getSrrSeverity() {
		return this.srrSeverity;
	}

	public void setSrrSeverity(String srrSeverity) {
		this.srrSeverity = srrSeverity;
	}

	public String getSrrPart() {
		return this.srrPart;
	}

	public void setSrrPart(String srrPart) {
		this.srrPart = srrPart;
	}

	public String getSrrEuNbr() {
		return this.srrEuNbr;
	}

	public void setSrrEuNbr(String srrEuNbr) {
		this.srrEuNbr = srrEuNbr;
	}

	public Integer getSrrPri() {
		return this.srrPri;
	}

	public void setSrrPri(Integer srrPri) {
		this.srrPri = srrPri;
	}

	public Date getSrrClsDate() {
		return this.srrClsDate;
	}

	public void setSrrClsDate(Date srrClsDate) {
		this.srrClsDate = srrClsDate;
	}

	public Double getSrrActHrs() {
		return this.srrActHrs;
	}

	public void setSrrActHrs(Double srrActHrs) {
		this.srrActHrs = srrActHrs;
	}

	public Double getSrrEstHrs() {
		return this.srrEstHrs;
	}

	public void setSrrEstHrs(Double srrEstHrs) {
		this.srrEstHrs = srrEstHrs;
	}

	public String getSrrQue() {
		return this.srrQue;
	}

	public void setSrrQue(String srrQue) {
		this.srrQue = srrQue;
	}

	public Date getSrrTdate() {
		return this.srrTdate;
	}

	public void setSrrTdate(Date srrTdate) {
		this.srrTdate = srrTdate;
	}

	public String getSrrTfix() {
		return this.srrTfix;
	}

	public void setSrrTfix(String srrTfix) {
		this.srrTfix = srrTfix;
	}

	public String getSrrUser1() {
		return this.srrUser1;
	}

	public void setSrrUser1(String srrUser1) {
		this.srrUser1 = srrUser1;
	}

	public String getSrrUser2() {
		return this.srrUser2;
	}

	public void setSrrUser2(String srrUser2) {
		this.srrUser2 = srrUser2;
	}

	public String getSrrEco() {
		return this.srrEco;
	}

	public void setSrrEco(String srrEco) {
		this.srrEco = srrEco;
	}

	public String getSrrNote() {
		return this.srrNote;
	}

	public void setSrrNote(String srrNote) {
		this.srrNote = srrNote;
	}

	public String getSrrPhone() {
		return this.srrPhone;
	}

	public void setSrrPhone(String srrPhone) {
		this.srrPhone = srrPhone;
	}

	public String getSrrRequestor() {
		return this.srrRequestor;
	}

	public void setSrrRequestor(String srrRequestor) {
		this.srrRequestor = srrRequestor;
	}

	public String getSrrResolution() {
		return this.srrResolution;
	}

	public void setSrrResolution(String srrResolution) {
		this.srrResolution = srrResolution;
	}

	public Double getOidSrrMstr() {
		return this.oidSrrMstr;
	}

	public void setOidSrrMstr(Double oidSrrMstr) {
		this.oidSrrMstr = oidSrrMstr;
	}

}