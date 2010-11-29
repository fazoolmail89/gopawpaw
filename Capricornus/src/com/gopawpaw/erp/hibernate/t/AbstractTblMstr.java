package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTblMstr entity provides the base persistence definition of the
 * TblMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTblMstr implements java.io.Serializable {

	// Fields

	private TblMstrId id;
	private Date tblStart;
	private Date tblEnd;
	private String tblRef;
	private String tblRmks;
	private String tblUser1;
	private String tblUser2;
	private String tblChr01;
	private String tblChr02;
	private String tblChr03;
	private String tblChr04;
	private String tblChr05;
	private Date tblDte01;
	private Date tblDte02;
	private Double tblDec01;
	private Double tblDec02;
	private Boolean tblLog01;
	private Boolean tblLog02;
	private String tblQadc01;
	private String tblQadc02;
	private Date tblQadd01;
	private Date tblQadd02;
	private Double tblQadde01;
	private Double tblQadde02;
	private Boolean tblQadl01;
	private Boolean tblQadl02;
	private String tblModUserid;
	private Date tblModDate;
	private Double oidTblMstr;

	// Constructors

	/** default constructor */
	public AbstractTblMstr() {
	}

	/** minimal constructor */
	public AbstractTblMstr(TblMstrId id, Double oidTblMstr) {
		this.id = id;
		this.oidTblMstr = oidTblMstr;
	}

	/** full constructor */
	public AbstractTblMstr(TblMstrId id, Date tblStart, Date tblEnd,
			String tblRef, String tblRmks, String tblUser1, String tblUser2,
			String tblChr01, String tblChr02, String tblChr03, String tblChr04,
			String tblChr05, Date tblDte01, Date tblDte02, Double tblDec01,
			Double tblDec02, Boolean tblLog01, Boolean tblLog02,
			String tblQadc01, String tblQadc02, Date tblQadd01, Date tblQadd02,
			Double tblQadde01, Double tblQadde02, Boolean tblQadl01,
			Boolean tblQadl02, String tblModUserid, Date tblModDate,
			Double oidTblMstr) {
		this.id = id;
		this.tblStart = tblStart;
		this.tblEnd = tblEnd;
		this.tblRef = tblRef;
		this.tblRmks = tblRmks;
		this.tblUser1 = tblUser1;
		this.tblUser2 = tblUser2;
		this.tblChr01 = tblChr01;
		this.tblChr02 = tblChr02;
		this.tblChr03 = tblChr03;
		this.tblChr04 = tblChr04;
		this.tblChr05 = tblChr05;
		this.tblDte01 = tblDte01;
		this.tblDte02 = tblDte02;
		this.tblDec01 = tblDec01;
		this.tblDec02 = tblDec02;
		this.tblLog01 = tblLog01;
		this.tblLog02 = tblLog02;
		this.tblQadc01 = tblQadc01;
		this.tblQadc02 = tblQadc02;
		this.tblQadd01 = tblQadd01;
		this.tblQadd02 = tblQadd02;
		this.tblQadde01 = tblQadde01;
		this.tblQadde02 = tblQadde02;
		this.tblQadl01 = tblQadl01;
		this.tblQadl02 = tblQadl02;
		this.tblModUserid = tblModUserid;
		this.tblModDate = tblModDate;
		this.oidTblMstr = oidTblMstr;
	}

	// Property accessors

	public TblMstrId getId() {
		return this.id;
	}

	public void setId(TblMstrId id) {
		this.id = id;
	}

	public Date getTblStart() {
		return this.tblStart;
	}

	public void setTblStart(Date tblStart) {
		this.tblStart = tblStart;
	}

	public Date getTblEnd() {
		return this.tblEnd;
	}

	public void setTblEnd(Date tblEnd) {
		this.tblEnd = tblEnd;
	}

	public String getTblRef() {
		return this.tblRef;
	}

	public void setTblRef(String tblRef) {
		this.tblRef = tblRef;
	}

	public String getTblRmks() {
		return this.tblRmks;
	}

	public void setTblRmks(String tblRmks) {
		this.tblRmks = tblRmks;
	}

	public String getTblUser1() {
		return this.tblUser1;
	}

	public void setTblUser1(String tblUser1) {
		this.tblUser1 = tblUser1;
	}

	public String getTblUser2() {
		return this.tblUser2;
	}

	public void setTblUser2(String tblUser2) {
		this.tblUser2 = tblUser2;
	}

	public String getTblChr01() {
		return this.tblChr01;
	}

	public void setTblChr01(String tblChr01) {
		this.tblChr01 = tblChr01;
	}

	public String getTblChr02() {
		return this.tblChr02;
	}

	public void setTblChr02(String tblChr02) {
		this.tblChr02 = tblChr02;
	}

	public String getTblChr03() {
		return this.tblChr03;
	}

	public void setTblChr03(String tblChr03) {
		this.tblChr03 = tblChr03;
	}

	public String getTblChr04() {
		return this.tblChr04;
	}

	public void setTblChr04(String tblChr04) {
		this.tblChr04 = tblChr04;
	}

	public String getTblChr05() {
		return this.tblChr05;
	}

	public void setTblChr05(String tblChr05) {
		this.tblChr05 = tblChr05;
	}

	public Date getTblDte01() {
		return this.tblDte01;
	}

	public void setTblDte01(Date tblDte01) {
		this.tblDte01 = tblDte01;
	}

	public Date getTblDte02() {
		return this.tblDte02;
	}

	public void setTblDte02(Date tblDte02) {
		this.tblDte02 = tblDte02;
	}

	public Double getTblDec01() {
		return this.tblDec01;
	}

	public void setTblDec01(Double tblDec01) {
		this.tblDec01 = tblDec01;
	}

	public Double getTblDec02() {
		return this.tblDec02;
	}

	public void setTblDec02(Double tblDec02) {
		this.tblDec02 = tblDec02;
	}

	public Boolean getTblLog01() {
		return this.tblLog01;
	}

	public void setTblLog01(Boolean tblLog01) {
		this.tblLog01 = tblLog01;
	}

	public Boolean getTblLog02() {
		return this.tblLog02;
	}

	public void setTblLog02(Boolean tblLog02) {
		this.tblLog02 = tblLog02;
	}

	public String getTblQadc01() {
		return this.tblQadc01;
	}

	public void setTblQadc01(String tblQadc01) {
		this.tblQadc01 = tblQadc01;
	}

	public String getTblQadc02() {
		return this.tblQadc02;
	}

	public void setTblQadc02(String tblQadc02) {
		this.tblQadc02 = tblQadc02;
	}

	public Date getTblQadd01() {
		return this.tblQadd01;
	}

	public void setTblQadd01(Date tblQadd01) {
		this.tblQadd01 = tblQadd01;
	}

	public Date getTblQadd02() {
		return this.tblQadd02;
	}

	public void setTblQadd02(Date tblQadd02) {
		this.tblQadd02 = tblQadd02;
	}

	public Double getTblQadde01() {
		return this.tblQadde01;
	}

	public void setTblQadde01(Double tblQadde01) {
		this.tblQadde01 = tblQadde01;
	}

	public Double getTblQadde02() {
		return this.tblQadde02;
	}

	public void setTblQadde02(Double tblQadde02) {
		this.tblQadde02 = tblQadde02;
	}

	public Boolean getTblQadl01() {
		return this.tblQadl01;
	}

	public void setTblQadl01(Boolean tblQadl01) {
		this.tblQadl01 = tblQadl01;
	}

	public Boolean getTblQadl02() {
		return this.tblQadl02;
	}

	public void setTblQadl02(Boolean tblQadl02) {
		this.tblQadl02 = tblQadl02;
	}

	public String getTblModUserid() {
		return this.tblModUserid;
	}

	public void setTblModUserid(String tblModUserid) {
		this.tblModUserid = tblModUserid;
	}

	public Date getTblModDate() {
		return this.tblModDate;
	}

	public void setTblModDate(Date tblModDate) {
		this.tblModDate = tblModDate;
	}

	public Double getOidTblMstr() {
		return this.oidTblMstr;
	}

	public void setOidTblMstr(Double oidTblMstr) {
		this.oidTblMstr = oidTblMstr;
	}

}