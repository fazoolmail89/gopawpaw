package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbddMstr entity provides the base persistence definition of the
 * KnbddMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbddMstr implements java.io.Serializable {

	// Fields

	private KnbddMstrId id;
	private String knbddLabelType;
	private Boolean knbddSupplier;
	private Boolean knbddSupplierDesc;
	private Boolean knbddPoNbr;
	private Boolean knbddPoLine;
	private Boolean knbddProcessSite;
	private Boolean knbddPrcsSiteDesc;
	private Boolean knbddProcessId;
	private Boolean knbddProcessDesc;
	private Boolean knbddInvSite;
	private Boolean knbddInvSiteDesc;
	private Boolean knbddSourceSmId;
	private Boolean knbddKanbanId;
	private Boolean knbddPart;
	private Boolean knbddPtDesc1;
	private Boolean knbddPtDesc2;
	private Boolean knbddPtRev;
	private Boolean knbddPtUm;
	private Boolean knbddRouting;
	private Boolean knbddBomCode;
	private Boolean knbddKanbanQuantity;
	private Boolean knbddContSize;
	private Boolean knbddContType;
	private Boolean knbddSecondCardId;
	private Boolean knbddSmInvLocation;
	private Boolean knbddDelLoc;
	private Boolean knbddPouLoc;
	private Boolean knbddCardType;
	private Boolean knbddCardTypeDesc;
	private Boolean knbddAccumType;
	private Boolean knbddAccumTypeDesc;
	private Boolean knbddCyclesAllowed;
	private Boolean knbddActiveStart;
	private Boolean knbddActiveEnd;
	private Boolean knbddPrintDate;
	private Boolean knbddPrintTime;
	private String knbddCardCmmtPage;
	private String knbddDocumentSize;
	private String knbddCardStock;
	private String knbddDocumentColor;
	private String knbddTextFont;
	private String knbddFontStyle;
	private String knbddFontSize;
	private String knbddTextColor;
	private Boolean knbddSmSite;
	private Boolean knbddSmSiteDesc;
	private String knbddDocumentDesc;
	private Boolean knbddDestSmId;
	private Boolean knbddSourceSmDesc;
	private Boolean knbddDestSmDesc;
	private Date knbddModDate;
	private String knbddModUserid;
	private Boolean knbddStep;
	private String knbddUser1;
	private String knbddUser2;
	private String knbddQadc01;
	private String knbddQadc02;
	private String knbddUser3;
	private String knbddQadc03;
	private String knbddQadc04;
	private Boolean knbddQadl01;
	private Boolean knbddQadl02;
	private Double knbddQadd01;
	private Boolean knbddQadl03;
	private Integer knbddQadi01;
	private Date knbddQadt01;
	private Double oidKnbddMstr;

	// Constructors

	/** default constructor */
	public AbstractKnbddMstr() {
	}

	/** minimal constructor */
	public AbstractKnbddMstr(KnbddMstrId id, String knbddLabelType,
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
		this.id = id;
		this.knbddLabelType = knbddLabelType;
		this.knbddSupplier = knbddSupplier;
		this.knbddSupplierDesc = knbddSupplierDesc;
		this.knbddPoNbr = knbddPoNbr;
		this.knbddPoLine = knbddPoLine;
		this.knbddProcessSite = knbddProcessSite;
		this.knbddPrcsSiteDesc = knbddPrcsSiteDesc;
		this.knbddProcessId = knbddProcessId;
		this.knbddProcessDesc = knbddProcessDesc;
		this.knbddInvSite = knbddInvSite;
		this.knbddInvSiteDesc = knbddInvSiteDesc;
		this.knbddSourceSmId = knbddSourceSmId;
		this.knbddKanbanId = knbddKanbanId;
		this.knbddPart = knbddPart;
		this.knbddPtDesc1 = knbddPtDesc1;
		this.knbddPtDesc2 = knbddPtDesc2;
		this.knbddPtRev = knbddPtRev;
		this.knbddPtUm = knbddPtUm;
		this.knbddRouting = knbddRouting;
		this.knbddBomCode = knbddBomCode;
		this.knbddKanbanQuantity = knbddKanbanQuantity;
		this.knbddContSize = knbddContSize;
		this.knbddContType = knbddContType;
		this.knbddSecondCardId = knbddSecondCardId;
		this.knbddSmInvLocation = knbddSmInvLocation;
		this.knbddDelLoc = knbddDelLoc;
		this.knbddPouLoc = knbddPouLoc;
		this.knbddCardType = knbddCardType;
		this.knbddCardTypeDesc = knbddCardTypeDesc;
		this.knbddAccumType = knbddAccumType;
		this.knbddAccumTypeDesc = knbddAccumTypeDesc;
		this.knbddCyclesAllowed = knbddCyclesAllowed;
		this.knbddActiveStart = knbddActiveStart;
		this.knbddActiveEnd = knbddActiveEnd;
		this.knbddPrintDate = knbddPrintDate;
		this.knbddPrintTime = knbddPrintTime;
		this.knbddCardCmmtPage = knbddCardCmmtPage;
		this.knbddDocumentSize = knbddDocumentSize;
		this.knbddCardStock = knbddCardStock;
		this.knbddDocumentColor = knbddDocumentColor;
		this.knbddTextFont = knbddTextFont;
		this.knbddFontStyle = knbddFontStyle;
		this.knbddFontSize = knbddFontSize;
		this.knbddTextColor = knbddTextColor;
		this.knbddSmSite = knbddSmSite;
		this.knbddSmSiteDesc = knbddSmSiteDesc;
		this.knbddDocumentDesc = knbddDocumentDesc;
		this.knbddDestSmId = knbddDestSmId;
		this.knbddSourceSmDesc = knbddSourceSmDesc;
		this.knbddDestSmDesc = knbddDestSmDesc;
		this.knbddModDate = knbddModDate;
		this.knbddModUserid = knbddModUserid;
		this.knbddStep = knbddStep;
		this.knbddUser1 = knbddUser1;
		this.knbddUser2 = knbddUser2;
		this.knbddQadc01 = knbddQadc01;
		this.knbddQadc02 = knbddQadc02;
		this.knbddUser3 = knbddUser3;
		this.knbddQadc03 = knbddQadc03;
		this.knbddQadc04 = knbddQadc04;
		this.knbddQadl01 = knbddQadl01;
		this.knbddQadl02 = knbddQadl02;
		this.knbddQadd01 = knbddQadd01;
		this.knbddQadl03 = knbddQadl03;
		this.knbddQadi01 = knbddQadi01;
		this.oidKnbddMstr = oidKnbddMstr;
	}

	/** full constructor */
	public AbstractKnbddMstr(KnbddMstrId id, String knbddLabelType,
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
		this.id = id;
		this.knbddLabelType = knbddLabelType;
		this.knbddSupplier = knbddSupplier;
		this.knbddSupplierDesc = knbddSupplierDesc;
		this.knbddPoNbr = knbddPoNbr;
		this.knbddPoLine = knbddPoLine;
		this.knbddProcessSite = knbddProcessSite;
		this.knbddPrcsSiteDesc = knbddPrcsSiteDesc;
		this.knbddProcessId = knbddProcessId;
		this.knbddProcessDesc = knbddProcessDesc;
		this.knbddInvSite = knbddInvSite;
		this.knbddInvSiteDesc = knbddInvSiteDesc;
		this.knbddSourceSmId = knbddSourceSmId;
		this.knbddKanbanId = knbddKanbanId;
		this.knbddPart = knbddPart;
		this.knbddPtDesc1 = knbddPtDesc1;
		this.knbddPtDesc2 = knbddPtDesc2;
		this.knbddPtRev = knbddPtRev;
		this.knbddPtUm = knbddPtUm;
		this.knbddRouting = knbddRouting;
		this.knbddBomCode = knbddBomCode;
		this.knbddKanbanQuantity = knbddKanbanQuantity;
		this.knbddContSize = knbddContSize;
		this.knbddContType = knbddContType;
		this.knbddSecondCardId = knbddSecondCardId;
		this.knbddSmInvLocation = knbddSmInvLocation;
		this.knbddDelLoc = knbddDelLoc;
		this.knbddPouLoc = knbddPouLoc;
		this.knbddCardType = knbddCardType;
		this.knbddCardTypeDesc = knbddCardTypeDesc;
		this.knbddAccumType = knbddAccumType;
		this.knbddAccumTypeDesc = knbddAccumTypeDesc;
		this.knbddCyclesAllowed = knbddCyclesAllowed;
		this.knbddActiveStart = knbddActiveStart;
		this.knbddActiveEnd = knbddActiveEnd;
		this.knbddPrintDate = knbddPrintDate;
		this.knbddPrintTime = knbddPrintTime;
		this.knbddCardCmmtPage = knbddCardCmmtPage;
		this.knbddDocumentSize = knbddDocumentSize;
		this.knbddCardStock = knbddCardStock;
		this.knbddDocumentColor = knbddDocumentColor;
		this.knbddTextFont = knbddTextFont;
		this.knbddFontStyle = knbddFontStyle;
		this.knbddFontSize = knbddFontSize;
		this.knbddTextColor = knbddTextColor;
		this.knbddSmSite = knbddSmSite;
		this.knbddSmSiteDesc = knbddSmSiteDesc;
		this.knbddDocumentDesc = knbddDocumentDesc;
		this.knbddDestSmId = knbddDestSmId;
		this.knbddSourceSmDesc = knbddSourceSmDesc;
		this.knbddDestSmDesc = knbddDestSmDesc;
		this.knbddModDate = knbddModDate;
		this.knbddModUserid = knbddModUserid;
		this.knbddStep = knbddStep;
		this.knbddUser1 = knbddUser1;
		this.knbddUser2 = knbddUser2;
		this.knbddQadc01 = knbddQadc01;
		this.knbddQadc02 = knbddQadc02;
		this.knbddUser3 = knbddUser3;
		this.knbddQadc03 = knbddQadc03;
		this.knbddQadc04 = knbddQadc04;
		this.knbddQadl01 = knbddQadl01;
		this.knbddQadl02 = knbddQadl02;
		this.knbddQadd01 = knbddQadd01;
		this.knbddQadl03 = knbddQadl03;
		this.knbddQadi01 = knbddQadi01;
		this.knbddQadt01 = knbddQadt01;
		this.oidKnbddMstr = oidKnbddMstr;
	}

	// Property accessors

	public KnbddMstrId getId() {
		return this.id;
	}

	public void setId(KnbddMstrId id) {
		this.id = id;
	}

	public String getKnbddLabelType() {
		return this.knbddLabelType;
	}

	public void setKnbddLabelType(String knbddLabelType) {
		this.knbddLabelType = knbddLabelType;
	}

	public Boolean getKnbddSupplier() {
		return this.knbddSupplier;
	}

	public void setKnbddSupplier(Boolean knbddSupplier) {
		this.knbddSupplier = knbddSupplier;
	}

	public Boolean getKnbddSupplierDesc() {
		return this.knbddSupplierDesc;
	}

	public void setKnbddSupplierDesc(Boolean knbddSupplierDesc) {
		this.knbddSupplierDesc = knbddSupplierDesc;
	}

	public Boolean getKnbddPoNbr() {
		return this.knbddPoNbr;
	}

	public void setKnbddPoNbr(Boolean knbddPoNbr) {
		this.knbddPoNbr = knbddPoNbr;
	}

	public Boolean getKnbddPoLine() {
		return this.knbddPoLine;
	}

	public void setKnbddPoLine(Boolean knbddPoLine) {
		this.knbddPoLine = knbddPoLine;
	}

	public Boolean getKnbddProcessSite() {
		return this.knbddProcessSite;
	}

	public void setKnbddProcessSite(Boolean knbddProcessSite) {
		this.knbddProcessSite = knbddProcessSite;
	}

	public Boolean getKnbddPrcsSiteDesc() {
		return this.knbddPrcsSiteDesc;
	}

	public void setKnbddPrcsSiteDesc(Boolean knbddPrcsSiteDesc) {
		this.knbddPrcsSiteDesc = knbddPrcsSiteDesc;
	}

	public Boolean getKnbddProcessId() {
		return this.knbddProcessId;
	}

	public void setKnbddProcessId(Boolean knbddProcessId) {
		this.knbddProcessId = knbddProcessId;
	}

	public Boolean getKnbddProcessDesc() {
		return this.knbddProcessDesc;
	}

	public void setKnbddProcessDesc(Boolean knbddProcessDesc) {
		this.knbddProcessDesc = knbddProcessDesc;
	}

	public Boolean getKnbddInvSite() {
		return this.knbddInvSite;
	}

	public void setKnbddInvSite(Boolean knbddInvSite) {
		this.knbddInvSite = knbddInvSite;
	}

	public Boolean getKnbddInvSiteDesc() {
		return this.knbddInvSiteDesc;
	}

	public void setKnbddInvSiteDesc(Boolean knbddInvSiteDesc) {
		this.knbddInvSiteDesc = knbddInvSiteDesc;
	}

	public Boolean getKnbddSourceSmId() {
		return this.knbddSourceSmId;
	}

	public void setKnbddSourceSmId(Boolean knbddSourceSmId) {
		this.knbddSourceSmId = knbddSourceSmId;
	}

	public Boolean getKnbddKanbanId() {
		return this.knbddKanbanId;
	}

	public void setKnbddKanbanId(Boolean knbddKanbanId) {
		this.knbddKanbanId = knbddKanbanId;
	}

	public Boolean getKnbddPart() {
		return this.knbddPart;
	}

	public void setKnbddPart(Boolean knbddPart) {
		this.knbddPart = knbddPart;
	}

	public Boolean getKnbddPtDesc1() {
		return this.knbddPtDesc1;
	}

	public void setKnbddPtDesc1(Boolean knbddPtDesc1) {
		this.knbddPtDesc1 = knbddPtDesc1;
	}

	public Boolean getKnbddPtDesc2() {
		return this.knbddPtDesc2;
	}

	public void setKnbddPtDesc2(Boolean knbddPtDesc2) {
		this.knbddPtDesc2 = knbddPtDesc2;
	}

	public Boolean getKnbddPtRev() {
		return this.knbddPtRev;
	}

	public void setKnbddPtRev(Boolean knbddPtRev) {
		this.knbddPtRev = knbddPtRev;
	}

	public Boolean getKnbddPtUm() {
		return this.knbddPtUm;
	}

	public void setKnbddPtUm(Boolean knbddPtUm) {
		this.knbddPtUm = knbddPtUm;
	}

	public Boolean getKnbddRouting() {
		return this.knbddRouting;
	}

	public void setKnbddRouting(Boolean knbddRouting) {
		this.knbddRouting = knbddRouting;
	}

	public Boolean getKnbddBomCode() {
		return this.knbddBomCode;
	}

	public void setKnbddBomCode(Boolean knbddBomCode) {
		this.knbddBomCode = knbddBomCode;
	}

	public Boolean getKnbddKanbanQuantity() {
		return this.knbddKanbanQuantity;
	}

	public void setKnbddKanbanQuantity(Boolean knbddKanbanQuantity) {
		this.knbddKanbanQuantity = knbddKanbanQuantity;
	}

	public Boolean getKnbddContSize() {
		return this.knbddContSize;
	}

	public void setKnbddContSize(Boolean knbddContSize) {
		this.knbddContSize = knbddContSize;
	}

	public Boolean getKnbddContType() {
		return this.knbddContType;
	}

	public void setKnbddContType(Boolean knbddContType) {
		this.knbddContType = knbddContType;
	}

	public Boolean getKnbddSecondCardId() {
		return this.knbddSecondCardId;
	}

	public void setKnbddSecondCardId(Boolean knbddSecondCardId) {
		this.knbddSecondCardId = knbddSecondCardId;
	}

	public Boolean getKnbddSmInvLocation() {
		return this.knbddSmInvLocation;
	}

	public void setKnbddSmInvLocation(Boolean knbddSmInvLocation) {
		this.knbddSmInvLocation = knbddSmInvLocation;
	}

	public Boolean getKnbddDelLoc() {
		return this.knbddDelLoc;
	}

	public void setKnbddDelLoc(Boolean knbddDelLoc) {
		this.knbddDelLoc = knbddDelLoc;
	}

	public Boolean getKnbddPouLoc() {
		return this.knbddPouLoc;
	}

	public void setKnbddPouLoc(Boolean knbddPouLoc) {
		this.knbddPouLoc = knbddPouLoc;
	}

	public Boolean getKnbddCardType() {
		return this.knbddCardType;
	}

	public void setKnbddCardType(Boolean knbddCardType) {
		this.knbddCardType = knbddCardType;
	}

	public Boolean getKnbddCardTypeDesc() {
		return this.knbddCardTypeDesc;
	}

	public void setKnbddCardTypeDesc(Boolean knbddCardTypeDesc) {
		this.knbddCardTypeDesc = knbddCardTypeDesc;
	}

	public Boolean getKnbddAccumType() {
		return this.knbddAccumType;
	}

	public void setKnbddAccumType(Boolean knbddAccumType) {
		this.knbddAccumType = knbddAccumType;
	}

	public Boolean getKnbddAccumTypeDesc() {
		return this.knbddAccumTypeDesc;
	}

	public void setKnbddAccumTypeDesc(Boolean knbddAccumTypeDesc) {
		this.knbddAccumTypeDesc = knbddAccumTypeDesc;
	}

	public Boolean getKnbddCyclesAllowed() {
		return this.knbddCyclesAllowed;
	}

	public void setKnbddCyclesAllowed(Boolean knbddCyclesAllowed) {
		this.knbddCyclesAllowed = knbddCyclesAllowed;
	}

	public Boolean getKnbddActiveStart() {
		return this.knbddActiveStart;
	}

	public void setKnbddActiveStart(Boolean knbddActiveStart) {
		this.knbddActiveStart = knbddActiveStart;
	}

	public Boolean getKnbddActiveEnd() {
		return this.knbddActiveEnd;
	}

	public void setKnbddActiveEnd(Boolean knbddActiveEnd) {
		this.knbddActiveEnd = knbddActiveEnd;
	}

	public Boolean getKnbddPrintDate() {
		return this.knbddPrintDate;
	}

	public void setKnbddPrintDate(Boolean knbddPrintDate) {
		this.knbddPrintDate = knbddPrintDate;
	}

	public Boolean getKnbddPrintTime() {
		return this.knbddPrintTime;
	}

	public void setKnbddPrintTime(Boolean knbddPrintTime) {
		this.knbddPrintTime = knbddPrintTime;
	}

	public String getKnbddCardCmmtPage() {
		return this.knbddCardCmmtPage;
	}

	public void setKnbddCardCmmtPage(String knbddCardCmmtPage) {
		this.knbddCardCmmtPage = knbddCardCmmtPage;
	}

	public String getKnbddDocumentSize() {
		return this.knbddDocumentSize;
	}

	public void setKnbddDocumentSize(String knbddDocumentSize) {
		this.knbddDocumentSize = knbddDocumentSize;
	}

	public String getKnbddCardStock() {
		return this.knbddCardStock;
	}

	public void setKnbddCardStock(String knbddCardStock) {
		this.knbddCardStock = knbddCardStock;
	}

	public String getKnbddDocumentColor() {
		return this.knbddDocumentColor;
	}

	public void setKnbddDocumentColor(String knbddDocumentColor) {
		this.knbddDocumentColor = knbddDocumentColor;
	}

	public String getKnbddTextFont() {
		return this.knbddTextFont;
	}

	public void setKnbddTextFont(String knbddTextFont) {
		this.knbddTextFont = knbddTextFont;
	}

	public String getKnbddFontStyle() {
		return this.knbddFontStyle;
	}

	public void setKnbddFontStyle(String knbddFontStyle) {
		this.knbddFontStyle = knbddFontStyle;
	}

	public String getKnbddFontSize() {
		return this.knbddFontSize;
	}

	public void setKnbddFontSize(String knbddFontSize) {
		this.knbddFontSize = knbddFontSize;
	}

	public String getKnbddTextColor() {
		return this.knbddTextColor;
	}

	public void setKnbddTextColor(String knbddTextColor) {
		this.knbddTextColor = knbddTextColor;
	}

	public Boolean getKnbddSmSite() {
		return this.knbddSmSite;
	}

	public void setKnbddSmSite(Boolean knbddSmSite) {
		this.knbddSmSite = knbddSmSite;
	}

	public Boolean getKnbddSmSiteDesc() {
		return this.knbddSmSiteDesc;
	}

	public void setKnbddSmSiteDesc(Boolean knbddSmSiteDesc) {
		this.knbddSmSiteDesc = knbddSmSiteDesc;
	}

	public String getKnbddDocumentDesc() {
		return this.knbddDocumentDesc;
	}

	public void setKnbddDocumentDesc(String knbddDocumentDesc) {
		this.knbddDocumentDesc = knbddDocumentDesc;
	}

	public Boolean getKnbddDestSmId() {
		return this.knbddDestSmId;
	}

	public void setKnbddDestSmId(Boolean knbddDestSmId) {
		this.knbddDestSmId = knbddDestSmId;
	}

	public Boolean getKnbddSourceSmDesc() {
		return this.knbddSourceSmDesc;
	}

	public void setKnbddSourceSmDesc(Boolean knbddSourceSmDesc) {
		this.knbddSourceSmDesc = knbddSourceSmDesc;
	}

	public Boolean getKnbddDestSmDesc() {
		return this.knbddDestSmDesc;
	}

	public void setKnbddDestSmDesc(Boolean knbddDestSmDesc) {
		this.knbddDestSmDesc = knbddDestSmDesc;
	}

	public Date getKnbddModDate() {
		return this.knbddModDate;
	}

	public void setKnbddModDate(Date knbddModDate) {
		this.knbddModDate = knbddModDate;
	}

	public String getKnbddModUserid() {
		return this.knbddModUserid;
	}

	public void setKnbddModUserid(String knbddModUserid) {
		this.knbddModUserid = knbddModUserid;
	}

	public Boolean getKnbddStep() {
		return this.knbddStep;
	}

	public void setKnbddStep(Boolean knbddStep) {
		this.knbddStep = knbddStep;
	}

	public String getKnbddUser1() {
		return this.knbddUser1;
	}

	public void setKnbddUser1(String knbddUser1) {
		this.knbddUser1 = knbddUser1;
	}

	public String getKnbddUser2() {
		return this.knbddUser2;
	}

	public void setKnbddUser2(String knbddUser2) {
		this.knbddUser2 = knbddUser2;
	}

	public String getKnbddQadc01() {
		return this.knbddQadc01;
	}

	public void setKnbddQadc01(String knbddQadc01) {
		this.knbddQadc01 = knbddQadc01;
	}

	public String getKnbddQadc02() {
		return this.knbddQadc02;
	}

	public void setKnbddQadc02(String knbddQadc02) {
		this.knbddQadc02 = knbddQadc02;
	}

	public String getKnbddUser3() {
		return this.knbddUser3;
	}

	public void setKnbddUser3(String knbddUser3) {
		this.knbddUser3 = knbddUser3;
	}

	public String getKnbddQadc03() {
		return this.knbddQadc03;
	}

	public void setKnbddQadc03(String knbddQadc03) {
		this.knbddQadc03 = knbddQadc03;
	}

	public String getKnbddQadc04() {
		return this.knbddQadc04;
	}

	public void setKnbddQadc04(String knbddQadc04) {
		this.knbddQadc04 = knbddQadc04;
	}

	public Boolean getKnbddQadl01() {
		return this.knbddQadl01;
	}

	public void setKnbddQadl01(Boolean knbddQadl01) {
		this.knbddQadl01 = knbddQadl01;
	}

	public Boolean getKnbddQadl02() {
		return this.knbddQadl02;
	}

	public void setKnbddQadl02(Boolean knbddQadl02) {
		this.knbddQadl02 = knbddQadl02;
	}

	public Double getKnbddQadd01() {
		return this.knbddQadd01;
	}

	public void setKnbddQadd01(Double knbddQadd01) {
		this.knbddQadd01 = knbddQadd01;
	}

	public Boolean getKnbddQadl03() {
		return this.knbddQadl03;
	}

	public void setKnbddQadl03(Boolean knbddQadl03) {
		this.knbddQadl03 = knbddQadl03;
	}

	public Integer getKnbddQadi01() {
		return this.knbddQadi01;
	}

	public void setKnbddQadi01(Integer knbddQadi01) {
		this.knbddQadi01 = knbddQadi01;
	}

	public Date getKnbddQadt01() {
		return this.knbddQadt01;
	}

	public void setKnbddQadt01(Date knbddQadt01) {
		this.knbddQadt01 = knbddQadt01;
	}

	public Double getOidKnbddMstr() {
		return this.oidKnbddMstr;
	}

	public void setOidKnbddMstr(Double oidKnbddMstr) {
		this.oidKnbddMstr = oidKnbddMstr;
	}

}