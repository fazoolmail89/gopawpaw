package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCasMstr entity provides the base persistence definition of the
 * CasMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCasMstr implements java.io.Serializable {

	// Fields

	private CasMstrId id;
	private String casDesc;
	private Integer casId;
	private String casProg;
	private Boolean casReq;
	private String casNxtStat;
	private String casChr01;
	private String casChr02;
	private Boolean casLog01;
	private Boolean casLog02;
	private Date casDte01;
	private Date casDte02;
	private Double casDec01;
	private Double casDec02;
	private String casChr03;
	private String casUser1;
	private String casUser2;
	private Boolean casField;
	private Boolean casHold;
	private Boolean casReview;
	private Boolean casWait;
	private String casNxtQue;
	private String casQadc01;
	private String casQadc02;
	private Boolean casQadl01;
	private Boolean casQadl02;
	private String casModUserid;
	private Date casModDate;
	private Double oidCasMstr;

	// Constructors

	/** default constructor */
	public AbstractCasMstr() {
	}

	/** minimal constructor */
	public AbstractCasMstr(CasMstrId id, Double oidCasMstr) {
		this.id = id;
		this.oidCasMstr = oidCasMstr;
	}

	/** full constructor */
	public AbstractCasMstr(CasMstrId id, String casDesc, Integer casId,
			String casProg, Boolean casReq, String casNxtStat, String casChr01,
			String casChr02, Boolean casLog01, Boolean casLog02, Date casDte01,
			Date casDte02, Double casDec01, Double casDec02, String casChr03,
			String casUser1, String casUser2, Boolean casField,
			Boolean casHold, Boolean casReview, Boolean casWait,
			String casNxtQue, String casQadc01, String casQadc02,
			Boolean casQadl01, Boolean casQadl02, String casModUserid,
			Date casModDate, Double oidCasMstr) {
		this.id = id;
		this.casDesc = casDesc;
		this.casId = casId;
		this.casProg = casProg;
		this.casReq = casReq;
		this.casNxtStat = casNxtStat;
		this.casChr01 = casChr01;
		this.casChr02 = casChr02;
		this.casLog01 = casLog01;
		this.casLog02 = casLog02;
		this.casDte01 = casDte01;
		this.casDte02 = casDte02;
		this.casDec01 = casDec01;
		this.casDec02 = casDec02;
		this.casChr03 = casChr03;
		this.casUser1 = casUser1;
		this.casUser2 = casUser2;
		this.casField = casField;
		this.casHold = casHold;
		this.casReview = casReview;
		this.casWait = casWait;
		this.casNxtQue = casNxtQue;
		this.casQadc01 = casQadc01;
		this.casQadc02 = casQadc02;
		this.casQadl01 = casQadl01;
		this.casQadl02 = casQadl02;
		this.casModUserid = casModUserid;
		this.casModDate = casModDate;
		this.oidCasMstr = oidCasMstr;
	}

	// Property accessors

	public CasMstrId getId() {
		return this.id;
	}

	public void setId(CasMstrId id) {
		this.id = id;
	}

	public String getCasDesc() {
		return this.casDesc;
	}

	public void setCasDesc(String casDesc) {
		this.casDesc = casDesc;
	}

	public Integer getCasId() {
		return this.casId;
	}

	public void setCasId(Integer casId) {
		this.casId = casId;
	}

	public String getCasProg() {
		return this.casProg;
	}

	public void setCasProg(String casProg) {
		this.casProg = casProg;
	}

	public Boolean getCasReq() {
		return this.casReq;
	}

	public void setCasReq(Boolean casReq) {
		this.casReq = casReq;
	}

	public String getCasNxtStat() {
		return this.casNxtStat;
	}

	public void setCasNxtStat(String casNxtStat) {
		this.casNxtStat = casNxtStat;
	}

	public String getCasChr01() {
		return this.casChr01;
	}

	public void setCasChr01(String casChr01) {
		this.casChr01 = casChr01;
	}

	public String getCasChr02() {
		return this.casChr02;
	}

	public void setCasChr02(String casChr02) {
		this.casChr02 = casChr02;
	}

	public Boolean getCasLog01() {
		return this.casLog01;
	}

	public void setCasLog01(Boolean casLog01) {
		this.casLog01 = casLog01;
	}

	public Boolean getCasLog02() {
		return this.casLog02;
	}

	public void setCasLog02(Boolean casLog02) {
		this.casLog02 = casLog02;
	}

	public Date getCasDte01() {
		return this.casDte01;
	}

	public void setCasDte01(Date casDte01) {
		this.casDte01 = casDte01;
	}

	public Date getCasDte02() {
		return this.casDte02;
	}

	public void setCasDte02(Date casDte02) {
		this.casDte02 = casDte02;
	}

	public Double getCasDec01() {
		return this.casDec01;
	}

	public void setCasDec01(Double casDec01) {
		this.casDec01 = casDec01;
	}

	public Double getCasDec02() {
		return this.casDec02;
	}

	public void setCasDec02(Double casDec02) {
		this.casDec02 = casDec02;
	}

	public String getCasChr03() {
		return this.casChr03;
	}

	public void setCasChr03(String casChr03) {
		this.casChr03 = casChr03;
	}

	public String getCasUser1() {
		return this.casUser1;
	}

	public void setCasUser1(String casUser1) {
		this.casUser1 = casUser1;
	}

	public String getCasUser2() {
		return this.casUser2;
	}

	public void setCasUser2(String casUser2) {
		this.casUser2 = casUser2;
	}

	public Boolean getCasField() {
		return this.casField;
	}

	public void setCasField(Boolean casField) {
		this.casField = casField;
	}

	public Boolean getCasHold() {
		return this.casHold;
	}

	public void setCasHold(Boolean casHold) {
		this.casHold = casHold;
	}

	public Boolean getCasReview() {
		return this.casReview;
	}

	public void setCasReview(Boolean casReview) {
		this.casReview = casReview;
	}

	public Boolean getCasWait() {
		return this.casWait;
	}

	public void setCasWait(Boolean casWait) {
		this.casWait = casWait;
	}

	public String getCasNxtQue() {
		return this.casNxtQue;
	}

	public void setCasNxtQue(String casNxtQue) {
		this.casNxtQue = casNxtQue;
	}

	public String getCasQadc01() {
		return this.casQadc01;
	}

	public void setCasQadc01(String casQadc01) {
		this.casQadc01 = casQadc01;
	}

	public String getCasQadc02() {
		return this.casQadc02;
	}

	public void setCasQadc02(String casQadc02) {
		this.casQadc02 = casQadc02;
	}

	public Boolean getCasQadl01() {
		return this.casQadl01;
	}

	public void setCasQadl01(Boolean casQadl01) {
		this.casQadl01 = casQadl01;
	}

	public Boolean getCasQadl02() {
		return this.casQadl02;
	}

	public void setCasQadl02(Boolean casQadl02) {
		this.casQadl02 = casQadl02;
	}

	public String getCasModUserid() {
		return this.casModUserid;
	}

	public void setCasModUserid(String casModUserid) {
		this.casModUserid = casModUserid;
	}

	public Date getCasModDate() {
		return this.casModDate;
	}

	public void setCasModDate(Date casModDate) {
		this.casModDate = casModDate;
	}

	public Double getOidCasMstr() {
		return this.oidCasMstr;
	}

	public void setOidCasMstr(Double oidCasMstr) {
		this.oidCasMstr = oidCasMstr;
	}

}