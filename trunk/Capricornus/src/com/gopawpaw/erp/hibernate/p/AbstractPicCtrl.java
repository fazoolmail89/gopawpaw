package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPicCtrl entity provides the base persistence definition of the
 * PicCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPicCtrl implements java.io.Serializable {

	// Fields

	private String picDomain;
	private Integer picQadi01;
	private Boolean picFsFact;
	private Integer picFsRfact;
	private Integer picPoRfact;
	private Integer picQoRfact;
	private Integer picListId;
	private String picPoDate;
	private String picQoDate;
	private String picSoDate;
	private String picFsDate;
	private Boolean picPoFact;
	private Boolean picQoFact;
	private Boolean picSoFact;
	private String picUser1;
	private String picUser2;
	private Integer picSoRfact;
	private Boolean picItemRegen;
	private Boolean picCustRegen;
	private Boolean picSoLinpri;
	private Boolean picFsLinpri;
	private Boolean picPoLinpri;
	private Boolean picQoLinpri;
	private String picDiscComb;
	private String picPromoPre;
	private String picQadc01;
	private Double oidPicCtrl;

	// Constructors

	/** default constructor */
	public AbstractPicCtrl() {
	}

	/** minimal constructor */
	public AbstractPicCtrl(String picPromoPre, Double oidPicCtrl) {
		this.picPromoPre = picPromoPre;
		this.oidPicCtrl = oidPicCtrl;
	}

	/** full constructor */
	public AbstractPicCtrl(Integer picQadi01, Boolean picFsFact,
			Integer picFsRfact, Integer picPoRfact, Integer picQoRfact,
			Integer picListId, String picPoDate, String picQoDate,
			String picSoDate, String picFsDate, Boolean picPoFact,
			Boolean picQoFact, Boolean picSoFact, String picUser1,
			String picUser2, Integer picSoRfact, Boolean picItemRegen,
			Boolean picCustRegen, Boolean picSoLinpri, Boolean picFsLinpri,
			Boolean picPoLinpri, Boolean picQoLinpri, String picDiscComb,
			String picPromoPre, String picQadc01, Double oidPicCtrl) {
		this.picQadi01 = picQadi01;
		this.picFsFact = picFsFact;
		this.picFsRfact = picFsRfact;
		this.picPoRfact = picPoRfact;
		this.picQoRfact = picQoRfact;
		this.picListId = picListId;
		this.picPoDate = picPoDate;
		this.picQoDate = picQoDate;
		this.picSoDate = picSoDate;
		this.picFsDate = picFsDate;
		this.picPoFact = picPoFact;
		this.picQoFact = picQoFact;
		this.picSoFact = picSoFact;
		this.picUser1 = picUser1;
		this.picUser2 = picUser2;
		this.picSoRfact = picSoRfact;
		this.picItemRegen = picItemRegen;
		this.picCustRegen = picCustRegen;
		this.picSoLinpri = picSoLinpri;
		this.picFsLinpri = picFsLinpri;
		this.picPoLinpri = picPoLinpri;
		this.picQoLinpri = picQoLinpri;
		this.picDiscComb = picDiscComb;
		this.picPromoPre = picPromoPre;
		this.picQadc01 = picQadc01;
		this.oidPicCtrl = oidPicCtrl;
	}

	// Property accessors

	public String getPicDomain() {
		return this.picDomain;
	}

	public void setPicDomain(String picDomain) {
		this.picDomain = picDomain;
	}

	public Integer getPicQadi01() {
		return this.picQadi01;
	}

	public void setPicQadi01(Integer picQadi01) {
		this.picQadi01 = picQadi01;
	}

	public Boolean getPicFsFact() {
		return this.picFsFact;
	}

	public void setPicFsFact(Boolean picFsFact) {
		this.picFsFact = picFsFact;
	}

	public Integer getPicFsRfact() {
		return this.picFsRfact;
	}

	public void setPicFsRfact(Integer picFsRfact) {
		this.picFsRfact = picFsRfact;
	}

	public Integer getPicPoRfact() {
		return this.picPoRfact;
	}

	public void setPicPoRfact(Integer picPoRfact) {
		this.picPoRfact = picPoRfact;
	}

	public Integer getPicQoRfact() {
		return this.picQoRfact;
	}

	public void setPicQoRfact(Integer picQoRfact) {
		this.picQoRfact = picQoRfact;
	}

	public Integer getPicListId() {
		return this.picListId;
	}

	public void setPicListId(Integer picListId) {
		this.picListId = picListId;
	}

	public String getPicPoDate() {
		return this.picPoDate;
	}

	public void setPicPoDate(String picPoDate) {
		this.picPoDate = picPoDate;
	}

	public String getPicQoDate() {
		return this.picQoDate;
	}

	public void setPicQoDate(String picQoDate) {
		this.picQoDate = picQoDate;
	}

	public String getPicSoDate() {
		return this.picSoDate;
	}

	public void setPicSoDate(String picSoDate) {
		this.picSoDate = picSoDate;
	}

	public String getPicFsDate() {
		return this.picFsDate;
	}

	public void setPicFsDate(String picFsDate) {
		this.picFsDate = picFsDate;
	}

	public Boolean getPicPoFact() {
		return this.picPoFact;
	}

	public void setPicPoFact(Boolean picPoFact) {
		this.picPoFact = picPoFact;
	}

	public Boolean getPicQoFact() {
		return this.picQoFact;
	}

	public void setPicQoFact(Boolean picQoFact) {
		this.picQoFact = picQoFact;
	}

	public Boolean getPicSoFact() {
		return this.picSoFact;
	}

	public void setPicSoFact(Boolean picSoFact) {
		this.picSoFact = picSoFact;
	}

	public String getPicUser1() {
		return this.picUser1;
	}

	public void setPicUser1(String picUser1) {
		this.picUser1 = picUser1;
	}

	public String getPicUser2() {
		return this.picUser2;
	}

	public void setPicUser2(String picUser2) {
		this.picUser2 = picUser2;
	}

	public Integer getPicSoRfact() {
		return this.picSoRfact;
	}

	public void setPicSoRfact(Integer picSoRfact) {
		this.picSoRfact = picSoRfact;
	}

	public Boolean getPicItemRegen() {
		return this.picItemRegen;
	}

	public void setPicItemRegen(Boolean picItemRegen) {
		this.picItemRegen = picItemRegen;
	}

	public Boolean getPicCustRegen() {
		return this.picCustRegen;
	}

	public void setPicCustRegen(Boolean picCustRegen) {
		this.picCustRegen = picCustRegen;
	}

	public Boolean getPicSoLinpri() {
		return this.picSoLinpri;
	}

	public void setPicSoLinpri(Boolean picSoLinpri) {
		this.picSoLinpri = picSoLinpri;
	}

	public Boolean getPicFsLinpri() {
		return this.picFsLinpri;
	}

	public void setPicFsLinpri(Boolean picFsLinpri) {
		this.picFsLinpri = picFsLinpri;
	}

	public Boolean getPicPoLinpri() {
		return this.picPoLinpri;
	}

	public void setPicPoLinpri(Boolean picPoLinpri) {
		this.picPoLinpri = picPoLinpri;
	}

	public Boolean getPicQoLinpri() {
		return this.picQoLinpri;
	}

	public void setPicQoLinpri(Boolean picQoLinpri) {
		this.picQoLinpri = picQoLinpri;
	}

	public String getPicDiscComb() {
		return this.picDiscComb;
	}

	public void setPicDiscComb(String picDiscComb) {
		this.picDiscComb = picDiscComb;
	}

	public String getPicPromoPre() {
		return this.picPromoPre;
	}

	public void setPicPromoPre(String picPromoPre) {
		this.picPromoPre = picPromoPre;
	}

	public String getPicQadc01() {
		return this.picQadc01;
	}

	public void setPicQadc01(String picQadc01) {
		this.picQadc01 = picQadc01;
	}

	public Double getOidPicCtrl() {
		return this.oidPicCtrl;
	}

	public void setOidPicCtrl(Double oidPicCtrl) {
		this.oidPicCtrl = oidPicCtrl;
	}

}