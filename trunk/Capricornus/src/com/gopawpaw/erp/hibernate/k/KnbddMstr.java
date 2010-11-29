package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbddMstr entity. @author MyEclipse Persistence Tools
 */
public class KnbddMstr extends AbstractKnbddMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbddMstr() {
	}

	/** minimal constructor */
	public KnbddMstr(KnbddMstrId id, String knbddLabelType,
			Boolean knbddSupplier, Boolean knbddSupplierDesc,
			Boolean knbddPoNbr, Boolean knbddPoLine, Boolean knbddProcessSite,
			Boolean knbddPrcsSiteDesc, Boolean knbddProcessId,
			Boolean knbddProcessDesc, Boolean knbddInvSite,
			Boolean knbddInvSiteDesc, Boolean knbddSourceSmId,
			Boolean knbddKanbanId, Boolean knbddPart, Boolean knbddPtDesc1,
			Boolean knbddPtDesc2, Boolean knbddPtRev, Boolean knbddPtUm,
			Boolean knbddRouting, Boolean knbddBomCode,
			Boolean knbddKanbanQuantity, Boolean knbddContSize,
			Boolean knbddContType, Boolean knbddSecondCardId,
			Boolean knbddSmInvLocation, Boolean knbddDelLoc,
			Boolean knbddPouLoc, Boolean knbddCardType,
			Boolean knbddCardTypeDesc, Boolean knbddAccumType,
			Boolean knbddAccumTypeDesc, Boolean knbddCyclesAllowed,
			Boolean knbddActiveStart, Boolean knbddActiveEnd,
			Boolean knbddPrintDate, Boolean knbddPrintTime,
			String knbddCardCmmtPage, String knbddDocumentSize,
			String knbddCardStock, String knbddDocumentColor,
			String knbddTextFont, String knbddFontStyle, String knbddFontSize,
			String knbddTextColor, Boolean knbddSmSite,
			Boolean knbddSmSiteDesc, String knbddDocumentDesc,
			Boolean knbddDestSmId, Boolean knbddSourceSmDesc,
			Boolean knbddDestSmDesc, Date knbddModDate, String knbddModUserid,
			Boolean knbddStep, String knbddUser1, String knbddUser2,
			String knbddQadc01, String knbddQadc02, String knbddUser3,
			String knbddQadc03, String knbddQadc04, Boolean knbddQadl01,
			Boolean knbddQadl02, Double knbddQadd01, Boolean knbddQadl03,
			Integer knbddQadi01, Double oidKnbddMstr) {
		super(id, knbddLabelType, knbddSupplier, knbddSupplierDesc, knbddPoNbr,
				knbddPoLine, knbddProcessSite, knbddPrcsSiteDesc,
				knbddProcessId, knbddProcessDesc, knbddInvSite,
				knbddInvSiteDesc, knbddSourceSmId, knbddKanbanId, knbddPart,
				knbddPtDesc1, knbddPtDesc2, knbddPtRev, knbddPtUm,
				knbddRouting, knbddBomCode, knbddKanbanQuantity, knbddContSize,
				knbddContType, knbddSecondCardId, knbddSmInvLocation,
				knbddDelLoc, knbddPouLoc, knbddCardType, knbddCardTypeDesc,
				knbddAccumType, knbddAccumTypeDesc, knbddCyclesAllowed,
				knbddActiveStart, knbddActiveEnd, knbddPrintDate,
				knbddPrintTime, knbddCardCmmtPage, knbddDocumentSize,
				knbddCardStock, knbddDocumentColor, knbddTextFont,
				knbddFontStyle, knbddFontSize, knbddTextColor, knbddSmSite,
				knbddSmSiteDesc, knbddDocumentDesc, knbddDestSmId,
				knbddSourceSmDesc, knbddDestSmDesc, knbddModDate,
				knbddModUserid, knbddStep, knbddUser1, knbddUser2, knbddQadc01,
				knbddQadc02, knbddUser3, knbddQadc03, knbddQadc04, knbddQadl01,
				knbddQadl02, knbddQadd01, knbddQadl03, knbddQadi01,
				oidKnbddMstr);
	}

	/** full constructor */
	public KnbddMstr(KnbddMstrId id, String knbddLabelType,
			Boolean knbddSupplier, Boolean knbddSupplierDesc,
			Boolean knbddPoNbr, Boolean knbddPoLine, Boolean knbddProcessSite,
			Boolean knbddPrcsSiteDesc, Boolean knbddProcessId,
			Boolean knbddProcessDesc, Boolean knbddInvSite,
			Boolean knbddInvSiteDesc, Boolean knbddSourceSmId,
			Boolean knbddKanbanId, Boolean knbddPart, Boolean knbddPtDesc1,
			Boolean knbddPtDesc2, Boolean knbddPtRev, Boolean knbddPtUm,
			Boolean knbddRouting, Boolean knbddBomCode,
			Boolean knbddKanbanQuantity, Boolean knbddContSize,
			Boolean knbddContType, Boolean knbddSecondCardId,
			Boolean knbddSmInvLocation, Boolean knbddDelLoc,
			Boolean knbddPouLoc, Boolean knbddCardType,
			Boolean knbddCardTypeDesc, Boolean knbddAccumType,
			Boolean knbddAccumTypeDesc, Boolean knbddCyclesAllowed,
			Boolean knbddActiveStart, Boolean knbddActiveEnd,
			Boolean knbddPrintDate, Boolean knbddPrintTime,
			String knbddCardCmmtPage, String knbddDocumentSize,
			String knbddCardStock, String knbddDocumentColor,
			String knbddTextFont, String knbddFontStyle, String knbddFontSize,
			String knbddTextColor, Boolean knbddSmSite,
			Boolean knbddSmSiteDesc, String knbddDocumentDesc,
			Boolean knbddDestSmId, Boolean knbddSourceSmDesc,
			Boolean knbddDestSmDesc, Date knbddModDate, String knbddModUserid,
			Boolean knbddStep, String knbddUser1, String knbddUser2,
			String knbddQadc01, String knbddQadc02, String knbddUser3,
			String knbddQadc03, String knbddQadc04, Boolean knbddQadl01,
			Boolean knbddQadl02, Double knbddQadd01, Boolean knbddQadl03,
			Integer knbddQadi01, Date knbddQadt01, Double oidKnbddMstr) {
		super(id, knbddLabelType, knbddSupplier, knbddSupplierDesc, knbddPoNbr,
				knbddPoLine, knbddProcessSite, knbddPrcsSiteDesc,
				knbddProcessId, knbddProcessDesc, knbddInvSite,
				knbddInvSiteDesc, knbddSourceSmId, knbddKanbanId, knbddPart,
				knbddPtDesc1, knbddPtDesc2, knbddPtRev, knbddPtUm,
				knbddRouting, knbddBomCode, knbddKanbanQuantity, knbddContSize,
				knbddContType, knbddSecondCardId, knbddSmInvLocation,
				knbddDelLoc, knbddPouLoc, knbddCardType, knbddCardTypeDesc,
				knbddAccumType, knbddAccumTypeDesc, knbddCyclesAllowed,
				knbddActiveStart, knbddActiveEnd, knbddPrintDate,
				knbddPrintTime, knbddCardCmmtPage, knbddDocumentSize,
				knbddCardStock, knbddDocumentColor, knbddTextFont,
				knbddFontStyle, knbddFontSize, knbddTextColor, knbddSmSite,
				knbddSmSiteDesc, knbddDocumentDesc, knbddDestSmId,
				knbddSourceSmDesc, knbddDestSmDesc, knbddModDate,
				knbddModUserid, knbddStep, knbddUser1, knbddUser2, knbddQadc01,
				knbddQadc02, knbddUser3, knbddQadc03, knbddQadc04, knbddQadl01,
				knbddQadl02, knbddQadd01, knbddQadl03, knbddQadi01,
				knbddQadt01, oidKnbddMstr);
	}

}
