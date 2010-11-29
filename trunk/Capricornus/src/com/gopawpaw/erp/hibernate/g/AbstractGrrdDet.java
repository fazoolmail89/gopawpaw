package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrrdDet entity provides the base persistence definition of the
 * GrrdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrrdDet implements java.io.Serializable {

	// Fields

	private GrrdDetId id;
	private String grrdRowType;
	private String grrdLabel;
	private Integer grrdIndent;
	private Boolean grrdApplySym;
	private String grrdZeroSuppress;
	private String grrdPreUnd;
	private String grrdPostUnd;
	private Integer grrdStartCol;
	private String grrdRvpol;
	private Boolean grrdShow;
	private Boolean grrdPercent;
	private Boolean grrdPrint;
	private Boolean grrdReverse;
	private String grrdFormat;
	private Boolean grrdOverride;
	private String grrdRound;
	private Boolean grrdPage;
	private Boolean grrdPrecedence;
	private String grrdUser1;
	private String grrdUser2;
	private Integer grrdSkips;
	private String grrdText;
	private String grrdCalc;
	private String grrdQadc01;
	private Double oidGrrdDet;

	// Constructors

	/** default constructor */
	public AbstractGrrdDet() {
	}

	/** minimal constructor */
	public AbstractGrrdDet(GrrdDetId id, Double oidGrrdDet) {
		this.id = id;
		this.oidGrrdDet = oidGrrdDet;
	}

	/** full constructor */
	public AbstractGrrdDet(GrrdDetId id, String grrdRowType, String grrdLabel,
			Integer grrdIndent, Boolean grrdApplySym, String grrdZeroSuppress,
			String grrdPreUnd, String grrdPostUnd, Integer grrdStartCol,
			String grrdRvpol, Boolean grrdShow, Boolean grrdPercent,
			Boolean grrdPrint, Boolean grrdReverse, String grrdFormat,
			Boolean grrdOverride, String grrdRound, Boolean grrdPage,
			Boolean grrdPrecedence, String grrdUser1, String grrdUser2,
			Integer grrdSkips, String grrdText, String grrdCalc,
			String grrdQadc01, Double oidGrrdDet) {
		this.id = id;
		this.grrdRowType = grrdRowType;
		this.grrdLabel = grrdLabel;
		this.grrdIndent = grrdIndent;
		this.grrdApplySym = grrdApplySym;
		this.grrdZeroSuppress = grrdZeroSuppress;
		this.grrdPreUnd = grrdPreUnd;
		this.grrdPostUnd = grrdPostUnd;
		this.grrdStartCol = grrdStartCol;
		this.grrdRvpol = grrdRvpol;
		this.grrdShow = grrdShow;
		this.grrdPercent = grrdPercent;
		this.grrdPrint = grrdPrint;
		this.grrdReverse = grrdReverse;
		this.grrdFormat = grrdFormat;
		this.grrdOverride = grrdOverride;
		this.grrdRound = grrdRound;
		this.grrdPage = grrdPage;
		this.grrdPrecedence = grrdPrecedence;
		this.grrdUser1 = grrdUser1;
		this.grrdUser2 = grrdUser2;
		this.grrdSkips = grrdSkips;
		this.grrdText = grrdText;
		this.grrdCalc = grrdCalc;
		this.grrdQadc01 = grrdQadc01;
		this.oidGrrdDet = oidGrrdDet;
	}

	// Property accessors

	public GrrdDetId getId() {
		return this.id;
	}

	public void setId(GrrdDetId id) {
		this.id = id;
	}

	public String getGrrdRowType() {
		return this.grrdRowType;
	}

	public void setGrrdRowType(String grrdRowType) {
		this.grrdRowType = grrdRowType;
	}

	public String getGrrdLabel() {
		return this.grrdLabel;
	}

	public void setGrrdLabel(String grrdLabel) {
		this.grrdLabel = grrdLabel;
	}

	public Integer getGrrdIndent() {
		return this.grrdIndent;
	}

	public void setGrrdIndent(Integer grrdIndent) {
		this.grrdIndent = grrdIndent;
	}

	public Boolean getGrrdApplySym() {
		return this.grrdApplySym;
	}

	public void setGrrdApplySym(Boolean grrdApplySym) {
		this.grrdApplySym = grrdApplySym;
	}

	public String getGrrdZeroSuppress() {
		return this.grrdZeroSuppress;
	}

	public void setGrrdZeroSuppress(String grrdZeroSuppress) {
		this.grrdZeroSuppress = grrdZeroSuppress;
	}

	public String getGrrdPreUnd() {
		return this.grrdPreUnd;
	}

	public void setGrrdPreUnd(String grrdPreUnd) {
		this.grrdPreUnd = grrdPreUnd;
	}

	public String getGrrdPostUnd() {
		return this.grrdPostUnd;
	}

	public void setGrrdPostUnd(String grrdPostUnd) {
		this.grrdPostUnd = grrdPostUnd;
	}

	public Integer getGrrdStartCol() {
		return this.grrdStartCol;
	}

	public void setGrrdStartCol(Integer grrdStartCol) {
		this.grrdStartCol = grrdStartCol;
	}

	public String getGrrdRvpol() {
		return this.grrdRvpol;
	}

	public void setGrrdRvpol(String grrdRvpol) {
		this.grrdRvpol = grrdRvpol;
	}

	public Boolean getGrrdShow() {
		return this.grrdShow;
	}

	public void setGrrdShow(Boolean grrdShow) {
		this.grrdShow = grrdShow;
	}

	public Boolean getGrrdPercent() {
		return this.grrdPercent;
	}

	public void setGrrdPercent(Boolean grrdPercent) {
		this.grrdPercent = grrdPercent;
	}

	public Boolean getGrrdPrint() {
		return this.grrdPrint;
	}

	public void setGrrdPrint(Boolean grrdPrint) {
		this.grrdPrint = grrdPrint;
	}

	public Boolean getGrrdReverse() {
		return this.grrdReverse;
	}

	public void setGrrdReverse(Boolean grrdReverse) {
		this.grrdReverse = grrdReverse;
	}

	public String getGrrdFormat() {
		return this.grrdFormat;
	}

	public void setGrrdFormat(String grrdFormat) {
		this.grrdFormat = grrdFormat;
	}

	public Boolean getGrrdOverride() {
		return this.grrdOverride;
	}

	public void setGrrdOverride(Boolean grrdOverride) {
		this.grrdOverride = grrdOverride;
	}

	public String getGrrdRound() {
		return this.grrdRound;
	}

	public void setGrrdRound(String grrdRound) {
		this.grrdRound = grrdRound;
	}

	public Boolean getGrrdPage() {
		return this.grrdPage;
	}

	public void setGrrdPage(Boolean grrdPage) {
		this.grrdPage = grrdPage;
	}

	public Boolean getGrrdPrecedence() {
		return this.grrdPrecedence;
	}

	public void setGrrdPrecedence(Boolean grrdPrecedence) {
		this.grrdPrecedence = grrdPrecedence;
	}

	public String getGrrdUser1() {
		return this.grrdUser1;
	}

	public void setGrrdUser1(String grrdUser1) {
		this.grrdUser1 = grrdUser1;
	}

	public String getGrrdUser2() {
		return this.grrdUser2;
	}

	public void setGrrdUser2(String grrdUser2) {
		this.grrdUser2 = grrdUser2;
	}

	public Integer getGrrdSkips() {
		return this.grrdSkips;
	}

	public void setGrrdSkips(Integer grrdSkips) {
		this.grrdSkips = grrdSkips;
	}

	public String getGrrdText() {
		return this.grrdText;
	}

	public void setGrrdText(String grrdText) {
		this.grrdText = grrdText;
	}

	public String getGrrdCalc() {
		return this.grrdCalc;
	}

	public void setGrrdCalc(String grrdCalc) {
		this.grrdCalc = grrdCalc;
	}

	public String getGrrdQadc01() {
		return this.grrdQadc01;
	}

	public void setGrrdQadc01(String grrdQadc01) {
		this.grrdQadc01 = grrdQadc01;
	}

	public Double getOidGrrdDet() {
		return this.oidGrrdDet;
	}

	public void setOidGrrdDet(Double oidGrrdDet) {
		this.oidGrrdDet = oidGrrdDet;
	}

}