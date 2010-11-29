package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SchMstr entity. @author MyEclipse Persistence Tools
 */
public class SchMstr extends AbstractSchMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SchMstr() {
	}

	/** minimal constructor */
	public SchMstr(SchMstrId id, Double oidSchMstr) {
		super(id, oidSchMstr);
	}

	/** full constructor */
	public SchMstr(SchMstrId id, Date schCrDate, Integer schCrTime,
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
		super(id, schCrDate, schCrTime, schShip, schRawQty, schFabQty,
				schRawStrt, schRawEnd, schFabStrt, schFabEnd, schPcrQty,
				schPcsDate, schCmtindx, schChr01, schChr02, schChr03, schChr04,
				schChr05, schChr06, schChr07, schChr08, schChr09, schChr10,
				schDec01, schDec02, schDec03, schDec04, schDec05, schDec06,
				schDec07, schDec08, schDec09, schDec10, schDte01, schDte02,
				schLog01, schLog02, schSdPat, schSdTime, schCumulative,
				schUser1, schUser2, schLrAsn, schLrDate, schLrQty, schLrCumQty,
				schEffStart, schEffEnd, schPdrQty, schLrTime, schFromPid,
				schFromSid, schSdDates, schPrpExt, schPrpInt, oidSchMstr);
	}

}
