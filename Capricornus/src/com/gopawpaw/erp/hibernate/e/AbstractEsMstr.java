package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsMstr entity provides the base persistence definition of the EsMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsMstr implements java.io.Serializable {

	// Fields

	private EsMstrId id;
	private String esCaCategory;
	private String esTimeIn;
	private Integer esDaysIn;
	private Integer esCaPri;
	private Boolean esEscalate;
	private String esGroup;
	private Boolean esMessage;
	private Boolean esPrint;
	private Integer esPriBump;
	private Boolean esPage;
	private Integer esCmtindx;
	private String esDesc;
	private String esNextQue;
	private String esNextStatus;
	private String esProgram;
	private String esEscProgram;
	private String esUser1;
	private String esUser2;
	private String esChr01;
	private String esChr02;
	private String esChr03;
	private String esChr04;
	private Double esDec01;
	private Double esDec02;
	private Double esDec03;
	private Date esDte01;
	private Date esDte02;
	private Date esDte03;
	private Boolean esLog01;
	private Boolean esLog02;
	private Boolean esLog03;
	private String esQadc01;
	private String esQadc02;
	private String esQadc03;
	private String esQadc04;
	private Date esQadd01;
	private Date esQadd02;
	private Date esQadd03;
	private Double esQadde01;
	private Double esQadde02;
	private Double esQadde03;
	private Boolean esQadl01;
	private Boolean esQadl02;
	private Boolean esQadl03;
	private String esMessageList;
	private String esDocDesc;
	private String esDocExec;
	private Date esDueDate;
	private Boolean esDocsPrinted;
	private String esDocPrinted;
	private String esRepairStep;
	private String esEsNbr;
	private Date esActDate;
	private String esDocPrintit;
	private Date esInitialDate;
	private String esDocPrinter;
	private String esDocPaged;
	private Double oidEsMstr;

	// Constructors

	/** default constructor */
	public AbstractEsMstr() {
	}

	/** minimal constructor */
	public AbstractEsMstr(EsMstrId id, Double oidEsMstr) {
		this.id = id;
		this.oidEsMstr = oidEsMstr;
	}

	/** full constructor */
	public AbstractEsMstr(EsMstrId id, String esCaCategory, String esTimeIn,
			Integer esDaysIn, Integer esCaPri, Boolean esEscalate,
			String esGroup, Boolean esMessage, Boolean esPrint,
			Integer esPriBump, Boolean esPage, Integer esCmtindx,
			String esDesc, String esNextQue, String esNextStatus,
			String esProgram, String esEscProgram, String esUser1,
			String esUser2, String esChr01, String esChr02, String esChr03,
			String esChr04, Double esDec01, Double esDec02, Double esDec03,
			Date esDte01, Date esDte02, Date esDte03, Boolean esLog01,
			Boolean esLog02, Boolean esLog03, String esQadc01, String esQadc02,
			String esQadc03, String esQadc04, Date esQadd01, Date esQadd02,
			Date esQadd03, Double esQadde01, Double esQadde02,
			Double esQadde03, Boolean esQadl01, Boolean esQadl02,
			Boolean esQadl03, String esMessageList, String esDocDesc,
			String esDocExec, Date esDueDate, Boolean esDocsPrinted,
			String esDocPrinted, String esRepairStep, String esEsNbr,
			Date esActDate, String esDocPrintit, Date esInitialDate,
			String esDocPrinter, String esDocPaged, Double oidEsMstr) {
		this.id = id;
		this.esCaCategory = esCaCategory;
		this.esTimeIn = esTimeIn;
		this.esDaysIn = esDaysIn;
		this.esCaPri = esCaPri;
		this.esEscalate = esEscalate;
		this.esGroup = esGroup;
		this.esMessage = esMessage;
		this.esPrint = esPrint;
		this.esPriBump = esPriBump;
		this.esPage = esPage;
		this.esCmtindx = esCmtindx;
		this.esDesc = esDesc;
		this.esNextQue = esNextQue;
		this.esNextStatus = esNextStatus;
		this.esProgram = esProgram;
		this.esEscProgram = esEscProgram;
		this.esUser1 = esUser1;
		this.esUser2 = esUser2;
		this.esChr01 = esChr01;
		this.esChr02 = esChr02;
		this.esChr03 = esChr03;
		this.esChr04 = esChr04;
		this.esDec01 = esDec01;
		this.esDec02 = esDec02;
		this.esDec03 = esDec03;
		this.esDte01 = esDte01;
		this.esDte02 = esDte02;
		this.esDte03 = esDte03;
		this.esLog01 = esLog01;
		this.esLog02 = esLog02;
		this.esLog03 = esLog03;
		this.esQadc01 = esQadc01;
		this.esQadc02 = esQadc02;
		this.esQadc03 = esQadc03;
		this.esQadc04 = esQadc04;
		this.esQadd01 = esQadd01;
		this.esQadd02 = esQadd02;
		this.esQadd03 = esQadd03;
		this.esQadde01 = esQadde01;
		this.esQadde02 = esQadde02;
		this.esQadde03 = esQadde03;
		this.esQadl01 = esQadl01;
		this.esQadl02 = esQadl02;
		this.esQadl03 = esQadl03;
		this.esMessageList = esMessageList;
		this.esDocDesc = esDocDesc;
		this.esDocExec = esDocExec;
		this.esDueDate = esDueDate;
		this.esDocsPrinted = esDocsPrinted;
		this.esDocPrinted = esDocPrinted;
		this.esRepairStep = esRepairStep;
		this.esEsNbr = esEsNbr;
		this.esActDate = esActDate;
		this.esDocPrintit = esDocPrintit;
		this.esInitialDate = esInitialDate;
		this.esDocPrinter = esDocPrinter;
		this.esDocPaged = esDocPaged;
		this.oidEsMstr = oidEsMstr;
	}

	// Property accessors

	public EsMstrId getId() {
		return this.id;
	}

	public void setId(EsMstrId id) {
		this.id = id;
	}

	public String getEsCaCategory() {
		return this.esCaCategory;
	}

	public void setEsCaCategory(String esCaCategory) {
		this.esCaCategory = esCaCategory;
	}

	public String getEsTimeIn() {
		return this.esTimeIn;
	}

	public void setEsTimeIn(String esTimeIn) {
		this.esTimeIn = esTimeIn;
	}

	public Integer getEsDaysIn() {
		return this.esDaysIn;
	}

	public void setEsDaysIn(Integer esDaysIn) {
		this.esDaysIn = esDaysIn;
	}

	public Integer getEsCaPri() {
		return this.esCaPri;
	}

	public void setEsCaPri(Integer esCaPri) {
		this.esCaPri = esCaPri;
	}

	public Boolean getEsEscalate() {
		return this.esEscalate;
	}

	public void setEsEscalate(Boolean esEscalate) {
		this.esEscalate = esEscalate;
	}

	public String getEsGroup() {
		return this.esGroup;
	}

	public void setEsGroup(String esGroup) {
		this.esGroup = esGroup;
	}

	public Boolean getEsMessage() {
		return this.esMessage;
	}

	public void setEsMessage(Boolean esMessage) {
		this.esMessage = esMessage;
	}

	public Boolean getEsPrint() {
		return this.esPrint;
	}

	public void setEsPrint(Boolean esPrint) {
		this.esPrint = esPrint;
	}

	public Integer getEsPriBump() {
		return this.esPriBump;
	}

	public void setEsPriBump(Integer esPriBump) {
		this.esPriBump = esPriBump;
	}

	public Boolean getEsPage() {
		return this.esPage;
	}

	public void setEsPage(Boolean esPage) {
		this.esPage = esPage;
	}

	public Integer getEsCmtindx() {
		return this.esCmtindx;
	}

	public void setEsCmtindx(Integer esCmtindx) {
		this.esCmtindx = esCmtindx;
	}

	public String getEsDesc() {
		return this.esDesc;
	}

	public void setEsDesc(String esDesc) {
		this.esDesc = esDesc;
	}

	public String getEsNextQue() {
		return this.esNextQue;
	}

	public void setEsNextQue(String esNextQue) {
		this.esNextQue = esNextQue;
	}

	public String getEsNextStatus() {
		return this.esNextStatus;
	}

	public void setEsNextStatus(String esNextStatus) {
		this.esNextStatus = esNextStatus;
	}

	public String getEsProgram() {
		return this.esProgram;
	}

	public void setEsProgram(String esProgram) {
		this.esProgram = esProgram;
	}

	public String getEsEscProgram() {
		return this.esEscProgram;
	}

	public void setEsEscProgram(String esEscProgram) {
		this.esEscProgram = esEscProgram;
	}

	public String getEsUser1() {
		return this.esUser1;
	}

	public void setEsUser1(String esUser1) {
		this.esUser1 = esUser1;
	}

	public String getEsUser2() {
		return this.esUser2;
	}

	public void setEsUser2(String esUser2) {
		this.esUser2 = esUser2;
	}

	public String getEsChr01() {
		return this.esChr01;
	}

	public void setEsChr01(String esChr01) {
		this.esChr01 = esChr01;
	}

	public String getEsChr02() {
		return this.esChr02;
	}

	public void setEsChr02(String esChr02) {
		this.esChr02 = esChr02;
	}

	public String getEsChr03() {
		return this.esChr03;
	}

	public void setEsChr03(String esChr03) {
		this.esChr03 = esChr03;
	}

	public String getEsChr04() {
		return this.esChr04;
	}

	public void setEsChr04(String esChr04) {
		this.esChr04 = esChr04;
	}

	public Double getEsDec01() {
		return this.esDec01;
	}

	public void setEsDec01(Double esDec01) {
		this.esDec01 = esDec01;
	}

	public Double getEsDec02() {
		return this.esDec02;
	}

	public void setEsDec02(Double esDec02) {
		this.esDec02 = esDec02;
	}

	public Double getEsDec03() {
		return this.esDec03;
	}

	public void setEsDec03(Double esDec03) {
		this.esDec03 = esDec03;
	}

	public Date getEsDte01() {
		return this.esDte01;
	}

	public void setEsDte01(Date esDte01) {
		this.esDte01 = esDte01;
	}

	public Date getEsDte02() {
		return this.esDte02;
	}

	public void setEsDte02(Date esDte02) {
		this.esDte02 = esDte02;
	}

	public Date getEsDte03() {
		return this.esDte03;
	}

	public void setEsDte03(Date esDte03) {
		this.esDte03 = esDte03;
	}

	public Boolean getEsLog01() {
		return this.esLog01;
	}

	public void setEsLog01(Boolean esLog01) {
		this.esLog01 = esLog01;
	}

	public Boolean getEsLog02() {
		return this.esLog02;
	}

	public void setEsLog02(Boolean esLog02) {
		this.esLog02 = esLog02;
	}

	public Boolean getEsLog03() {
		return this.esLog03;
	}

	public void setEsLog03(Boolean esLog03) {
		this.esLog03 = esLog03;
	}

	public String getEsQadc01() {
		return this.esQadc01;
	}

	public void setEsQadc01(String esQadc01) {
		this.esQadc01 = esQadc01;
	}

	public String getEsQadc02() {
		return this.esQadc02;
	}

	public void setEsQadc02(String esQadc02) {
		this.esQadc02 = esQadc02;
	}

	public String getEsQadc03() {
		return this.esQadc03;
	}

	public void setEsQadc03(String esQadc03) {
		this.esQadc03 = esQadc03;
	}

	public String getEsQadc04() {
		return this.esQadc04;
	}

	public void setEsQadc04(String esQadc04) {
		this.esQadc04 = esQadc04;
	}

	public Date getEsQadd01() {
		return this.esQadd01;
	}

	public void setEsQadd01(Date esQadd01) {
		this.esQadd01 = esQadd01;
	}

	public Date getEsQadd02() {
		return this.esQadd02;
	}

	public void setEsQadd02(Date esQadd02) {
		this.esQadd02 = esQadd02;
	}

	public Date getEsQadd03() {
		return this.esQadd03;
	}

	public void setEsQadd03(Date esQadd03) {
		this.esQadd03 = esQadd03;
	}

	public Double getEsQadde01() {
		return this.esQadde01;
	}

	public void setEsQadde01(Double esQadde01) {
		this.esQadde01 = esQadde01;
	}

	public Double getEsQadde02() {
		return this.esQadde02;
	}

	public void setEsQadde02(Double esQadde02) {
		this.esQadde02 = esQadde02;
	}

	public Double getEsQadde03() {
		return this.esQadde03;
	}

	public void setEsQadde03(Double esQadde03) {
		this.esQadde03 = esQadde03;
	}

	public Boolean getEsQadl01() {
		return this.esQadl01;
	}

	public void setEsQadl01(Boolean esQadl01) {
		this.esQadl01 = esQadl01;
	}

	public Boolean getEsQadl02() {
		return this.esQadl02;
	}

	public void setEsQadl02(Boolean esQadl02) {
		this.esQadl02 = esQadl02;
	}

	public Boolean getEsQadl03() {
		return this.esQadl03;
	}

	public void setEsQadl03(Boolean esQadl03) {
		this.esQadl03 = esQadl03;
	}

	public String getEsMessageList() {
		return this.esMessageList;
	}

	public void setEsMessageList(String esMessageList) {
		this.esMessageList = esMessageList;
	}

	public String getEsDocDesc() {
		return this.esDocDesc;
	}

	public void setEsDocDesc(String esDocDesc) {
		this.esDocDesc = esDocDesc;
	}

	public String getEsDocExec() {
		return this.esDocExec;
	}

	public void setEsDocExec(String esDocExec) {
		this.esDocExec = esDocExec;
	}

	public Date getEsDueDate() {
		return this.esDueDate;
	}

	public void setEsDueDate(Date esDueDate) {
		this.esDueDate = esDueDate;
	}

	public Boolean getEsDocsPrinted() {
		return this.esDocsPrinted;
	}

	public void setEsDocsPrinted(Boolean esDocsPrinted) {
		this.esDocsPrinted = esDocsPrinted;
	}

	public String getEsDocPrinted() {
		return this.esDocPrinted;
	}

	public void setEsDocPrinted(String esDocPrinted) {
		this.esDocPrinted = esDocPrinted;
	}

	public String getEsRepairStep() {
		return this.esRepairStep;
	}

	public void setEsRepairStep(String esRepairStep) {
		this.esRepairStep = esRepairStep;
	}

	public String getEsEsNbr() {
		return this.esEsNbr;
	}

	public void setEsEsNbr(String esEsNbr) {
		this.esEsNbr = esEsNbr;
	}

	public Date getEsActDate() {
		return this.esActDate;
	}

	public void setEsActDate(Date esActDate) {
		this.esActDate = esActDate;
	}

	public String getEsDocPrintit() {
		return this.esDocPrintit;
	}

	public void setEsDocPrintit(String esDocPrintit) {
		this.esDocPrintit = esDocPrintit;
	}

	public Date getEsInitialDate() {
		return this.esInitialDate;
	}

	public void setEsInitialDate(Date esInitialDate) {
		this.esInitialDate = esInitialDate;
	}

	public String getEsDocPrinter() {
		return this.esDocPrinter;
	}

	public void setEsDocPrinter(String esDocPrinter) {
		this.esDocPrinter = esDocPrinter;
	}

	public String getEsDocPaged() {
		return this.esDocPaged;
	}

	public void setEsDocPaged(String esDocPaged) {
		this.esDocPaged = esDocPaged;
	}

	public Double getOidEsMstr() {
		return this.oidEsMstr;
	}

	public void setOidEsMstr(Double oidEsMstr) {
		this.oidEsMstr = oidEsMstr;
	}

}