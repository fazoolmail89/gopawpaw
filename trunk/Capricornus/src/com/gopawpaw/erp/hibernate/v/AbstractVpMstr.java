package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVpMstr entity provides the base persistence definition of the VpMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVpMstr implements java.io.Serializable {

	// Fields

	private VpMstrId id;
	private String vpUm;
	private Integer vpVendLead;
	private Double vpQPrice;
	private Date vpQDate;
	private Double vpQQty;
	private String vpMfgr;
	private String vpMfgrPart;
	private String vpComment;
	private String vpPrList;
	private String vpUser1;
	private String vpUser2;
	private String vpCurr;
	private Double vpBkageAmt;
	private Double vpDutyAmt;
	private String vpDutyType;
	private Double vpFrtAmt;
	private Double vpSchPct;
	private Date vpApprDate;
	private String vpChr01;
	private String vpChr02;
	private String vpChr03;
	private String vpChr04;
	private String vpChr05;
	private Date vpDte01;
	private Date vpDte02;
	private Double vpDec01;
	private Double vpDec02;
	private Boolean vpLog01;
	private String vpUserid;
	private Date vpModDate;
	private String vpPkgCode;
	private Boolean vpInsRqd;
	private String vpRcptStat;
	private Boolean vpTpUsePct;
	private Double vpTpPct;
	private Double oidVpMstr;

	// Constructors

	/** default constructor */
	public AbstractVpMstr() {
	}

	/** minimal constructor */
	public AbstractVpMstr(VpMstrId id, String vpUm, Boolean vpTpUsePct,
			Double vpTpPct, Double oidVpMstr) {
		this.id = id;
		this.vpUm = vpUm;
		this.vpTpUsePct = vpTpUsePct;
		this.vpTpPct = vpTpPct;
		this.oidVpMstr = oidVpMstr;
	}

	/** full constructor */
	public AbstractVpMstr(VpMstrId id, String vpUm, Integer vpVendLead,
			Double vpQPrice, Date vpQDate, Double vpQQty, String vpMfgr,
			String vpMfgrPart, String vpComment, String vpPrList,
			String vpUser1, String vpUser2, String vpCurr, Double vpBkageAmt,
			Double vpDutyAmt, String vpDutyType, Double vpFrtAmt,
			Double vpSchPct, Date vpApprDate, String vpChr01, String vpChr02,
			String vpChr03, String vpChr04, String vpChr05, Date vpDte01,
			Date vpDte02, Double vpDec01, Double vpDec02, Boolean vpLog01,
			String vpUserid, Date vpModDate, String vpPkgCode,
			Boolean vpInsRqd, String vpRcptStat, Boolean vpTpUsePct,
			Double vpTpPct, Double oidVpMstr) {
		this.id = id;
		this.vpUm = vpUm;
		this.vpVendLead = vpVendLead;
		this.vpQPrice = vpQPrice;
		this.vpQDate = vpQDate;
		this.vpQQty = vpQQty;
		this.vpMfgr = vpMfgr;
		this.vpMfgrPart = vpMfgrPart;
		this.vpComment = vpComment;
		this.vpPrList = vpPrList;
		this.vpUser1 = vpUser1;
		this.vpUser2 = vpUser2;
		this.vpCurr = vpCurr;
		this.vpBkageAmt = vpBkageAmt;
		this.vpDutyAmt = vpDutyAmt;
		this.vpDutyType = vpDutyType;
		this.vpFrtAmt = vpFrtAmt;
		this.vpSchPct = vpSchPct;
		this.vpApprDate = vpApprDate;
		this.vpChr01 = vpChr01;
		this.vpChr02 = vpChr02;
		this.vpChr03 = vpChr03;
		this.vpChr04 = vpChr04;
		this.vpChr05 = vpChr05;
		this.vpDte01 = vpDte01;
		this.vpDte02 = vpDte02;
		this.vpDec01 = vpDec01;
		this.vpDec02 = vpDec02;
		this.vpLog01 = vpLog01;
		this.vpUserid = vpUserid;
		this.vpModDate = vpModDate;
		this.vpPkgCode = vpPkgCode;
		this.vpInsRqd = vpInsRqd;
		this.vpRcptStat = vpRcptStat;
		this.vpTpUsePct = vpTpUsePct;
		this.vpTpPct = vpTpPct;
		this.oidVpMstr = oidVpMstr;
	}

	// Property accessors

	public VpMstrId getId() {
		return this.id;
	}

	public void setId(VpMstrId id) {
		this.id = id;
	}

	public String getVpUm() {
		return this.vpUm;
	}

	public void setVpUm(String vpUm) {
		this.vpUm = vpUm;
	}

	public Integer getVpVendLead() {
		return this.vpVendLead;
	}

	public void setVpVendLead(Integer vpVendLead) {
		this.vpVendLead = vpVendLead;
	}

	public Double getVpQPrice() {
		return this.vpQPrice;
	}

	public void setVpQPrice(Double vpQPrice) {
		this.vpQPrice = vpQPrice;
	}

	public Date getVpQDate() {
		return this.vpQDate;
	}

	public void setVpQDate(Date vpQDate) {
		this.vpQDate = vpQDate;
	}

	public Double getVpQQty() {
		return this.vpQQty;
	}

	public void setVpQQty(Double vpQQty) {
		this.vpQQty = vpQQty;
	}

	public String getVpMfgr() {
		return this.vpMfgr;
	}

	public void setVpMfgr(String vpMfgr) {
		this.vpMfgr = vpMfgr;
	}

	public String getVpMfgrPart() {
		return this.vpMfgrPart;
	}

	public void setVpMfgrPart(String vpMfgrPart) {
		this.vpMfgrPart = vpMfgrPart;
	}

	public String getVpComment() {
		return this.vpComment;
	}

	public void setVpComment(String vpComment) {
		this.vpComment = vpComment;
	}

	public String getVpPrList() {
		return this.vpPrList;
	}

	public void setVpPrList(String vpPrList) {
		this.vpPrList = vpPrList;
	}

	public String getVpUser1() {
		return this.vpUser1;
	}

	public void setVpUser1(String vpUser1) {
		this.vpUser1 = vpUser1;
	}

	public String getVpUser2() {
		return this.vpUser2;
	}

	public void setVpUser2(String vpUser2) {
		this.vpUser2 = vpUser2;
	}

	public String getVpCurr() {
		return this.vpCurr;
	}

	public void setVpCurr(String vpCurr) {
		this.vpCurr = vpCurr;
	}

	public Double getVpBkageAmt() {
		return this.vpBkageAmt;
	}

	public void setVpBkageAmt(Double vpBkageAmt) {
		this.vpBkageAmt = vpBkageAmt;
	}

	public Double getVpDutyAmt() {
		return this.vpDutyAmt;
	}

	public void setVpDutyAmt(Double vpDutyAmt) {
		this.vpDutyAmt = vpDutyAmt;
	}

	public String getVpDutyType() {
		return this.vpDutyType;
	}

	public void setVpDutyType(String vpDutyType) {
		this.vpDutyType = vpDutyType;
	}

	public Double getVpFrtAmt() {
		return this.vpFrtAmt;
	}

	public void setVpFrtAmt(Double vpFrtAmt) {
		this.vpFrtAmt = vpFrtAmt;
	}

	public Double getVpSchPct() {
		return this.vpSchPct;
	}

	public void setVpSchPct(Double vpSchPct) {
		this.vpSchPct = vpSchPct;
	}

	public Date getVpApprDate() {
		return this.vpApprDate;
	}

	public void setVpApprDate(Date vpApprDate) {
		this.vpApprDate = vpApprDate;
	}

	public String getVpChr01() {
		return this.vpChr01;
	}

	public void setVpChr01(String vpChr01) {
		this.vpChr01 = vpChr01;
	}

	public String getVpChr02() {
		return this.vpChr02;
	}

	public void setVpChr02(String vpChr02) {
		this.vpChr02 = vpChr02;
	}

	public String getVpChr03() {
		return this.vpChr03;
	}

	public void setVpChr03(String vpChr03) {
		this.vpChr03 = vpChr03;
	}

	public String getVpChr04() {
		return this.vpChr04;
	}

	public void setVpChr04(String vpChr04) {
		this.vpChr04 = vpChr04;
	}

	public String getVpChr05() {
		return this.vpChr05;
	}

	public void setVpChr05(String vpChr05) {
		this.vpChr05 = vpChr05;
	}

	public Date getVpDte01() {
		return this.vpDte01;
	}

	public void setVpDte01(Date vpDte01) {
		this.vpDte01 = vpDte01;
	}

	public Date getVpDte02() {
		return this.vpDte02;
	}

	public void setVpDte02(Date vpDte02) {
		this.vpDte02 = vpDte02;
	}

	public Double getVpDec01() {
		return this.vpDec01;
	}

	public void setVpDec01(Double vpDec01) {
		this.vpDec01 = vpDec01;
	}

	public Double getVpDec02() {
		return this.vpDec02;
	}

	public void setVpDec02(Double vpDec02) {
		this.vpDec02 = vpDec02;
	}

	public Boolean getVpLog01() {
		return this.vpLog01;
	}

	public void setVpLog01(Boolean vpLog01) {
		this.vpLog01 = vpLog01;
	}

	public String getVpUserid() {
		return this.vpUserid;
	}

	public void setVpUserid(String vpUserid) {
		this.vpUserid = vpUserid;
	}

	public Date getVpModDate() {
		return this.vpModDate;
	}

	public void setVpModDate(Date vpModDate) {
		this.vpModDate = vpModDate;
	}

	public String getVpPkgCode() {
		return this.vpPkgCode;
	}

	public void setVpPkgCode(String vpPkgCode) {
		this.vpPkgCode = vpPkgCode;
	}

	public Boolean getVpInsRqd() {
		return this.vpInsRqd;
	}

	public void setVpInsRqd(Boolean vpInsRqd) {
		this.vpInsRqd = vpInsRqd;
	}

	public String getVpRcptStat() {
		return this.vpRcptStat;
	}

	public void setVpRcptStat(String vpRcptStat) {
		this.vpRcptStat = vpRcptStat;
	}

	public Boolean getVpTpUsePct() {
		return this.vpTpUsePct;
	}

	public void setVpTpUsePct(Boolean vpTpUsePct) {
		this.vpTpUsePct = vpTpUsePct;
	}

	public Double getVpTpPct() {
		return this.vpTpPct;
	}

	public void setVpTpPct(Double vpTpPct) {
		this.vpTpPct = vpTpPct;
	}

	public Double getOidVpMstr() {
		return this.oidVpMstr;
	}

	public void setOidVpMstr(Double oidVpMstr) {
		this.oidVpMstr = oidVpMstr;
	}

}