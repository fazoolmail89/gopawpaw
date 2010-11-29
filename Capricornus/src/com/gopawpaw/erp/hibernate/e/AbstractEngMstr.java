package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEngMstr entity provides the base persistence definition of the
 * EngMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEngMstr implements java.io.Serializable {

	// Fields

	private EngMstrId id;
	private String engStatus;
	private String engLocation;
	private String engSkills;
	private String engArea;
	private String engPager;
	private String engGroup;
	private String engLabor;
	private Date engCpltDt;
	private Integer engCpltTm;
	private String engSort;
	private String engChr01;
	private String engChr02;
	private String engChr03;
	private String engChr04;
	private String engChr05;
	private String engSite;
	private String engLoc;
	private String engChr06;
	private String engChr07;
	private String engChr08;
	private String engChr09;
	private String engChr10;
	private Double engDec01;
	private Double engDec02;
	private Double engDec03;
	private Date engDte01;
	private Date engDte02;
	private Date engDte03;
	private Date engDte04;
	private Boolean engLog01;
	private Boolean engLog02;
	private Boolean engLog03;
	private Boolean engLog04;
	private Boolean engLog05;
	private String engLocRtn;
	private String engSiteRtn;
	private Boolean engSub;
	private String engUser1;
	private String engUser2;
	private Integer engCallLoad;
	private String engCode;
	private Boolean engField;
	private String engEshSchedule;
	private Boolean eng3rdParty;
	private Boolean engAvailOt;
	private String engQadc01;
	private String engQadc02;
	private Date engQadd01;
	private Date engQadd02;
	private Double engQadde01;
	private Integer engQadi01;
	private Integer engQadi02;
	private Boolean engQadl01;
	private Boolean engQadl02;
	private String engModUserid;
	private Date engModDate;
	private String engAddress;
	private Double oidEngMstr;

	// Constructors

	/** default constructor */
	public AbstractEngMstr() {
	}

	/** minimal constructor */
	public AbstractEngMstr(EngMstrId id, Double oidEngMstr) {
		this.id = id;
		this.oidEngMstr = oidEngMstr;
	}

	/** full constructor */
	public AbstractEngMstr(EngMstrId id, String engStatus, String engLocation,
			String engSkills, String engArea, String engPager, String engGroup,
			String engLabor, Date engCpltDt, Integer engCpltTm, String engSort,
			String engChr01, String engChr02, String engChr03, String engChr04,
			String engChr05, String engSite, String engLoc, String engChr06,
			String engChr07, String engChr08, String engChr09, String engChr10,
			Double engDec01, Double engDec02, Double engDec03, Date engDte01,
			Date engDte02, Date engDte03, Date engDte04, Boolean engLog01,
			Boolean engLog02, Boolean engLog03, Boolean engLog04,
			Boolean engLog05, String engLocRtn, String engSiteRtn,
			Boolean engSub, String engUser1, String engUser2,
			Integer engCallLoad, String engCode, Boolean engField,
			String engEshSchedule, Boolean eng3rdParty, Boolean engAvailOt,
			String engQadc01, String engQadc02, Date engQadd01, Date engQadd02,
			Double engQadde01, Integer engQadi01, Integer engQadi02,
			Boolean engQadl01, Boolean engQadl02, String engModUserid,
			Date engModDate, String engAddress, Double oidEngMstr) {
		this.id = id;
		this.engStatus = engStatus;
		this.engLocation = engLocation;
		this.engSkills = engSkills;
		this.engArea = engArea;
		this.engPager = engPager;
		this.engGroup = engGroup;
		this.engLabor = engLabor;
		this.engCpltDt = engCpltDt;
		this.engCpltTm = engCpltTm;
		this.engSort = engSort;
		this.engChr01 = engChr01;
		this.engChr02 = engChr02;
		this.engChr03 = engChr03;
		this.engChr04 = engChr04;
		this.engChr05 = engChr05;
		this.engSite = engSite;
		this.engLoc = engLoc;
		this.engChr06 = engChr06;
		this.engChr07 = engChr07;
		this.engChr08 = engChr08;
		this.engChr09 = engChr09;
		this.engChr10 = engChr10;
		this.engDec01 = engDec01;
		this.engDec02 = engDec02;
		this.engDec03 = engDec03;
		this.engDte01 = engDte01;
		this.engDte02 = engDte02;
		this.engDte03 = engDte03;
		this.engDte04 = engDte04;
		this.engLog01 = engLog01;
		this.engLog02 = engLog02;
		this.engLog03 = engLog03;
		this.engLog04 = engLog04;
		this.engLog05 = engLog05;
		this.engLocRtn = engLocRtn;
		this.engSiteRtn = engSiteRtn;
		this.engSub = engSub;
		this.engUser1 = engUser1;
		this.engUser2 = engUser2;
		this.engCallLoad = engCallLoad;
		this.engCode = engCode;
		this.engField = engField;
		this.engEshSchedule = engEshSchedule;
		this.eng3rdParty = eng3rdParty;
		this.engAvailOt = engAvailOt;
		this.engQadc01 = engQadc01;
		this.engQadc02 = engQadc02;
		this.engQadd01 = engQadd01;
		this.engQadd02 = engQadd02;
		this.engQadde01 = engQadde01;
		this.engQadi01 = engQadi01;
		this.engQadi02 = engQadi02;
		this.engQadl01 = engQadl01;
		this.engQadl02 = engQadl02;
		this.engModUserid = engModUserid;
		this.engModDate = engModDate;
		this.engAddress = engAddress;
		this.oidEngMstr = oidEngMstr;
	}

	// Property accessors

	public EngMstrId getId() {
		return this.id;
	}

	public void setId(EngMstrId id) {
		this.id = id;
	}

	public String getEngStatus() {
		return this.engStatus;
	}

	public void setEngStatus(String engStatus) {
		this.engStatus = engStatus;
	}

	public String getEngLocation() {
		return this.engLocation;
	}

	public void setEngLocation(String engLocation) {
		this.engLocation = engLocation;
	}

	public String getEngSkills() {
		return this.engSkills;
	}

	public void setEngSkills(String engSkills) {
		this.engSkills = engSkills;
	}

	public String getEngArea() {
		return this.engArea;
	}

	public void setEngArea(String engArea) {
		this.engArea = engArea;
	}

	public String getEngPager() {
		return this.engPager;
	}

	public void setEngPager(String engPager) {
		this.engPager = engPager;
	}

	public String getEngGroup() {
		return this.engGroup;
	}

	public void setEngGroup(String engGroup) {
		this.engGroup = engGroup;
	}

	public String getEngLabor() {
		return this.engLabor;
	}

	public void setEngLabor(String engLabor) {
		this.engLabor = engLabor;
	}

	public Date getEngCpltDt() {
		return this.engCpltDt;
	}

	public void setEngCpltDt(Date engCpltDt) {
		this.engCpltDt = engCpltDt;
	}

	public Integer getEngCpltTm() {
		return this.engCpltTm;
	}

	public void setEngCpltTm(Integer engCpltTm) {
		this.engCpltTm = engCpltTm;
	}

	public String getEngSort() {
		return this.engSort;
	}

	public void setEngSort(String engSort) {
		this.engSort = engSort;
	}

	public String getEngChr01() {
		return this.engChr01;
	}

	public void setEngChr01(String engChr01) {
		this.engChr01 = engChr01;
	}

	public String getEngChr02() {
		return this.engChr02;
	}

	public void setEngChr02(String engChr02) {
		this.engChr02 = engChr02;
	}

	public String getEngChr03() {
		return this.engChr03;
	}

	public void setEngChr03(String engChr03) {
		this.engChr03 = engChr03;
	}

	public String getEngChr04() {
		return this.engChr04;
	}

	public void setEngChr04(String engChr04) {
		this.engChr04 = engChr04;
	}

	public String getEngChr05() {
		return this.engChr05;
	}

	public void setEngChr05(String engChr05) {
		this.engChr05 = engChr05;
	}

	public String getEngSite() {
		return this.engSite;
	}

	public void setEngSite(String engSite) {
		this.engSite = engSite;
	}

	public String getEngLoc() {
		return this.engLoc;
	}

	public void setEngLoc(String engLoc) {
		this.engLoc = engLoc;
	}

	public String getEngChr06() {
		return this.engChr06;
	}

	public void setEngChr06(String engChr06) {
		this.engChr06 = engChr06;
	}

	public String getEngChr07() {
		return this.engChr07;
	}

	public void setEngChr07(String engChr07) {
		this.engChr07 = engChr07;
	}

	public String getEngChr08() {
		return this.engChr08;
	}

	public void setEngChr08(String engChr08) {
		this.engChr08 = engChr08;
	}

	public String getEngChr09() {
		return this.engChr09;
	}

	public void setEngChr09(String engChr09) {
		this.engChr09 = engChr09;
	}

	public String getEngChr10() {
		return this.engChr10;
	}

	public void setEngChr10(String engChr10) {
		this.engChr10 = engChr10;
	}

	public Double getEngDec01() {
		return this.engDec01;
	}

	public void setEngDec01(Double engDec01) {
		this.engDec01 = engDec01;
	}

	public Double getEngDec02() {
		return this.engDec02;
	}

	public void setEngDec02(Double engDec02) {
		this.engDec02 = engDec02;
	}

	public Double getEngDec03() {
		return this.engDec03;
	}

	public void setEngDec03(Double engDec03) {
		this.engDec03 = engDec03;
	}

	public Date getEngDte01() {
		return this.engDte01;
	}

	public void setEngDte01(Date engDte01) {
		this.engDte01 = engDte01;
	}

	public Date getEngDte02() {
		return this.engDte02;
	}

	public void setEngDte02(Date engDte02) {
		this.engDte02 = engDte02;
	}

	public Date getEngDte03() {
		return this.engDte03;
	}

	public void setEngDte03(Date engDte03) {
		this.engDte03 = engDte03;
	}

	public Date getEngDte04() {
		return this.engDte04;
	}

	public void setEngDte04(Date engDte04) {
		this.engDte04 = engDte04;
	}

	public Boolean getEngLog01() {
		return this.engLog01;
	}

	public void setEngLog01(Boolean engLog01) {
		this.engLog01 = engLog01;
	}

	public Boolean getEngLog02() {
		return this.engLog02;
	}

	public void setEngLog02(Boolean engLog02) {
		this.engLog02 = engLog02;
	}

	public Boolean getEngLog03() {
		return this.engLog03;
	}

	public void setEngLog03(Boolean engLog03) {
		this.engLog03 = engLog03;
	}

	public Boolean getEngLog04() {
		return this.engLog04;
	}

	public void setEngLog04(Boolean engLog04) {
		this.engLog04 = engLog04;
	}

	public Boolean getEngLog05() {
		return this.engLog05;
	}

	public void setEngLog05(Boolean engLog05) {
		this.engLog05 = engLog05;
	}

	public String getEngLocRtn() {
		return this.engLocRtn;
	}

	public void setEngLocRtn(String engLocRtn) {
		this.engLocRtn = engLocRtn;
	}

	public String getEngSiteRtn() {
		return this.engSiteRtn;
	}

	public void setEngSiteRtn(String engSiteRtn) {
		this.engSiteRtn = engSiteRtn;
	}

	public Boolean getEngSub() {
		return this.engSub;
	}

	public void setEngSub(Boolean engSub) {
		this.engSub = engSub;
	}

	public String getEngUser1() {
		return this.engUser1;
	}

	public void setEngUser1(String engUser1) {
		this.engUser1 = engUser1;
	}

	public String getEngUser2() {
		return this.engUser2;
	}

	public void setEngUser2(String engUser2) {
		this.engUser2 = engUser2;
	}

	public Integer getEngCallLoad() {
		return this.engCallLoad;
	}

	public void setEngCallLoad(Integer engCallLoad) {
		this.engCallLoad = engCallLoad;
	}

	public String getEngCode() {
		return this.engCode;
	}

	public void setEngCode(String engCode) {
		this.engCode = engCode;
	}

	public Boolean getEngField() {
		return this.engField;
	}

	public void setEngField(Boolean engField) {
		this.engField = engField;
	}

	public String getEngEshSchedule() {
		return this.engEshSchedule;
	}

	public void setEngEshSchedule(String engEshSchedule) {
		this.engEshSchedule = engEshSchedule;
	}

	public Boolean getEng3rdParty() {
		return this.eng3rdParty;
	}

	public void setEng3rdParty(Boolean eng3rdParty) {
		this.eng3rdParty = eng3rdParty;
	}

	public Boolean getEngAvailOt() {
		return this.engAvailOt;
	}

	public void setEngAvailOt(Boolean engAvailOt) {
		this.engAvailOt = engAvailOt;
	}

	public String getEngQadc01() {
		return this.engQadc01;
	}

	public void setEngQadc01(String engQadc01) {
		this.engQadc01 = engQadc01;
	}

	public String getEngQadc02() {
		return this.engQadc02;
	}

	public void setEngQadc02(String engQadc02) {
		this.engQadc02 = engQadc02;
	}

	public Date getEngQadd01() {
		return this.engQadd01;
	}

	public void setEngQadd01(Date engQadd01) {
		this.engQadd01 = engQadd01;
	}

	public Date getEngQadd02() {
		return this.engQadd02;
	}

	public void setEngQadd02(Date engQadd02) {
		this.engQadd02 = engQadd02;
	}

	public Double getEngQadde01() {
		return this.engQadde01;
	}

	public void setEngQadde01(Double engQadde01) {
		this.engQadde01 = engQadde01;
	}

	public Integer getEngQadi01() {
		return this.engQadi01;
	}

	public void setEngQadi01(Integer engQadi01) {
		this.engQadi01 = engQadi01;
	}

	public Integer getEngQadi02() {
		return this.engQadi02;
	}

	public void setEngQadi02(Integer engQadi02) {
		this.engQadi02 = engQadi02;
	}

	public Boolean getEngQadl01() {
		return this.engQadl01;
	}

	public void setEngQadl01(Boolean engQadl01) {
		this.engQadl01 = engQadl01;
	}

	public Boolean getEngQadl02() {
		return this.engQadl02;
	}

	public void setEngQadl02(Boolean engQadl02) {
		this.engQadl02 = engQadl02;
	}

	public String getEngModUserid() {
		return this.engModUserid;
	}

	public void setEngModUserid(String engModUserid) {
		this.engModUserid = engModUserid;
	}

	public Date getEngModDate() {
		return this.engModDate;
	}

	public void setEngModDate(Date engModDate) {
		this.engModDate = engModDate;
	}

	public String getEngAddress() {
		return this.engAddress;
	}

	public void setEngAddress(String engAddress) {
		this.engAddress = engAddress;
	}

	public Double getOidEngMstr() {
		return this.oidEngMstr;
	}

	public void setOidEngMstr(Double oidEngMstr) {
		this.oidEngMstr = oidEngMstr;
	}

}