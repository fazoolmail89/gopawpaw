package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcd4Det entity provides the base persistence definition of the
 * Ecd4Det entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd4Det implements java.io.Serializable {

	// Fields

	private Ecd4DetId id;
	private String ecd4Property;
	private Integer ecd4Cmtindx;
	private String ecd4User1;
	private String ecd4User2;
	private String ecd4Propertyum;
	private Integer ecd4Specid;
	private Integer ecd4Qadi01;
	private Integer ecd4DocNbr;
	private String ecd4Testmthd;
	private String ecd4Minimum;
	private String ecd4Maximum;
	private String ecd4Target;
	private String ecd4Attribute;
	private String ecd4Attach;
	private String ecd4SpecDet;
	private Double ecd4DocRev;
	private String ecd4Qadc01;
	private Double oidEcd4Det;

	// Constructors

	/** default constructor */
	public AbstractEcd4Det() {
	}

	/** minimal constructor */
	public AbstractEcd4Det(Ecd4DetId id, String ecd4Property,
			Integer ecd4Cmtindx, String ecd4User1, String ecd4User2,
			String ecd4Propertyum, Integer ecd4Specid, Integer ecd4DocNbr,
			String ecd4Testmthd, String ecd4Minimum, String ecd4Maximum,
			String ecd4Target, String ecd4Attribute, String ecd4Attach,
			String ecd4SpecDet, Double ecd4DocRev, Double oidEcd4Det) {
		this.id = id;
		this.ecd4Property = ecd4Property;
		this.ecd4Cmtindx = ecd4Cmtindx;
		this.ecd4User1 = ecd4User1;
		this.ecd4User2 = ecd4User2;
		this.ecd4Propertyum = ecd4Propertyum;
		this.ecd4Specid = ecd4Specid;
		this.ecd4DocNbr = ecd4DocNbr;
		this.ecd4Testmthd = ecd4Testmthd;
		this.ecd4Minimum = ecd4Minimum;
		this.ecd4Maximum = ecd4Maximum;
		this.ecd4Target = ecd4Target;
		this.ecd4Attribute = ecd4Attribute;
		this.ecd4Attach = ecd4Attach;
		this.ecd4SpecDet = ecd4SpecDet;
		this.ecd4DocRev = ecd4DocRev;
		this.oidEcd4Det = oidEcd4Det;
	}

	/** full constructor */
	public AbstractEcd4Det(Ecd4DetId id, String ecd4Property,
			Integer ecd4Cmtindx, String ecd4User1, String ecd4User2,
			String ecd4Propertyum, Integer ecd4Specid, Integer ecd4Qadi01,
			Integer ecd4DocNbr, String ecd4Testmthd, String ecd4Minimum,
			String ecd4Maximum, String ecd4Target, String ecd4Attribute,
			String ecd4Attach, String ecd4SpecDet, Double ecd4DocRev,
			String ecd4Qadc01, Double oidEcd4Det) {
		this.id = id;
		this.ecd4Property = ecd4Property;
		this.ecd4Cmtindx = ecd4Cmtindx;
		this.ecd4User1 = ecd4User1;
		this.ecd4User2 = ecd4User2;
		this.ecd4Propertyum = ecd4Propertyum;
		this.ecd4Specid = ecd4Specid;
		this.ecd4Qadi01 = ecd4Qadi01;
		this.ecd4DocNbr = ecd4DocNbr;
		this.ecd4Testmthd = ecd4Testmthd;
		this.ecd4Minimum = ecd4Minimum;
		this.ecd4Maximum = ecd4Maximum;
		this.ecd4Target = ecd4Target;
		this.ecd4Attribute = ecd4Attribute;
		this.ecd4Attach = ecd4Attach;
		this.ecd4SpecDet = ecd4SpecDet;
		this.ecd4DocRev = ecd4DocRev;
		this.ecd4Qadc01 = ecd4Qadc01;
		this.oidEcd4Det = oidEcd4Det;
	}

	// Property accessors

	public Ecd4DetId getId() {
		return this.id;
	}

	public void setId(Ecd4DetId id) {
		this.id = id;
	}

	public String getEcd4Property() {
		return this.ecd4Property;
	}

	public void setEcd4Property(String ecd4Property) {
		this.ecd4Property = ecd4Property;
	}

	public Integer getEcd4Cmtindx() {
		return this.ecd4Cmtindx;
	}

	public void setEcd4Cmtindx(Integer ecd4Cmtindx) {
		this.ecd4Cmtindx = ecd4Cmtindx;
	}

	public String getEcd4User1() {
		return this.ecd4User1;
	}

	public void setEcd4User1(String ecd4User1) {
		this.ecd4User1 = ecd4User1;
	}

	public String getEcd4User2() {
		return this.ecd4User2;
	}

	public void setEcd4User2(String ecd4User2) {
		this.ecd4User2 = ecd4User2;
	}

	public String getEcd4Propertyum() {
		return this.ecd4Propertyum;
	}

	public void setEcd4Propertyum(String ecd4Propertyum) {
		this.ecd4Propertyum = ecd4Propertyum;
	}

	public Integer getEcd4Specid() {
		return this.ecd4Specid;
	}

	public void setEcd4Specid(Integer ecd4Specid) {
		this.ecd4Specid = ecd4Specid;
	}

	public Integer getEcd4Qadi01() {
		return this.ecd4Qadi01;
	}

	public void setEcd4Qadi01(Integer ecd4Qadi01) {
		this.ecd4Qadi01 = ecd4Qadi01;
	}

	public Integer getEcd4DocNbr() {
		return this.ecd4DocNbr;
	}

	public void setEcd4DocNbr(Integer ecd4DocNbr) {
		this.ecd4DocNbr = ecd4DocNbr;
	}

	public String getEcd4Testmthd() {
		return this.ecd4Testmthd;
	}

	public void setEcd4Testmthd(String ecd4Testmthd) {
		this.ecd4Testmthd = ecd4Testmthd;
	}

	public String getEcd4Minimum() {
		return this.ecd4Minimum;
	}

	public void setEcd4Minimum(String ecd4Minimum) {
		this.ecd4Minimum = ecd4Minimum;
	}

	public String getEcd4Maximum() {
		return this.ecd4Maximum;
	}

	public void setEcd4Maximum(String ecd4Maximum) {
		this.ecd4Maximum = ecd4Maximum;
	}

	public String getEcd4Target() {
		return this.ecd4Target;
	}

	public void setEcd4Target(String ecd4Target) {
		this.ecd4Target = ecd4Target;
	}

	public String getEcd4Attribute() {
		return this.ecd4Attribute;
	}

	public void setEcd4Attribute(String ecd4Attribute) {
		this.ecd4Attribute = ecd4Attribute;
	}

	public String getEcd4Attach() {
		return this.ecd4Attach;
	}

	public void setEcd4Attach(String ecd4Attach) {
		this.ecd4Attach = ecd4Attach;
	}

	public String getEcd4SpecDet() {
		return this.ecd4SpecDet;
	}

	public void setEcd4SpecDet(String ecd4SpecDet) {
		this.ecd4SpecDet = ecd4SpecDet;
	}

	public Double getEcd4DocRev() {
		return this.ecd4DocRev;
	}

	public void setEcd4DocRev(Double ecd4DocRev) {
		this.ecd4DocRev = ecd4DocRev;
	}

	public String getEcd4Qadc01() {
		return this.ecd4Qadc01;
	}

	public void setEcd4Qadc01(String ecd4Qadc01) {
		this.ecd4Qadc01 = ecd4Qadc01;
	}

	public Double getOidEcd4Det() {
		return this.oidEcd4Det;
	}

	public void setOidEcd4Det(Double oidEcd4Det) {
		this.oidEcd4Det = oidEcd4Det;
	}

}