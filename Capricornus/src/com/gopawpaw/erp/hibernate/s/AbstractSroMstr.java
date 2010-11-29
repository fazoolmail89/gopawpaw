package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSroMstr entity provides the base persistence definition of the
 * SroMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSroMstr implements java.io.Serializable {

	// Fields

	private SroMstrId id;
	private String sroCust;
	private String sroShip;
	private String sroTaken;
	private String sroAssign;
	private Date sroEntDate;
	private Date sroClsDate;
	private String sroType;
	private String sroStatus;
	private String sroCrTerms;
	private String sroShipvia;
	private String sroPo;
	private String sroRga;
	private String sroAuthor;
	private Boolean sroPrintRg;
	private Boolean sroPrintPl;
	private String sroDspstn;
	private String sroPart;
	private String sroDesc;
	private String sroSerial;
	private String sroRev;
	private Boolean sroWrrnty;
	private String sroFailure1;
	private String sroFailure2;
	private String sroFailure3;
	private String sroFailure4;
	private String sroFailure5;
	private String sroRepair1;
	private String sroRepair2;
	private String sroRepair3;
	private String sroRepair4;
	private String sroRepair5;
	private String sroCmmt;
	private Double sroFrt;
	private Double sroServChg;
	private Double sroDiscPct;
	private Double sroSpecChg;
	private String sroTaxPct;
	private Double sroPrepaid;
	private Boolean sroToInv;
	private Boolean sroInvoiced;
	private String sroQadc05;
	private String sroQadc06;
	private Date sroInvDate;
	private Date sroShpDate;
	private Boolean sroClosed;
	private Date sroDueDate;
	private String sroUser1;
	private String sroUser2;
	private Double sroQty;
	private Integer sroCmtindx;
	private String sroChr01;
	private String sroChr02;
	private String sroChr03;
	private String sroChr04;
	private String sroChr05;
	private Date sroDte01;
	private Date sroDte02;
	private Double sroDec01;
	private Double sroDec02;
	private Boolean sroLog01;
	private Double oidSroMstr;

	// Constructors

	/** default constructor */
	public AbstractSroMstr() {
	}

	/** minimal constructor */
	public AbstractSroMstr(SroMstrId id, Double oidSroMstr) {
		this.id = id;
		this.oidSroMstr = oidSroMstr;
	}

	/** full constructor */
	public AbstractSroMstr(SroMstrId id, String sroCust, String sroShip,
			String sroTaken, String sroAssign, Date sroEntDate,
			Date sroClsDate, String sroType, String sroStatus,
			String sroCrTerms, String sroShipvia, String sroPo, String sroRga,
			String sroAuthor, Boolean sroPrintRg, Boolean sroPrintPl,
			String sroDspstn, String sroPart, String sroDesc, String sroSerial,
			String sroRev, Boolean sroWrrnty, String sroFailure1,
			String sroFailure2, String sroFailure3, String sroFailure4,
			String sroFailure5, String sroRepair1, String sroRepair2,
			String sroRepair3, String sroRepair4, String sroRepair5,
			String sroCmmt, Double sroFrt, Double sroServChg,
			Double sroDiscPct, Double sroSpecChg, String sroTaxPct,
			Double sroPrepaid, Boolean sroToInv, Boolean sroInvoiced,
			String sroQadc05, String sroQadc06, Date sroInvDate,
			Date sroShpDate, Boolean sroClosed, Date sroDueDate,
			String sroUser1, String sroUser2, Double sroQty,
			Integer sroCmtindx, String sroChr01, String sroChr02,
			String sroChr03, String sroChr04, String sroChr05, Date sroDte01,
			Date sroDte02, Double sroDec01, Double sroDec02, Boolean sroLog01,
			Double oidSroMstr) {
		this.id = id;
		this.sroCust = sroCust;
		this.sroShip = sroShip;
		this.sroTaken = sroTaken;
		this.sroAssign = sroAssign;
		this.sroEntDate = sroEntDate;
		this.sroClsDate = sroClsDate;
		this.sroType = sroType;
		this.sroStatus = sroStatus;
		this.sroCrTerms = sroCrTerms;
		this.sroShipvia = sroShipvia;
		this.sroPo = sroPo;
		this.sroRga = sroRga;
		this.sroAuthor = sroAuthor;
		this.sroPrintRg = sroPrintRg;
		this.sroPrintPl = sroPrintPl;
		this.sroDspstn = sroDspstn;
		this.sroPart = sroPart;
		this.sroDesc = sroDesc;
		this.sroSerial = sroSerial;
		this.sroRev = sroRev;
		this.sroWrrnty = sroWrrnty;
		this.sroFailure1 = sroFailure1;
		this.sroFailure2 = sroFailure2;
		this.sroFailure3 = sroFailure3;
		this.sroFailure4 = sroFailure4;
		this.sroFailure5 = sroFailure5;
		this.sroRepair1 = sroRepair1;
		this.sroRepair2 = sroRepair2;
		this.sroRepair3 = sroRepair3;
		this.sroRepair4 = sroRepair4;
		this.sroRepair5 = sroRepair5;
		this.sroCmmt = sroCmmt;
		this.sroFrt = sroFrt;
		this.sroServChg = sroServChg;
		this.sroDiscPct = sroDiscPct;
		this.sroSpecChg = sroSpecChg;
		this.sroTaxPct = sroTaxPct;
		this.sroPrepaid = sroPrepaid;
		this.sroToInv = sroToInv;
		this.sroInvoiced = sroInvoiced;
		this.sroQadc05 = sroQadc05;
		this.sroQadc06 = sroQadc06;
		this.sroInvDate = sroInvDate;
		this.sroShpDate = sroShpDate;
		this.sroClosed = sroClosed;
		this.sroDueDate = sroDueDate;
		this.sroUser1 = sroUser1;
		this.sroUser2 = sroUser2;
		this.sroQty = sroQty;
		this.sroCmtindx = sroCmtindx;
		this.sroChr01 = sroChr01;
		this.sroChr02 = sroChr02;
		this.sroChr03 = sroChr03;
		this.sroChr04 = sroChr04;
		this.sroChr05 = sroChr05;
		this.sroDte01 = sroDte01;
		this.sroDte02 = sroDte02;
		this.sroDec01 = sroDec01;
		this.sroDec02 = sroDec02;
		this.sroLog01 = sroLog01;
		this.oidSroMstr = oidSroMstr;
	}

	// Property accessors

	public SroMstrId getId() {
		return this.id;
	}

	public void setId(SroMstrId id) {
		this.id = id;
	}

	public String getSroCust() {
		return this.sroCust;
	}

	public void setSroCust(String sroCust) {
		this.sroCust = sroCust;
	}

	public String getSroShip() {
		return this.sroShip;
	}

	public void setSroShip(String sroShip) {
		this.sroShip = sroShip;
	}

	public String getSroTaken() {
		return this.sroTaken;
	}

	public void setSroTaken(String sroTaken) {
		this.sroTaken = sroTaken;
	}

	public String getSroAssign() {
		return this.sroAssign;
	}

	public void setSroAssign(String sroAssign) {
		this.sroAssign = sroAssign;
	}

	public Date getSroEntDate() {
		return this.sroEntDate;
	}

	public void setSroEntDate(Date sroEntDate) {
		this.sroEntDate = sroEntDate;
	}

	public Date getSroClsDate() {
		return this.sroClsDate;
	}

	public void setSroClsDate(Date sroClsDate) {
		this.sroClsDate = sroClsDate;
	}

	public String getSroType() {
		return this.sroType;
	}

	public void setSroType(String sroType) {
		this.sroType = sroType;
	}

	public String getSroStatus() {
		return this.sroStatus;
	}

	public void setSroStatus(String sroStatus) {
		this.sroStatus = sroStatus;
	}

	public String getSroCrTerms() {
		return this.sroCrTerms;
	}

	public void setSroCrTerms(String sroCrTerms) {
		this.sroCrTerms = sroCrTerms;
	}

	public String getSroShipvia() {
		return this.sroShipvia;
	}

	public void setSroShipvia(String sroShipvia) {
		this.sroShipvia = sroShipvia;
	}

	public String getSroPo() {
		return this.sroPo;
	}

	public void setSroPo(String sroPo) {
		this.sroPo = sroPo;
	}

	public String getSroRga() {
		return this.sroRga;
	}

	public void setSroRga(String sroRga) {
		this.sroRga = sroRga;
	}

	public String getSroAuthor() {
		return this.sroAuthor;
	}

	public void setSroAuthor(String sroAuthor) {
		this.sroAuthor = sroAuthor;
	}

	public Boolean getSroPrintRg() {
		return this.sroPrintRg;
	}

	public void setSroPrintRg(Boolean sroPrintRg) {
		this.sroPrintRg = sroPrintRg;
	}

	public Boolean getSroPrintPl() {
		return this.sroPrintPl;
	}

	public void setSroPrintPl(Boolean sroPrintPl) {
		this.sroPrintPl = sroPrintPl;
	}

	public String getSroDspstn() {
		return this.sroDspstn;
	}

	public void setSroDspstn(String sroDspstn) {
		this.sroDspstn = sroDspstn;
	}

	public String getSroPart() {
		return this.sroPart;
	}

	public void setSroPart(String sroPart) {
		this.sroPart = sroPart;
	}

	public String getSroDesc() {
		return this.sroDesc;
	}

	public void setSroDesc(String sroDesc) {
		this.sroDesc = sroDesc;
	}

	public String getSroSerial() {
		return this.sroSerial;
	}

	public void setSroSerial(String sroSerial) {
		this.sroSerial = sroSerial;
	}

	public String getSroRev() {
		return this.sroRev;
	}

	public void setSroRev(String sroRev) {
		this.sroRev = sroRev;
	}

	public Boolean getSroWrrnty() {
		return this.sroWrrnty;
	}

	public void setSroWrrnty(Boolean sroWrrnty) {
		this.sroWrrnty = sroWrrnty;
	}

	public String getSroFailure1() {
		return this.sroFailure1;
	}

	public void setSroFailure1(String sroFailure1) {
		this.sroFailure1 = sroFailure1;
	}

	public String getSroFailure2() {
		return this.sroFailure2;
	}

	public void setSroFailure2(String sroFailure2) {
		this.sroFailure2 = sroFailure2;
	}

	public String getSroFailure3() {
		return this.sroFailure3;
	}

	public void setSroFailure3(String sroFailure3) {
		this.sroFailure3 = sroFailure3;
	}

	public String getSroFailure4() {
		return this.sroFailure4;
	}

	public void setSroFailure4(String sroFailure4) {
		this.sroFailure4 = sroFailure4;
	}

	public String getSroFailure5() {
		return this.sroFailure5;
	}

	public void setSroFailure5(String sroFailure5) {
		this.sroFailure5 = sroFailure5;
	}

	public String getSroRepair1() {
		return this.sroRepair1;
	}

	public void setSroRepair1(String sroRepair1) {
		this.sroRepair1 = sroRepair1;
	}

	public String getSroRepair2() {
		return this.sroRepair2;
	}

	public void setSroRepair2(String sroRepair2) {
		this.sroRepair2 = sroRepair2;
	}

	public String getSroRepair3() {
		return this.sroRepair3;
	}

	public void setSroRepair3(String sroRepair3) {
		this.sroRepair3 = sroRepair3;
	}

	public String getSroRepair4() {
		return this.sroRepair4;
	}

	public void setSroRepair4(String sroRepair4) {
		this.sroRepair4 = sroRepair4;
	}

	public String getSroRepair5() {
		return this.sroRepair5;
	}

	public void setSroRepair5(String sroRepair5) {
		this.sroRepair5 = sroRepair5;
	}

	public String getSroCmmt() {
		return this.sroCmmt;
	}

	public void setSroCmmt(String sroCmmt) {
		this.sroCmmt = sroCmmt;
	}

	public Double getSroFrt() {
		return this.sroFrt;
	}

	public void setSroFrt(Double sroFrt) {
		this.sroFrt = sroFrt;
	}

	public Double getSroServChg() {
		return this.sroServChg;
	}

	public void setSroServChg(Double sroServChg) {
		this.sroServChg = sroServChg;
	}

	public Double getSroDiscPct() {
		return this.sroDiscPct;
	}

	public void setSroDiscPct(Double sroDiscPct) {
		this.sroDiscPct = sroDiscPct;
	}

	public Double getSroSpecChg() {
		return this.sroSpecChg;
	}

	public void setSroSpecChg(Double sroSpecChg) {
		this.sroSpecChg = sroSpecChg;
	}

	public String getSroTaxPct() {
		return this.sroTaxPct;
	}

	public void setSroTaxPct(String sroTaxPct) {
		this.sroTaxPct = sroTaxPct;
	}

	public Double getSroPrepaid() {
		return this.sroPrepaid;
	}

	public void setSroPrepaid(Double sroPrepaid) {
		this.sroPrepaid = sroPrepaid;
	}

	public Boolean getSroToInv() {
		return this.sroToInv;
	}

	public void setSroToInv(Boolean sroToInv) {
		this.sroToInv = sroToInv;
	}

	public Boolean getSroInvoiced() {
		return this.sroInvoiced;
	}

	public void setSroInvoiced(Boolean sroInvoiced) {
		this.sroInvoiced = sroInvoiced;
	}

	public String getSroQadc05() {
		return this.sroQadc05;
	}

	public void setSroQadc05(String sroQadc05) {
		this.sroQadc05 = sroQadc05;
	}

	public String getSroQadc06() {
		return this.sroQadc06;
	}

	public void setSroQadc06(String sroQadc06) {
		this.sroQadc06 = sroQadc06;
	}

	public Date getSroInvDate() {
		return this.sroInvDate;
	}

	public void setSroInvDate(Date sroInvDate) {
		this.sroInvDate = sroInvDate;
	}

	public Date getSroShpDate() {
		return this.sroShpDate;
	}

	public void setSroShpDate(Date sroShpDate) {
		this.sroShpDate = sroShpDate;
	}

	public Boolean getSroClosed() {
		return this.sroClosed;
	}

	public void setSroClosed(Boolean sroClosed) {
		this.sroClosed = sroClosed;
	}

	public Date getSroDueDate() {
		return this.sroDueDate;
	}

	public void setSroDueDate(Date sroDueDate) {
		this.sroDueDate = sroDueDate;
	}

	public String getSroUser1() {
		return this.sroUser1;
	}

	public void setSroUser1(String sroUser1) {
		this.sroUser1 = sroUser1;
	}

	public String getSroUser2() {
		return this.sroUser2;
	}

	public void setSroUser2(String sroUser2) {
		this.sroUser2 = sroUser2;
	}

	public Double getSroQty() {
		return this.sroQty;
	}

	public void setSroQty(Double sroQty) {
		this.sroQty = sroQty;
	}

	public Integer getSroCmtindx() {
		return this.sroCmtindx;
	}

	public void setSroCmtindx(Integer sroCmtindx) {
		this.sroCmtindx = sroCmtindx;
	}

	public String getSroChr01() {
		return this.sroChr01;
	}

	public void setSroChr01(String sroChr01) {
		this.sroChr01 = sroChr01;
	}

	public String getSroChr02() {
		return this.sroChr02;
	}

	public void setSroChr02(String sroChr02) {
		this.sroChr02 = sroChr02;
	}

	public String getSroChr03() {
		return this.sroChr03;
	}

	public void setSroChr03(String sroChr03) {
		this.sroChr03 = sroChr03;
	}

	public String getSroChr04() {
		return this.sroChr04;
	}

	public void setSroChr04(String sroChr04) {
		this.sroChr04 = sroChr04;
	}

	public String getSroChr05() {
		return this.sroChr05;
	}

	public void setSroChr05(String sroChr05) {
		this.sroChr05 = sroChr05;
	}

	public Date getSroDte01() {
		return this.sroDte01;
	}

	public void setSroDte01(Date sroDte01) {
		this.sroDte01 = sroDte01;
	}

	public Date getSroDte02() {
		return this.sroDte02;
	}

	public void setSroDte02(Date sroDte02) {
		this.sroDte02 = sroDte02;
	}

	public Double getSroDec01() {
		return this.sroDec01;
	}

	public void setSroDec01(Double sroDec01) {
		this.sroDec01 = sroDec01;
	}

	public Double getSroDec02() {
		return this.sroDec02;
	}

	public void setSroDec02(Double sroDec02) {
		this.sroDec02 = sroDec02;
	}

	public Boolean getSroLog01() {
		return this.sroLog01;
	}

	public void setSroLog01(Boolean sroLog01) {
		this.sroLog01 = sroLog01;
	}

	public Double getOidSroMstr() {
		return this.oidSroMstr;
	}

	public void setOidSroMstr(Double oidSroMstr) {
		this.oidSroMstr = oidSroMstr;
	}

}