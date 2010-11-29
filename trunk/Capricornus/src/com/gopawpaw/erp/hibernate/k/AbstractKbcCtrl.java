package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKbcCtrl entity provides the base persistence definition of the
 * KbcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbcCtrl implements java.io.Serializable {

	// Fields

	private String kbcDomain;
	private String kbcPattern;
	private String kbcModUserid;
	private Date kbcModDate;
	private String kbcUser1;
	private String kbcUser2;
	private String kbcQadc01;
	private Integer kbcQadi02;
	private Integer kbcDisplayPause;
	private Boolean kbcEffDateEntry;
	private Boolean kbcIdBarcode;
	private Boolean kbcItemBarcode;
	private Boolean kbcPrintQuantity;
	private Integer kbcMaxCycleTime;
	private Integer kbcMinCycleTime;
	private String kbcMinCycleCheck;
	private String kbcControlledEntry;
	private Double kbcUserd01;
	private Integer kbcUseri01;
	private Boolean kbcUserl01;
	private Date kbcUsert01;
	private String kbcQadc02;
	private String kbcQadc03;
	private Double kbcQadd01;
	private Integer kbcQadi01;
	private Boolean kbcQadl01;
	private Date kbcQadt01;
	private String kbcTemplate;
	private String kbcTimeAdj;
	private Boolean kbcPrintConsumeRef;
	private Double kbcTolerancePct;
	private Integer kbcTimeFence;
	private String kbcExportDirectory;
	private String kbcImportDirectory;
	private Boolean kbcFifoEntry;
	private Double kbcMinEpeInterval;
	private Double kbcLoadLimit;
	private Integer kbcLeadTimeMethod;
	private Integer kbcCardReporting;
	private Double kbcFractionalKanban;
	private String kbcCostSet;
	private String kbcSsTemplate;
	private Double oidKbcCtrl;

	// Constructors

	/** default constructor */
	public AbstractKbcCtrl() {
	}

	/** minimal constructor */
	public AbstractKbcCtrl(String kbcPattern, String kbcModUserid,
			Date kbcModDate, String kbcUser1, String kbcUser2,
			String kbcQadc01, Integer kbcQadi02, Integer kbcDisplayPause,
			Boolean kbcEffDateEntry, Boolean kbcIdBarcode,
			Boolean kbcItemBarcode, Boolean kbcPrintQuantity,
			Integer kbcMaxCycleTime, Integer kbcMinCycleTime,
			String kbcMinCycleCheck, String kbcControlledEntry,
			Double kbcUserd01, Integer kbcUseri01, Boolean kbcUserl01,
			String kbcQadc02, String kbcQadc03, Double kbcQadd01,
			Integer kbcQadi01, Boolean kbcQadl01, String kbcTemplate,
			String kbcTimeAdj, Boolean kbcPrintConsumeRef,
			Double kbcTolerancePct, Integer kbcTimeFence,
			String kbcExportDirectory, String kbcImportDirectory,
			Boolean kbcFifoEntry, Double kbcMinEpeInterval,
			Double kbcLoadLimit, Integer kbcLeadTimeMethod,
			Integer kbcCardReporting, Double kbcFractionalKanban,
			String kbcCostSet, String kbcSsTemplate, Double oidKbcCtrl) {
		this.kbcPattern = kbcPattern;
		this.kbcModUserid = kbcModUserid;
		this.kbcModDate = kbcModDate;
		this.kbcUser1 = kbcUser1;
		this.kbcUser2 = kbcUser2;
		this.kbcQadc01 = kbcQadc01;
		this.kbcQadi02 = kbcQadi02;
		this.kbcDisplayPause = kbcDisplayPause;
		this.kbcEffDateEntry = kbcEffDateEntry;
		this.kbcIdBarcode = kbcIdBarcode;
		this.kbcItemBarcode = kbcItemBarcode;
		this.kbcPrintQuantity = kbcPrintQuantity;
		this.kbcMaxCycleTime = kbcMaxCycleTime;
		this.kbcMinCycleTime = kbcMinCycleTime;
		this.kbcMinCycleCheck = kbcMinCycleCheck;
		this.kbcControlledEntry = kbcControlledEntry;
		this.kbcUserd01 = kbcUserd01;
		this.kbcUseri01 = kbcUseri01;
		this.kbcUserl01 = kbcUserl01;
		this.kbcQadc02 = kbcQadc02;
		this.kbcQadc03 = kbcQadc03;
		this.kbcQadd01 = kbcQadd01;
		this.kbcQadi01 = kbcQadi01;
		this.kbcQadl01 = kbcQadl01;
		this.kbcTemplate = kbcTemplate;
		this.kbcTimeAdj = kbcTimeAdj;
		this.kbcPrintConsumeRef = kbcPrintConsumeRef;
		this.kbcTolerancePct = kbcTolerancePct;
		this.kbcTimeFence = kbcTimeFence;
		this.kbcExportDirectory = kbcExportDirectory;
		this.kbcImportDirectory = kbcImportDirectory;
		this.kbcFifoEntry = kbcFifoEntry;
		this.kbcMinEpeInterval = kbcMinEpeInterval;
		this.kbcLoadLimit = kbcLoadLimit;
		this.kbcLeadTimeMethod = kbcLeadTimeMethod;
		this.kbcCardReporting = kbcCardReporting;
		this.kbcFractionalKanban = kbcFractionalKanban;
		this.kbcCostSet = kbcCostSet;
		this.kbcSsTemplate = kbcSsTemplate;
		this.oidKbcCtrl = oidKbcCtrl;
	}

	/** full constructor */
	public AbstractKbcCtrl(String kbcPattern, String kbcModUserid,
			Date kbcModDate, String kbcUser1, String kbcUser2,
			String kbcQadc01, Integer kbcQadi02, Integer kbcDisplayPause,
			Boolean kbcEffDateEntry, Boolean kbcIdBarcode,
			Boolean kbcItemBarcode, Boolean kbcPrintQuantity,
			Integer kbcMaxCycleTime, Integer kbcMinCycleTime,
			String kbcMinCycleCheck, String kbcControlledEntry,
			Double kbcUserd01, Integer kbcUseri01, Boolean kbcUserl01,
			Date kbcUsert01, String kbcQadc02, String kbcQadc03,
			Double kbcQadd01, Integer kbcQadi01, Boolean kbcQadl01,
			Date kbcQadt01, String kbcTemplate, String kbcTimeAdj,
			Boolean kbcPrintConsumeRef, Double kbcTolerancePct,
			Integer kbcTimeFence, String kbcExportDirectory,
			String kbcImportDirectory, Boolean kbcFifoEntry,
			Double kbcMinEpeInterval, Double kbcLoadLimit,
			Integer kbcLeadTimeMethod, Integer kbcCardReporting,
			Double kbcFractionalKanban, String kbcCostSet,
			String kbcSsTemplate, Double oidKbcCtrl) {
		this.kbcPattern = kbcPattern;
		this.kbcModUserid = kbcModUserid;
		this.kbcModDate = kbcModDate;
		this.kbcUser1 = kbcUser1;
		this.kbcUser2 = kbcUser2;
		this.kbcQadc01 = kbcQadc01;
		this.kbcQadi02 = kbcQadi02;
		this.kbcDisplayPause = kbcDisplayPause;
		this.kbcEffDateEntry = kbcEffDateEntry;
		this.kbcIdBarcode = kbcIdBarcode;
		this.kbcItemBarcode = kbcItemBarcode;
		this.kbcPrintQuantity = kbcPrintQuantity;
		this.kbcMaxCycleTime = kbcMaxCycleTime;
		this.kbcMinCycleTime = kbcMinCycleTime;
		this.kbcMinCycleCheck = kbcMinCycleCheck;
		this.kbcControlledEntry = kbcControlledEntry;
		this.kbcUserd01 = kbcUserd01;
		this.kbcUseri01 = kbcUseri01;
		this.kbcUserl01 = kbcUserl01;
		this.kbcUsert01 = kbcUsert01;
		this.kbcQadc02 = kbcQadc02;
		this.kbcQadc03 = kbcQadc03;
		this.kbcQadd01 = kbcQadd01;
		this.kbcQadi01 = kbcQadi01;
		this.kbcQadl01 = kbcQadl01;
		this.kbcQadt01 = kbcQadt01;
		this.kbcTemplate = kbcTemplate;
		this.kbcTimeAdj = kbcTimeAdj;
		this.kbcPrintConsumeRef = kbcPrintConsumeRef;
		this.kbcTolerancePct = kbcTolerancePct;
		this.kbcTimeFence = kbcTimeFence;
		this.kbcExportDirectory = kbcExportDirectory;
		this.kbcImportDirectory = kbcImportDirectory;
		this.kbcFifoEntry = kbcFifoEntry;
		this.kbcMinEpeInterval = kbcMinEpeInterval;
		this.kbcLoadLimit = kbcLoadLimit;
		this.kbcLeadTimeMethod = kbcLeadTimeMethod;
		this.kbcCardReporting = kbcCardReporting;
		this.kbcFractionalKanban = kbcFractionalKanban;
		this.kbcCostSet = kbcCostSet;
		this.kbcSsTemplate = kbcSsTemplate;
		this.oidKbcCtrl = oidKbcCtrl;
	}

	// Property accessors

	public String getKbcDomain() {
		return this.kbcDomain;
	}

	public void setKbcDomain(String kbcDomain) {
		this.kbcDomain = kbcDomain;
	}

	public String getKbcPattern() {
		return this.kbcPattern;
	}

	public void setKbcPattern(String kbcPattern) {
		this.kbcPattern = kbcPattern;
	}

	public String getKbcModUserid() {
		return this.kbcModUserid;
	}

	public void setKbcModUserid(String kbcModUserid) {
		this.kbcModUserid = kbcModUserid;
	}

	public Date getKbcModDate() {
		return this.kbcModDate;
	}

	public void setKbcModDate(Date kbcModDate) {
		this.kbcModDate = kbcModDate;
	}

	public String getKbcUser1() {
		return this.kbcUser1;
	}

	public void setKbcUser1(String kbcUser1) {
		this.kbcUser1 = kbcUser1;
	}

	public String getKbcUser2() {
		return this.kbcUser2;
	}

	public void setKbcUser2(String kbcUser2) {
		this.kbcUser2 = kbcUser2;
	}

	public String getKbcQadc01() {
		return this.kbcQadc01;
	}

	public void setKbcQadc01(String kbcQadc01) {
		this.kbcQadc01 = kbcQadc01;
	}

	public Integer getKbcQadi02() {
		return this.kbcQadi02;
	}

	public void setKbcQadi02(Integer kbcQadi02) {
		this.kbcQadi02 = kbcQadi02;
	}

	public Integer getKbcDisplayPause() {
		return this.kbcDisplayPause;
	}

	public void setKbcDisplayPause(Integer kbcDisplayPause) {
		this.kbcDisplayPause = kbcDisplayPause;
	}

	public Boolean getKbcEffDateEntry() {
		return this.kbcEffDateEntry;
	}

	public void setKbcEffDateEntry(Boolean kbcEffDateEntry) {
		this.kbcEffDateEntry = kbcEffDateEntry;
	}

	public Boolean getKbcIdBarcode() {
		return this.kbcIdBarcode;
	}

	public void setKbcIdBarcode(Boolean kbcIdBarcode) {
		this.kbcIdBarcode = kbcIdBarcode;
	}

	public Boolean getKbcItemBarcode() {
		return this.kbcItemBarcode;
	}

	public void setKbcItemBarcode(Boolean kbcItemBarcode) {
		this.kbcItemBarcode = kbcItemBarcode;
	}

	public Boolean getKbcPrintQuantity() {
		return this.kbcPrintQuantity;
	}

	public void setKbcPrintQuantity(Boolean kbcPrintQuantity) {
		this.kbcPrintQuantity = kbcPrintQuantity;
	}

	public Integer getKbcMaxCycleTime() {
		return this.kbcMaxCycleTime;
	}

	public void setKbcMaxCycleTime(Integer kbcMaxCycleTime) {
		this.kbcMaxCycleTime = kbcMaxCycleTime;
	}

	public Integer getKbcMinCycleTime() {
		return this.kbcMinCycleTime;
	}

	public void setKbcMinCycleTime(Integer kbcMinCycleTime) {
		this.kbcMinCycleTime = kbcMinCycleTime;
	}

	public String getKbcMinCycleCheck() {
		return this.kbcMinCycleCheck;
	}

	public void setKbcMinCycleCheck(String kbcMinCycleCheck) {
		this.kbcMinCycleCheck = kbcMinCycleCheck;
	}

	public String getKbcControlledEntry() {
		return this.kbcControlledEntry;
	}

	public void setKbcControlledEntry(String kbcControlledEntry) {
		this.kbcControlledEntry = kbcControlledEntry;
	}

	public Double getKbcUserd01() {
		return this.kbcUserd01;
	}

	public void setKbcUserd01(Double kbcUserd01) {
		this.kbcUserd01 = kbcUserd01;
	}

	public Integer getKbcUseri01() {
		return this.kbcUseri01;
	}

	public void setKbcUseri01(Integer kbcUseri01) {
		this.kbcUseri01 = kbcUseri01;
	}

	public Boolean getKbcUserl01() {
		return this.kbcUserl01;
	}

	public void setKbcUserl01(Boolean kbcUserl01) {
		this.kbcUserl01 = kbcUserl01;
	}

	public Date getKbcUsert01() {
		return this.kbcUsert01;
	}

	public void setKbcUsert01(Date kbcUsert01) {
		this.kbcUsert01 = kbcUsert01;
	}

	public String getKbcQadc02() {
		return this.kbcQadc02;
	}

	public void setKbcQadc02(String kbcQadc02) {
		this.kbcQadc02 = kbcQadc02;
	}

	public String getKbcQadc03() {
		return this.kbcQadc03;
	}

	public void setKbcQadc03(String kbcQadc03) {
		this.kbcQadc03 = kbcQadc03;
	}

	public Double getKbcQadd01() {
		return this.kbcQadd01;
	}

	public void setKbcQadd01(Double kbcQadd01) {
		this.kbcQadd01 = kbcQadd01;
	}

	public Integer getKbcQadi01() {
		return this.kbcQadi01;
	}

	public void setKbcQadi01(Integer kbcQadi01) {
		this.kbcQadi01 = kbcQadi01;
	}

	public Boolean getKbcQadl01() {
		return this.kbcQadl01;
	}

	public void setKbcQadl01(Boolean kbcQadl01) {
		this.kbcQadl01 = kbcQadl01;
	}

	public Date getKbcQadt01() {
		return this.kbcQadt01;
	}

	public void setKbcQadt01(Date kbcQadt01) {
		this.kbcQadt01 = kbcQadt01;
	}

	public String getKbcTemplate() {
		return this.kbcTemplate;
	}

	public void setKbcTemplate(String kbcTemplate) {
		this.kbcTemplate = kbcTemplate;
	}

	public String getKbcTimeAdj() {
		return this.kbcTimeAdj;
	}

	public void setKbcTimeAdj(String kbcTimeAdj) {
		this.kbcTimeAdj = kbcTimeAdj;
	}

	public Boolean getKbcPrintConsumeRef() {
		return this.kbcPrintConsumeRef;
	}

	public void setKbcPrintConsumeRef(Boolean kbcPrintConsumeRef) {
		this.kbcPrintConsumeRef = kbcPrintConsumeRef;
	}

	public Double getKbcTolerancePct() {
		return this.kbcTolerancePct;
	}

	public void setKbcTolerancePct(Double kbcTolerancePct) {
		this.kbcTolerancePct = kbcTolerancePct;
	}

	public Integer getKbcTimeFence() {
		return this.kbcTimeFence;
	}

	public void setKbcTimeFence(Integer kbcTimeFence) {
		this.kbcTimeFence = kbcTimeFence;
	}

	public String getKbcExportDirectory() {
		return this.kbcExportDirectory;
	}

	public void setKbcExportDirectory(String kbcExportDirectory) {
		this.kbcExportDirectory = kbcExportDirectory;
	}

	public String getKbcImportDirectory() {
		return this.kbcImportDirectory;
	}

	public void setKbcImportDirectory(String kbcImportDirectory) {
		this.kbcImportDirectory = kbcImportDirectory;
	}

	public Boolean getKbcFifoEntry() {
		return this.kbcFifoEntry;
	}

	public void setKbcFifoEntry(Boolean kbcFifoEntry) {
		this.kbcFifoEntry = kbcFifoEntry;
	}

	public Double getKbcMinEpeInterval() {
		return this.kbcMinEpeInterval;
	}

	public void setKbcMinEpeInterval(Double kbcMinEpeInterval) {
		this.kbcMinEpeInterval = kbcMinEpeInterval;
	}

	public Double getKbcLoadLimit() {
		return this.kbcLoadLimit;
	}

	public void setKbcLoadLimit(Double kbcLoadLimit) {
		this.kbcLoadLimit = kbcLoadLimit;
	}

	public Integer getKbcLeadTimeMethod() {
		return this.kbcLeadTimeMethod;
	}

	public void setKbcLeadTimeMethod(Integer kbcLeadTimeMethod) {
		this.kbcLeadTimeMethod = kbcLeadTimeMethod;
	}

	public Integer getKbcCardReporting() {
		return this.kbcCardReporting;
	}

	public void setKbcCardReporting(Integer kbcCardReporting) {
		this.kbcCardReporting = kbcCardReporting;
	}

	public Double getKbcFractionalKanban() {
		return this.kbcFractionalKanban;
	}

	public void setKbcFractionalKanban(Double kbcFractionalKanban) {
		this.kbcFractionalKanban = kbcFractionalKanban;
	}

	public String getKbcCostSet() {
		return this.kbcCostSet;
	}

	public void setKbcCostSet(String kbcCostSet) {
		this.kbcCostSet = kbcCostSet;
	}

	public String getKbcSsTemplate() {
		return this.kbcSsTemplate;
	}

	public void setKbcSsTemplate(String kbcSsTemplate) {
		this.kbcSsTemplate = kbcSsTemplate;
	}

	public Double getOidKbcCtrl() {
		return this.oidKbcCtrl;
	}

	public void setOidKbcCtrl(Double oidKbcCtrl) {
		this.oidKbcCtrl = oidKbcCtrl;
	}

}