package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDjrMstr entity provides the base persistence definition of the
 * DjrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDjrMstr implements java.io.Serializable {

	// Fields

	private DjrMstrId id;
	private Boolean djrAccSkip;
	private String djrBank;
	private String djrCc1;
	private String djrCc2;
	private String djrCrit1;
	private String djrCrit2;
	private String djrDesc;
	private Boolean djrDispCurr;
	private String djrEnt1;
	private String djrEnt2;
	private Boolean djrIncMemo;
	private Boolean djrIncStat;
	private String djrModUserid;
	private Date djrModDate;
	private Boolean djrNewpage;
	private Integer djrPagenum;
	private Integer djrPer1;
	private Integer djrPer2;
	private String djrSub1;
	private String djrSub2;
	private Boolean djrSummary;
	private String djrTitle;
	private String djrType;
	private Integer djrYear;
	private String djrUser1;
	private String djrUser2;
	private String djrUserc03;
	private String djrUserc04;
	private String djrUserc05;
	private Double djrUserd01;
	private Double djrUserd02;
	private Integer djrUseri01;
	private Integer djrUseri02;
	private Boolean djrUserl01;
	private Boolean djrUserl02;
	private Date djrUsert01;
	private Date djrUsert02;
	private String djrQadc01;
	private String djrQadc02;
	private String djrQadc03;
	private String djrQadc04;
	private String djrQadc05;
	private Double djrQadd01;
	private Double djrQadd02;
	private Integer djrQadi01;
	private Integer djrQadi02;
	private Boolean djrQadl01;
	private Boolean djrQadl02;
	private Date djrQadt01;
	private Date djrQadt02;
	private Double oidDjrMstr;

	// Constructors

	/** default constructor */
	public AbstractDjrMstr() {
	}

	/** minimal constructor */
	public AbstractDjrMstr(DjrMstrId id, Boolean djrAccSkip, String djrBank,
			String djrCc1, String djrCc2, String djrCrit1, String djrCrit2,
			String djrDesc, Boolean djrDispCurr, String djrEnt1,
			String djrEnt2, Boolean djrIncMemo, Boolean djrIncStat,
			String djrModUserid, Date djrModDate, Boolean djrNewpage,
			Integer djrPagenum, Integer djrPer1, Integer djrPer2,
			String djrSub1, String djrSub2, Boolean djrSummary,
			String djrTitle, String djrType, Integer djrYear, String djrUser1,
			String djrUser2, String djrUserc03, String djrUserc04,
			String djrUserc05, Double djrUserd01, Double djrUserd02,
			Integer djrUseri01, Integer djrUseri02, Boolean djrUserl01,
			Boolean djrUserl02, String djrQadc01, String djrQadc02,
			String djrQadc03, String djrQadc04, String djrQadc05,
			Double djrQadd01, Double djrQadd02, Integer djrQadi01,
			Integer djrQadi02, Boolean djrQadl01, Boolean djrQadl02,
			Double oidDjrMstr) {
		this.id = id;
		this.djrAccSkip = djrAccSkip;
		this.djrBank = djrBank;
		this.djrCc1 = djrCc1;
		this.djrCc2 = djrCc2;
		this.djrCrit1 = djrCrit1;
		this.djrCrit2 = djrCrit2;
		this.djrDesc = djrDesc;
		this.djrDispCurr = djrDispCurr;
		this.djrEnt1 = djrEnt1;
		this.djrEnt2 = djrEnt2;
		this.djrIncMemo = djrIncMemo;
		this.djrIncStat = djrIncStat;
		this.djrModUserid = djrModUserid;
		this.djrModDate = djrModDate;
		this.djrNewpage = djrNewpage;
		this.djrPagenum = djrPagenum;
		this.djrPer1 = djrPer1;
		this.djrPer2 = djrPer2;
		this.djrSub1 = djrSub1;
		this.djrSub2 = djrSub2;
		this.djrSummary = djrSummary;
		this.djrTitle = djrTitle;
		this.djrType = djrType;
		this.djrYear = djrYear;
		this.djrUser1 = djrUser1;
		this.djrUser2 = djrUser2;
		this.djrUserc03 = djrUserc03;
		this.djrUserc04 = djrUserc04;
		this.djrUserc05 = djrUserc05;
		this.djrUserd01 = djrUserd01;
		this.djrUserd02 = djrUserd02;
		this.djrUseri01 = djrUseri01;
		this.djrUseri02 = djrUseri02;
		this.djrUserl01 = djrUserl01;
		this.djrUserl02 = djrUserl02;
		this.djrQadc01 = djrQadc01;
		this.djrQadc02 = djrQadc02;
		this.djrQadc03 = djrQadc03;
		this.djrQadc04 = djrQadc04;
		this.djrQadc05 = djrQadc05;
		this.djrQadd01 = djrQadd01;
		this.djrQadd02 = djrQadd02;
		this.djrQadi01 = djrQadi01;
		this.djrQadi02 = djrQadi02;
		this.djrQadl01 = djrQadl01;
		this.djrQadl02 = djrQadl02;
		this.oidDjrMstr = oidDjrMstr;
	}

	/** full constructor */
	public AbstractDjrMstr(DjrMstrId id, Boolean djrAccSkip, String djrBank,
			String djrCc1, String djrCc2, String djrCrit1, String djrCrit2,
			String djrDesc, Boolean djrDispCurr, String djrEnt1,
			String djrEnt2, Boolean djrIncMemo, Boolean djrIncStat,
			String djrModUserid, Date djrModDate, Boolean djrNewpage,
			Integer djrPagenum, Integer djrPer1, Integer djrPer2,
			String djrSub1, String djrSub2, Boolean djrSummary,
			String djrTitle, String djrType, Integer djrYear, String djrUser1,
			String djrUser2, String djrUserc03, String djrUserc04,
			String djrUserc05, Double djrUserd01, Double djrUserd02,
			Integer djrUseri01, Integer djrUseri02, Boolean djrUserl01,
			Boolean djrUserl02, Date djrUsert01, Date djrUsert02,
			String djrQadc01, String djrQadc02, String djrQadc03,
			String djrQadc04, String djrQadc05, Double djrQadd01,
			Double djrQadd02, Integer djrQadi01, Integer djrQadi02,
			Boolean djrQadl01, Boolean djrQadl02, Date djrQadt01,
			Date djrQadt02, Double oidDjrMstr) {
		this.id = id;
		this.djrAccSkip = djrAccSkip;
		this.djrBank = djrBank;
		this.djrCc1 = djrCc1;
		this.djrCc2 = djrCc2;
		this.djrCrit1 = djrCrit1;
		this.djrCrit2 = djrCrit2;
		this.djrDesc = djrDesc;
		this.djrDispCurr = djrDispCurr;
		this.djrEnt1 = djrEnt1;
		this.djrEnt2 = djrEnt2;
		this.djrIncMemo = djrIncMemo;
		this.djrIncStat = djrIncStat;
		this.djrModUserid = djrModUserid;
		this.djrModDate = djrModDate;
		this.djrNewpage = djrNewpage;
		this.djrPagenum = djrPagenum;
		this.djrPer1 = djrPer1;
		this.djrPer2 = djrPer2;
		this.djrSub1 = djrSub1;
		this.djrSub2 = djrSub2;
		this.djrSummary = djrSummary;
		this.djrTitle = djrTitle;
		this.djrType = djrType;
		this.djrYear = djrYear;
		this.djrUser1 = djrUser1;
		this.djrUser2 = djrUser2;
		this.djrUserc03 = djrUserc03;
		this.djrUserc04 = djrUserc04;
		this.djrUserc05 = djrUserc05;
		this.djrUserd01 = djrUserd01;
		this.djrUserd02 = djrUserd02;
		this.djrUseri01 = djrUseri01;
		this.djrUseri02 = djrUseri02;
		this.djrUserl01 = djrUserl01;
		this.djrUserl02 = djrUserl02;
		this.djrUsert01 = djrUsert01;
		this.djrUsert02 = djrUsert02;
		this.djrQadc01 = djrQadc01;
		this.djrQadc02 = djrQadc02;
		this.djrQadc03 = djrQadc03;
		this.djrQadc04 = djrQadc04;
		this.djrQadc05 = djrQadc05;
		this.djrQadd01 = djrQadd01;
		this.djrQadd02 = djrQadd02;
		this.djrQadi01 = djrQadi01;
		this.djrQadi02 = djrQadi02;
		this.djrQadl01 = djrQadl01;
		this.djrQadl02 = djrQadl02;
		this.djrQadt01 = djrQadt01;
		this.djrQadt02 = djrQadt02;
		this.oidDjrMstr = oidDjrMstr;
	}

	// Property accessors

	public DjrMstrId getId() {
		return this.id;
	}

	public void setId(DjrMstrId id) {
		this.id = id;
	}

	public Boolean getDjrAccSkip() {
		return this.djrAccSkip;
	}

	public void setDjrAccSkip(Boolean djrAccSkip) {
		this.djrAccSkip = djrAccSkip;
	}

	public String getDjrBank() {
		return this.djrBank;
	}

	public void setDjrBank(String djrBank) {
		this.djrBank = djrBank;
	}

	public String getDjrCc1() {
		return this.djrCc1;
	}

	public void setDjrCc1(String djrCc1) {
		this.djrCc1 = djrCc1;
	}

	public String getDjrCc2() {
		return this.djrCc2;
	}

	public void setDjrCc2(String djrCc2) {
		this.djrCc2 = djrCc2;
	}

	public String getDjrCrit1() {
		return this.djrCrit1;
	}

	public void setDjrCrit1(String djrCrit1) {
		this.djrCrit1 = djrCrit1;
	}

	public String getDjrCrit2() {
		return this.djrCrit2;
	}

	public void setDjrCrit2(String djrCrit2) {
		this.djrCrit2 = djrCrit2;
	}

	public String getDjrDesc() {
		return this.djrDesc;
	}

	public void setDjrDesc(String djrDesc) {
		this.djrDesc = djrDesc;
	}

	public Boolean getDjrDispCurr() {
		return this.djrDispCurr;
	}

	public void setDjrDispCurr(Boolean djrDispCurr) {
		this.djrDispCurr = djrDispCurr;
	}

	public String getDjrEnt1() {
		return this.djrEnt1;
	}

	public void setDjrEnt1(String djrEnt1) {
		this.djrEnt1 = djrEnt1;
	}

	public String getDjrEnt2() {
		return this.djrEnt2;
	}

	public void setDjrEnt2(String djrEnt2) {
		this.djrEnt2 = djrEnt2;
	}

	public Boolean getDjrIncMemo() {
		return this.djrIncMemo;
	}

	public void setDjrIncMemo(Boolean djrIncMemo) {
		this.djrIncMemo = djrIncMemo;
	}

	public Boolean getDjrIncStat() {
		return this.djrIncStat;
	}

	public void setDjrIncStat(Boolean djrIncStat) {
		this.djrIncStat = djrIncStat;
	}

	public String getDjrModUserid() {
		return this.djrModUserid;
	}

	public void setDjrModUserid(String djrModUserid) {
		this.djrModUserid = djrModUserid;
	}

	public Date getDjrModDate() {
		return this.djrModDate;
	}

	public void setDjrModDate(Date djrModDate) {
		this.djrModDate = djrModDate;
	}

	public Boolean getDjrNewpage() {
		return this.djrNewpage;
	}

	public void setDjrNewpage(Boolean djrNewpage) {
		this.djrNewpage = djrNewpage;
	}

	public Integer getDjrPagenum() {
		return this.djrPagenum;
	}

	public void setDjrPagenum(Integer djrPagenum) {
		this.djrPagenum = djrPagenum;
	}

	public Integer getDjrPer1() {
		return this.djrPer1;
	}

	public void setDjrPer1(Integer djrPer1) {
		this.djrPer1 = djrPer1;
	}

	public Integer getDjrPer2() {
		return this.djrPer2;
	}

	public void setDjrPer2(Integer djrPer2) {
		this.djrPer2 = djrPer2;
	}

	public String getDjrSub1() {
		return this.djrSub1;
	}

	public void setDjrSub1(String djrSub1) {
		this.djrSub1 = djrSub1;
	}

	public String getDjrSub2() {
		return this.djrSub2;
	}

	public void setDjrSub2(String djrSub2) {
		this.djrSub2 = djrSub2;
	}

	public Boolean getDjrSummary() {
		return this.djrSummary;
	}

	public void setDjrSummary(Boolean djrSummary) {
		this.djrSummary = djrSummary;
	}

	public String getDjrTitle() {
		return this.djrTitle;
	}

	public void setDjrTitle(String djrTitle) {
		this.djrTitle = djrTitle;
	}

	public String getDjrType() {
		return this.djrType;
	}

	public void setDjrType(String djrType) {
		this.djrType = djrType;
	}

	public Integer getDjrYear() {
		return this.djrYear;
	}

	public void setDjrYear(Integer djrYear) {
		this.djrYear = djrYear;
	}

	public String getDjrUser1() {
		return this.djrUser1;
	}

	public void setDjrUser1(String djrUser1) {
		this.djrUser1 = djrUser1;
	}

	public String getDjrUser2() {
		return this.djrUser2;
	}

	public void setDjrUser2(String djrUser2) {
		this.djrUser2 = djrUser2;
	}

	public String getDjrUserc03() {
		return this.djrUserc03;
	}

	public void setDjrUserc03(String djrUserc03) {
		this.djrUserc03 = djrUserc03;
	}

	public String getDjrUserc04() {
		return this.djrUserc04;
	}

	public void setDjrUserc04(String djrUserc04) {
		this.djrUserc04 = djrUserc04;
	}

	public String getDjrUserc05() {
		return this.djrUserc05;
	}

	public void setDjrUserc05(String djrUserc05) {
		this.djrUserc05 = djrUserc05;
	}

	public Double getDjrUserd01() {
		return this.djrUserd01;
	}

	public void setDjrUserd01(Double djrUserd01) {
		this.djrUserd01 = djrUserd01;
	}

	public Double getDjrUserd02() {
		return this.djrUserd02;
	}

	public void setDjrUserd02(Double djrUserd02) {
		this.djrUserd02 = djrUserd02;
	}

	public Integer getDjrUseri01() {
		return this.djrUseri01;
	}

	public void setDjrUseri01(Integer djrUseri01) {
		this.djrUseri01 = djrUseri01;
	}

	public Integer getDjrUseri02() {
		return this.djrUseri02;
	}

	public void setDjrUseri02(Integer djrUseri02) {
		this.djrUseri02 = djrUseri02;
	}

	public Boolean getDjrUserl01() {
		return this.djrUserl01;
	}

	public void setDjrUserl01(Boolean djrUserl01) {
		this.djrUserl01 = djrUserl01;
	}

	public Boolean getDjrUserl02() {
		return this.djrUserl02;
	}

	public void setDjrUserl02(Boolean djrUserl02) {
		this.djrUserl02 = djrUserl02;
	}

	public Date getDjrUsert01() {
		return this.djrUsert01;
	}

	public void setDjrUsert01(Date djrUsert01) {
		this.djrUsert01 = djrUsert01;
	}

	public Date getDjrUsert02() {
		return this.djrUsert02;
	}

	public void setDjrUsert02(Date djrUsert02) {
		this.djrUsert02 = djrUsert02;
	}

	public String getDjrQadc01() {
		return this.djrQadc01;
	}

	public void setDjrQadc01(String djrQadc01) {
		this.djrQadc01 = djrQadc01;
	}

	public String getDjrQadc02() {
		return this.djrQadc02;
	}

	public void setDjrQadc02(String djrQadc02) {
		this.djrQadc02 = djrQadc02;
	}

	public String getDjrQadc03() {
		return this.djrQadc03;
	}

	public void setDjrQadc03(String djrQadc03) {
		this.djrQadc03 = djrQadc03;
	}

	public String getDjrQadc04() {
		return this.djrQadc04;
	}

	public void setDjrQadc04(String djrQadc04) {
		this.djrQadc04 = djrQadc04;
	}

	public String getDjrQadc05() {
		return this.djrQadc05;
	}

	public void setDjrQadc05(String djrQadc05) {
		this.djrQadc05 = djrQadc05;
	}

	public Double getDjrQadd01() {
		return this.djrQadd01;
	}

	public void setDjrQadd01(Double djrQadd01) {
		this.djrQadd01 = djrQadd01;
	}

	public Double getDjrQadd02() {
		return this.djrQadd02;
	}

	public void setDjrQadd02(Double djrQadd02) {
		this.djrQadd02 = djrQadd02;
	}

	public Integer getDjrQadi01() {
		return this.djrQadi01;
	}

	public void setDjrQadi01(Integer djrQadi01) {
		this.djrQadi01 = djrQadi01;
	}

	public Integer getDjrQadi02() {
		return this.djrQadi02;
	}

	public void setDjrQadi02(Integer djrQadi02) {
		this.djrQadi02 = djrQadi02;
	}

	public Boolean getDjrQadl01() {
		return this.djrQadl01;
	}

	public void setDjrQadl01(Boolean djrQadl01) {
		this.djrQadl01 = djrQadl01;
	}

	public Boolean getDjrQadl02() {
		return this.djrQadl02;
	}

	public void setDjrQadl02(Boolean djrQadl02) {
		this.djrQadl02 = djrQadl02;
	}

	public Date getDjrQadt01() {
		return this.djrQadt01;
	}

	public void setDjrQadt01(Date djrQadt01) {
		this.djrQadt01 = djrQadt01;
	}

	public Date getDjrQadt02() {
		return this.djrQadt02;
	}

	public void setDjrQadt02(Date djrQadt02) {
		this.djrQadt02 = djrQadt02;
	}

	public Double getOidDjrMstr() {
		return this.oidDjrMstr;
	}

	public void setOidDjrMstr(Double oidDjrMstr) {
		this.oidDjrMstr = oidDjrMstr;
	}

}