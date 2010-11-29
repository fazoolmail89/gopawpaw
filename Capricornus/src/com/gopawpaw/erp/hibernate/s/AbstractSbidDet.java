package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSbidDet entity provides the base persistence definition of the
 * SbidDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbidDet implements java.io.Serializable {

	// Fields

	private SbidDetId id;
	private String sbidType;
	private String sbidOrigin;
	private String sbidPart;
	private String sbidCust;
	private Double sbidQty;
	private String sbidUm;
	private Double sbidPrice;
	private Double sbidAmt;
	private String sbidShipId;
	private String sbidAuthorization;
	private String sbidPo;
	private Integer sbidTrnbr;
	private String sbidInvNbr;
	private Double sbidTaxAmt;
	private Double sbidTaxPct;
	private String sbidOrder;
	private String sbidUser6;
	private String sbidUser7;
	private String sbidModUserid;
	private Date sbidModDate;
	private String sbidUser1;
	private String sbidUser2;
	private String sbidUser3;
	private String sbidUser4;
	private String sbidUser5;
	private String sbidQadc01;
	private String sbidQadc02;
	private String sbidQadc03;
	private String sbidQadc04;
	private String sbidQadc05;
	private String sbidQadc06;
	private String sbidQadc07;
	private String sbidQadc08;
	private String sbidQadc09;
	private String sbidQadc10;
	private Integer sbidQadi01;
	private Integer sbidQadi02;
	private Integer sbidQadi03;
	private Integer sbidQadi04;
	private Integer sbidQadi05;
	private Double sbidQadd01;
	private Double sbidQadd02;
	private Double sbidQadd03;
	private Double sbidQadd04;
	private Double sbidQadd05;
	private Boolean sbidQadl01;
	private Boolean sbidQadl02;
	private Boolean sbidQadl03;
	private Boolean sbidQadl04;
	private Boolean sbidQadl05;
	private Date sbidQadt01;
	private Date sbidQadt02;
	private Date sbidQadt03;
	private Date sbidQadt04;
	private Date sbidQadt05;
	private String sbidRemarks;
	private String sbidModelyr;
	private String sbidCustref;
	private Double oidSbidDet;

	// Constructors

	/** default constructor */
	public AbstractSbidDet() {
	}

	/** minimal constructor */
	public AbstractSbidDet(SbidDetId id, String sbidModelyr,
			String sbidCustref, Double oidSbidDet) {
		this.id = id;
		this.sbidModelyr = sbidModelyr;
		this.sbidCustref = sbidCustref;
		this.oidSbidDet = oidSbidDet;
	}

	/** full constructor */
	public AbstractSbidDet(SbidDetId id, String sbidType, String sbidOrigin,
			String sbidPart, String sbidCust, Double sbidQty, String sbidUm,
			Double sbidPrice, Double sbidAmt, String sbidShipId,
			String sbidAuthorization, String sbidPo, Integer sbidTrnbr,
			String sbidInvNbr, Double sbidTaxAmt, Double sbidTaxPct,
			String sbidOrder, String sbidUser6, String sbidUser7,
			String sbidModUserid, Date sbidModDate, String sbidUser1,
			String sbidUser2, String sbidUser3, String sbidUser4,
			String sbidUser5, String sbidQadc01, String sbidQadc02,
			String sbidQadc03, String sbidQadc04, String sbidQadc05,
			String sbidQadc06, String sbidQadc07, String sbidQadc08,
			String sbidQadc09, String sbidQadc10, Integer sbidQadi01,
			Integer sbidQadi02, Integer sbidQadi03, Integer sbidQadi04,
			Integer sbidQadi05, Double sbidQadd01, Double sbidQadd02,
			Double sbidQadd03, Double sbidQadd04, Double sbidQadd05,
			Boolean sbidQadl01, Boolean sbidQadl02, Boolean sbidQadl03,
			Boolean sbidQadl04, Boolean sbidQadl05, Date sbidQadt01,
			Date sbidQadt02, Date sbidQadt03, Date sbidQadt04, Date sbidQadt05,
			String sbidRemarks, String sbidModelyr, String sbidCustref,
			Double oidSbidDet) {
		this.id = id;
		this.sbidType = sbidType;
		this.sbidOrigin = sbidOrigin;
		this.sbidPart = sbidPart;
		this.sbidCust = sbidCust;
		this.sbidQty = sbidQty;
		this.sbidUm = sbidUm;
		this.sbidPrice = sbidPrice;
		this.sbidAmt = sbidAmt;
		this.sbidShipId = sbidShipId;
		this.sbidAuthorization = sbidAuthorization;
		this.sbidPo = sbidPo;
		this.sbidTrnbr = sbidTrnbr;
		this.sbidInvNbr = sbidInvNbr;
		this.sbidTaxAmt = sbidTaxAmt;
		this.sbidTaxPct = sbidTaxPct;
		this.sbidOrder = sbidOrder;
		this.sbidUser6 = sbidUser6;
		this.sbidUser7 = sbidUser7;
		this.sbidModUserid = sbidModUserid;
		this.sbidModDate = sbidModDate;
		this.sbidUser1 = sbidUser1;
		this.sbidUser2 = sbidUser2;
		this.sbidUser3 = sbidUser3;
		this.sbidUser4 = sbidUser4;
		this.sbidUser5 = sbidUser5;
		this.sbidQadc01 = sbidQadc01;
		this.sbidQadc02 = sbidQadc02;
		this.sbidQadc03 = sbidQadc03;
		this.sbidQadc04 = sbidQadc04;
		this.sbidQadc05 = sbidQadc05;
		this.sbidQadc06 = sbidQadc06;
		this.sbidQadc07 = sbidQadc07;
		this.sbidQadc08 = sbidQadc08;
		this.sbidQadc09 = sbidQadc09;
		this.sbidQadc10 = sbidQadc10;
		this.sbidQadi01 = sbidQadi01;
		this.sbidQadi02 = sbidQadi02;
		this.sbidQadi03 = sbidQadi03;
		this.sbidQadi04 = sbidQadi04;
		this.sbidQadi05 = sbidQadi05;
		this.sbidQadd01 = sbidQadd01;
		this.sbidQadd02 = sbidQadd02;
		this.sbidQadd03 = sbidQadd03;
		this.sbidQadd04 = sbidQadd04;
		this.sbidQadd05 = sbidQadd05;
		this.sbidQadl01 = sbidQadl01;
		this.sbidQadl02 = sbidQadl02;
		this.sbidQadl03 = sbidQadl03;
		this.sbidQadl04 = sbidQadl04;
		this.sbidQadl05 = sbidQadl05;
		this.sbidQadt01 = sbidQadt01;
		this.sbidQadt02 = sbidQadt02;
		this.sbidQadt03 = sbidQadt03;
		this.sbidQadt04 = sbidQadt04;
		this.sbidQadt05 = sbidQadt05;
		this.sbidRemarks = sbidRemarks;
		this.sbidModelyr = sbidModelyr;
		this.sbidCustref = sbidCustref;
		this.oidSbidDet = oidSbidDet;
	}

	// Property accessors

	public SbidDetId getId() {
		return this.id;
	}

	public void setId(SbidDetId id) {
		this.id = id;
	}

	public String getSbidType() {
		return this.sbidType;
	}

	public void setSbidType(String sbidType) {
		this.sbidType = sbidType;
	}

	public String getSbidOrigin() {
		return this.sbidOrigin;
	}

	public void setSbidOrigin(String sbidOrigin) {
		this.sbidOrigin = sbidOrigin;
	}

	public String getSbidPart() {
		return this.sbidPart;
	}

	public void setSbidPart(String sbidPart) {
		this.sbidPart = sbidPart;
	}

	public String getSbidCust() {
		return this.sbidCust;
	}

	public void setSbidCust(String sbidCust) {
		this.sbidCust = sbidCust;
	}

	public Double getSbidQty() {
		return this.sbidQty;
	}

	public void setSbidQty(Double sbidQty) {
		this.sbidQty = sbidQty;
	}

	public String getSbidUm() {
		return this.sbidUm;
	}

	public void setSbidUm(String sbidUm) {
		this.sbidUm = sbidUm;
	}

	public Double getSbidPrice() {
		return this.sbidPrice;
	}

	public void setSbidPrice(Double sbidPrice) {
		this.sbidPrice = sbidPrice;
	}

	public Double getSbidAmt() {
		return this.sbidAmt;
	}

	public void setSbidAmt(Double sbidAmt) {
		this.sbidAmt = sbidAmt;
	}

	public String getSbidShipId() {
		return this.sbidShipId;
	}

	public void setSbidShipId(String sbidShipId) {
		this.sbidShipId = sbidShipId;
	}

	public String getSbidAuthorization() {
		return this.sbidAuthorization;
	}

	public void setSbidAuthorization(String sbidAuthorization) {
		this.sbidAuthorization = sbidAuthorization;
	}

	public String getSbidPo() {
		return this.sbidPo;
	}

	public void setSbidPo(String sbidPo) {
		this.sbidPo = sbidPo;
	}

	public Integer getSbidTrnbr() {
		return this.sbidTrnbr;
	}

	public void setSbidTrnbr(Integer sbidTrnbr) {
		this.sbidTrnbr = sbidTrnbr;
	}

	public String getSbidInvNbr() {
		return this.sbidInvNbr;
	}

	public void setSbidInvNbr(String sbidInvNbr) {
		this.sbidInvNbr = sbidInvNbr;
	}

	public Double getSbidTaxAmt() {
		return this.sbidTaxAmt;
	}

	public void setSbidTaxAmt(Double sbidTaxAmt) {
		this.sbidTaxAmt = sbidTaxAmt;
	}

	public Double getSbidTaxPct() {
		return this.sbidTaxPct;
	}

	public void setSbidTaxPct(Double sbidTaxPct) {
		this.sbidTaxPct = sbidTaxPct;
	}

	public String getSbidOrder() {
		return this.sbidOrder;
	}

	public void setSbidOrder(String sbidOrder) {
		this.sbidOrder = sbidOrder;
	}

	public String getSbidUser6() {
		return this.sbidUser6;
	}

	public void setSbidUser6(String sbidUser6) {
		this.sbidUser6 = sbidUser6;
	}

	public String getSbidUser7() {
		return this.sbidUser7;
	}

	public void setSbidUser7(String sbidUser7) {
		this.sbidUser7 = sbidUser7;
	}

	public String getSbidModUserid() {
		return this.sbidModUserid;
	}

	public void setSbidModUserid(String sbidModUserid) {
		this.sbidModUserid = sbidModUserid;
	}

	public Date getSbidModDate() {
		return this.sbidModDate;
	}

	public void setSbidModDate(Date sbidModDate) {
		this.sbidModDate = sbidModDate;
	}

	public String getSbidUser1() {
		return this.sbidUser1;
	}

	public void setSbidUser1(String sbidUser1) {
		this.sbidUser1 = sbidUser1;
	}

	public String getSbidUser2() {
		return this.sbidUser2;
	}

	public void setSbidUser2(String sbidUser2) {
		this.sbidUser2 = sbidUser2;
	}

	public String getSbidUser3() {
		return this.sbidUser3;
	}

	public void setSbidUser3(String sbidUser3) {
		this.sbidUser3 = sbidUser3;
	}

	public String getSbidUser4() {
		return this.sbidUser4;
	}

	public void setSbidUser4(String sbidUser4) {
		this.sbidUser4 = sbidUser4;
	}

	public String getSbidUser5() {
		return this.sbidUser5;
	}

	public void setSbidUser5(String sbidUser5) {
		this.sbidUser5 = sbidUser5;
	}

	public String getSbidQadc01() {
		return this.sbidQadc01;
	}

	public void setSbidQadc01(String sbidQadc01) {
		this.sbidQadc01 = sbidQadc01;
	}

	public String getSbidQadc02() {
		return this.sbidQadc02;
	}

	public void setSbidQadc02(String sbidQadc02) {
		this.sbidQadc02 = sbidQadc02;
	}

	public String getSbidQadc03() {
		return this.sbidQadc03;
	}

	public void setSbidQadc03(String sbidQadc03) {
		this.sbidQadc03 = sbidQadc03;
	}

	public String getSbidQadc04() {
		return this.sbidQadc04;
	}

	public void setSbidQadc04(String sbidQadc04) {
		this.sbidQadc04 = sbidQadc04;
	}

	public String getSbidQadc05() {
		return this.sbidQadc05;
	}

	public void setSbidQadc05(String sbidQadc05) {
		this.sbidQadc05 = sbidQadc05;
	}

	public String getSbidQadc06() {
		return this.sbidQadc06;
	}

	public void setSbidQadc06(String sbidQadc06) {
		this.sbidQadc06 = sbidQadc06;
	}

	public String getSbidQadc07() {
		return this.sbidQadc07;
	}

	public void setSbidQadc07(String sbidQadc07) {
		this.sbidQadc07 = sbidQadc07;
	}

	public String getSbidQadc08() {
		return this.sbidQadc08;
	}

	public void setSbidQadc08(String sbidQadc08) {
		this.sbidQadc08 = sbidQadc08;
	}

	public String getSbidQadc09() {
		return this.sbidQadc09;
	}

	public void setSbidQadc09(String sbidQadc09) {
		this.sbidQadc09 = sbidQadc09;
	}

	public String getSbidQadc10() {
		return this.sbidQadc10;
	}

	public void setSbidQadc10(String sbidQadc10) {
		this.sbidQadc10 = sbidQadc10;
	}

	public Integer getSbidQadi01() {
		return this.sbidQadi01;
	}

	public void setSbidQadi01(Integer sbidQadi01) {
		this.sbidQadi01 = sbidQadi01;
	}

	public Integer getSbidQadi02() {
		return this.sbidQadi02;
	}

	public void setSbidQadi02(Integer sbidQadi02) {
		this.sbidQadi02 = sbidQadi02;
	}

	public Integer getSbidQadi03() {
		return this.sbidQadi03;
	}

	public void setSbidQadi03(Integer sbidQadi03) {
		this.sbidQadi03 = sbidQadi03;
	}

	public Integer getSbidQadi04() {
		return this.sbidQadi04;
	}

	public void setSbidQadi04(Integer sbidQadi04) {
		this.sbidQadi04 = sbidQadi04;
	}

	public Integer getSbidQadi05() {
		return this.sbidQadi05;
	}

	public void setSbidQadi05(Integer sbidQadi05) {
		this.sbidQadi05 = sbidQadi05;
	}

	public Double getSbidQadd01() {
		return this.sbidQadd01;
	}

	public void setSbidQadd01(Double sbidQadd01) {
		this.sbidQadd01 = sbidQadd01;
	}

	public Double getSbidQadd02() {
		return this.sbidQadd02;
	}

	public void setSbidQadd02(Double sbidQadd02) {
		this.sbidQadd02 = sbidQadd02;
	}

	public Double getSbidQadd03() {
		return this.sbidQadd03;
	}

	public void setSbidQadd03(Double sbidQadd03) {
		this.sbidQadd03 = sbidQadd03;
	}

	public Double getSbidQadd04() {
		return this.sbidQadd04;
	}

	public void setSbidQadd04(Double sbidQadd04) {
		this.sbidQadd04 = sbidQadd04;
	}

	public Double getSbidQadd05() {
		return this.sbidQadd05;
	}

	public void setSbidQadd05(Double sbidQadd05) {
		this.sbidQadd05 = sbidQadd05;
	}

	public Boolean getSbidQadl01() {
		return this.sbidQadl01;
	}

	public void setSbidQadl01(Boolean sbidQadl01) {
		this.sbidQadl01 = sbidQadl01;
	}

	public Boolean getSbidQadl02() {
		return this.sbidQadl02;
	}

	public void setSbidQadl02(Boolean sbidQadl02) {
		this.sbidQadl02 = sbidQadl02;
	}

	public Boolean getSbidQadl03() {
		return this.sbidQadl03;
	}

	public void setSbidQadl03(Boolean sbidQadl03) {
		this.sbidQadl03 = sbidQadl03;
	}

	public Boolean getSbidQadl04() {
		return this.sbidQadl04;
	}

	public void setSbidQadl04(Boolean sbidQadl04) {
		this.sbidQadl04 = sbidQadl04;
	}

	public Boolean getSbidQadl05() {
		return this.sbidQadl05;
	}

	public void setSbidQadl05(Boolean sbidQadl05) {
		this.sbidQadl05 = sbidQadl05;
	}

	public Date getSbidQadt01() {
		return this.sbidQadt01;
	}

	public void setSbidQadt01(Date sbidQadt01) {
		this.sbidQadt01 = sbidQadt01;
	}

	public Date getSbidQadt02() {
		return this.sbidQadt02;
	}

	public void setSbidQadt02(Date sbidQadt02) {
		this.sbidQadt02 = sbidQadt02;
	}

	public Date getSbidQadt03() {
		return this.sbidQadt03;
	}

	public void setSbidQadt03(Date sbidQadt03) {
		this.sbidQadt03 = sbidQadt03;
	}

	public Date getSbidQadt04() {
		return this.sbidQadt04;
	}

	public void setSbidQadt04(Date sbidQadt04) {
		this.sbidQadt04 = sbidQadt04;
	}

	public Date getSbidQadt05() {
		return this.sbidQadt05;
	}

	public void setSbidQadt05(Date sbidQadt05) {
		this.sbidQadt05 = sbidQadt05;
	}

	public String getSbidRemarks() {
		return this.sbidRemarks;
	}

	public void setSbidRemarks(String sbidRemarks) {
		this.sbidRemarks = sbidRemarks;
	}

	public String getSbidModelyr() {
		return this.sbidModelyr;
	}

	public void setSbidModelyr(String sbidModelyr) {
		this.sbidModelyr = sbidModelyr;
	}

	public String getSbidCustref() {
		return this.sbidCustref;
	}

	public void setSbidCustref(String sbidCustref) {
		this.sbidCustref = sbidCustref;
	}

	public Double getOidSbidDet() {
		return this.oidSbidDet;
	}

	public void setOidSbidDet(Double oidSbidDet) {
		this.oidSbidDet = oidSbidDet;
	}

}