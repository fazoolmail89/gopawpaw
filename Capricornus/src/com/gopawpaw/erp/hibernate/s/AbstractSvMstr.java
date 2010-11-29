package com.gopawpaw.erp.hibernate.s;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractSvMstr entity provides the base persistence definition of the SvMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSvMstr implements java.io.Serializable {

	// Fields

	private SvMstrId id;
	private String svDesc;
	private String svPrList;
	private Integer svRspTime;
	private Boolean svRmaonly;
	private Integer svDfltPri;
	private Boolean svOnsite;
	private String svQoTitle;
	private String svSoTitle;
	private Integer svDuration;
	private String svDays;
	private Boolean svHolidays;
	private String svSvcType;
	private String svChr01;
	private String svChr02;
	private String svChr03;
	private String svChr04;
	private String svChr05;
	private Integer svCmtindx;
	private String svStTime;
	private String svEdTime;
	private Boolean svShpB4rtn;
	private String svCrPrlist;
	private Double svRstkPct;
	private String svRspUm;
	private String svDurUm;
	private Boolean svBlanket;
	private String svRmaprice;
	private Double svVisits;
	private String svStime;
	private String svEtime;
	private String svCstmlist;
	private String svUser1;
	private String svUser2;
	private String svEsNbr;
	private String svOffHoursPt;
	private String svProdLine;
	private BigDecimal svCallsAllow;
	private Integer svLaborDur;
	private String svLaborUm;
	private Boolean svTaxable;
	private String svTaxc;
	private String svTaxUsage;
	private String svCallPrice;
	private String svQadc01;
	private String svQadc02;
	private String svQadc03;
	private String svQadc04;
	private Date svQadt01;
	private Date svQadt02;
	private Date svQadt03;
	private Double svQadd01;
	private Double svQadd02;
	private Double svQadd03;
	private Boolean svQadl01;
	private Boolean svQadl02;
	private Boolean svQadl03;
	private Double oidSvMstr;

	// Constructors

	/** default constructor */
	public AbstractSvMstr() {
	}

	/** minimal constructor */
	public AbstractSvMstr(SvMstrId id, Double oidSvMstr) {
		this.id = id;
		this.oidSvMstr = oidSvMstr;
	}

	/** full constructor */
	public AbstractSvMstr(SvMstrId id, String svDesc, String svPrList,
			Integer svRspTime, Boolean svRmaonly, Integer svDfltPri,
			Boolean svOnsite, String svQoTitle, String svSoTitle,
			Integer svDuration, String svDays, Boolean svHolidays,
			String svSvcType, String svChr01, String svChr02, String svChr03,
			String svChr04, String svChr05, Integer svCmtindx, String svStTime,
			String svEdTime, Boolean svShpB4rtn, String svCrPrlist,
			Double svRstkPct, String svRspUm, String svDurUm,
			Boolean svBlanket, String svRmaprice, Double svVisits,
			String svStime, String svEtime, String svCstmlist, String svUser1,
			String svUser2, String svEsNbr, String svOffHoursPt,
			String svProdLine, BigDecimal svCallsAllow, Integer svLaborDur,
			String svLaborUm, Boolean svTaxable, String svTaxc,
			String svTaxUsage, String svCallPrice, String svQadc01,
			String svQadc02, String svQadc03, String svQadc04, Date svQadt01,
			Date svQadt02, Date svQadt03, Double svQadd01, Double svQadd02,
			Double svQadd03, Boolean svQadl01, Boolean svQadl02,
			Boolean svQadl03, Double oidSvMstr) {
		this.id = id;
		this.svDesc = svDesc;
		this.svPrList = svPrList;
		this.svRspTime = svRspTime;
		this.svRmaonly = svRmaonly;
		this.svDfltPri = svDfltPri;
		this.svOnsite = svOnsite;
		this.svQoTitle = svQoTitle;
		this.svSoTitle = svSoTitle;
		this.svDuration = svDuration;
		this.svDays = svDays;
		this.svHolidays = svHolidays;
		this.svSvcType = svSvcType;
		this.svChr01 = svChr01;
		this.svChr02 = svChr02;
		this.svChr03 = svChr03;
		this.svChr04 = svChr04;
		this.svChr05 = svChr05;
		this.svCmtindx = svCmtindx;
		this.svStTime = svStTime;
		this.svEdTime = svEdTime;
		this.svShpB4rtn = svShpB4rtn;
		this.svCrPrlist = svCrPrlist;
		this.svRstkPct = svRstkPct;
		this.svRspUm = svRspUm;
		this.svDurUm = svDurUm;
		this.svBlanket = svBlanket;
		this.svRmaprice = svRmaprice;
		this.svVisits = svVisits;
		this.svStime = svStime;
		this.svEtime = svEtime;
		this.svCstmlist = svCstmlist;
		this.svUser1 = svUser1;
		this.svUser2 = svUser2;
		this.svEsNbr = svEsNbr;
		this.svOffHoursPt = svOffHoursPt;
		this.svProdLine = svProdLine;
		this.svCallsAllow = svCallsAllow;
		this.svLaborDur = svLaborDur;
		this.svLaborUm = svLaborUm;
		this.svTaxable = svTaxable;
		this.svTaxc = svTaxc;
		this.svTaxUsage = svTaxUsage;
		this.svCallPrice = svCallPrice;
		this.svQadc01 = svQadc01;
		this.svQadc02 = svQadc02;
		this.svQadc03 = svQadc03;
		this.svQadc04 = svQadc04;
		this.svQadt01 = svQadt01;
		this.svQadt02 = svQadt02;
		this.svQadt03 = svQadt03;
		this.svQadd01 = svQadd01;
		this.svQadd02 = svQadd02;
		this.svQadd03 = svQadd03;
		this.svQadl01 = svQadl01;
		this.svQadl02 = svQadl02;
		this.svQadl03 = svQadl03;
		this.oidSvMstr = oidSvMstr;
	}

	// Property accessors

	public SvMstrId getId() {
		return this.id;
	}

	public void setId(SvMstrId id) {
		this.id = id;
	}

	public String getSvDesc() {
		return this.svDesc;
	}

	public void setSvDesc(String svDesc) {
		this.svDesc = svDesc;
	}

	public String getSvPrList() {
		return this.svPrList;
	}

	public void setSvPrList(String svPrList) {
		this.svPrList = svPrList;
	}

	public Integer getSvRspTime() {
		return this.svRspTime;
	}

	public void setSvRspTime(Integer svRspTime) {
		this.svRspTime = svRspTime;
	}

	public Boolean getSvRmaonly() {
		return this.svRmaonly;
	}

	public void setSvRmaonly(Boolean svRmaonly) {
		this.svRmaonly = svRmaonly;
	}

	public Integer getSvDfltPri() {
		return this.svDfltPri;
	}

	public void setSvDfltPri(Integer svDfltPri) {
		this.svDfltPri = svDfltPri;
	}

	public Boolean getSvOnsite() {
		return this.svOnsite;
	}

	public void setSvOnsite(Boolean svOnsite) {
		this.svOnsite = svOnsite;
	}

	public String getSvQoTitle() {
		return this.svQoTitle;
	}

	public void setSvQoTitle(String svQoTitle) {
		this.svQoTitle = svQoTitle;
	}

	public String getSvSoTitle() {
		return this.svSoTitle;
	}

	public void setSvSoTitle(String svSoTitle) {
		this.svSoTitle = svSoTitle;
	}

	public Integer getSvDuration() {
		return this.svDuration;
	}

	public void setSvDuration(Integer svDuration) {
		this.svDuration = svDuration;
	}

	public String getSvDays() {
		return this.svDays;
	}

	public void setSvDays(String svDays) {
		this.svDays = svDays;
	}

	public Boolean getSvHolidays() {
		return this.svHolidays;
	}

	public void setSvHolidays(Boolean svHolidays) {
		this.svHolidays = svHolidays;
	}

	public String getSvSvcType() {
		return this.svSvcType;
	}

	public void setSvSvcType(String svSvcType) {
		this.svSvcType = svSvcType;
	}

	public String getSvChr01() {
		return this.svChr01;
	}

	public void setSvChr01(String svChr01) {
		this.svChr01 = svChr01;
	}

	public String getSvChr02() {
		return this.svChr02;
	}

	public void setSvChr02(String svChr02) {
		this.svChr02 = svChr02;
	}

	public String getSvChr03() {
		return this.svChr03;
	}

	public void setSvChr03(String svChr03) {
		this.svChr03 = svChr03;
	}

	public String getSvChr04() {
		return this.svChr04;
	}

	public void setSvChr04(String svChr04) {
		this.svChr04 = svChr04;
	}

	public String getSvChr05() {
		return this.svChr05;
	}

	public void setSvChr05(String svChr05) {
		this.svChr05 = svChr05;
	}

	public Integer getSvCmtindx() {
		return this.svCmtindx;
	}

	public void setSvCmtindx(Integer svCmtindx) {
		this.svCmtindx = svCmtindx;
	}

	public String getSvStTime() {
		return this.svStTime;
	}

	public void setSvStTime(String svStTime) {
		this.svStTime = svStTime;
	}

	public String getSvEdTime() {
		return this.svEdTime;
	}

	public void setSvEdTime(String svEdTime) {
		this.svEdTime = svEdTime;
	}

	public Boolean getSvShpB4rtn() {
		return this.svShpB4rtn;
	}

	public void setSvShpB4rtn(Boolean svShpB4rtn) {
		this.svShpB4rtn = svShpB4rtn;
	}

	public String getSvCrPrlist() {
		return this.svCrPrlist;
	}

	public void setSvCrPrlist(String svCrPrlist) {
		this.svCrPrlist = svCrPrlist;
	}

	public Double getSvRstkPct() {
		return this.svRstkPct;
	}

	public void setSvRstkPct(Double svRstkPct) {
		this.svRstkPct = svRstkPct;
	}

	public String getSvRspUm() {
		return this.svRspUm;
	}

	public void setSvRspUm(String svRspUm) {
		this.svRspUm = svRspUm;
	}

	public String getSvDurUm() {
		return this.svDurUm;
	}

	public void setSvDurUm(String svDurUm) {
		this.svDurUm = svDurUm;
	}

	public Boolean getSvBlanket() {
		return this.svBlanket;
	}

	public void setSvBlanket(Boolean svBlanket) {
		this.svBlanket = svBlanket;
	}

	public String getSvRmaprice() {
		return this.svRmaprice;
	}

	public void setSvRmaprice(String svRmaprice) {
		this.svRmaprice = svRmaprice;
	}

	public Double getSvVisits() {
		return this.svVisits;
	}

	public void setSvVisits(Double svVisits) {
		this.svVisits = svVisits;
	}

	public String getSvStime() {
		return this.svStime;
	}

	public void setSvStime(String svStime) {
		this.svStime = svStime;
	}

	public String getSvEtime() {
		return this.svEtime;
	}

	public void setSvEtime(String svEtime) {
		this.svEtime = svEtime;
	}

	public String getSvCstmlist() {
		return this.svCstmlist;
	}

	public void setSvCstmlist(String svCstmlist) {
		this.svCstmlist = svCstmlist;
	}

	public String getSvUser1() {
		return this.svUser1;
	}

	public void setSvUser1(String svUser1) {
		this.svUser1 = svUser1;
	}

	public String getSvUser2() {
		return this.svUser2;
	}

	public void setSvUser2(String svUser2) {
		this.svUser2 = svUser2;
	}

	public String getSvEsNbr() {
		return this.svEsNbr;
	}

	public void setSvEsNbr(String svEsNbr) {
		this.svEsNbr = svEsNbr;
	}

	public String getSvOffHoursPt() {
		return this.svOffHoursPt;
	}

	public void setSvOffHoursPt(String svOffHoursPt) {
		this.svOffHoursPt = svOffHoursPt;
	}

	public String getSvProdLine() {
		return this.svProdLine;
	}

	public void setSvProdLine(String svProdLine) {
		this.svProdLine = svProdLine;
	}

	public BigDecimal getSvCallsAllow() {
		return this.svCallsAllow;
	}

	public void setSvCallsAllow(BigDecimal svCallsAllow) {
		this.svCallsAllow = svCallsAllow;
	}

	public Integer getSvLaborDur() {
		return this.svLaborDur;
	}

	public void setSvLaborDur(Integer svLaborDur) {
		this.svLaborDur = svLaborDur;
	}

	public String getSvLaborUm() {
		return this.svLaborUm;
	}

	public void setSvLaborUm(String svLaborUm) {
		this.svLaborUm = svLaborUm;
	}

	public Boolean getSvTaxable() {
		return this.svTaxable;
	}

	public void setSvTaxable(Boolean svTaxable) {
		this.svTaxable = svTaxable;
	}

	public String getSvTaxc() {
		return this.svTaxc;
	}

	public void setSvTaxc(String svTaxc) {
		this.svTaxc = svTaxc;
	}

	public String getSvTaxUsage() {
		return this.svTaxUsage;
	}

	public void setSvTaxUsage(String svTaxUsage) {
		this.svTaxUsage = svTaxUsage;
	}

	public String getSvCallPrice() {
		return this.svCallPrice;
	}

	public void setSvCallPrice(String svCallPrice) {
		this.svCallPrice = svCallPrice;
	}

	public String getSvQadc01() {
		return this.svQadc01;
	}

	public void setSvQadc01(String svQadc01) {
		this.svQadc01 = svQadc01;
	}

	public String getSvQadc02() {
		return this.svQadc02;
	}

	public void setSvQadc02(String svQadc02) {
		this.svQadc02 = svQadc02;
	}

	public String getSvQadc03() {
		return this.svQadc03;
	}

	public void setSvQadc03(String svQadc03) {
		this.svQadc03 = svQadc03;
	}

	public String getSvQadc04() {
		return this.svQadc04;
	}

	public void setSvQadc04(String svQadc04) {
		this.svQadc04 = svQadc04;
	}

	public Date getSvQadt01() {
		return this.svQadt01;
	}

	public void setSvQadt01(Date svQadt01) {
		this.svQadt01 = svQadt01;
	}

	public Date getSvQadt02() {
		return this.svQadt02;
	}

	public void setSvQadt02(Date svQadt02) {
		this.svQadt02 = svQadt02;
	}

	public Date getSvQadt03() {
		return this.svQadt03;
	}

	public void setSvQadt03(Date svQadt03) {
		this.svQadt03 = svQadt03;
	}

	public Double getSvQadd01() {
		return this.svQadd01;
	}

	public void setSvQadd01(Double svQadd01) {
		this.svQadd01 = svQadd01;
	}

	public Double getSvQadd02() {
		return this.svQadd02;
	}

	public void setSvQadd02(Double svQadd02) {
		this.svQadd02 = svQadd02;
	}

	public Double getSvQadd03() {
		return this.svQadd03;
	}

	public void setSvQadd03(Double svQadd03) {
		this.svQadd03 = svQadd03;
	}

	public Boolean getSvQadl01() {
		return this.svQadl01;
	}

	public void setSvQadl01(Boolean svQadl01) {
		this.svQadl01 = svQadl01;
	}

	public Boolean getSvQadl02() {
		return this.svQadl02;
	}

	public void setSvQadl02(Boolean svQadl02) {
		this.svQadl02 = svQadl02;
	}

	public Boolean getSvQadl03() {
		return this.svQadl03;
	}

	public void setSvQadl03(Boolean svQadl03) {
		this.svQadl03 = svQadl03;
	}

	public Double getOidSvMstr() {
		return this.oidSvMstr;
	}

	public void setOidSvMstr(Double oidSvMstr) {
		this.oidSvMstr = oidSvMstr;
	}

}