package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPjtMstr entity provides the base persistence definition of the
 * PjtMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjtMstr implements java.io.Serializable {

	// Fields

	private PjtMstrId id;
	private String pjtCaIntType;
	private Integer pjtCmtindx;
	private String pjtDesc;
	private Integer pjtPriority;
	private String pjtProdLine;
	private String pjtPrList;
	private Boolean pjtTaxable;
	private String pjtTaxc;
	private Date pjtModDate;
	private String pjtModUserid;
	private String pjtUser1;
	private String pjtUser2;
	private String pjtQadc01;
	private Double pjtQadd01;
	private Integer pjtQadi01;
	private Boolean pjtQadl01;
	private Date pjtQadt01;
	private Double oidPjtMstr;

	// Constructors

	/** default constructor */
	public AbstractPjtMstr() {
	}

	/** minimal constructor */
	public AbstractPjtMstr(PjtMstrId id, String pjtCaIntType,
			Integer pjtCmtindx, String pjtDesc, Integer pjtPriority,
			String pjtProdLine, String pjtPrList, Boolean pjtTaxable,
			String pjtTaxc, Date pjtModDate, String pjtModUserid,
			Double oidPjtMstr) {
		this.id = id;
		this.pjtCaIntType = pjtCaIntType;
		this.pjtCmtindx = pjtCmtindx;
		this.pjtDesc = pjtDesc;
		this.pjtPriority = pjtPriority;
		this.pjtProdLine = pjtProdLine;
		this.pjtPrList = pjtPrList;
		this.pjtTaxable = pjtTaxable;
		this.pjtTaxc = pjtTaxc;
		this.pjtModDate = pjtModDate;
		this.pjtModUserid = pjtModUserid;
		this.oidPjtMstr = oidPjtMstr;
	}

	/** full constructor */
	public AbstractPjtMstr(PjtMstrId id, String pjtCaIntType,
			Integer pjtCmtindx, String pjtDesc, Integer pjtPriority,
			String pjtProdLine, String pjtPrList, Boolean pjtTaxable,
			String pjtTaxc, Date pjtModDate, String pjtModUserid,
			String pjtUser1, String pjtUser2, String pjtQadc01,
			Double pjtQadd01, Integer pjtQadi01, Boolean pjtQadl01,
			Date pjtQadt01, Double oidPjtMstr) {
		this.id = id;
		this.pjtCaIntType = pjtCaIntType;
		this.pjtCmtindx = pjtCmtindx;
		this.pjtDesc = pjtDesc;
		this.pjtPriority = pjtPriority;
		this.pjtProdLine = pjtProdLine;
		this.pjtPrList = pjtPrList;
		this.pjtTaxable = pjtTaxable;
		this.pjtTaxc = pjtTaxc;
		this.pjtModDate = pjtModDate;
		this.pjtModUserid = pjtModUserid;
		this.pjtUser1 = pjtUser1;
		this.pjtUser2 = pjtUser2;
		this.pjtQadc01 = pjtQadc01;
		this.pjtQadd01 = pjtQadd01;
		this.pjtQadi01 = pjtQadi01;
		this.pjtQadl01 = pjtQadl01;
		this.pjtQadt01 = pjtQadt01;
		this.oidPjtMstr = oidPjtMstr;
	}

	// Property accessors

	public PjtMstrId getId() {
		return this.id;
	}

	public void setId(PjtMstrId id) {
		this.id = id;
	}

	public String getPjtCaIntType() {
		return this.pjtCaIntType;
	}

	public void setPjtCaIntType(String pjtCaIntType) {
		this.pjtCaIntType = pjtCaIntType;
	}

	public Integer getPjtCmtindx() {
		return this.pjtCmtindx;
	}

	public void setPjtCmtindx(Integer pjtCmtindx) {
		this.pjtCmtindx = pjtCmtindx;
	}

	public String getPjtDesc() {
		return this.pjtDesc;
	}

	public void setPjtDesc(String pjtDesc) {
		this.pjtDesc = pjtDesc;
	}

	public Integer getPjtPriority() {
		return this.pjtPriority;
	}

	public void setPjtPriority(Integer pjtPriority) {
		this.pjtPriority = pjtPriority;
	}

	public String getPjtProdLine() {
		return this.pjtProdLine;
	}

	public void setPjtProdLine(String pjtProdLine) {
		this.pjtProdLine = pjtProdLine;
	}

	public String getPjtPrList() {
		return this.pjtPrList;
	}

	public void setPjtPrList(String pjtPrList) {
		this.pjtPrList = pjtPrList;
	}

	public Boolean getPjtTaxable() {
		return this.pjtTaxable;
	}

	public void setPjtTaxable(Boolean pjtTaxable) {
		this.pjtTaxable = pjtTaxable;
	}

	public String getPjtTaxc() {
		return this.pjtTaxc;
	}

	public void setPjtTaxc(String pjtTaxc) {
		this.pjtTaxc = pjtTaxc;
	}

	public Date getPjtModDate() {
		return this.pjtModDate;
	}

	public void setPjtModDate(Date pjtModDate) {
		this.pjtModDate = pjtModDate;
	}

	public String getPjtModUserid() {
		return this.pjtModUserid;
	}

	public void setPjtModUserid(String pjtModUserid) {
		this.pjtModUserid = pjtModUserid;
	}

	public String getPjtUser1() {
		return this.pjtUser1;
	}

	public void setPjtUser1(String pjtUser1) {
		this.pjtUser1 = pjtUser1;
	}

	public String getPjtUser2() {
		return this.pjtUser2;
	}

	public void setPjtUser2(String pjtUser2) {
		this.pjtUser2 = pjtUser2;
	}

	public String getPjtQadc01() {
		return this.pjtQadc01;
	}

	public void setPjtQadc01(String pjtQadc01) {
		this.pjtQadc01 = pjtQadc01;
	}

	public Double getPjtQadd01() {
		return this.pjtQadd01;
	}

	public void setPjtQadd01(Double pjtQadd01) {
		this.pjtQadd01 = pjtQadd01;
	}

	public Integer getPjtQadi01() {
		return this.pjtQadi01;
	}

	public void setPjtQadi01(Integer pjtQadi01) {
		this.pjtQadi01 = pjtQadi01;
	}

	public Boolean getPjtQadl01() {
		return this.pjtQadl01;
	}

	public void setPjtQadl01(Boolean pjtQadl01) {
		this.pjtQadl01 = pjtQadl01;
	}

	public Date getPjtQadt01() {
		return this.pjtQadt01;
	}

	public void setPjtQadt01(Date pjtQadt01) {
		this.pjtQadt01 = pjtQadt01;
	}

	public Double getOidPjtMstr() {
		return this.oidPjtMstr;
	}

	public void setOidPjtMstr(Double oidPjtMstr) {
		this.oidPjtMstr = oidPjtMstr;
	}

}