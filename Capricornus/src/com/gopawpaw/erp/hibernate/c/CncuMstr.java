package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CncuMstr entity. @author MyEclipse Persistence Tools
 */
public class CncuMstr extends AbstractCncuMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CncuMstr() {
	}

	/** minimal constructor */
	public CncuMstr(CncuMstrId id, Integer cncuBatch, Date cncuTransDate,
			Date cncuEffDate, String cncuCustUsageRef, String cncuSoNbr,
			Integer cncuSodLine, String cncuSite, String cncuShipto,
			String cncuCust, String cncuPart, String cncuCustpart,
			Double cncuUsageQty, String cncuUsageUm, Double cncuUsageUmConv,
			Double cncuUsageSoUmConv, Double cncuCumQty, String cncuPo,
			String cncuLotser, String cncuRef, String cncuAuth,
			String cncuSelfbillAuth, String cncuCustJob, String cncuCustSeq,
			String cncuCustRef, String cncuModelyr, Integer cncuTrnbr,
			String cncuInvoice, String cncuOrigin, Double cncuManualQty,
			String cncuModUserid, Date cncuModDate, String cncuUser1,
			String cncuUser2, String cncuQadc01, String cncuQadc02,
			Double oidCncuMstr) {
		super(id, cncuBatch, cncuTransDate, cncuEffDate, cncuCustUsageRef,
				cncuSoNbr, cncuSodLine, cncuSite, cncuShipto, cncuCust,
				cncuPart, cncuCustpart, cncuUsageQty, cncuUsageUm,
				cncuUsageUmConv, cncuUsageSoUmConv, cncuCumQty, cncuPo,
				cncuLotser, cncuRef, cncuAuth, cncuSelfbillAuth, cncuCustJob,
				cncuCustSeq, cncuCustRef, cncuModelyr, cncuTrnbr, cncuInvoice,
				cncuOrigin, cncuManualQty, cncuModUserid, cncuModDate,
				cncuUser1, cncuUser2, cncuQadc01, cncuQadc02, oidCncuMstr);
	}

	/** full constructor */
	public CncuMstr(CncuMstrId id, Integer cncuBatch, Date cncuTransDate,
			Date cncuEffDate, String cncuCustUsageRef, Date cncuCustUsageDate,
			String cncuSoNbr, Integer cncuSodLine, String cncuSite,
			String cncuShipto, String cncuCust, String cncuPart,
			String cncuCustpart, Double cncuUsageQty, String cncuUsageUm,
			Double cncuUsageUmConv, Double cncuUsageSoUmConv,
			Double cncuCumQty, String cncuPo, String cncuLotser,
			String cncuRef, String cncuAuth, String cncuSelfbillAuth,
			String cncuCustJob, String cncuCustSeq, String cncuCustRef,
			String cncuModelyr, Integer cncuTrnbr, String cncuInvoice,
			String cncuOrigin, Double cncuManualQty, String cncuModUserid,
			Date cncuModDate, String cncuUser1, String cncuUser2,
			String cncuQadc01, String cncuQadc02, Double oidCncuMstr) {
		super(id, cncuBatch, cncuTransDate, cncuEffDate, cncuCustUsageRef,
				cncuCustUsageDate, cncuSoNbr, cncuSodLine, cncuSite,
				cncuShipto, cncuCust, cncuPart, cncuCustpart, cncuUsageQty,
				cncuUsageUm, cncuUsageUmConv, cncuUsageSoUmConv, cncuCumQty,
				cncuPo, cncuLotser, cncuRef, cncuAuth, cncuSelfbillAuth,
				cncuCustJob, cncuCustSeq, cncuCustRef, cncuModelyr, cncuTrnbr,
				cncuInvoice, cncuOrigin, cncuManualQty, cncuModUserid,
				cncuModDate, cncuUser1, cncuUser2, cncuQadc01, cncuQadc02,
				oidCncuMstr);
	}

}
