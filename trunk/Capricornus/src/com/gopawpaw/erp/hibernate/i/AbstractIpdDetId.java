package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIpdDetId entity provides the base persistence definition of the
 * IpdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIpdDetId implements java.io.Serializable {

	// Fields

	private String ipdPart;
	private String ipdRouting;
	private Integer ipdOp;
	private String ipdNbr;
	private String ipdTest;
	private String ipdLabel;
	private String ipdTol;
	private Boolean ipdInclude;
	private Integer ipdCmtindx;
	private String ipdUser1;
	private String ipdUser2;
	private String ipdTolType;
	private String ipdChr01;
	private String ipdChr02;
	private String ipdChr03;
	private String ipdChr04;
	private String ipdChr05;
	private Double ipdDec01;
	private Double ipdDec02;
	private Date ipdStart;
	private Date ipdEnd;
	private String ipdTestmthd;
	private String ipdAttribute;
	private String ipdDomain;
	private Double oidIpdDet;

	// Constructors

	/** default constructor */
	public AbstractIpdDetId() {
	}

	/** minimal constructor */
	public AbstractIpdDetId(String ipdDomain, Double oidIpdDet) {
		this.ipdDomain = ipdDomain;
		this.oidIpdDet = oidIpdDet;
	}

	/** full constructor */
	public AbstractIpdDetId(String ipdPart, String ipdRouting, Integer ipdOp,
			String ipdNbr, String ipdTest, String ipdLabel, String ipdTol,
			Boolean ipdInclude, Integer ipdCmtindx, String ipdUser1,
			String ipdUser2, String ipdTolType, String ipdChr01,
			String ipdChr02, String ipdChr03, String ipdChr04, String ipdChr05,
			Double ipdDec01, Double ipdDec02, Date ipdStart, Date ipdEnd,
			String ipdTestmthd, String ipdAttribute, String ipdDomain,
			Double oidIpdDet) {
		this.ipdPart = ipdPart;
		this.ipdRouting = ipdRouting;
		this.ipdOp = ipdOp;
		this.ipdNbr = ipdNbr;
		this.ipdTest = ipdTest;
		this.ipdLabel = ipdLabel;
		this.ipdTol = ipdTol;
		this.ipdInclude = ipdInclude;
		this.ipdCmtindx = ipdCmtindx;
		this.ipdUser1 = ipdUser1;
		this.ipdUser2 = ipdUser2;
		this.ipdTolType = ipdTolType;
		this.ipdChr01 = ipdChr01;
		this.ipdChr02 = ipdChr02;
		this.ipdChr03 = ipdChr03;
		this.ipdChr04 = ipdChr04;
		this.ipdChr05 = ipdChr05;
		this.ipdDec01 = ipdDec01;
		this.ipdDec02 = ipdDec02;
		this.ipdStart = ipdStart;
		this.ipdEnd = ipdEnd;
		this.ipdTestmthd = ipdTestmthd;
		this.ipdAttribute = ipdAttribute;
		this.ipdDomain = ipdDomain;
		this.oidIpdDet = oidIpdDet;
	}

	// Property accessors

	public String getIpdPart() {
		return this.ipdPart;
	}

	public void setIpdPart(String ipdPart) {
		this.ipdPart = ipdPart;
	}

	public String getIpdRouting() {
		return this.ipdRouting;
	}

	public void setIpdRouting(String ipdRouting) {
		this.ipdRouting = ipdRouting;
	}

	public Integer getIpdOp() {
		return this.ipdOp;
	}

	public void setIpdOp(Integer ipdOp) {
		this.ipdOp = ipdOp;
	}

	public String getIpdNbr() {
		return this.ipdNbr;
	}

	public void setIpdNbr(String ipdNbr) {
		this.ipdNbr = ipdNbr;
	}

	public String getIpdTest() {
		return this.ipdTest;
	}

	public void setIpdTest(String ipdTest) {
		this.ipdTest = ipdTest;
	}

	public String getIpdLabel() {
		return this.ipdLabel;
	}

	public void setIpdLabel(String ipdLabel) {
		this.ipdLabel = ipdLabel;
	}

	public String getIpdTol() {
		return this.ipdTol;
	}

	public void setIpdTol(String ipdTol) {
		this.ipdTol = ipdTol;
	}

	public Boolean getIpdInclude() {
		return this.ipdInclude;
	}

	public void setIpdInclude(Boolean ipdInclude) {
		this.ipdInclude = ipdInclude;
	}

	public Integer getIpdCmtindx() {
		return this.ipdCmtindx;
	}

	public void setIpdCmtindx(Integer ipdCmtindx) {
		this.ipdCmtindx = ipdCmtindx;
	}

	public String getIpdUser1() {
		return this.ipdUser1;
	}

	public void setIpdUser1(String ipdUser1) {
		this.ipdUser1 = ipdUser1;
	}

	public String getIpdUser2() {
		return this.ipdUser2;
	}

	public void setIpdUser2(String ipdUser2) {
		this.ipdUser2 = ipdUser2;
	}

	public String getIpdTolType() {
		return this.ipdTolType;
	}

	public void setIpdTolType(String ipdTolType) {
		this.ipdTolType = ipdTolType;
	}

	public String getIpdChr01() {
		return this.ipdChr01;
	}

	public void setIpdChr01(String ipdChr01) {
		this.ipdChr01 = ipdChr01;
	}

	public String getIpdChr02() {
		return this.ipdChr02;
	}

	public void setIpdChr02(String ipdChr02) {
		this.ipdChr02 = ipdChr02;
	}

	public String getIpdChr03() {
		return this.ipdChr03;
	}

	public void setIpdChr03(String ipdChr03) {
		this.ipdChr03 = ipdChr03;
	}

	public String getIpdChr04() {
		return this.ipdChr04;
	}

	public void setIpdChr04(String ipdChr04) {
		this.ipdChr04 = ipdChr04;
	}

	public String getIpdChr05() {
		return this.ipdChr05;
	}

	public void setIpdChr05(String ipdChr05) {
		this.ipdChr05 = ipdChr05;
	}

	public Double getIpdDec01() {
		return this.ipdDec01;
	}

	public void setIpdDec01(Double ipdDec01) {
		this.ipdDec01 = ipdDec01;
	}

	public Double getIpdDec02() {
		return this.ipdDec02;
	}

	public void setIpdDec02(Double ipdDec02) {
		this.ipdDec02 = ipdDec02;
	}

	public Date getIpdStart() {
		return this.ipdStart;
	}

	public void setIpdStart(Date ipdStart) {
		this.ipdStart = ipdStart;
	}

	public Date getIpdEnd() {
		return this.ipdEnd;
	}

	public void setIpdEnd(Date ipdEnd) {
		this.ipdEnd = ipdEnd;
	}

	public String getIpdTestmthd() {
		return this.ipdTestmthd;
	}

	public void setIpdTestmthd(String ipdTestmthd) {
		this.ipdTestmthd = ipdTestmthd;
	}

	public String getIpdAttribute() {
		return this.ipdAttribute;
	}

	public void setIpdAttribute(String ipdAttribute) {
		this.ipdAttribute = ipdAttribute;
	}

	public String getIpdDomain() {
		return this.ipdDomain;
	}

	public void setIpdDomain(String ipdDomain) {
		this.ipdDomain = ipdDomain;
	}

	public Double getOidIpdDet() {
		return this.oidIpdDet;
	}

	public void setOidIpdDet(Double oidIpdDet) {
		this.oidIpdDet = oidIpdDet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIpdDetId))
			return false;
		AbstractIpdDetId castOther = (AbstractIpdDetId) other;

		return ((this.getIpdPart() == castOther.getIpdPart()) || (this
				.getIpdPart() != null
				&& castOther.getIpdPart() != null && this.getIpdPart().equals(
				castOther.getIpdPart())))
				&& ((this.getIpdRouting() == castOther.getIpdRouting()) || (this
						.getIpdRouting() != null
						&& castOther.getIpdRouting() != null && this
						.getIpdRouting().equals(castOther.getIpdRouting())))
				&& ((this.getIpdOp() == castOther.getIpdOp()) || (this
						.getIpdOp() != null
						&& castOther.getIpdOp() != null && this.getIpdOp()
						.equals(castOther.getIpdOp())))
				&& ((this.getIpdNbr() == castOther.getIpdNbr()) || (this
						.getIpdNbr() != null
						&& castOther.getIpdNbr() != null && this.getIpdNbr()
						.equals(castOther.getIpdNbr())))
				&& ((this.getIpdTest() == castOther.getIpdTest()) || (this
						.getIpdTest() != null
						&& castOther.getIpdTest() != null && this.getIpdTest()
						.equals(castOther.getIpdTest())))
				&& ((this.getIpdLabel() == castOther.getIpdLabel()) || (this
						.getIpdLabel() != null
						&& castOther.getIpdLabel() != null && this
						.getIpdLabel().equals(castOther.getIpdLabel())))
				&& ((this.getIpdTol() == castOther.getIpdTol()) || (this
						.getIpdTol() != null
						&& castOther.getIpdTol() != null && this.getIpdTol()
						.equals(castOther.getIpdTol())))
				&& ((this.getIpdInclude() == castOther.getIpdInclude()) || (this
						.getIpdInclude() != null
						&& castOther.getIpdInclude() != null && this
						.getIpdInclude().equals(castOther.getIpdInclude())))
				&& ((this.getIpdCmtindx() == castOther.getIpdCmtindx()) || (this
						.getIpdCmtindx() != null
						&& castOther.getIpdCmtindx() != null && this
						.getIpdCmtindx().equals(castOther.getIpdCmtindx())))
				&& ((this.getIpdUser1() == castOther.getIpdUser1()) || (this
						.getIpdUser1() != null
						&& castOther.getIpdUser1() != null && this
						.getIpdUser1().equals(castOther.getIpdUser1())))
				&& ((this.getIpdUser2() == castOther.getIpdUser2()) || (this
						.getIpdUser2() != null
						&& castOther.getIpdUser2() != null && this
						.getIpdUser2().equals(castOther.getIpdUser2())))
				&& ((this.getIpdTolType() == castOther.getIpdTolType()) || (this
						.getIpdTolType() != null
						&& castOther.getIpdTolType() != null && this
						.getIpdTolType().equals(castOther.getIpdTolType())))
				&& ((this.getIpdChr01() == castOther.getIpdChr01()) || (this
						.getIpdChr01() != null
						&& castOther.getIpdChr01() != null && this
						.getIpdChr01().equals(castOther.getIpdChr01())))
				&& ((this.getIpdChr02() == castOther.getIpdChr02()) || (this
						.getIpdChr02() != null
						&& castOther.getIpdChr02() != null && this
						.getIpdChr02().equals(castOther.getIpdChr02())))
				&& ((this.getIpdChr03() == castOther.getIpdChr03()) || (this
						.getIpdChr03() != null
						&& castOther.getIpdChr03() != null && this
						.getIpdChr03().equals(castOther.getIpdChr03())))
				&& ((this.getIpdChr04() == castOther.getIpdChr04()) || (this
						.getIpdChr04() != null
						&& castOther.getIpdChr04() != null && this
						.getIpdChr04().equals(castOther.getIpdChr04())))
				&& ((this.getIpdChr05() == castOther.getIpdChr05()) || (this
						.getIpdChr05() != null
						&& castOther.getIpdChr05() != null && this
						.getIpdChr05().equals(castOther.getIpdChr05())))
				&& ((this.getIpdDec01() == castOther.getIpdDec01()) || (this
						.getIpdDec01() != null
						&& castOther.getIpdDec01() != null && this
						.getIpdDec01().equals(castOther.getIpdDec01())))
				&& ((this.getIpdDec02() == castOther.getIpdDec02()) || (this
						.getIpdDec02() != null
						&& castOther.getIpdDec02() != null && this
						.getIpdDec02().equals(castOther.getIpdDec02())))
				&& ((this.getIpdStart() == castOther.getIpdStart()) || (this
						.getIpdStart() != null
						&& castOther.getIpdStart() != null && this
						.getIpdStart().equals(castOther.getIpdStart())))
				&& ((this.getIpdEnd() == castOther.getIpdEnd()) || (this
						.getIpdEnd() != null
						&& castOther.getIpdEnd() != null && this.getIpdEnd()
						.equals(castOther.getIpdEnd())))
				&& ((this.getIpdTestmthd() == castOther.getIpdTestmthd()) || (this
						.getIpdTestmthd() != null
						&& castOther.getIpdTestmthd() != null && this
						.getIpdTestmthd().equals(castOther.getIpdTestmthd())))
				&& ((this.getIpdAttribute() == castOther.getIpdAttribute()) || (this
						.getIpdAttribute() != null
						&& castOther.getIpdAttribute() != null && this
						.getIpdAttribute().equals(castOther.getIpdAttribute())))
				&& ((this.getIpdDomain() == castOther.getIpdDomain()) || (this
						.getIpdDomain() != null
						&& castOther.getIpdDomain() != null && this
						.getIpdDomain().equals(castOther.getIpdDomain())))
				&& ((this.getOidIpdDet() == castOther.getOidIpdDet()) || (this
						.getOidIpdDet() != null
						&& castOther.getOidIpdDet() != null && this
						.getOidIpdDet().equals(castOther.getOidIpdDet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIpdPart() == null ? 0 : this.getIpdPart().hashCode());
		result = 37
				* result
				+ (getIpdRouting() == null ? 0 : this.getIpdRouting()
						.hashCode());
		result = 37 * result
				+ (getIpdOp() == null ? 0 : this.getIpdOp().hashCode());
		result = 37 * result
				+ (getIpdNbr() == null ? 0 : this.getIpdNbr().hashCode());
		result = 37 * result
				+ (getIpdTest() == null ? 0 : this.getIpdTest().hashCode());
		result = 37 * result
				+ (getIpdLabel() == null ? 0 : this.getIpdLabel().hashCode());
		result = 37 * result
				+ (getIpdTol() == null ? 0 : this.getIpdTol().hashCode());
		result = 37
				* result
				+ (getIpdInclude() == null ? 0 : this.getIpdInclude()
						.hashCode());
		result = 37
				* result
				+ (getIpdCmtindx() == null ? 0 : this.getIpdCmtindx()
						.hashCode());
		result = 37 * result
				+ (getIpdUser1() == null ? 0 : this.getIpdUser1().hashCode());
		result = 37 * result
				+ (getIpdUser2() == null ? 0 : this.getIpdUser2().hashCode());
		result = 37
				* result
				+ (getIpdTolType() == null ? 0 : this.getIpdTolType()
						.hashCode());
		result = 37 * result
				+ (getIpdChr01() == null ? 0 : this.getIpdChr01().hashCode());
		result = 37 * result
				+ (getIpdChr02() == null ? 0 : this.getIpdChr02().hashCode());
		result = 37 * result
				+ (getIpdChr03() == null ? 0 : this.getIpdChr03().hashCode());
		result = 37 * result
				+ (getIpdChr04() == null ? 0 : this.getIpdChr04().hashCode());
		result = 37 * result
				+ (getIpdChr05() == null ? 0 : this.getIpdChr05().hashCode());
		result = 37 * result
				+ (getIpdDec01() == null ? 0 : this.getIpdDec01().hashCode());
		result = 37 * result
				+ (getIpdDec02() == null ? 0 : this.getIpdDec02().hashCode());
		result = 37 * result
				+ (getIpdStart() == null ? 0 : this.getIpdStart().hashCode());
		result = 37 * result
				+ (getIpdEnd() == null ? 0 : this.getIpdEnd().hashCode());
		result = 37
				* result
				+ (getIpdTestmthd() == null ? 0 : this.getIpdTestmthd()
						.hashCode());
		result = 37
				* result
				+ (getIpdAttribute() == null ? 0 : this.getIpdAttribute()
						.hashCode());
		result = 37 * result
				+ (getIpdDomain() == null ? 0 : this.getIpdDomain().hashCode());
		result = 37 * result
				+ (getOidIpdDet() == null ? 0 : this.getOidIpdDet().hashCode());
		return result;
	}

}