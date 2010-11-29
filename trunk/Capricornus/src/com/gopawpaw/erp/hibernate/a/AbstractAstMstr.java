package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAstMstr entity provides the base persistence definition of the
 * AstMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAstMstr implements java.io.Serializable {

	// Fields

	private String astAsset;
	private String astDesc;
	private String astEntity;
	private Date astDate;
	private Date astPurDate;
	private String astSerial;
	private String astInvNbr;
	private Integer astQty;
	private String astFaLoc;
	private String astSpExpAcct;
	private String astSpExpSub;
	private String astCust;
	private String astAcct;
	private String astSub;
	private String astCc;
	private String astProj;
	private String astAcAcct;
	private String astAcSub;
	private String astAcCc;
	private String astAcProj;
	private String astExpAcct;
	private String astExpSub;
	private String astExpCc;
	private String astExpProj;
	private String astPoNbr;
	private String astVend;
	private Double astAtRisk;
	private Date astWarranty;
	private String astClass;
	private String astRetire;
	private Double astRtPrice;
	private Date astRtDate;
	private String astRtReason;
	private Boolean astReport;
	private String astSpAcAcct;
	private String astSpAcSub;
	private String astSpAcCc;
	private String astSpAcProj;
	private String astInsNbr;
	private String astInsCo;
	private Date astInsDate;
	private Double astInsValue;
	private Date astUdate1;
	private Date astUdate2;
	private Date astUdate3;
	private Date astUdate4;
	private String astUchar1;
	private String astUchar2;
	private String astUchar3;
	private String astUchar4;
	private Integer astUint1;
	private Integer astUint2;
	private Integer astUint3;
	private Integer astUint4;
	private Double astUdec1;
	private Double astUdec2;
	private String astUserid;
	private Date astModDate;
	private Date astSusBeg;
	private Date astSusEnd;
	private String astSpExpCc;
	private String astSpExpProj;
	private String astPrevMethod;
	private Boolean astQad01;
	private String astQad02;
	private String astQad03;
	private String astUser1;
	private String astUser2;
	private Double oidAstMstr;

	// Constructors

	/** default constructor */
	public AbstractAstMstr() {
	}

	/** minimal constructor */
	public AbstractAstMstr(Date astDate, Double oidAstMstr) {
		this.astDate = astDate;
		this.oidAstMstr = oidAstMstr;
	}

	/** full constructor */
	public AbstractAstMstr(String astDesc, String astEntity, Date astDate,
			Date astPurDate, String astSerial, String astInvNbr,
			Integer astQty, String astFaLoc, String astSpExpAcct,
			String astSpExpSub, String astCust, String astAcct, String astSub,
			String astCc, String astProj, String astAcAcct, String astAcSub,
			String astAcCc, String astAcProj, String astExpAcct,
			String astExpSub, String astExpCc, String astExpProj,
			String astPoNbr, String astVend, Double astAtRisk,
			Date astWarranty, String astClass, String astRetire,
			Double astRtPrice, Date astRtDate, String astRtReason,
			Boolean astReport, String astSpAcAcct, String astSpAcSub,
			String astSpAcCc, String astSpAcProj, String astInsNbr,
			String astInsCo, Date astInsDate, Double astInsValue,
			Date astUdate1, Date astUdate2, Date astUdate3, Date astUdate4,
			String astUchar1, String astUchar2, String astUchar3,
			String astUchar4, Integer astUint1, Integer astUint2,
			Integer astUint3, Integer astUint4, Double astUdec1,
			Double astUdec2, String astUserid, Date astModDate, Date astSusBeg,
			Date astSusEnd, String astSpExpCc, String astSpExpProj,
			String astPrevMethod, Boolean astQad01, String astQad02,
			String astQad03, String astUser1, String astUser2, Double oidAstMstr) {
		this.astDesc = astDesc;
		this.astEntity = astEntity;
		this.astDate = astDate;
		this.astPurDate = astPurDate;
		this.astSerial = astSerial;
		this.astInvNbr = astInvNbr;
		this.astQty = astQty;
		this.astFaLoc = astFaLoc;
		this.astSpExpAcct = astSpExpAcct;
		this.astSpExpSub = astSpExpSub;
		this.astCust = astCust;
		this.astAcct = astAcct;
		this.astSub = astSub;
		this.astCc = astCc;
		this.astProj = astProj;
		this.astAcAcct = astAcAcct;
		this.astAcSub = astAcSub;
		this.astAcCc = astAcCc;
		this.astAcProj = astAcProj;
		this.astExpAcct = astExpAcct;
		this.astExpSub = astExpSub;
		this.astExpCc = astExpCc;
		this.astExpProj = astExpProj;
		this.astPoNbr = astPoNbr;
		this.astVend = astVend;
		this.astAtRisk = astAtRisk;
		this.astWarranty = astWarranty;
		this.astClass = astClass;
		this.astRetire = astRetire;
		this.astRtPrice = astRtPrice;
		this.astRtDate = astRtDate;
		this.astRtReason = astRtReason;
		this.astReport = astReport;
		this.astSpAcAcct = astSpAcAcct;
		this.astSpAcSub = astSpAcSub;
		this.astSpAcCc = astSpAcCc;
		this.astSpAcProj = astSpAcProj;
		this.astInsNbr = astInsNbr;
		this.astInsCo = astInsCo;
		this.astInsDate = astInsDate;
		this.astInsValue = astInsValue;
		this.astUdate1 = astUdate1;
		this.astUdate2 = astUdate2;
		this.astUdate3 = astUdate3;
		this.astUdate4 = astUdate4;
		this.astUchar1 = astUchar1;
		this.astUchar2 = astUchar2;
		this.astUchar3 = astUchar3;
		this.astUchar4 = astUchar4;
		this.astUint1 = astUint1;
		this.astUint2 = astUint2;
		this.astUint3 = astUint3;
		this.astUint4 = astUint4;
		this.astUdec1 = astUdec1;
		this.astUdec2 = astUdec2;
		this.astUserid = astUserid;
		this.astModDate = astModDate;
		this.astSusBeg = astSusBeg;
		this.astSusEnd = astSusEnd;
		this.astSpExpCc = astSpExpCc;
		this.astSpExpProj = astSpExpProj;
		this.astPrevMethod = astPrevMethod;
		this.astQad01 = astQad01;
		this.astQad02 = astQad02;
		this.astQad03 = astQad03;
		this.astUser1 = astUser1;
		this.astUser2 = astUser2;
		this.oidAstMstr = oidAstMstr;
	}

	// Property accessors

	public String getAstAsset() {
		return this.astAsset;
	}

	public void setAstAsset(String astAsset) {
		this.astAsset = astAsset;
	}

	public String getAstDesc() {
		return this.astDesc;
	}

	public void setAstDesc(String astDesc) {
		this.astDesc = astDesc;
	}

	public String getAstEntity() {
		return this.astEntity;
	}

	public void setAstEntity(String astEntity) {
		this.astEntity = astEntity;
	}

	public Date getAstDate() {
		return this.astDate;
	}

	public void setAstDate(Date astDate) {
		this.astDate = astDate;
	}

	public Date getAstPurDate() {
		return this.astPurDate;
	}

	public void setAstPurDate(Date astPurDate) {
		this.astPurDate = astPurDate;
	}

	public String getAstSerial() {
		return this.astSerial;
	}

	public void setAstSerial(String astSerial) {
		this.astSerial = astSerial;
	}

	public String getAstInvNbr() {
		return this.astInvNbr;
	}

	public void setAstInvNbr(String astInvNbr) {
		this.astInvNbr = astInvNbr;
	}

	public Integer getAstQty() {
		return this.astQty;
	}

	public void setAstQty(Integer astQty) {
		this.astQty = astQty;
	}

	public String getAstFaLoc() {
		return this.astFaLoc;
	}

	public void setAstFaLoc(String astFaLoc) {
		this.astFaLoc = astFaLoc;
	}

	public String getAstSpExpAcct() {
		return this.astSpExpAcct;
	}

	public void setAstSpExpAcct(String astSpExpAcct) {
		this.astSpExpAcct = astSpExpAcct;
	}

	public String getAstSpExpSub() {
		return this.astSpExpSub;
	}

	public void setAstSpExpSub(String astSpExpSub) {
		this.astSpExpSub = astSpExpSub;
	}

	public String getAstCust() {
		return this.astCust;
	}

	public void setAstCust(String astCust) {
		this.astCust = astCust;
	}

	public String getAstAcct() {
		return this.astAcct;
	}

	public void setAstAcct(String astAcct) {
		this.astAcct = astAcct;
	}

	public String getAstSub() {
		return this.astSub;
	}

	public void setAstSub(String astSub) {
		this.astSub = astSub;
	}

	public String getAstCc() {
		return this.astCc;
	}

	public void setAstCc(String astCc) {
		this.astCc = astCc;
	}

	public String getAstProj() {
		return this.astProj;
	}

	public void setAstProj(String astProj) {
		this.astProj = astProj;
	}

	public String getAstAcAcct() {
		return this.astAcAcct;
	}

	public void setAstAcAcct(String astAcAcct) {
		this.astAcAcct = astAcAcct;
	}

	public String getAstAcSub() {
		return this.astAcSub;
	}

	public void setAstAcSub(String astAcSub) {
		this.astAcSub = astAcSub;
	}

	public String getAstAcCc() {
		return this.astAcCc;
	}

	public void setAstAcCc(String astAcCc) {
		this.astAcCc = astAcCc;
	}

	public String getAstAcProj() {
		return this.astAcProj;
	}

	public void setAstAcProj(String astAcProj) {
		this.astAcProj = astAcProj;
	}

	public String getAstExpAcct() {
		return this.astExpAcct;
	}

	public void setAstExpAcct(String astExpAcct) {
		this.astExpAcct = astExpAcct;
	}

	public String getAstExpSub() {
		return this.astExpSub;
	}

	public void setAstExpSub(String astExpSub) {
		this.astExpSub = astExpSub;
	}

	public String getAstExpCc() {
		return this.astExpCc;
	}

	public void setAstExpCc(String astExpCc) {
		this.astExpCc = astExpCc;
	}

	public String getAstExpProj() {
		return this.astExpProj;
	}

	public void setAstExpProj(String astExpProj) {
		this.astExpProj = astExpProj;
	}

	public String getAstPoNbr() {
		return this.astPoNbr;
	}

	public void setAstPoNbr(String astPoNbr) {
		this.astPoNbr = astPoNbr;
	}

	public String getAstVend() {
		return this.astVend;
	}

	public void setAstVend(String astVend) {
		this.astVend = astVend;
	}

	public Double getAstAtRisk() {
		return this.astAtRisk;
	}

	public void setAstAtRisk(Double astAtRisk) {
		this.astAtRisk = astAtRisk;
	}

	public Date getAstWarranty() {
		return this.astWarranty;
	}

	public void setAstWarranty(Date astWarranty) {
		this.astWarranty = astWarranty;
	}

	public String getAstClass() {
		return this.astClass;
	}

	public void setAstClass(String astClass) {
		this.astClass = astClass;
	}

	public String getAstRetire() {
		return this.astRetire;
	}

	public void setAstRetire(String astRetire) {
		this.astRetire = astRetire;
	}

	public Double getAstRtPrice() {
		return this.astRtPrice;
	}

	public void setAstRtPrice(Double astRtPrice) {
		this.astRtPrice = astRtPrice;
	}

	public Date getAstRtDate() {
		return this.astRtDate;
	}

	public void setAstRtDate(Date astRtDate) {
		this.astRtDate = astRtDate;
	}

	public String getAstRtReason() {
		return this.astRtReason;
	}

	public void setAstRtReason(String astRtReason) {
		this.astRtReason = astRtReason;
	}

	public Boolean getAstReport() {
		return this.astReport;
	}

	public void setAstReport(Boolean astReport) {
		this.astReport = astReport;
	}

	public String getAstSpAcAcct() {
		return this.astSpAcAcct;
	}

	public void setAstSpAcAcct(String astSpAcAcct) {
		this.astSpAcAcct = astSpAcAcct;
	}

	public String getAstSpAcSub() {
		return this.astSpAcSub;
	}

	public void setAstSpAcSub(String astSpAcSub) {
		this.astSpAcSub = astSpAcSub;
	}

	public String getAstSpAcCc() {
		return this.astSpAcCc;
	}

	public void setAstSpAcCc(String astSpAcCc) {
		this.astSpAcCc = astSpAcCc;
	}

	public String getAstSpAcProj() {
		return this.astSpAcProj;
	}

	public void setAstSpAcProj(String astSpAcProj) {
		this.astSpAcProj = astSpAcProj;
	}

	public String getAstInsNbr() {
		return this.astInsNbr;
	}

	public void setAstInsNbr(String astInsNbr) {
		this.astInsNbr = astInsNbr;
	}

	public String getAstInsCo() {
		return this.astInsCo;
	}

	public void setAstInsCo(String astInsCo) {
		this.astInsCo = astInsCo;
	}

	public Date getAstInsDate() {
		return this.astInsDate;
	}

	public void setAstInsDate(Date astInsDate) {
		this.astInsDate = astInsDate;
	}

	public Double getAstInsValue() {
		return this.astInsValue;
	}

	public void setAstInsValue(Double astInsValue) {
		this.astInsValue = astInsValue;
	}

	public Date getAstUdate1() {
		return this.astUdate1;
	}

	public void setAstUdate1(Date astUdate1) {
		this.astUdate1 = astUdate1;
	}

	public Date getAstUdate2() {
		return this.astUdate2;
	}

	public void setAstUdate2(Date astUdate2) {
		this.astUdate2 = astUdate2;
	}

	public Date getAstUdate3() {
		return this.astUdate3;
	}

	public void setAstUdate3(Date astUdate3) {
		this.astUdate3 = astUdate3;
	}

	public Date getAstUdate4() {
		return this.astUdate4;
	}

	public void setAstUdate4(Date astUdate4) {
		this.astUdate4 = astUdate4;
	}

	public String getAstUchar1() {
		return this.astUchar1;
	}

	public void setAstUchar1(String astUchar1) {
		this.astUchar1 = astUchar1;
	}

	public String getAstUchar2() {
		return this.astUchar2;
	}

	public void setAstUchar2(String astUchar2) {
		this.astUchar2 = astUchar2;
	}

	public String getAstUchar3() {
		return this.astUchar3;
	}

	public void setAstUchar3(String astUchar3) {
		this.astUchar3 = astUchar3;
	}

	public String getAstUchar4() {
		return this.astUchar4;
	}

	public void setAstUchar4(String astUchar4) {
		this.astUchar4 = astUchar4;
	}

	public Integer getAstUint1() {
		return this.astUint1;
	}

	public void setAstUint1(Integer astUint1) {
		this.astUint1 = astUint1;
	}

	public Integer getAstUint2() {
		return this.astUint2;
	}

	public void setAstUint2(Integer astUint2) {
		this.astUint2 = astUint2;
	}

	public Integer getAstUint3() {
		return this.astUint3;
	}

	public void setAstUint3(Integer astUint3) {
		this.astUint3 = astUint3;
	}

	public Integer getAstUint4() {
		return this.astUint4;
	}

	public void setAstUint4(Integer astUint4) {
		this.astUint4 = astUint4;
	}

	public Double getAstUdec1() {
		return this.astUdec1;
	}

	public void setAstUdec1(Double astUdec1) {
		this.astUdec1 = astUdec1;
	}

	public Double getAstUdec2() {
		return this.astUdec2;
	}

	public void setAstUdec2(Double astUdec2) {
		this.astUdec2 = astUdec2;
	}

	public String getAstUserid() {
		return this.astUserid;
	}

	public void setAstUserid(String astUserid) {
		this.astUserid = astUserid;
	}

	public Date getAstModDate() {
		return this.astModDate;
	}

	public void setAstModDate(Date astModDate) {
		this.astModDate = astModDate;
	}

	public Date getAstSusBeg() {
		return this.astSusBeg;
	}

	public void setAstSusBeg(Date astSusBeg) {
		this.astSusBeg = astSusBeg;
	}

	public Date getAstSusEnd() {
		return this.astSusEnd;
	}

	public void setAstSusEnd(Date astSusEnd) {
		this.astSusEnd = astSusEnd;
	}

	public String getAstSpExpCc() {
		return this.astSpExpCc;
	}

	public void setAstSpExpCc(String astSpExpCc) {
		this.astSpExpCc = astSpExpCc;
	}

	public String getAstSpExpProj() {
		return this.astSpExpProj;
	}

	public void setAstSpExpProj(String astSpExpProj) {
		this.astSpExpProj = astSpExpProj;
	}

	public String getAstPrevMethod() {
		return this.astPrevMethod;
	}

	public void setAstPrevMethod(String astPrevMethod) {
		this.astPrevMethod = astPrevMethod;
	}

	public Boolean getAstQad01() {
		return this.astQad01;
	}

	public void setAstQad01(Boolean astQad01) {
		this.astQad01 = astQad01;
	}

	public String getAstQad02() {
		return this.astQad02;
	}

	public void setAstQad02(String astQad02) {
		this.astQad02 = astQad02;
	}

	public String getAstQad03() {
		return this.astQad03;
	}

	public void setAstQad03(String astQad03) {
		this.astQad03 = astQad03;
	}

	public String getAstUser1() {
		return this.astUser1;
	}

	public void setAstUser1(String astUser1) {
		this.astUser1 = astUser1;
	}

	public String getAstUser2() {
		return this.astUser2;
	}

	public void setAstUser2(String astUser2) {
		this.astUser2 = astUser2;
	}

	public Double getOidAstMstr() {
		return this.oidAstMstr;
	}

	public void setOidAstMstr(Double oidAstMstr) {
		this.oidAstMstr = oidAstMstr;
	}

}