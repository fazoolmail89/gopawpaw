package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSixRef entity provides the base persistence definition of the SixRef
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSixRef implements java.io.Serializable {

	// Fields

	private SixRefId id;
	private String sixType;
	private String sixOrder;
	private Integer sixLine;
	private String sixSite;
	private String sixShip;
	private String sixCust;
	private String sixBill;
	private String sixPart;
	private String sixSopart;
	private Double sixQty;
	private String sixUm;
	private Double sixPrice;
	private Double sixAmt;
	private String sixCurr;
	private String sixShipId;
	private String sixAuthorization;
	private String sixPo;
	private Date sixShipdt;
	private String sixInvNbr;
	private Double sixQtyPaid;
	private Double sixAmtPaid;
	private Boolean sixClosed;
	private String sixModUserid;
	private Date sixModDate;
	private String sixUser1;
	private String sixUser2;
	private String sixUser3;
	private String sixUser4;
	private String sixUser5;
	private String sixQadc01;
	private String sixQadc02;
	private String sixQadc03;
	private String sixQadc04;
	private String sixQadc05;
	private String sixQadc06;
	private String sixQadc07;
	private String sixQadc08;
	private String sixQadc09;
	private String sixQadc10;
	private Integer sixQadi01;
	private Integer sixQadi02;
	private Integer sixQadi03;
	private Integer sixQadi04;
	private Integer sixQadi05;
	private Double sixQadd01;
	private Double sixQadd02;
	private Double sixQadd03;
	private Double sixQadd04;
	private Double sixQadd05;
	private Boolean sixQadl01;
	private Boolean sixQadl02;
	private Boolean sixQadl03;
	private Boolean sixQadl04;
	private Boolean sixQadl05;
	private Date sixQadt01;
	private Date sixQadt02;
	private Date sixQadt03;
	private Date sixQadt04;
	private Date sixQadt05;
	private Double sixAmtAppld;
	private String sixModelyr;
	private String sixCustref;
	private Double oidSixRef;

	// Constructors

	/** default constructor */
	public AbstractSixRef() {
	}

	/** minimal constructor */
	public AbstractSixRef(SixRefId id, String sixModelyr, String sixCustref,
			Double oidSixRef) {
		this.id = id;
		this.sixModelyr = sixModelyr;
		this.sixCustref = sixCustref;
		this.oidSixRef = oidSixRef;
	}

	/** full constructor */
	public AbstractSixRef(SixRefId id, String sixType, String sixOrder,
			Integer sixLine, String sixSite, String sixShip, String sixCust,
			String sixBill, String sixPart, String sixSopart, Double sixQty,
			String sixUm, Double sixPrice, Double sixAmt, String sixCurr,
			String sixShipId, String sixAuthorization, String sixPo,
			Date sixShipdt, String sixInvNbr, Double sixQtyPaid,
			Double sixAmtPaid, Boolean sixClosed, String sixModUserid,
			Date sixModDate, String sixUser1, String sixUser2, String sixUser3,
			String sixUser4, String sixUser5, String sixQadc01,
			String sixQadc02, String sixQadc03, String sixQadc04,
			String sixQadc05, String sixQadc06, String sixQadc07,
			String sixQadc08, String sixQadc09, String sixQadc10,
			Integer sixQadi01, Integer sixQadi02, Integer sixQadi03,
			Integer sixQadi04, Integer sixQadi05, Double sixQadd01,
			Double sixQadd02, Double sixQadd03, Double sixQadd04,
			Double sixQadd05, Boolean sixQadl01, Boolean sixQadl02,
			Boolean sixQadl03, Boolean sixQadl04, Boolean sixQadl05,
			Date sixQadt01, Date sixQadt02, Date sixQadt03, Date sixQadt04,
			Date sixQadt05, Double sixAmtAppld, String sixModelyr,
			String sixCustref, Double oidSixRef) {
		this.id = id;
		this.sixType = sixType;
		this.sixOrder = sixOrder;
		this.sixLine = sixLine;
		this.sixSite = sixSite;
		this.sixShip = sixShip;
		this.sixCust = sixCust;
		this.sixBill = sixBill;
		this.sixPart = sixPart;
		this.sixSopart = sixSopart;
		this.sixQty = sixQty;
		this.sixUm = sixUm;
		this.sixPrice = sixPrice;
		this.sixAmt = sixAmt;
		this.sixCurr = sixCurr;
		this.sixShipId = sixShipId;
		this.sixAuthorization = sixAuthorization;
		this.sixPo = sixPo;
		this.sixShipdt = sixShipdt;
		this.sixInvNbr = sixInvNbr;
		this.sixQtyPaid = sixQtyPaid;
		this.sixAmtPaid = sixAmtPaid;
		this.sixClosed = sixClosed;
		this.sixModUserid = sixModUserid;
		this.sixModDate = sixModDate;
		this.sixUser1 = sixUser1;
		this.sixUser2 = sixUser2;
		this.sixUser3 = sixUser3;
		this.sixUser4 = sixUser4;
		this.sixUser5 = sixUser5;
		this.sixQadc01 = sixQadc01;
		this.sixQadc02 = sixQadc02;
		this.sixQadc03 = sixQadc03;
		this.sixQadc04 = sixQadc04;
		this.sixQadc05 = sixQadc05;
		this.sixQadc06 = sixQadc06;
		this.sixQadc07 = sixQadc07;
		this.sixQadc08 = sixQadc08;
		this.sixQadc09 = sixQadc09;
		this.sixQadc10 = sixQadc10;
		this.sixQadi01 = sixQadi01;
		this.sixQadi02 = sixQadi02;
		this.sixQadi03 = sixQadi03;
		this.sixQadi04 = sixQadi04;
		this.sixQadi05 = sixQadi05;
		this.sixQadd01 = sixQadd01;
		this.sixQadd02 = sixQadd02;
		this.sixQadd03 = sixQadd03;
		this.sixQadd04 = sixQadd04;
		this.sixQadd05 = sixQadd05;
		this.sixQadl01 = sixQadl01;
		this.sixQadl02 = sixQadl02;
		this.sixQadl03 = sixQadl03;
		this.sixQadl04 = sixQadl04;
		this.sixQadl05 = sixQadl05;
		this.sixQadt01 = sixQadt01;
		this.sixQadt02 = sixQadt02;
		this.sixQadt03 = sixQadt03;
		this.sixQadt04 = sixQadt04;
		this.sixQadt05 = sixQadt05;
		this.sixAmtAppld = sixAmtAppld;
		this.sixModelyr = sixModelyr;
		this.sixCustref = sixCustref;
		this.oidSixRef = oidSixRef;
	}

	// Property accessors

	public SixRefId getId() {
		return this.id;
	}

	public void setId(SixRefId id) {
		this.id = id;
	}

	public String getSixType() {
		return this.sixType;
	}

	public void setSixType(String sixType) {
		this.sixType = sixType;
	}

	public String getSixOrder() {
		return this.sixOrder;
	}

	public void setSixOrder(String sixOrder) {
		this.sixOrder = sixOrder;
	}

	public Integer getSixLine() {
		return this.sixLine;
	}

	public void setSixLine(Integer sixLine) {
		this.sixLine = sixLine;
	}

	public String getSixSite() {
		return this.sixSite;
	}

	public void setSixSite(String sixSite) {
		this.sixSite = sixSite;
	}

	public String getSixShip() {
		return this.sixShip;
	}

	public void setSixShip(String sixShip) {
		this.sixShip = sixShip;
	}

	public String getSixCust() {
		return this.sixCust;
	}

	public void setSixCust(String sixCust) {
		this.sixCust = sixCust;
	}

	public String getSixBill() {
		return this.sixBill;
	}

	public void setSixBill(String sixBill) {
		this.sixBill = sixBill;
	}

	public String getSixPart() {
		return this.sixPart;
	}

	public void setSixPart(String sixPart) {
		this.sixPart = sixPart;
	}

	public String getSixSopart() {
		return this.sixSopart;
	}

	public void setSixSopart(String sixSopart) {
		this.sixSopart = sixSopart;
	}

	public Double getSixQty() {
		return this.sixQty;
	}

	public void setSixQty(Double sixQty) {
		this.sixQty = sixQty;
	}

	public String getSixUm() {
		return this.sixUm;
	}

	public void setSixUm(String sixUm) {
		this.sixUm = sixUm;
	}

	public Double getSixPrice() {
		return this.sixPrice;
	}

	public void setSixPrice(Double sixPrice) {
		this.sixPrice = sixPrice;
	}

	public Double getSixAmt() {
		return this.sixAmt;
	}

	public void setSixAmt(Double sixAmt) {
		this.sixAmt = sixAmt;
	}

	public String getSixCurr() {
		return this.sixCurr;
	}

	public void setSixCurr(String sixCurr) {
		this.sixCurr = sixCurr;
	}

	public String getSixShipId() {
		return this.sixShipId;
	}

	public void setSixShipId(String sixShipId) {
		this.sixShipId = sixShipId;
	}

	public String getSixAuthorization() {
		return this.sixAuthorization;
	}

	public void setSixAuthorization(String sixAuthorization) {
		this.sixAuthorization = sixAuthorization;
	}

	public String getSixPo() {
		return this.sixPo;
	}

	public void setSixPo(String sixPo) {
		this.sixPo = sixPo;
	}

	public Date getSixShipdt() {
		return this.sixShipdt;
	}

	public void setSixShipdt(Date sixShipdt) {
		this.sixShipdt = sixShipdt;
	}

	public String getSixInvNbr() {
		return this.sixInvNbr;
	}

	public void setSixInvNbr(String sixInvNbr) {
		this.sixInvNbr = sixInvNbr;
	}

	public Double getSixQtyPaid() {
		return this.sixQtyPaid;
	}

	public void setSixQtyPaid(Double sixQtyPaid) {
		this.sixQtyPaid = sixQtyPaid;
	}

	public Double getSixAmtPaid() {
		return this.sixAmtPaid;
	}

	public void setSixAmtPaid(Double sixAmtPaid) {
		this.sixAmtPaid = sixAmtPaid;
	}

	public Boolean getSixClosed() {
		return this.sixClosed;
	}

	public void setSixClosed(Boolean sixClosed) {
		this.sixClosed = sixClosed;
	}

	public String getSixModUserid() {
		return this.sixModUserid;
	}

	public void setSixModUserid(String sixModUserid) {
		this.sixModUserid = sixModUserid;
	}

	public Date getSixModDate() {
		return this.sixModDate;
	}

	public void setSixModDate(Date sixModDate) {
		this.sixModDate = sixModDate;
	}

	public String getSixUser1() {
		return this.sixUser1;
	}

	public void setSixUser1(String sixUser1) {
		this.sixUser1 = sixUser1;
	}

	public String getSixUser2() {
		return this.sixUser2;
	}

	public void setSixUser2(String sixUser2) {
		this.sixUser2 = sixUser2;
	}

	public String getSixUser3() {
		return this.sixUser3;
	}

	public void setSixUser3(String sixUser3) {
		this.sixUser3 = sixUser3;
	}

	public String getSixUser4() {
		return this.sixUser4;
	}

	public void setSixUser4(String sixUser4) {
		this.sixUser4 = sixUser4;
	}

	public String getSixUser5() {
		return this.sixUser5;
	}

	public void setSixUser5(String sixUser5) {
		this.sixUser5 = sixUser5;
	}

	public String getSixQadc01() {
		return this.sixQadc01;
	}

	public void setSixQadc01(String sixQadc01) {
		this.sixQadc01 = sixQadc01;
	}

	public String getSixQadc02() {
		return this.sixQadc02;
	}

	public void setSixQadc02(String sixQadc02) {
		this.sixQadc02 = sixQadc02;
	}

	public String getSixQadc03() {
		return this.sixQadc03;
	}

	public void setSixQadc03(String sixQadc03) {
		this.sixQadc03 = sixQadc03;
	}

	public String getSixQadc04() {
		return this.sixQadc04;
	}

	public void setSixQadc04(String sixQadc04) {
		this.sixQadc04 = sixQadc04;
	}

	public String getSixQadc05() {
		return this.sixQadc05;
	}

	public void setSixQadc05(String sixQadc05) {
		this.sixQadc05 = sixQadc05;
	}

	public String getSixQadc06() {
		return this.sixQadc06;
	}

	public void setSixQadc06(String sixQadc06) {
		this.sixQadc06 = sixQadc06;
	}

	public String getSixQadc07() {
		return this.sixQadc07;
	}

	public void setSixQadc07(String sixQadc07) {
		this.sixQadc07 = sixQadc07;
	}

	public String getSixQadc08() {
		return this.sixQadc08;
	}

	public void setSixQadc08(String sixQadc08) {
		this.sixQadc08 = sixQadc08;
	}

	public String getSixQadc09() {
		return this.sixQadc09;
	}

	public void setSixQadc09(String sixQadc09) {
		this.sixQadc09 = sixQadc09;
	}

	public String getSixQadc10() {
		return this.sixQadc10;
	}

	public void setSixQadc10(String sixQadc10) {
		this.sixQadc10 = sixQadc10;
	}

	public Integer getSixQadi01() {
		return this.sixQadi01;
	}

	public void setSixQadi01(Integer sixQadi01) {
		this.sixQadi01 = sixQadi01;
	}

	public Integer getSixQadi02() {
		return this.sixQadi02;
	}

	public void setSixQadi02(Integer sixQadi02) {
		this.sixQadi02 = sixQadi02;
	}

	public Integer getSixQadi03() {
		return this.sixQadi03;
	}

	public void setSixQadi03(Integer sixQadi03) {
		this.sixQadi03 = sixQadi03;
	}

	public Integer getSixQadi04() {
		return this.sixQadi04;
	}

	public void setSixQadi04(Integer sixQadi04) {
		this.sixQadi04 = sixQadi04;
	}

	public Integer getSixQadi05() {
		return this.sixQadi05;
	}

	public void setSixQadi05(Integer sixQadi05) {
		this.sixQadi05 = sixQadi05;
	}

	public Double getSixQadd01() {
		return this.sixQadd01;
	}

	public void setSixQadd01(Double sixQadd01) {
		this.sixQadd01 = sixQadd01;
	}

	public Double getSixQadd02() {
		return this.sixQadd02;
	}

	public void setSixQadd02(Double sixQadd02) {
		this.sixQadd02 = sixQadd02;
	}

	public Double getSixQadd03() {
		return this.sixQadd03;
	}

	public void setSixQadd03(Double sixQadd03) {
		this.sixQadd03 = sixQadd03;
	}

	public Double getSixQadd04() {
		return this.sixQadd04;
	}

	public void setSixQadd04(Double sixQadd04) {
		this.sixQadd04 = sixQadd04;
	}

	public Double getSixQadd05() {
		return this.sixQadd05;
	}

	public void setSixQadd05(Double sixQadd05) {
		this.sixQadd05 = sixQadd05;
	}

	public Boolean getSixQadl01() {
		return this.sixQadl01;
	}

	public void setSixQadl01(Boolean sixQadl01) {
		this.sixQadl01 = sixQadl01;
	}

	public Boolean getSixQadl02() {
		return this.sixQadl02;
	}

	public void setSixQadl02(Boolean sixQadl02) {
		this.sixQadl02 = sixQadl02;
	}

	public Boolean getSixQadl03() {
		return this.sixQadl03;
	}

	public void setSixQadl03(Boolean sixQadl03) {
		this.sixQadl03 = sixQadl03;
	}

	public Boolean getSixQadl04() {
		return this.sixQadl04;
	}

	public void setSixQadl04(Boolean sixQadl04) {
		this.sixQadl04 = sixQadl04;
	}

	public Boolean getSixQadl05() {
		return this.sixQadl05;
	}

	public void setSixQadl05(Boolean sixQadl05) {
		this.sixQadl05 = sixQadl05;
	}

	public Date getSixQadt01() {
		return this.sixQadt01;
	}

	public void setSixQadt01(Date sixQadt01) {
		this.sixQadt01 = sixQadt01;
	}

	public Date getSixQadt02() {
		return this.sixQadt02;
	}

	public void setSixQadt02(Date sixQadt02) {
		this.sixQadt02 = sixQadt02;
	}

	public Date getSixQadt03() {
		return this.sixQadt03;
	}

	public void setSixQadt03(Date sixQadt03) {
		this.sixQadt03 = sixQadt03;
	}

	public Date getSixQadt04() {
		return this.sixQadt04;
	}

	public void setSixQadt04(Date sixQadt04) {
		this.sixQadt04 = sixQadt04;
	}

	public Date getSixQadt05() {
		return this.sixQadt05;
	}

	public void setSixQadt05(Date sixQadt05) {
		this.sixQadt05 = sixQadt05;
	}

	public Double getSixAmtAppld() {
		return this.sixAmtAppld;
	}

	public void setSixAmtAppld(Double sixAmtAppld) {
		this.sixAmtAppld = sixAmtAppld;
	}

	public String getSixModelyr() {
		return this.sixModelyr;
	}

	public void setSixModelyr(String sixModelyr) {
		this.sixModelyr = sixModelyr;
	}

	public String getSixCustref() {
		return this.sixCustref;
	}

	public void setSixCustref(String sixCustref) {
		this.sixCustref = sixCustref;
	}

	public Double getOidSixRef() {
		return this.oidSixRef;
	}

	public void setOidSixRef(Double oidSixRef) {
		this.oidSixRef = oidSixRef;
	}

}