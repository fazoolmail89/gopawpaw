package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBomMstr entity provides the base persistence definition of the
 * BomMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBomMstr implements java.io.Serializable {

	// Fields

	private BomMstrId id;
	private String bomDesc;
	private Double bomBatch;
	private String bomBatchUm;
	private Integer bomCmtindx;
	private Integer bomLlCode;
	private String bomUser1;
	private String bomUser2;
	private String bomUserid;
	private Date bomModDate;
	private String bomChr01;
	private String bomChr02;
	private String bomChr03;
	private String bomChr04;
	private String bomChr05;
	private Date bomDte01;
	private Date bomDte02;
	private Double bomDec01;
	private Double bomDec02;
	private Boolean bomLog01;
	private Boolean bomFormula;
	private String bomMthd;
	private String bomFsmType;
	private String bomSite;
	private String bomLoc;
	private String bomQadc01;
	private String bomQadc02;
	private String bomQadc03;
	private Double bomQadd01;
	private Integer bomQadi01;
	private Integer bomQadi02;
	private Date bomQadt01;
	private Date bomQadt02;
	private Boolean bomQadl01;
	private Boolean bomQadl02;
	private String bomMthdQtycompl;
	private Double oidBomMstr;

	// Constructors

	/** default constructor */
	public AbstractBomMstr() {
	}

	/** minimal constructor */
	public AbstractBomMstr(BomMstrId id, String bomBatchUm, String bomMthd,
			Double oidBomMstr) {
		this.id = id;
		this.bomBatchUm = bomBatchUm;
		this.bomMthd = bomMthd;
		this.oidBomMstr = oidBomMstr;
	}

	/** full constructor */
	public AbstractBomMstr(BomMstrId id, String bomDesc, Double bomBatch,
			String bomBatchUm, Integer bomCmtindx, Integer bomLlCode,
			String bomUser1, String bomUser2, String bomUserid,
			Date bomModDate, String bomChr01, String bomChr02, String bomChr03,
			String bomChr04, String bomChr05, Date bomDte01, Date bomDte02,
			Double bomDec01, Double bomDec02, Boolean bomLog01,
			Boolean bomFormula, String bomMthd, String bomFsmType,
			String bomSite, String bomLoc, String bomQadc01, String bomQadc02,
			String bomQadc03, Double bomQadd01, Integer bomQadi01,
			Integer bomQadi02, Date bomQadt01, Date bomQadt02,
			Boolean bomQadl01, Boolean bomQadl02, String bomMthdQtycompl,
			Double oidBomMstr) {
		this.id = id;
		this.bomDesc = bomDesc;
		this.bomBatch = bomBatch;
		this.bomBatchUm = bomBatchUm;
		this.bomCmtindx = bomCmtindx;
		this.bomLlCode = bomLlCode;
		this.bomUser1 = bomUser1;
		this.bomUser2 = bomUser2;
		this.bomUserid = bomUserid;
		this.bomModDate = bomModDate;
		this.bomChr01 = bomChr01;
		this.bomChr02 = bomChr02;
		this.bomChr03 = bomChr03;
		this.bomChr04 = bomChr04;
		this.bomChr05 = bomChr05;
		this.bomDte01 = bomDte01;
		this.bomDte02 = bomDte02;
		this.bomDec01 = bomDec01;
		this.bomDec02 = bomDec02;
		this.bomLog01 = bomLog01;
		this.bomFormula = bomFormula;
		this.bomMthd = bomMthd;
		this.bomFsmType = bomFsmType;
		this.bomSite = bomSite;
		this.bomLoc = bomLoc;
		this.bomQadc01 = bomQadc01;
		this.bomQadc02 = bomQadc02;
		this.bomQadc03 = bomQadc03;
		this.bomQadd01 = bomQadd01;
		this.bomQadi01 = bomQadi01;
		this.bomQadi02 = bomQadi02;
		this.bomQadt01 = bomQadt01;
		this.bomQadt02 = bomQadt02;
		this.bomQadl01 = bomQadl01;
		this.bomQadl02 = bomQadl02;
		this.bomMthdQtycompl = bomMthdQtycompl;
		this.oidBomMstr = oidBomMstr;
	}

	// Property accessors

	public BomMstrId getId() {
		return this.id;
	}

	public void setId(BomMstrId id) {
		this.id = id;
	}

	public String getBomDesc() {
		return this.bomDesc;
	}

	public void setBomDesc(String bomDesc) {
		this.bomDesc = bomDesc;
	}

	public Double getBomBatch() {
		return this.bomBatch;
	}

	public void setBomBatch(Double bomBatch) {
		this.bomBatch = bomBatch;
	}

	public String getBomBatchUm() {
		return this.bomBatchUm;
	}

	public void setBomBatchUm(String bomBatchUm) {
		this.bomBatchUm = bomBatchUm;
	}

	public Integer getBomCmtindx() {
		return this.bomCmtindx;
	}

	public void setBomCmtindx(Integer bomCmtindx) {
		this.bomCmtindx = bomCmtindx;
	}

	public Integer getBomLlCode() {
		return this.bomLlCode;
	}

	public void setBomLlCode(Integer bomLlCode) {
		this.bomLlCode = bomLlCode;
	}

	public String getBomUser1() {
		return this.bomUser1;
	}

	public void setBomUser1(String bomUser1) {
		this.bomUser1 = bomUser1;
	}

	public String getBomUser2() {
		return this.bomUser2;
	}

	public void setBomUser2(String bomUser2) {
		this.bomUser2 = bomUser2;
	}

	public String getBomUserid() {
		return this.bomUserid;
	}

	public void setBomUserid(String bomUserid) {
		this.bomUserid = bomUserid;
	}

	public Date getBomModDate() {
		return this.bomModDate;
	}

	public void setBomModDate(Date bomModDate) {
		this.bomModDate = bomModDate;
	}

	public String getBomChr01() {
		return this.bomChr01;
	}

	public void setBomChr01(String bomChr01) {
		this.bomChr01 = bomChr01;
	}

	public String getBomChr02() {
		return this.bomChr02;
	}

	public void setBomChr02(String bomChr02) {
		this.bomChr02 = bomChr02;
	}

	public String getBomChr03() {
		return this.bomChr03;
	}

	public void setBomChr03(String bomChr03) {
		this.bomChr03 = bomChr03;
	}

	public String getBomChr04() {
		return this.bomChr04;
	}

	public void setBomChr04(String bomChr04) {
		this.bomChr04 = bomChr04;
	}

	public String getBomChr05() {
		return this.bomChr05;
	}

	public void setBomChr05(String bomChr05) {
		this.bomChr05 = bomChr05;
	}

	public Date getBomDte01() {
		return this.bomDte01;
	}

	public void setBomDte01(Date bomDte01) {
		this.bomDte01 = bomDte01;
	}

	public Date getBomDte02() {
		return this.bomDte02;
	}

	public void setBomDte02(Date bomDte02) {
		this.bomDte02 = bomDte02;
	}

	public Double getBomDec01() {
		return this.bomDec01;
	}

	public void setBomDec01(Double bomDec01) {
		this.bomDec01 = bomDec01;
	}

	public Double getBomDec02() {
		return this.bomDec02;
	}

	public void setBomDec02(Double bomDec02) {
		this.bomDec02 = bomDec02;
	}

	public Boolean getBomLog01() {
		return this.bomLog01;
	}

	public void setBomLog01(Boolean bomLog01) {
		this.bomLog01 = bomLog01;
	}

	public Boolean getBomFormula() {
		return this.bomFormula;
	}

	public void setBomFormula(Boolean bomFormula) {
		this.bomFormula = bomFormula;
	}

	public String getBomMthd() {
		return this.bomMthd;
	}

	public void setBomMthd(String bomMthd) {
		this.bomMthd = bomMthd;
	}

	public String getBomFsmType() {
		return this.bomFsmType;
	}

	public void setBomFsmType(String bomFsmType) {
		this.bomFsmType = bomFsmType;
	}

	public String getBomSite() {
		return this.bomSite;
	}

	public void setBomSite(String bomSite) {
		this.bomSite = bomSite;
	}

	public String getBomLoc() {
		return this.bomLoc;
	}

	public void setBomLoc(String bomLoc) {
		this.bomLoc = bomLoc;
	}

	public String getBomQadc01() {
		return this.bomQadc01;
	}

	public void setBomQadc01(String bomQadc01) {
		this.bomQadc01 = bomQadc01;
	}

	public String getBomQadc02() {
		return this.bomQadc02;
	}

	public void setBomQadc02(String bomQadc02) {
		this.bomQadc02 = bomQadc02;
	}

	public String getBomQadc03() {
		return this.bomQadc03;
	}

	public void setBomQadc03(String bomQadc03) {
		this.bomQadc03 = bomQadc03;
	}

	public Double getBomQadd01() {
		return this.bomQadd01;
	}

	public void setBomQadd01(Double bomQadd01) {
		this.bomQadd01 = bomQadd01;
	}

	public Integer getBomQadi01() {
		return this.bomQadi01;
	}

	public void setBomQadi01(Integer bomQadi01) {
		this.bomQadi01 = bomQadi01;
	}

	public Integer getBomQadi02() {
		return this.bomQadi02;
	}

	public void setBomQadi02(Integer bomQadi02) {
		this.bomQadi02 = bomQadi02;
	}

	public Date getBomQadt01() {
		return this.bomQadt01;
	}

	public void setBomQadt01(Date bomQadt01) {
		this.bomQadt01 = bomQadt01;
	}

	public Date getBomQadt02() {
		return this.bomQadt02;
	}

	public void setBomQadt02(Date bomQadt02) {
		this.bomQadt02 = bomQadt02;
	}

	public Boolean getBomQadl01() {
		return this.bomQadl01;
	}

	public void setBomQadl01(Boolean bomQadl01) {
		this.bomQadl01 = bomQadl01;
	}

	public Boolean getBomQadl02() {
		return this.bomQadl02;
	}

	public void setBomQadl02(Boolean bomQadl02) {
		this.bomQadl02 = bomQadl02;
	}

	public String getBomMthdQtycompl() {
		return this.bomMthdQtycompl;
	}

	public void setBomMthdQtycompl(String bomMthdQtycompl) {
		this.bomMthdQtycompl = bomMthdQtycompl;
	}

	public Double getOidBomMstr() {
		return this.oidBomMstr;
	}

	public void setOidBomMstr(Double oidBomMstr) {
		this.oidBomMstr = oidBomMstr;
	}

}