package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSchMstr entity provides the base persistence definition of the
 * SchMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSchMstr implements java.io.Serializable {

	// Fields

	private SchMstrId id;
	private Date schCrDate;
	private Integer schCrTime;
	private String schShip;
	private Double schRawQty;
	private Double schFabQty;
	private Date schRawStrt;
	private Date schRawEnd;
	private Date schFabStrt;
	private Date schFabEnd;
	private Double schPcrQty;
	private Date schPcsDate;
	private Integer schCmtindx;
	private String schChr01;
	private String schChr02;
	private String schChr03;
	private String schChr04;
	private String schChr05;
	private String schChr06;
	private String schChr07;
	private String schChr08;
	private String schChr09;
	private String schChr10;
	private Double schDec01;
	private Double schDec02;
	private Double schDec03;
	private Double schDec04;
	private Double schDec05;
	private Double schDec06;
	private Double schDec07;
	private Double schDec08;
	private Double schDec09;
	private Double schDec10;
	private Date schDte01;
	private Date schDte02;
	private Boolean schLog01;
	private Boolean schLog02;
	private String schSdPat;
	private String schSdTime;
	private Boolean schCumulative;
	private String schUser1;
	private String schUser2;
	private String schLrAsn;
	private String schLrDate;
	private String schLrQty;
	private String schLrCumQty;
	private Date schEffStart;
	private Date schEffEnd;
	private Double schPdrQty;
	private String schLrTime;
	private String schFromPid;
	private String schFromSid;
	private Boolean schSdDates;
	private String schPrpExt;
	private String schPrpInt;
	private Double oidSchMstr;

	// Constructors

	/** default constructor */
	public AbstractSchMstr() {
	}

	/** minimal constructor */
	public AbstractSchMstr(SchMstrId id, Double oidSchMstr) {
		this.id = id;
		this.oidSchMstr = oidSchMstr;
	}

	/** full constructor */
	public AbstractSchMstr(SchMstrId id, Date schCrDate, Integer schCrTime,
			String schShip, Double schRawQty, Double schFabQty,
			Date schRawStrt, Date schRawEnd, Date schFabStrt, Date schFabEnd,
			Double schPcrQty, Date schPcsDate, Integer schCmtindx,
			String schChr01, String schChr02, String schChr03, String schChr04,
			String schChr05, String schChr06, String schChr07, String schChr08,
			String schChr09, String schChr10, Double schDec01, Double schDec02,
			Double schDec03, Double schDec04, Double schDec05, Double schDec06,
			Double schDec07, Double schDec08, Double schDec09, Double schDec10,
			Date schDte01, Date schDte02, Boolean schLog01, Boolean schLog02,
			String schSdPat, String schSdTime, Boolean schCumulative,
			String schUser1, String schUser2, String schLrAsn,
			String schLrDate, String schLrQty, String schLrCumQty,
			Date schEffStart, Date schEffEnd, Double schPdrQty,
			String schLrTime, String schFromPid, String schFromSid,
			Boolean schSdDates, String schPrpExt, String schPrpInt,
			Double oidSchMstr) {
		this.id = id;
		this.schCrDate = schCrDate;
		this.schCrTime = schCrTime;
		this.schShip = schShip;
		this.schRawQty = schRawQty;
		this.schFabQty = schFabQty;
		this.schRawStrt = schRawStrt;
		this.schRawEnd = schRawEnd;
		this.schFabStrt = schFabStrt;
		this.schFabEnd = schFabEnd;
		this.schPcrQty = schPcrQty;
		this.schPcsDate = schPcsDate;
		this.schCmtindx = schCmtindx;
		this.schChr01 = schChr01;
		this.schChr02 = schChr02;
		this.schChr03 = schChr03;
		this.schChr04 = schChr04;
		this.schChr05 = schChr05;
		this.schChr06 = schChr06;
		this.schChr07 = schChr07;
		this.schChr08 = schChr08;
		this.schChr09 = schChr09;
		this.schChr10 = schChr10;
		this.schDec01 = schDec01;
		this.schDec02 = schDec02;
		this.schDec03 = schDec03;
		this.schDec04 = schDec04;
		this.schDec05 = schDec05;
		this.schDec06 = schDec06;
		this.schDec07 = schDec07;
		this.schDec08 = schDec08;
		this.schDec09 = schDec09;
		this.schDec10 = schDec10;
		this.schDte01 = schDte01;
		this.schDte02 = schDte02;
		this.schLog01 = schLog01;
		this.schLog02 = schLog02;
		this.schSdPat = schSdPat;
		this.schSdTime = schSdTime;
		this.schCumulative = schCumulative;
		this.schUser1 = schUser1;
		this.schUser2 = schUser2;
		this.schLrAsn = schLrAsn;
		this.schLrDate = schLrDate;
		this.schLrQty = schLrQty;
		this.schLrCumQty = schLrCumQty;
		this.schEffStart = schEffStart;
		this.schEffEnd = schEffEnd;
		this.schPdrQty = schPdrQty;
		this.schLrTime = schLrTime;
		this.schFromPid = schFromPid;
		this.schFromSid = schFromSid;
		this.schSdDates = schSdDates;
		this.schPrpExt = schPrpExt;
		this.schPrpInt = schPrpInt;
		this.oidSchMstr = oidSchMstr;
	}

	// Property accessors

	public SchMstrId getId() {
		return this.id;
	}

	public void setId(SchMstrId id) {
		this.id = id;
	}

	public Date getSchCrDate() {
		return this.schCrDate;
	}

	public void setSchCrDate(Date schCrDate) {
		this.schCrDate = schCrDate;
	}

	public Integer getSchCrTime() {
		return this.schCrTime;
	}

	public void setSchCrTime(Integer schCrTime) {
		this.schCrTime = schCrTime;
	}

	public String getSchShip() {
		return this.schShip;
	}

	public void setSchShip(String schShip) {
		this.schShip = schShip;
	}

	public Double getSchRawQty() {
		return this.schRawQty;
	}

	public void setSchRawQty(Double schRawQty) {
		this.schRawQty = schRawQty;
	}

	public Double getSchFabQty() {
		return this.schFabQty;
	}

	public void setSchFabQty(Double schFabQty) {
		this.schFabQty = schFabQty;
	}

	public Date getSchRawStrt() {
		return this.schRawStrt;
	}

	public void setSchRawStrt(Date schRawStrt) {
		this.schRawStrt = schRawStrt;
	}

	public Date getSchRawEnd() {
		return this.schRawEnd;
	}

	public void setSchRawEnd(Date schRawEnd) {
		this.schRawEnd = schRawEnd;
	}

	public Date getSchFabStrt() {
		return this.schFabStrt;
	}

	public void setSchFabStrt(Date schFabStrt) {
		this.schFabStrt = schFabStrt;
	}

	public Date getSchFabEnd() {
		return this.schFabEnd;
	}

	public void setSchFabEnd(Date schFabEnd) {
		this.schFabEnd = schFabEnd;
	}

	public Double getSchPcrQty() {
		return this.schPcrQty;
	}

	public void setSchPcrQty(Double schPcrQty) {
		this.schPcrQty = schPcrQty;
	}

	public Date getSchPcsDate() {
		return this.schPcsDate;
	}

	public void setSchPcsDate(Date schPcsDate) {
		this.schPcsDate = schPcsDate;
	}

	public Integer getSchCmtindx() {
		return this.schCmtindx;
	}

	public void setSchCmtindx(Integer schCmtindx) {
		this.schCmtindx = schCmtindx;
	}

	public String getSchChr01() {
		return this.schChr01;
	}

	public void setSchChr01(String schChr01) {
		this.schChr01 = schChr01;
	}

	public String getSchChr02() {
		return this.schChr02;
	}

	public void setSchChr02(String schChr02) {
		this.schChr02 = schChr02;
	}

	public String getSchChr03() {
		return this.schChr03;
	}

	public void setSchChr03(String schChr03) {
		this.schChr03 = schChr03;
	}

	public String getSchChr04() {
		return this.schChr04;
	}

	public void setSchChr04(String schChr04) {
		this.schChr04 = schChr04;
	}

	public String getSchChr05() {
		return this.schChr05;
	}

	public void setSchChr05(String schChr05) {
		this.schChr05 = schChr05;
	}

	public String getSchChr06() {
		return this.schChr06;
	}

	public void setSchChr06(String schChr06) {
		this.schChr06 = schChr06;
	}

	public String getSchChr07() {
		return this.schChr07;
	}

	public void setSchChr07(String schChr07) {
		this.schChr07 = schChr07;
	}

	public String getSchChr08() {
		return this.schChr08;
	}

	public void setSchChr08(String schChr08) {
		this.schChr08 = schChr08;
	}

	public String getSchChr09() {
		return this.schChr09;
	}

	public void setSchChr09(String schChr09) {
		this.schChr09 = schChr09;
	}

	public String getSchChr10() {
		return this.schChr10;
	}

	public void setSchChr10(String schChr10) {
		this.schChr10 = schChr10;
	}

	public Double getSchDec01() {
		return this.schDec01;
	}

	public void setSchDec01(Double schDec01) {
		this.schDec01 = schDec01;
	}

	public Double getSchDec02() {
		return this.schDec02;
	}

	public void setSchDec02(Double schDec02) {
		this.schDec02 = schDec02;
	}

	public Double getSchDec03() {
		return this.schDec03;
	}

	public void setSchDec03(Double schDec03) {
		this.schDec03 = schDec03;
	}

	public Double getSchDec04() {
		return this.schDec04;
	}

	public void setSchDec04(Double schDec04) {
		this.schDec04 = schDec04;
	}

	public Double getSchDec05() {
		return this.schDec05;
	}

	public void setSchDec05(Double schDec05) {
		this.schDec05 = schDec05;
	}

	public Double getSchDec06() {
		return this.schDec06;
	}

	public void setSchDec06(Double schDec06) {
		this.schDec06 = schDec06;
	}

	public Double getSchDec07() {
		return this.schDec07;
	}

	public void setSchDec07(Double schDec07) {
		this.schDec07 = schDec07;
	}

	public Double getSchDec08() {
		return this.schDec08;
	}

	public void setSchDec08(Double schDec08) {
		this.schDec08 = schDec08;
	}

	public Double getSchDec09() {
		return this.schDec09;
	}

	public void setSchDec09(Double schDec09) {
		this.schDec09 = schDec09;
	}

	public Double getSchDec10() {
		return this.schDec10;
	}

	public void setSchDec10(Double schDec10) {
		this.schDec10 = schDec10;
	}

	public Date getSchDte01() {
		return this.schDte01;
	}

	public void setSchDte01(Date schDte01) {
		this.schDte01 = schDte01;
	}

	public Date getSchDte02() {
		return this.schDte02;
	}

	public void setSchDte02(Date schDte02) {
		this.schDte02 = schDte02;
	}

	public Boolean getSchLog01() {
		return this.schLog01;
	}

	public void setSchLog01(Boolean schLog01) {
		this.schLog01 = schLog01;
	}

	public Boolean getSchLog02() {
		return this.schLog02;
	}

	public void setSchLog02(Boolean schLog02) {
		this.schLog02 = schLog02;
	}

	public String getSchSdPat() {
		return this.schSdPat;
	}

	public void setSchSdPat(String schSdPat) {
		this.schSdPat = schSdPat;
	}

	public String getSchSdTime() {
		return this.schSdTime;
	}

	public void setSchSdTime(String schSdTime) {
		this.schSdTime = schSdTime;
	}

	public Boolean getSchCumulative() {
		return this.schCumulative;
	}

	public void setSchCumulative(Boolean schCumulative) {
		this.schCumulative = schCumulative;
	}

	public String getSchUser1() {
		return this.schUser1;
	}

	public void setSchUser1(String schUser1) {
		this.schUser1 = schUser1;
	}

	public String getSchUser2() {
		return this.schUser2;
	}

	public void setSchUser2(String schUser2) {
		this.schUser2 = schUser2;
	}

	public String getSchLrAsn() {
		return this.schLrAsn;
	}

	public void setSchLrAsn(String schLrAsn) {
		this.schLrAsn = schLrAsn;
	}

	public String getSchLrDate() {
		return this.schLrDate;
	}

	public void setSchLrDate(String schLrDate) {
		this.schLrDate = schLrDate;
	}

	public String getSchLrQty() {
		return this.schLrQty;
	}

	public void setSchLrQty(String schLrQty) {
		this.schLrQty = schLrQty;
	}

	public String getSchLrCumQty() {
		return this.schLrCumQty;
	}

	public void setSchLrCumQty(String schLrCumQty) {
		this.schLrCumQty = schLrCumQty;
	}

	public Date getSchEffStart() {
		return this.schEffStart;
	}

	public void setSchEffStart(Date schEffStart) {
		this.schEffStart = schEffStart;
	}

	public Date getSchEffEnd() {
		return this.schEffEnd;
	}

	public void setSchEffEnd(Date schEffEnd) {
		this.schEffEnd = schEffEnd;
	}

	public Double getSchPdrQty() {
		return this.schPdrQty;
	}

	public void setSchPdrQty(Double schPdrQty) {
		this.schPdrQty = schPdrQty;
	}

	public String getSchLrTime() {
		return this.schLrTime;
	}

	public void setSchLrTime(String schLrTime) {
		this.schLrTime = schLrTime;
	}

	public String getSchFromPid() {
		return this.schFromPid;
	}

	public void setSchFromPid(String schFromPid) {
		this.schFromPid = schFromPid;
	}

	public String getSchFromSid() {
		return this.schFromSid;
	}

	public void setSchFromSid(String schFromSid) {
		this.schFromSid = schFromSid;
	}

	public Boolean getSchSdDates() {
		return this.schSdDates;
	}

	public void setSchSdDates(Boolean schSdDates) {
		this.schSdDates = schSdDates;
	}

	public String getSchPrpExt() {
		return this.schPrpExt;
	}

	public void setSchPrpExt(String schPrpExt) {
		this.schPrpExt = schPrpExt;
	}

	public String getSchPrpInt() {
		return this.schPrpInt;
	}

	public void setSchPrpInt(String schPrpInt) {
		this.schPrpInt = schPrpInt;
	}

	public Double getOidSchMstr() {
		return this.oidSchMstr;
	}

	public void setOidSchMstr(Double oidSchMstr) {
		this.oidSchMstr = oidSchMstr;
	}

}