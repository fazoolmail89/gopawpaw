package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIedDet entity provides the base persistence definition of the IedDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIedDet implements java.io.Serializable {

	// Fields

	private IedDetId id;
	private String iedComCode;
	private String iedCtryOrigin;
	private String iedModeTransp;
	private String iedNatTrans;
	private String iedPortArrdisp;
	private String iedPortTransh;
	private String iedStatProc;
	private String iedTermsDeliv;
	private String iedUserid;
	private Date iedModDate;
	private String iedCtryDesdisp;
	private Boolean iedIntrastat;
	private String iedRegion;
	private String iedChr01;
	private String iedChr02;
	private String iedChr03;
	private String iedChr04;
	private String iedChr05;
	private Double iedDec01;
	private Double iedDec02;
	private Double iedDec03;
	private Double iedDec04;
	private Double iedDec05;
	private Date iedDte01;
	private Date iedDte02;
	private Date iedDte03;
	private Date iedDte04;
	private Date iedDte05;
	private Boolean iedLog01;
	private Boolean iedLog02;
	private Boolean iedLog03;
	private String iedQadc01;
	private String iedQadc02;
	private String iedQadc03;
	private String iedQadc04;
	private String iedQadc05;
	private Double iedQadd01;
	private Double iedQadd02;
	private Double iedQadd03;
	private Double iedQadd04;
	private Double iedQadd05;
	private Boolean iedQadl01;
	private Boolean iedQadl02;
	private Boolean iedQadl03;
	private Boolean iedQadl04;
	private Boolean iedQadl05;
	private Date iedQadt01;
	private Date iedQadt02;
	private Date iedQadt03;
	private Boolean iedLog04;
	private Boolean iedLog05;
	private Boolean iedLog06;
	private String iedUser1;
	private String iedUser2;
	private String iedShipvia;
	private String iedAffiliation;
	private String iedItemSpec;
	private Integer iedCsa;
	private Boolean iedContainer;
	private Integer iedPreference;
	private String iedDeclRegion;
	private String iedReqNbr;
	private Integer iedTrnbr;
	private Double oidIedDet;

	// Constructors

	/** default constructor */
	public AbstractIedDet() {
	}

	/** minimal constructor */
	public AbstractIedDet(IedDetId id, String iedShipvia,
			String iedAffiliation, String iedItemSpec, Integer iedCsa,
			Boolean iedContainer, Integer iedPreference, String iedDeclRegion,
			String iedReqNbr, Integer iedTrnbr, Double oidIedDet) {
		this.id = id;
		this.iedShipvia = iedShipvia;
		this.iedAffiliation = iedAffiliation;
		this.iedItemSpec = iedItemSpec;
		this.iedCsa = iedCsa;
		this.iedContainer = iedContainer;
		this.iedPreference = iedPreference;
		this.iedDeclRegion = iedDeclRegion;
		this.iedReqNbr = iedReqNbr;
		this.iedTrnbr = iedTrnbr;
		this.oidIedDet = oidIedDet;
	}

	/** full constructor */
	public AbstractIedDet(IedDetId id, String iedComCode, String iedCtryOrigin,
			String iedModeTransp, String iedNatTrans, String iedPortArrdisp,
			String iedPortTransh, String iedStatProc, String iedTermsDeliv,
			String iedUserid, Date iedModDate, String iedCtryDesdisp,
			Boolean iedIntrastat, String iedRegion, String iedChr01,
			String iedChr02, String iedChr03, String iedChr04, String iedChr05,
			Double iedDec01, Double iedDec02, Double iedDec03, Double iedDec04,
			Double iedDec05, Date iedDte01, Date iedDte02, Date iedDte03,
			Date iedDte04, Date iedDte05, Boolean iedLog01, Boolean iedLog02,
			Boolean iedLog03, String iedQadc01, String iedQadc02,
			String iedQadc03, String iedQadc04, String iedQadc05,
			Double iedQadd01, Double iedQadd02, Double iedQadd03,
			Double iedQadd04, Double iedQadd05, Boolean iedQadl01,
			Boolean iedQadl02, Boolean iedQadl03, Boolean iedQadl04,
			Boolean iedQadl05, Date iedQadt01, Date iedQadt02, Date iedQadt03,
			Boolean iedLog04, Boolean iedLog05, Boolean iedLog06,
			String iedUser1, String iedUser2, String iedShipvia,
			String iedAffiliation, String iedItemSpec, Integer iedCsa,
			Boolean iedContainer, Integer iedPreference, String iedDeclRegion,
			String iedReqNbr, Integer iedTrnbr, Double oidIedDet) {
		this.id = id;
		this.iedComCode = iedComCode;
		this.iedCtryOrigin = iedCtryOrigin;
		this.iedModeTransp = iedModeTransp;
		this.iedNatTrans = iedNatTrans;
		this.iedPortArrdisp = iedPortArrdisp;
		this.iedPortTransh = iedPortTransh;
		this.iedStatProc = iedStatProc;
		this.iedTermsDeliv = iedTermsDeliv;
		this.iedUserid = iedUserid;
		this.iedModDate = iedModDate;
		this.iedCtryDesdisp = iedCtryDesdisp;
		this.iedIntrastat = iedIntrastat;
		this.iedRegion = iedRegion;
		this.iedChr01 = iedChr01;
		this.iedChr02 = iedChr02;
		this.iedChr03 = iedChr03;
		this.iedChr04 = iedChr04;
		this.iedChr05 = iedChr05;
		this.iedDec01 = iedDec01;
		this.iedDec02 = iedDec02;
		this.iedDec03 = iedDec03;
		this.iedDec04 = iedDec04;
		this.iedDec05 = iedDec05;
		this.iedDte01 = iedDte01;
		this.iedDte02 = iedDte02;
		this.iedDte03 = iedDte03;
		this.iedDte04 = iedDte04;
		this.iedDte05 = iedDte05;
		this.iedLog01 = iedLog01;
		this.iedLog02 = iedLog02;
		this.iedLog03 = iedLog03;
		this.iedQadc01 = iedQadc01;
		this.iedQadc02 = iedQadc02;
		this.iedQadc03 = iedQadc03;
		this.iedQadc04 = iedQadc04;
		this.iedQadc05 = iedQadc05;
		this.iedQadd01 = iedQadd01;
		this.iedQadd02 = iedQadd02;
		this.iedQadd03 = iedQadd03;
		this.iedQadd04 = iedQadd04;
		this.iedQadd05 = iedQadd05;
		this.iedQadl01 = iedQadl01;
		this.iedQadl02 = iedQadl02;
		this.iedQadl03 = iedQadl03;
		this.iedQadl04 = iedQadl04;
		this.iedQadl05 = iedQadl05;
		this.iedQadt01 = iedQadt01;
		this.iedQadt02 = iedQadt02;
		this.iedQadt03 = iedQadt03;
		this.iedLog04 = iedLog04;
		this.iedLog05 = iedLog05;
		this.iedLog06 = iedLog06;
		this.iedUser1 = iedUser1;
		this.iedUser2 = iedUser2;
		this.iedShipvia = iedShipvia;
		this.iedAffiliation = iedAffiliation;
		this.iedItemSpec = iedItemSpec;
		this.iedCsa = iedCsa;
		this.iedContainer = iedContainer;
		this.iedPreference = iedPreference;
		this.iedDeclRegion = iedDeclRegion;
		this.iedReqNbr = iedReqNbr;
		this.iedTrnbr = iedTrnbr;
		this.oidIedDet = oidIedDet;
	}

	// Property accessors

	public IedDetId getId() {
		return this.id;
	}

	public void setId(IedDetId id) {
		this.id = id;
	}

	public String getIedComCode() {
		return this.iedComCode;
	}

	public void setIedComCode(String iedComCode) {
		this.iedComCode = iedComCode;
	}

	public String getIedCtryOrigin() {
		return this.iedCtryOrigin;
	}

	public void setIedCtryOrigin(String iedCtryOrigin) {
		this.iedCtryOrigin = iedCtryOrigin;
	}

	public String getIedModeTransp() {
		return this.iedModeTransp;
	}

	public void setIedModeTransp(String iedModeTransp) {
		this.iedModeTransp = iedModeTransp;
	}

	public String getIedNatTrans() {
		return this.iedNatTrans;
	}

	public void setIedNatTrans(String iedNatTrans) {
		this.iedNatTrans = iedNatTrans;
	}

	public String getIedPortArrdisp() {
		return this.iedPortArrdisp;
	}

	public void setIedPortArrdisp(String iedPortArrdisp) {
		this.iedPortArrdisp = iedPortArrdisp;
	}

	public String getIedPortTransh() {
		return this.iedPortTransh;
	}

	public void setIedPortTransh(String iedPortTransh) {
		this.iedPortTransh = iedPortTransh;
	}

	public String getIedStatProc() {
		return this.iedStatProc;
	}

	public void setIedStatProc(String iedStatProc) {
		this.iedStatProc = iedStatProc;
	}

	public String getIedTermsDeliv() {
		return this.iedTermsDeliv;
	}

	public void setIedTermsDeliv(String iedTermsDeliv) {
		this.iedTermsDeliv = iedTermsDeliv;
	}

	public String getIedUserid() {
		return this.iedUserid;
	}

	public void setIedUserid(String iedUserid) {
		this.iedUserid = iedUserid;
	}

	public Date getIedModDate() {
		return this.iedModDate;
	}

	public void setIedModDate(Date iedModDate) {
		this.iedModDate = iedModDate;
	}

	public String getIedCtryDesdisp() {
		return this.iedCtryDesdisp;
	}

	public void setIedCtryDesdisp(String iedCtryDesdisp) {
		this.iedCtryDesdisp = iedCtryDesdisp;
	}

	public Boolean getIedIntrastat() {
		return this.iedIntrastat;
	}

	public void setIedIntrastat(Boolean iedIntrastat) {
		this.iedIntrastat = iedIntrastat;
	}

	public String getIedRegion() {
		return this.iedRegion;
	}

	public void setIedRegion(String iedRegion) {
		this.iedRegion = iedRegion;
	}

	public String getIedChr01() {
		return this.iedChr01;
	}

	public void setIedChr01(String iedChr01) {
		this.iedChr01 = iedChr01;
	}

	public String getIedChr02() {
		return this.iedChr02;
	}

	public void setIedChr02(String iedChr02) {
		this.iedChr02 = iedChr02;
	}

	public String getIedChr03() {
		return this.iedChr03;
	}

	public void setIedChr03(String iedChr03) {
		this.iedChr03 = iedChr03;
	}

	public String getIedChr04() {
		return this.iedChr04;
	}

	public void setIedChr04(String iedChr04) {
		this.iedChr04 = iedChr04;
	}

	public String getIedChr05() {
		return this.iedChr05;
	}

	public void setIedChr05(String iedChr05) {
		this.iedChr05 = iedChr05;
	}

	public Double getIedDec01() {
		return this.iedDec01;
	}

	public void setIedDec01(Double iedDec01) {
		this.iedDec01 = iedDec01;
	}

	public Double getIedDec02() {
		return this.iedDec02;
	}

	public void setIedDec02(Double iedDec02) {
		this.iedDec02 = iedDec02;
	}

	public Double getIedDec03() {
		return this.iedDec03;
	}

	public void setIedDec03(Double iedDec03) {
		this.iedDec03 = iedDec03;
	}

	public Double getIedDec04() {
		return this.iedDec04;
	}

	public void setIedDec04(Double iedDec04) {
		this.iedDec04 = iedDec04;
	}

	public Double getIedDec05() {
		return this.iedDec05;
	}

	public void setIedDec05(Double iedDec05) {
		this.iedDec05 = iedDec05;
	}

	public Date getIedDte01() {
		return this.iedDte01;
	}

	public void setIedDte01(Date iedDte01) {
		this.iedDte01 = iedDte01;
	}

	public Date getIedDte02() {
		return this.iedDte02;
	}

	public void setIedDte02(Date iedDte02) {
		this.iedDte02 = iedDte02;
	}

	public Date getIedDte03() {
		return this.iedDte03;
	}

	public void setIedDte03(Date iedDte03) {
		this.iedDte03 = iedDte03;
	}

	public Date getIedDte04() {
		return this.iedDte04;
	}

	public void setIedDte04(Date iedDte04) {
		this.iedDte04 = iedDte04;
	}

	public Date getIedDte05() {
		return this.iedDte05;
	}

	public void setIedDte05(Date iedDte05) {
		this.iedDte05 = iedDte05;
	}

	public Boolean getIedLog01() {
		return this.iedLog01;
	}

	public void setIedLog01(Boolean iedLog01) {
		this.iedLog01 = iedLog01;
	}

	public Boolean getIedLog02() {
		return this.iedLog02;
	}

	public void setIedLog02(Boolean iedLog02) {
		this.iedLog02 = iedLog02;
	}

	public Boolean getIedLog03() {
		return this.iedLog03;
	}

	public void setIedLog03(Boolean iedLog03) {
		this.iedLog03 = iedLog03;
	}

	public String getIedQadc01() {
		return this.iedQadc01;
	}

	public void setIedQadc01(String iedQadc01) {
		this.iedQadc01 = iedQadc01;
	}

	public String getIedQadc02() {
		return this.iedQadc02;
	}

	public void setIedQadc02(String iedQadc02) {
		this.iedQadc02 = iedQadc02;
	}

	public String getIedQadc03() {
		return this.iedQadc03;
	}

	public void setIedQadc03(String iedQadc03) {
		this.iedQadc03 = iedQadc03;
	}

	public String getIedQadc04() {
		return this.iedQadc04;
	}

	public void setIedQadc04(String iedQadc04) {
		this.iedQadc04 = iedQadc04;
	}

	public String getIedQadc05() {
		return this.iedQadc05;
	}

	public void setIedQadc05(String iedQadc05) {
		this.iedQadc05 = iedQadc05;
	}

	public Double getIedQadd01() {
		return this.iedQadd01;
	}

	public void setIedQadd01(Double iedQadd01) {
		this.iedQadd01 = iedQadd01;
	}

	public Double getIedQadd02() {
		return this.iedQadd02;
	}

	public void setIedQadd02(Double iedQadd02) {
		this.iedQadd02 = iedQadd02;
	}

	public Double getIedQadd03() {
		return this.iedQadd03;
	}

	public void setIedQadd03(Double iedQadd03) {
		this.iedQadd03 = iedQadd03;
	}

	public Double getIedQadd04() {
		return this.iedQadd04;
	}

	public void setIedQadd04(Double iedQadd04) {
		this.iedQadd04 = iedQadd04;
	}

	public Double getIedQadd05() {
		return this.iedQadd05;
	}

	public void setIedQadd05(Double iedQadd05) {
		this.iedQadd05 = iedQadd05;
	}

	public Boolean getIedQadl01() {
		return this.iedQadl01;
	}

	public void setIedQadl01(Boolean iedQadl01) {
		this.iedQadl01 = iedQadl01;
	}

	public Boolean getIedQadl02() {
		return this.iedQadl02;
	}

	public void setIedQadl02(Boolean iedQadl02) {
		this.iedQadl02 = iedQadl02;
	}

	public Boolean getIedQadl03() {
		return this.iedQadl03;
	}

	public void setIedQadl03(Boolean iedQadl03) {
		this.iedQadl03 = iedQadl03;
	}

	public Boolean getIedQadl04() {
		return this.iedQadl04;
	}

	public void setIedQadl04(Boolean iedQadl04) {
		this.iedQadl04 = iedQadl04;
	}

	public Boolean getIedQadl05() {
		return this.iedQadl05;
	}

	public void setIedQadl05(Boolean iedQadl05) {
		this.iedQadl05 = iedQadl05;
	}

	public Date getIedQadt01() {
		return this.iedQadt01;
	}

	public void setIedQadt01(Date iedQadt01) {
		this.iedQadt01 = iedQadt01;
	}

	public Date getIedQadt02() {
		return this.iedQadt02;
	}

	public void setIedQadt02(Date iedQadt02) {
		this.iedQadt02 = iedQadt02;
	}

	public Date getIedQadt03() {
		return this.iedQadt03;
	}

	public void setIedQadt03(Date iedQadt03) {
		this.iedQadt03 = iedQadt03;
	}

	public Boolean getIedLog04() {
		return this.iedLog04;
	}

	public void setIedLog04(Boolean iedLog04) {
		this.iedLog04 = iedLog04;
	}

	public Boolean getIedLog05() {
		return this.iedLog05;
	}

	public void setIedLog05(Boolean iedLog05) {
		this.iedLog05 = iedLog05;
	}

	public Boolean getIedLog06() {
		return this.iedLog06;
	}

	public void setIedLog06(Boolean iedLog06) {
		this.iedLog06 = iedLog06;
	}

	public String getIedUser1() {
		return this.iedUser1;
	}

	public void setIedUser1(String iedUser1) {
		this.iedUser1 = iedUser1;
	}

	public String getIedUser2() {
		return this.iedUser2;
	}

	public void setIedUser2(String iedUser2) {
		this.iedUser2 = iedUser2;
	}

	public String getIedShipvia() {
		return this.iedShipvia;
	}

	public void setIedShipvia(String iedShipvia) {
		this.iedShipvia = iedShipvia;
	}

	public String getIedAffiliation() {
		return this.iedAffiliation;
	}

	public void setIedAffiliation(String iedAffiliation) {
		this.iedAffiliation = iedAffiliation;
	}

	public String getIedItemSpec() {
		return this.iedItemSpec;
	}

	public void setIedItemSpec(String iedItemSpec) {
		this.iedItemSpec = iedItemSpec;
	}

	public Integer getIedCsa() {
		return this.iedCsa;
	}

	public void setIedCsa(Integer iedCsa) {
		this.iedCsa = iedCsa;
	}

	public Boolean getIedContainer() {
		return this.iedContainer;
	}

	public void setIedContainer(Boolean iedContainer) {
		this.iedContainer = iedContainer;
	}

	public Integer getIedPreference() {
		return this.iedPreference;
	}

	public void setIedPreference(Integer iedPreference) {
		this.iedPreference = iedPreference;
	}

	public String getIedDeclRegion() {
		return this.iedDeclRegion;
	}

	public void setIedDeclRegion(String iedDeclRegion) {
		this.iedDeclRegion = iedDeclRegion;
	}

	public String getIedReqNbr() {
		return this.iedReqNbr;
	}

	public void setIedReqNbr(String iedReqNbr) {
		this.iedReqNbr = iedReqNbr;
	}

	public Integer getIedTrnbr() {
		return this.iedTrnbr;
	}

	public void setIedTrnbr(Integer iedTrnbr) {
		this.iedTrnbr = iedTrnbr;
	}

	public Double getOidIedDet() {
		return this.oidIedDet;
	}

	public void setOidIedDet(Double oidIedDet) {
		this.oidIedDet = oidIedDet;
	}

}