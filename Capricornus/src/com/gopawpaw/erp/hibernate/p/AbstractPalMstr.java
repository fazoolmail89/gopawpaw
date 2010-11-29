package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPalMstr entity provides the base persistence definition of the
 * PalMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPalMstr implements java.io.Serializable {

	// Fields

	private PalMstrId id;
	private String palDesc;
	private Integer palUnitLay;
	private String palUm;
	private Integer palNbrLay;
	private Double palHeight;
	private Double palWeight;
	private String palUser1;
	private String palUser2;
	private String palChr01;
	private String palChr03;
	private String palChr04;
	private String palChr05;
	private Double palDec01;
	private Double palDec02;
	private String palChr02;
	private String palHghtUm;
	private String palWghtUm;
	private Double oidPalMstr;

	// Constructors

	/** default constructor */
	public AbstractPalMstr() {
	}

	/** minimal constructor */
	public AbstractPalMstr(PalMstrId id, Double oidPalMstr) {
		this.id = id;
		this.oidPalMstr = oidPalMstr;
	}

	/** full constructor */
	public AbstractPalMstr(PalMstrId id, String palDesc, Integer palUnitLay,
			String palUm, Integer palNbrLay, Double palHeight,
			Double palWeight, String palUser1, String palUser2,
			String palChr01, String palChr03, String palChr04, String palChr05,
			Double palDec01, Double palDec02, String palChr02,
			String palHghtUm, String palWghtUm, Double oidPalMstr) {
		this.id = id;
		this.palDesc = palDesc;
		this.palUnitLay = palUnitLay;
		this.palUm = palUm;
		this.palNbrLay = palNbrLay;
		this.palHeight = palHeight;
		this.palWeight = palWeight;
		this.palUser1 = palUser1;
		this.palUser2 = palUser2;
		this.palChr01 = palChr01;
		this.palChr03 = palChr03;
		this.palChr04 = palChr04;
		this.palChr05 = palChr05;
		this.palDec01 = palDec01;
		this.palDec02 = palDec02;
		this.palChr02 = palChr02;
		this.palHghtUm = palHghtUm;
		this.palWghtUm = palWghtUm;
		this.oidPalMstr = oidPalMstr;
	}

	// Property accessors

	public PalMstrId getId() {
		return this.id;
	}

	public void setId(PalMstrId id) {
		this.id = id;
	}

	public String getPalDesc() {
		return this.palDesc;
	}

	public void setPalDesc(String palDesc) {
		this.palDesc = palDesc;
	}

	public Integer getPalUnitLay() {
		return this.palUnitLay;
	}

	public void setPalUnitLay(Integer palUnitLay) {
		this.palUnitLay = palUnitLay;
	}

	public String getPalUm() {
		return this.palUm;
	}

	public void setPalUm(String palUm) {
		this.palUm = palUm;
	}

	public Integer getPalNbrLay() {
		return this.palNbrLay;
	}

	public void setPalNbrLay(Integer palNbrLay) {
		this.palNbrLay = palNbrLay;
	}

	public Double getPalHeight() {
		return this.palHeight;
	}

	public void setPalHeight(Double palHeight) {
		this.palHeight = palHeight;
	}

	public Double getPalWeight() {
		return this.palWeight;
	}

	public void setPalWeight(Double palWeight) {
		this.palWeight = palWeight;
	}

	public String getPalUser1() {
		return this.palUser1;
	}

	public void setPalUser1(String palUser1) {
		this.palUser1 = palUser1;
	}

	public String getPalUser2() {
		return this.palUser2;
	}

	public void setPalUser2(String palUser2) {
		this.palUser2 = palUser2;
	}

	public String getPalChr01() {
		return this.palChr01;
	}

	public void setPalChr01(String palChr01) {
		this.palChr01 = palChr01;
	}

	public String getPalChr03() {
		return this.palChr03;
	}

	public void setPalChr03(String palChr03) {
		this.palChr03 = palChr03;
	}

	public String getPalChr04() {
		return this.palChr04;
	}

	public void setPalChr04(String palChr04) {
		this.palChr04 = palChr04;
	}

	public String getPalChr05() {
		return this.palChr05;
	}

	public void setPalChr05(String palChr05) {
		this.palChr05 = palChr05;
	}

	public Double getPalDec01() {
		return this.palDec01;
	}

	public void setPalDec01(Double palDec01) {
		this.palDec01 = palDec01;
	}

	public Double getPalDec02() {
		return this.palDec02;
	}

	public void setPalDec02(Double palDec02) {
		this.palDec02 = palDec02;
	}

	public String getPalChr02() {
		return this.palChr02;
	}

	public void setPalChr02(String palChr02) {
		this.palChr02 = palChr02;
	}

	public String getPalHghtUm() {
		return this.palHghtUm;
	}

	public void setPalHghtUm(String palHghtUm) {
		this.palHghtUm = palHghtUm;
	}

	public String getPalWghtUm() {
		return this.palWghtUm;
	}

	public void setPalWghtUm(String palWghtUm) {
		this.palWghtUm = palWghtUm;
	}

	public Double getOidPalMstr() {
		return this.oidPalMstr;
	}

	public void setOidPalMstr(Double oidPalMstr) {
		this.oidPalMstr = oidPalMstr;
	}

}