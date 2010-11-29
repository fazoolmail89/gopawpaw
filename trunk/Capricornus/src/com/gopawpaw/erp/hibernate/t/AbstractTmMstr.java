package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTmMstr entity provides the base persistence definition of the TmMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTmMstr implements java.io.Serializable {

	// Fields

	private TmMstrId id;
	private String tmDesc;
	private String tmType;
	private Double tmMaxweight;
	private String tmWeightUm;
	private Double tmMaxcube;
	private String tmCubeUm;
	private Double tmHeight;
	private Double tmWidth;
	private Double tmLength;
	private Integer tmPallets;
	private Double tmGrossWt;
	private String tmRateCode;
	private Integer tmCmtindx;
	private Double tmLoadLt;
	private Double tmUnloadLt;
	private Integer tmNoUnits;
	private String tmUser1;
	private String tmUser2;
	private String tmQadc01;
	private Double oidTmMstr;

	// Constructors

	/** default constructor */
	public AbstractTmMstr() {
	}

	/** minimal constructor */
	public AbstractTmMstr(TmMstrId id, Integer tmNoUnits, Double oidTmMstr) {
		this.id = id;
		this.tmNoUnits = tmNoUnits;
		this.oidTmMstr = oidTmMstr;
	}

	/** full constructor */
	public AbstractTmMstr(TmMstrId id, String tmDesc, String tmType,
			Double tmMaxweight, String tmWeightUm, Double tmMaxcube,
			String tmCubeUm, Double tmHeight, Double tmWidth, Double tmLength,
			Integer tmPallets, Double tmGrossWt, String tmRateCode,
			Integer tmCmtindx, Double tmLoadLt, Double tmUnloadLt,
			Integer tmNoUnits, String tmUser1, String tmUser2, String tmQadc01,
			Double oidTmMstr) {
		this.id = id;
		this.tmDesc = tmDesc;
		this.tmType = tmType;
		this.tmMaxweight = tmMaxweight;
		this.tmWeightUm = tmWeightUm;
		this.tmMaxcube = tmMaxcube;
		this.tmCubeUm = tmCubeUm;
		this.tmHeight = tmHeight;
		this.tmWidth = tmWidth;
		this.tmLength = tmLength;
		this.tmPallets = tmPallets;
		this.tmGrossWt = tmGrossWt;
		this.tmRateCode = tmRateCode;
		this.tmCmtindx = tmCmtindx;
		this.tmLoadLt = tmLoadLt;
		this.tmUnloadLt = tmUnloadLt;
		this.tmNoUnits = tmNoUnits;
		this.tmUser1 = tmUser1;
		this.tmUser2 = tmUser2;
		this.tmQadc01 = tmQadc01;
		this.oidTmMstr = oidTmMstr;
	}

	// Property accessors

	public TmMstrId getId() {
		return this.id;
	}

	public void setId(TmMstrId id) {
		this.id = id;
	}

	public String getTmDesc() {
		return this.tmDesc;
	}

	public void setTmDesc(String tmDesc) {
		this.tmDesc = tmDesc;
	}

	public String getTmType() {
		return this.tmType;
	}

	public void setTmType(String tmType) {
		this.tmType = tmType;
	}

	public Double getTmMaxweight() {
		return this.tmMaxweight;
	}

	public void setTmMaxweight(Double tmMaxweight) {
		this.tmMaxweight = tmMaxweight;
	}

	public String getTmWeightUm() {
		return this.tmWeightUm;
	}

	public void setTmWeightUm(String tmWeightUm) {
		this.tmWeightUm = tmWeightUm;
	}

	public Double getTmMaxcube() {
		return this.tmMaxcube;
	}

	public void setTmMaxcube(Double tmMaxcube) {
		this.tmMaxcube = tmMaxcube;
	}

	public String getTmCubeUm() {
		return this.tmCubeUm;
	}

	public void setTmCubeUm(String tmCubeUm) {
		this.tmCubeUm = tmCubeUm;
	}

	public Double getTmHeight() {
		return this.tmHeight;
	}

	public void setTmHeight(Double tmHeight) {
		this.tmHeight = tmHeight;
	}

	public Double getTmWidth() {
		return this.tmWidth;
	}

	public void setTmWidth(Double tmWidth) {
		this.tmWidth = tmWidth;
	}

	public Double getTmLength() {
		return this.tmLength;
	}

	public void setTmLength(Double tmLength) {
		this.tmLength = tmLength;
	}

	public Integer getTmPallets() {
		return this.tmPallets;
	}

	public void setTmPallets(Integer tmPallets) {
		this.tmPallets = tmPallets;
	}

	public Double getTmGrossWt() {
		return this.tmGrossWt;
	}

	public void setTmGrossWt(Double tmGrossWt) {
		this.tmGrossWt = tmGrossWt;
	}

	public String getTmRateCode() {
		return this.tmRateCode;
	}

	public void setTmRateCode(String tmRateCode) {
		this.tmRateCode = tmRateCode;
	}

	public Integer getTmCmtindx() {
		return this.tmCmtindx;
	}

	public void setTmCmtindx(Integer tmCmtindx) {
		this.tmCmtindx = tmCmtindx;
	}

	public Double getTmLoadLt() {
		return this.tmLoadLt;
	}

	public void setTmLoadLt(Double tmLoadLt) {
		this.tmLoadLt = tmLoadLt;
	}

	public Double getTmUnloadLt() {
		return this.tmUnloadLt;
	}

	public void setTmUnloadLt(Double tmUnloadLt) {
		this.tmUnloadLt = tmUnloadLt;
	}

	public Integer getTmNoUnits() {
		return this.tmNoUnits;
	}

	public void setTmNoUnits(Integer tmNoUnits) {
		this.tmNoUnits = tmNoUnits;
	}

	public String getTmUser1() {
		return this.tmUser1;
	}

	public void setTmUser1(String tmUser1) {
		this.tmUser1 = tmUser1;
	}

	public String getTmUser2() {
		return this.tmUser2;
	}

	public void setTmUser2(String tmUser2) {
		this.tmUser2 = tmUser2;
	}

	public String getTmQadc01() {
		return this.tmQadc01;
	}

	public void setTmQadc01(String tmQadc01) {
		this.tmQadc01 = tmQadc01;
	}

	public Double getOidTmMstr() {
		return this.oidTmMstr;
	}

	public void setOidTmMstr(Double oidTmMstr) {
		this.oidTmMstr = oidTmMstr;
	}

}