package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQocCtrl entity provides the base persistence definition of the
 * QocCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQocCtrl implements java.io.Serializable {

	// Fields

	private String qocDomain;
	private Integer qocQo;
	private Boolean qocLnFmt;
	private Boolean qocPrint;
	private String qocCompany;
	private String qocFob;
	private Boolean qocHcmmts;
	private Boolean qocLcmmts;
	private Integer qocDays;
	private Integer qocQad01;
	private String qocUser1;
	private String qocUser2;
	private Integer qocQadi01;
	private Boolean qocFrBySite;
	private String qocQoPre;
	private Boolean qocPlReq;
	private Boolean qocPcLine;
	private Boolean qocPtReq;
	private String qocExRatetype;
	private Double oidQocCtrl;

	// Constructors

	/** default constructor */
	public AbstractQocCtrl() {
	}

	/** minimal constructor */
	public AbstractQocCtrl(String qocExRatetype, Double oidQocCtrl) {
		this.qocExRatetype = qocExRatetype;
		this.oidQocCtrl = oidQocCtrl;
	}

	/** full constructor */
	public AbstractQocCtrl(Integer qocQo, Boolean qocLnFmt, Boolean qocPrint,
			String qocCompany, String qocFob, Boolean qocHcmmts,
			Boolean qocLcmmts, Integer qocDays, Integer qocQad01,
			String qocUser1, String qocUser2, Integer qocQadi01,
			Boolean qocFrBySite, String qocQoPre, Boolean qocPlReq,
			Boolean qocPcLine, Boolean qocPtReq, String qocExRatetype,
			Double oidQocCtrl) {
		this.qocQo = qocQo;
		this.qocLnFmt = qocLnFmt;
		this.qocPrint = qocPrint;
		this.qocCompany = qocCompany;
		this.qocFob = qocFob;
		this.qocHcmmts = qocHcmmts;
		this.qocLcmmts = qocLcmmts;
		this.qocDays = qocDays;
		this.qocQad01 = qocQad01;
		this.qocUser1 = qocUser1;
		this.qocUser2 = qocUser2;
		this.qocQadi01 = qocQadi01;
		this.qocFrBySite = qocFrBySite;
		this.qocQoPre = qocQoPre;
		this.qocPlReq = qocPlReq;
		this.qocPcLine = qocPcLine;
		this.qocPtReq = qocPtReq;
		this.qocExRatetype = qocExRatetype;
		this.oidQocCtrl = oidQocCtrl;
	}

	// Property accessors

	public String getQocDomain() {
		return this.qocDomain;
	}

	public void setQocDomain(String qocDomain) {
		this.qocDomain = qocDomain;
	}

	public Integer getQocQo() {
		return this.qocQo;
	}

	public void setQocQo(Integer qocQo) {
		this.qocQo = qocQo;
	}

	public Boolean getQocLnFmt() {
		return this.qocLnFmt;
	}

	public void setQocLnFmt(Boolean qocLnFmt) {
		this.qocLnFmt = qocLnFmt;
	}

	public Boolean getQocPrint() {
		return this.qocPrint;
	}

	public void setQocPrint(Boolean qocPrint) {
		this.qocPrint = qocPrint;
	}

	public String getQocCompany() {
		return this.qocCompany;
	}

	public void setQocCompany(String qocCompany) {
		this.qocCompany = qocCompany;
	}

	public String getQocFob() {
		return this.qocFob;
	}

	public void setQocFob(String qocFob) {
		this.qocFob = qocFob;
	}

	public Boolean getQocHcmmts() {
		return this.qocHcmmts;
	}

	public void setQocHcmmts(Boolean qocHcmmts) {
		this.qocHcmmts = qocHcmmts;
	}

	public Boolean getQocLcmmts() {
		return this.qocLcmmts;
	}

	public void setQocLcmmts(Boolean qocLcmmts) {
		this.qocLcmmts = qocLcmmts;
	}

	public Integer getQocDays() {
		return this.qocDays;
	}

	public void setQocDays(Integer qocDays) {
		this.qocDays = qocDays;
	}

	public Integer getQocQad01() {
		return this.qocQad01;
	}

	public void setQocQad01(Integer qocQad01) {
		this.qocQad01 = qocQad01;
	}

	public String getQocUser1() {
		return this.qocUser1;
	}

	public void setQocUser1(String qocUser1) {
		this.qocUser1 = qocUser1;
	}

	public String getQocUser2() {
		return this.qocUser2;
	}

	public void setQocUser2(String qocUser2) {
		this.qocUser2 = qocUser2;
	}

	public Integer getQocQadi01() {
		return this.qocQadi01;
	}

	public void setQocQadi01(Integer qocQadi01) {
		this.qocQadi01 = qocQadi01;
	}

	public Boolean getQocFrBySite() {
		return this.qocFrBySite;
	}

	public void setQocFrBySite(Boolean qocFrBySite) {
		this.qocFrBySite = qocFrBySite;
	}

	public String getQocQoPre() {
		return this.qocQoPre;
	}

	public void setQocQoPre(String qocQoPre) {
		this.qocQoPre = qocQoPre;
	}

	public Boolean getQocPlReq() {
		return this.qocPlReq;
	}

	public void setQocPlReq(Boolean qocPlReq) {
		this.qocPlReq = qocPlReq;
	}

	public Boolean getQocPcLine() {
		return this.qocPcLine;
	}

	public void setQocPcLine(Boolean qocPcLine) {
		this.qocPcLine = qocPcLine;
	}

	public Boolean getQocPtReq() {
		return this.qocPtReq;
	}

	public void setQocPtReq(Boolean qocPtReq) {
		this.qocPtReq = qocPtReq;
	}

	public String getQocExRatetype() {
		return this.qocExRatetype;
	}

	public void setQocExRatetype(String qocExRatetype) {
		this.qocExRatetype = qocExRatetype;
	}

	public Double getOidQocCtrl() {
		return this.oidQocCtrl;
	}

	public void setOidQocCtrl(Double oidQocCtrl) {
		this.oidQocCtrl = oidQocCtrl;
	}

}