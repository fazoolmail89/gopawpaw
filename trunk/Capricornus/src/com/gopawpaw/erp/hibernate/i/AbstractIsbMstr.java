package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIsbMstr entity provides the base persistence definition of the
 * IsbMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIsbMstr implements java.io.Serializable {

	// Fields

	private IsbMstrId id;
	private Integer isbSeq;
	private Integer isbQadi03;
	private Integer isbWarrDur;
	private String isbStatus;
	private String isbQadc04;
	private Integer isbQadi04;
	private String isbRev;
	private Date isbInsDate;
	private Date isbLastPm;
	private Integer isbPmDays;
	private String isbSoNbr;
	private String isbDesc1;
	private String isbDesc2;
	private String isbWarrCd;
	private Boolean isbComp;
	private Boolean isbParent;
	private Date isbWarrExp;
	private Date isbNextPm;
	private Integer isbSoLine;
	private String isbInvNbr;
	private String isbOwner;
	private String isbTarrif;
	private String isbOrigin;
	private String isbSysType;
	private String isbChr01;
	private String isbChr02;
	private String isbChr03;
	private String isbChr04;
	private String isbChr05;
	private String isbChr06;
	private String isbChr07;
	private String isbChr08;
	private String isbChr09;
	private String isbChr10;
	private Double isbDec01;
	private Double isbDec02;
	private Double isbDec03;
	private Date isbDte01;
	private Date isbDte02;
	private Date isbDte03;
	private Date isbDte04;
	private Boolean isbLog01;
	private Boolean isbLog02;
	private Boolean isbLog03;
	private Boolean isbLog04;
	private Boolean isbLog05;
	private Date isbLstUpd;
	private String isbPmUm;
	private String isbLocation;
	private String isbUser1;
	private String isbUser2;
	private String isbArticle;
	private Double isbCalibration;
	private Date isbCalibDate;
	private Integer isbCmtindx;
	private String isbCustomerId;
	private String isbEco;
	private String isbIcRef;
	private String isbModel;
	private Date isbOrigIns;
	private Double isbPriceSold;
	private Boolean isbRebuild;
	private Date isbShipDate;
	private String isbSoldTo;
	private String isbUpdates;
	private Boolean isbPlantMaint;
	private Integer isbEudTrnbr;
	private String isbEngCode;
	private Date isbLbWarrExp;
	private String isbModUserid;
	private Date isbModDate;
	private String isbQadc01;
	private String isbQadc02;
	private String isbQadc03;
	private Date isbQadt01;
	private Date isbQadt02;
	private Date isbQadt03;
	private Double isbQade01;
	private Double isbQade02;
	private Double isbQade03;
	private Integer isbQadi01;
	private Integer isbQadi02;
	private Boolean isbQadl01;
	private Boolean isbQadl02;
	private Boolean isbQadl03;
	private Double isbQty;
	private Double isbMeterRdg;
	private Date isbMeterDate;
	private Double isbMeterInterval;
	private String isbMeterUm;
	private Boolean isbWarrOverride;
	private Double oidIsbMstr;

	// Constructors

	/** default constructor */
	public AbstractIsbMstr() {
	}

	/** minimal constructor */
	public AbstractIsbMstr(IsbMstrId id, Double oidIsbMstr) {
		this.id = id;
		this.oidIsbMstr = oidIsbMstr;
	}

	/** full constructor */
	public AbstractIsbMstr(IsbMstrId id, Integer isbSeq, Integer isbQadi03,
			Integer isbWarrDur, String isbStatus, String isbQadc04,
			Integer isbQadi04, String isbRev, Date isbInsDate, Date isbLastPm,
			Integer isbPmDays, String isbSoNbr, String isbDesc1,
			String isbDesc2, String isbWarrCd, Boolean isbComp,
			Boolean isbParent, Date isbWarrExp, Date isbNextPm,
			Integer isbSoLine, String isbInvNbr, String isbOwner,
			String isbTarrif, String isbOrigin, String isbSysType,
			String isbChr01, String isbChr02, String isbChr03, String isbChr04,
			String isbChr05, String isbChr06, String isbChr07, String isbChr08,
			String isbChr09, String isbChr10, Double isbDec01, Double isbDec02,
			Double isbDec03, Date isbDte01, Date isbDte02, Date isbDte03,
			Date isbDte04, Boolean isbLog01, Boolean isbLog02,
			Boolean isbLog03, Boolean isbLog04, Boolean isbLog05,
			Date isbLstUpd, String isbPmUm, String isbLocation,
			String isbUser1, String isbUser2, String isbArticle,
			Double isbCalibration, Date isbCalibDate, Integer isbCmtindx,
			String isbCustomerId, String isbEco, String isbIcRef,
			String isbModel, Date isbOrigIns, Double isbPriceSold,
			Boolean isbRebuild, Date isbShipDate, String isbSoldTo,
			String isbUpdates, Boolean isbPlantMaint, Integer isbEudTrnbr,
			String isbEngCode, Date isbLbWarrExp, String isbModUserid,
			Date isbModDate, String isbQadc01, String isbQadc02,
			String isbQadc03, Date isbQadt01, Date isbQadt02, Date isbQadt03,
			Double isbQade01, Double isbQade02, Double isbQade03,
			Integer isbQadi01, Integer isbQadi02, Boolean isbQadl01,
			Boolean isbQadl02, Boolean isbQadl03, Double isbQty,
			Double isbMeterRdg, Date isbMeterDate, Double isbMeterInterval,
			String isbMeterUm, Boolean isbWarrOverride, Double oidIsbMstr) {
		this.id = id;
		this.isbSeq = isbSeq;
		this.isbQadi03 = isbQadi03;
		this.isbWarrDur = isbWarrDur;
		this.isbStatus = isbStatus;
		this.isbQadc04 = isbQadc04;
		this.isbQadi04 = isbQadi04;
		this.isbRev = isbRev;
		this.isbInsDate = isbInsDate;
		this.isbLastPm = isbLastPm;
		this.isbPmDays = isbPmDays;
		this.isbSoNbr = isbSoNbr;
		this.isbDesc1 = isbDesc1;
		this.isbDesc2 = isbDesc2;
		this.isbWarrCd = isbWarrCd;
		this.isbComp = isbComp;
		this.isbParent = isbParent;
		this.isbWarrExp = isbWarrExp;
		this.isbNextPm = isbNextPm;
		this.isbSoLine = isbSoLine;
		this.isbInvNbr = isbInvNbr;
		this.isbOwner = isbOwner;
		this.isbTarrif = isbTarrif;
		this.isbOrigin = isbOrigin;
		this.isbSysType = isbSysType;
		this.isbChr01 = isbChr01;
		this.isbChr02 = isbChr02;
		this.isbChr03 = isbChr03;
		this.isbChr04 = isbChr04;
		this.isbChr05 = isbChr05;
		this.isbChr06 = isbChr06;
		this.isbChr07 = isbChr07;
		this.isbChr08 = isbChr08;
		this.isbChr09 = isbChr09;
		this.isbChr10 = isbChr10;
		this.isbDec01 = isbDec01;
		this.isbDec02 = isbDec02;
		this.isbDec03 = isbDec03;
		this.isbDte01 = isbDte01;
		this.isbDte02 = isbDte02;
		this.isbDte03 = isbDte03;
		this.isbDte04 = isbDte04;
		this.isbLog01 = isbLog01;
		this.isbLog02 = isbLog02;
		this.isbLog03 = isbLog03;
		this.isbLog04 = isbLog04;
		this.isbLog05 = isbLog05;
		this.isbLstUpd = isbLstUpd;
		this.isbPmUm = isbPmUm;
		this.isbLocation = isbLocation;
		this.isbUser1 = isbUser1;
		this.isbUser2 = isbUser2;
		this.isbArticle = isbArticle;
		this.isbCalibration = isbCalibration;
		this.isbCalibDate = isbCalibDate;
		this.isbCmtindx = isbCmtindx;
		this.isbCustomerId = isbCustomerId;
		this.isbEco = isbEco;
		this.isbIcRef = isbIcRef;
		this.isbModel = isbModel;
		this.isbOrigIns = isbOrigIns;
		this.isbPriceSold = isbPriceSold;
		this.isbRebuild = isbRebuild;
		this.isbShipDate = isbShipDate;
		this.isbSoldTo = isbSoldTo;
		this.isbUpdates = isbUpdates;
		this.isbPlantMaint = isbPlantMaint;
		this.isbEudTrnbr = isbEudTrnbr;
		this.isbEngCode = isbEngCode;
		this.isbLbWarrExp = isbLbWarrExp;
		this.isbModUserid = isbModUserid;
		this.isbModDate = isbModDate;
		this.isbQadc01 = isbQadc01;
		this.isbQadc02 = isbQadc02;
		this.isbQadc03 = isbQadc03;
		this.isbQadt01 = isbQadt01;
		this.isbQadt02 = isbQadt02;
		this.isbQadt03 = isbQadt03;
		this.isbQade01 = isbQade01;
		this.isbQade02 = isbQade02;
		this.isbQade03 = isbQade03;
		this.isbQadi01 = isbQadi01;
		this.isbQadi02 = isbQadi02;
		this.isbQadl01 = isbQadl01;
		this.isbQadl02 = isbQadl02;
		this.isbQadl03 = isbQadl03;
		this.isbQty = isbQty;
		this.isbMeterRdg = isbMeterRdg;
		this.isbMeterDate = isbMeterDate;
		this.isbMeterInterval = isbMeterInterval;
		this.isbMeterUm = isbMeterUm;
		this.isbWarrOverride = isbWarrOverride;
		this.oidIsbMstr = oidIsbMstr;
	}

	// Property accessors

	public IsbMstrId getId() {
		return this.id;
	}

	public void setId(IsbMstrId id) {
		this.id = id;
	}

	public Integer getIsbSeq() {
		return this.isbSeq;
	}

	public void setIsbSeq(Integer isbSeq) {
		this.isbSeq = isbSeq;
	}

	public Integer getIsbQadi03() {
		return this.isbQadi03;
	}

	public void setIsbQadi03(Integer isbQadi03) {
		this.isbQadi03 = isbQadi03;
	}

	public Integer getIsbWarrDur() {
		return this.isbWarrDur;
	}

	public void setIsbWarrDur(Integer isbWarrDur) {
		this.isbWarrDur = isbWarrDur;
	}

	public String getIsbStatus() {
		return this.isbStatus;
	}

	public void setIsbStatus(String isbStatus) {
		this.isbStatus = isbStatus;
	}

	public String getIsbQadc04() {
		return this.isbQadc04;
	}

	public void setIsbQadc04(String isbQadc04) {
		this.isbQadc04 = isbQadc04;
	}

	public Integer getIsbQadi04() {
		return this.isbQadi04;
	}

	public void setIsbQadi04(Integer isbQadi04) {
		this.isbQadi04 = isbQadi04;
	}

	public String getIsbRev() {
		return this.isbRev;
	}

	public void setIsbRev(String isbRev) {
		this.isbRev = isbRev;
	}

	public Date getIsbInsDate() {
		return this.isbInsDate;
	}

	public void setIsbInsDate(Date isbInsDate) {
		this.isbInsDate = isbInsDate;
	}

	public Date getIsbLastPm() {
		return this.isbLastPm;
	}

	public void setIsbLastPm(Date isbLastPm) {
		this.isbLastPm = isbLastPm;
	}

	public Integer getIsbPmDays() {
		return this.isbPmDays;
	}

	public void setIsbPmDays(Integer isbPmDays) {
		this.isbPmDays = isbPmDays;
	}

	public String getIsbSoNbr() {
		return this.isbSoNbr;
	}

	public void setIsbSoNbr(String isbSoNbr) {
		this.isbSoNbr = isbSoNbr;
	}

	public String getIsbDesc1() {
		return this.isbDesc1;
	}

	public void setIsbDesc1(String isbDesc1) {
		this.isbDesc1 = isbDesc1;
	}

	public String getIsbDesc2() {
		return this.isbDesc2;
	}

	public void setIsbDesc2(String isbDesc2) {
		this.isbDesc2 = isbDesc2;
	}

	public String getIsbWarrCd() {
		return this.isbWarrCd;
	}

	public void setIsbWarrCd(String isbWarrCd) {
		this.isbWarrCd = isbWarrCd;
	}

	public Boolean getIsbComp() {
		return this.isbComp;
	}

	public void setIsbComp(Boolean isbComp) {
		this.isbComp = isbComp;
	}

	public Boolean getIsbParent() {
		return this.isbParent;
	}

	public void setIsbParent(Boolean isbParent) {
		this.isbParent = isbParent;
	}

	public Date getIsbWarrExp() {
		return this.isbWarrExp;
	}

	public void setIsbWarrExp(Date isbWarrExp) {
		this.isbWarrExp = isbWarrExp;
	}

	public Date getIsbNextPm() {
		return this.isbNextPm;
	}

	public void setIsbNextPm(Date isbNextPm) {
		this.isbNextPm = isbNextPm;
	}

	public Integer getIsbSoLine() {
		return this.isbSoLine;
	}

	public void setIsbSoLine(Integer isbSoLine) {
		this.isbSoLine = isbSoLine;
	}

	public String getIsbInvNbr() {
		return this.isbInvNbr;
	}

	public void setIsbInvNbr(String isbInvNbr) {
		this.isbInvNbr = isbInvNbr;
	}

	public String getIsbOwner() {
		return this.isbOwner;
	}

	public void setIsbOwner(String isbOwner) {
		this.isbOwner = isbOwner;
	}

	public String getIsbTarrif() {
		return this.isbTarrif;
	}

	public void setIsbTarrif(String isbTarrif) {
		this.isbTarrif = isbTarrif;
	}

	public String getIsbOrigin() {
		return this.isbOrigin;
	}

	public void setIsbOrigin(String isbOrigin) {
		this.isbOrigin = isbOrigin;
	}

	public String getIsbSysType() {
		return this.isbSysType;
	}

	public void setIsbSysType(String isbSysType) {
		this.isbSysType = isbSysType;
	}

	public String getIsbChr01() {
		return this.isbChr01;
	}

	public void setIsbChr01(String isbChr01) {
		this.isbChr01 = isbChr01;
	}

	public String getIsbChr02() {
		return this.isbChr02;
	}

	public void setIsbChr02(String isbChr02) {
		this.isbChr02 = isbChr02;
	}

	public String getIsbChr03() {
		return this.isbChr03;
	}

	public void setIsbChr03(String isbChr03) {
		this.isbChr03 = isbChr03;
	}

	public String getIsbChr04() {
		return this.isbChr04;
	}

	public void setIsbChr04(String isbChr04) {
		this.isbChr04 = isbChr04;
	}

	public String getIsbChr05() {
		return this.isbChr05;
	}

	public void setIsbChr05(String isbChr05) {
		this.isbChr05 = isbChr05;
	}

	public String getIsbChr06() {
		return this.isbChr06;
	}

	public void setIsbChr06(String isbChr06) {
		this.isbChr06 = isbChr06;
	}

	public String getIsbChr07() {
		return this.isbChr07;
	}

	public void setIsbChr07(String isbChr07) {
		this.isbChr07 = isbChr07;
	}

	public String getIsbChr08() {
		return this.isbChr08;
	}

	public void setIsbChr08(String isbChr08) {
		this.isbChr08 = isbChr08;
	}

	public String getIsbChr09() {
		return this.isbChr09;
	}

	public void setIsbChr09(String isbChr09) {
		this.isbChr09 = isbChr09;
	}

	public String getIsbChr10() {
		return this.isbChr10;
	}

	public void setIsbChr10(String isbChr10) {
		this.isbChr10 = isbChr10;
	}

	public Double getIsbDec01() {
		return this.isbDec01;
	}

	public void setIsbDec01(Double isbDec01) {
		this.isbDec01 = isbDec01;
	}

	public Double getIsbDec02() {
		return this.isbDec02;
	}

	public void setIsbDec02(Double isbDec02) {
		this.isbDec02 = isbDec02;
	}

	public Double getIsbDec03() {
		return this.isbDec03;
	}

	public void setIsbDec03(Double isbDec03) {
		this.isbDec03 = isbDec03;
	}

	public Date getIsbDte01() {
		return this.isbDte01;
	}

	public void setIsbDte01(Date isbDte01) {
		this.isbDte01 = isbDte01;
	}

	public Date getIsbDte02() {
		return this.isbDte02;
	}

	public void setIsbDte02(Date isbDte02) {
		this.isbDte02 = isbDte02;
	}

	public Date getIsbDte03() {
		return this.isbDte03;
	}

	public void setIsbDte03(Date isbDte03) {
		this.isbDte03 = isbDte03;
	}

	public Date getIsbDte04() {
		return this.isbDte04;
	}

	public void setIsbDte04(Date isbDte04) {
		this.isbDte04 = isbDte04;
	}

	public Boolean getIsbLog01() {
		return this.isbLog01;
	}

	public void setIsbLog01(Boolean isbLog01) {
		this.isbLog01 = isbLog01;
	}

	public Boolean getIsbLog02() {
		return this.isbLog02;
	}

	public void setIsbLog02(Boolean isbLog02) {
		this.isbLog02 = isbLog02;
	}

	public Boolean getIsbLog03() {
		return this.isbLog03;
	}

	public void setIsbLog03(Boolean isbLog03) {
		this.isbLog03 = isbLog03;
	}

	public Boolean getIsbLog04() {
		return this.isbLog04;
	}

	public void setIsbLog04(Boolean isbLog04) {
		this.isbLog04 = isbLog04;
	}

	public Boolean getIsbLog05() {
		return this.isbLog05;
	}

	public void setIsbLog05(Boolean isbLog05) {
		this.isbLog05 = isbLog05;
	}

	public Date getIsbLstUpd() {
		return this.isbLstUpd;
	}

	public void setIsbLstUpd(Date isbLstUpd) {
		this.isbLstUpd = isbLstUpd;
	}

	public String getIsbPmUm() {
		return this.isbPmUm;
	}

	public void setIsbPmUm(String isbPmUm) {
		this.isbPmUm = isbPmUm;
	}

	public String getIsbLocation() {
		return this.isbLocation;
	}

	public void setIsbLocation(String isbLocation) {
		this.isbLocation = isbLocation;
	}

	public String getIsbUser1() {
		return this.isbUser1;
	}

	public void setIsbUser1(String isbUser1) {
		this.isbUser1 = isbUser1;
	}

	public String getIsbUser2() {
		return this.isbUser2;
	}

	public void setIsbUser2(String isbUser2) {
		this.isbUser2 = isbUser2;
	}

	public String getIsbArticle() {
		return this.isbArticle;
	}

	public void setIsbArticle(String isbArticle) {
		this.isbArticle = isbArticle;
	}

	public Double getIsbCalibration() {
		return this.isbCalibration;
	}

	public void setIsbCalibration(Double isbCalibration) {
		this.isbCalibration = isbCalibration;
	}

	public Date getIsbCalibDate() {
		return this.isbCalibDate;
	}

	public void setIsbCalibDate(Date isbCalibDate) {
		this.isbCalibDate = isbCalibDate;
	}

	public Integer getIsbCmtindx() {
		return this.isbCmtindx;
	}

	public void setIsbCmtindx(Integer isbCmtindx) {
		this.isbCmtindx = isbCmtindx;
	}

	public String getIsbCustomerId() {
		return this.isbCustomerId;
	}

	public void setIsbCustomerId(String isbCustomerId) {
		this.isbCustomerId = isbCustomerId;
	}

	public String getIsbEco() {
		return this.isbEco;
	}

	public void setIsbEco(String isbEco) {
		this.isbEco = isbEco;
	}

	public String getIsbIcRef() {
		return this.isbIcRef;
	}

	public void setIsbIcRef(String isbIcRef) {
		this.isbIcRef = isbIcRef;
	}

	public String getIsbModel() {
		return this.isbModel;
	}

	public void setIsbModel(String isbModel) {
		this.isbModel = isbModel;
	}

	public Date getIsbOrigIns() {
		return this.isbOrigIns;
	}

	public void setIsbOrigIns(Date isbOrigIns) {
		this.isbOrigIns = isbOrigIns;
	}

	public Double getIsbPriceSold() {
		return this.isbPriceSold;
	}

	public void setIsbPriceSold(Double isbPriceSold) {
		this.isbPriceSold = isbPriceSold;
	}

	public Boolean getIsbRebuild() {
		return this.isbRebuild;
	}

	public void setIsbRebuild(Boolean isbRebuild) {
		this.isbRebuild = isbRebuild;
	}

	public Date getIsbShipDate() {
		return this.isbShipDate;
	}

	public void setIsbShipDate(Date isbShipDate) {
		this.isbShipDate = isbShipDate;
	}

	public String getIsbSoldTo() {
		return this.isbSoldTo;
	}

	public void setIsbSoldTo(String isbSoldTo) {
		this.isbSoldTo = isbSoldTo;
	}

	public String getIsbUpdates() {
		return this.isbUpdates;
	}

	public void setIsbUpdates(String isbUpdates) {
		this.isbUpdates = isbUpdates;
	}

	public Boolean getIsbPlantMaint() {
		return this.isbPlantMaint;
	}

	public void setIsbPlantMaint(Boolean isbPlantMaint) {
		this.isbPlantMaint = isbPlantMaint;
	}

	public Integer getIsbEudTrnbr() {
		return this.isbEudTrnbr;
	}

	public void setIsbEudTrnbr(Integer isbEudTrnbr) {
		this.isbEudTrnbr = isbEudTrnbr;
	}

	public String getIsbEngCode() {
		return this.isbEngCode;
	}

	public void setIsbEngCode(String isbEngCode) {
		this.isbEngCode = isbEngCode;
	}

	public Date getIsbLbWarrExp() {
		return this.isbLbWarrExp;
	}

	public void setIsbLbWarrExp(Date isbLbWarrExp) {
		this.isbLbWarrExp = isbLbWarrExp;
	}

	public String getIsbModUserid() {
		return this.isbModUserid;
	}

	public void setIsbModUserid(String isbModUserid) {
		this.isbModUserid = isbModUserid;
	}

	public Date getIsbModDate() {
		return this.isbModDate;
	}

	public void setIsbModDate(Date isbModDate) {
		this.isbModDate = isbModDate;
	}

	public String getIsbQadc01() {
		return this.isbQadc01;
	}

	public void setIsbQadc01(String isbQadc01) {
		this.isbQadc01 = isbQadc01;
	}

	public String getIsbQadc02() {
		return this.isbQadc02;
	}

	public void setIsbQadc02(String isbQadc02) {
		this.isbQadc02 = isbQadc02;
	}

	public String getIsbQadc03() {
		return this.isbQadc03;
	}

	public void setIsbQadc03(String isbQadc03) {
		this.isbQadc03 = isbQadc03;
	}

	public Date getIsbQadt01() {
		return this.isbQadt01;
	}

	public void setIsbQadt01(Date isbQadt01) {
		this.isbQadt01 = isbQadt01;
	}

	public Date getIsbQadt02() {
		return this.isbQadt02;
	}

	public void setIsbQadt02(Date isbQadt02) {
		this.isbQadt02 = isbQadt02;
	}

	public Date getIsbQadt03() {
		return this.isbQadt03;
	}

	public void setIsbQadt03(Date isbQadt03) {
		this.isbQadt03 = isbQadt03;
	}

	public Double getIsbQade01() {
		return this.isbQade01;
	}

	public void setIsbQade01(Double isbQade01) {
		this.isbQade01 = isbQade01;
	}

	public Double getIsbQade02() {
		return this.isbQade02;
	}

	public void setIsbQade02(Double isbQade02) {
		this.isbQade02 = isbQade02;
	}

	public Double getIsbQade03() {
		return this.isbQade03;
	}

	public void setIsbQade03(Double isbQade03) {
		this.isbQade03 = isbQade03;
	}

	public Integer getIsbQadi01() {
		return this.isbQadi01;
	}

	public void setIsbQadi01(Integer isbQadi01) {
		this.isbQadi01 = isbQadi01;
	}

	public Integer getIsbQadi02() {
		return this.isbQadi02;
	}

	public void setIsbQadi02(Integer isbQadi02) {
		this.isbQadi02 = isbQadi02;
	}

	public Boolean getIsbQadl01() {
		return this.isbQadl01;
	}

	public void setIsbQadl01(Boolean isbQadl01) {
		this.isbQadl01 = isbQadl01;
	}

	public Boolean getIsbQadl02() {
		return this.isbQadl02;
	}

	public void setIsbQadl02(Boolean isbQadl02) {
		this.isbQadl02 = isbQadl02;
	}

	public Boolean getIsbQadl03() {
		return this.isbQadl03;
	}

	public void setIsbQadl03(Boolean isbQadl03) {
		this.isbQadl03 = isbQadl03;
	}

	public Double getIsbQty() {
		return this.isbQty;
	}

	public void setIsbQty(Double isbQty) {
		this.isbQty = isbQty;
	}

	public Double getIsbMeterRdg() {
		return this.isbMeterRdg;
	}

	public void setIsbMeterRdg(Double isbMeterRdg) {
		this.isbMeterRdg = isbMeterRdg;
	}

	public Date getIsbMeterDate() {
		return this.isbMeterDate;
	}

	public void setIsbMeterDate(Date isbMeterDate) {
		this.isbMeterDate = isbMeterDate;
	}

	public Double getIsbMeterInterval() {
		return this.isbMeterInterval;
	}

	public void setIsbMeterInterval(Double isbMeterInterval) {
		this.isbMeterInterval = isbMeterInterval;
	}

	public String getIsbMeterUm() {
		return this.isbMeterUm;
	}

	public void setIsbMeterUm(String isbMeterUm) {
		this.isbMeterUm = isbMeterUm;
	}

	public Boolean getIsbWarrOverride() {
		return this.isbWarrOverride;
	}

	public void setIsbWarrOverride(Boolean isbWarrOverride) {
		this.isbWarrOverride = isbWarrOverride;
	}

	public Double getOidIsbMstr() {
		return this.oidIsbMstr;
	}

	public void setOidIsbMstr(Double oidIsbMstr) {
		this.oidIsbMstr = oidIsbMstr;
	}

}