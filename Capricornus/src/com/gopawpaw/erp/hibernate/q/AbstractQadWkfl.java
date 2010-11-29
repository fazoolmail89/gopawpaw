package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQadWkfl entity provides the base persistence definition of the
 * QadWkfl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQadWkfl implements java.io.Serializable {

	// Fields

	private QadWkflId id;
	private String qadKey3;
	private String qadKey4;
	private String qadKey5;
	private String qadKey6;
	private String qadCharfld;
	private String qadDecfld;
	private String qadDatefld;
	private String qadUser1;
	private String qadUser2;
	private String qadQadc01;
	private String qadLogfld;
	private String qadCharfld1;
	private String qadIntfld;
	private Double oidQadWkfl;

	// Constructors

	/** default constructor */
	public AbstractQadWkfl() {
	}

	/** minimal constructor */
	public AbstractQadWkfl(QadWkflId id, Double oidQadWkfl) {
		this.id = id;
		this.oidQadWkfl = oidQadWkfl;
	}

	/** full constructor */
	public AbstractQadWkfl(QadWkflId id, String qadKey3, String qadKey4,
			String qadKey5, String qadKey6, String qadCharfld,
			String qadDecfld, String qadDatefld, String qadUser1,
			String qadUser2, String qadQadc01, String qadLogfld,
			String qadCharfld1, String qadIntfld, Double oidQadWkfl) {
		this.id = id;
		this.qadKey3 = qadKey3;
		this.qadKey4 = qadKey4;
		this.qadKey5 = qadKey5;
		this.qadKey6 = qadKey6;
		this.qadCharfld = qadCharfld;
		this.qadDecfld = qadDecfld;
		this.qadDatefld = qadDatefld;
		this.qadUser1 = qadUser1;
		this.qadUser2 = qadUser2;
		this.qadQadc01 = qadQadc01;
		this.qadLogfld = qadLogfld;
		this.qadCharfld1 = qadCharfld1;
		this.qadIntfld = qadIntfld;
		this.oidQadWkfl = oidQadWkfl;
	}

	// Property accessors

	public QadWkflId getId() {
		return this.id;
	}

	public void setId(QadWkflId id) {
		this.id = id;
	}

	public String getQadKey3() {
		return this.qadKey3;
	}

	public void setQadKey3(String qadKey3) {
		this.qadKey3 = qadKey3;
	}

	public String getQadKey4() {
		return this.qadKey4;
	}

	public void setQadKey4(String qadKey4) {
		this.qadKey4 = qadKey4;
	}

	public String getQadKey5() {
		return this.qadKey5;
	}

	public void setQadKey5(String qadKey5) {
		this.qadKey5 = qadKey5;
	}

	public String getQadKey6() {
		return this.qadKey6;
	}

	public void setQadKey6(String qadKey6) {
		this.qadKey6 = qadKey6;
	}

	public String getQadCharfld() {
		return this.qadCharfld;
	}

	public void setQadCharfld(String qadCharfld) {
		this.qadCharfld = qadCharfld;
	}

	public String getQadDecfld() {
		return this.qadDecfld;
	}

	public void setQadDecfld(String qadDecfld) {
		this.qadDecfld = qadDecfld;
	}

	public String getQadDatefld() {
		return this.qadDatefld;
	}

	public void setQadDatefld(String qadDatefld) {
		this.qadDatefld = qadDatefld;
	}

	public String getQadUser1() {
		return this.qadUser1;
	}

	public void setQadUser1(String qadUser1) {
		this.qadUser1 = qadUser1;
	}

	public String getQadUser2() {
		return this.qadUser2;
	}

	public void setQadUser2(String qadUser2) {
		this.qadUser2 = qadUser2;
	}

	public String getQadQadc01() {
		return this.qadQadc01;
	}

	public void setQadQadc01(String qadQadc01) {
		this.qadQadc01 = qadQadc01;
	}

	public String getQadLogfld() {
		return this.qadLogfld;
	}

	public void setQadLogfld(String qadLogfld) {
		this.qadLogfld = qadLogfld;
	}

	public String getQadCharfld1() {
		return this.qadCharfld1;
	}

	public void setQadCharfld1(String qadCharfld1) {
		this.qadCharfld1 = qadCharfld1;
	}

	public String getQadIntfld() {
		return this.qadIntfld;
	}

	public void setQadIntfld(String qadIntfld) {
		this.qadIntfld = qadIntfld;
	}

	public Double getOidQadWkfl() {
		return this.oidQadWkfl;
	}

	public void setOidQadWkfl(Double oidQadWkfl) {
		this.oidQadWkfl = oidQadWkfl;
	}

}