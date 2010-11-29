package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQtblExt entity provides the base persistence definition of the
 * QtblExt entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQtblExt implements java.io.Serializable {

	// Fields

	private QtblExtId id;
	private String qtblQadc01;
	private String qtblQadc02;
	private String qtblQadc03;
	private String qtblQadc04;
	private String qtblQadc05;
	private Double qtblQadd01;
	private Double qtblQadd02;
	private Double qtblQadd03;
	private Double qtblQadd04;
	private Double qtblQadd05;
	private Boolean qtblQadl01;
	private Boolean qtblQadl02;
	private Date qtblQadt01;
	private Date qtblQadt02;
	private Double oidQtblExt;

	// Constructors

	/** default constructor */
	public AbstractQtblExt() {
	}

	/** minimal constructor */
	public AbstractQtblExt(QtblExtId id, String qtblQadc01, String qtblQadc02,
			String qtblQadc03, String qtblQadc04, String qtblQadc05,
			Double qtblQadd01, Double qtblQadd02, Double qtblQadd03,
			Double qtblQadd04, Double qtblQadd05, Boolean qtblQadl01,
			Boolean qtblQadl02, Double oidQtblExt) {
		this.id = id;
		this.qtblQadc01 = qtblQadc01;
		this.qtblQadc02 = qtblQadc02;
		this.qtblQadc03 = qtblQadc03;
		this.qtblQadc04 = qtblQadc04;
		this.qtblQadc05 = qtblQadc05;
		this.qtblQadd01 = qtblQadd01;
		this.qtblQadd02 = qtblQadd02;
		this.qtblQadd03 = qtblQadd03;
		this.qtblQadd04 = qtblQadd04;
		this.qtblQadd05 = qtblQadd05;
		this.qtblQadl01 = qtblQadl01;
		this.qtblQadl02 = qtblQadl02;
		this.oidQtblExt = oidQtblExt;
	}

	/** full constructor */
	public AbstractQtblExt(QtblExtId id, String qtblQadc01, String qtblQadc02,
			String qtblQadc03, String qtblQadc04, String qtblQadc05,
			Double qtblQadd01, Double qtblQadd02, Double qtblQadd03,
			Double qtblQadd04, Double qtblQadd05, Boolean qtblQadl01,
			Boolean qtblQadl02, Date qtblQadt01, Date qtblQadt02,
			Double oidQtblExt) {
		this.id = id;
		this.qtblQadc01 = qtblQadc01;
		this.qtblQadc02 = qtblQadc02;
		this.qtblQadc03 = qtblQadc03;
		this.qtblQadc04 = qtblQadc04;
		this.qtblQadc05 = qtblQadc05;
		this.qtblQadd01 = qtblQadd01;
		this.qtblQadd02 = qtblQadd02;
		this.qtblQadd03 = qtblQadd03;
		this.qtblQadd04 = qtblQadd04;
		this.qtblQadd05 = qtblQadd05;
		this.qtblQadl01 = qtblQadl01;
		this.qtblQadl02 = qtblQadl02;
		this.qtblQadt01 = qtblQadt01;
		this.qtblQadt02 = qtblQadt02;
		this.oidQtblExt = oidQtblExt;
	}

	// Property accessors

	public QtblExtId getId() {
		return this.id;
	}

	public void setId(QtblExtId id) {
		this.id = id;
	}

	public String getQtblQadc01() {
		return this.qtblQadc01;
	}

	public void setQtblQadc01(String qtblQadc01) {
		this.qtblQadc01 = qtblQadc01;
	}

	public String getQtblQadc02() {
		return this.qtblQadc02;
	}

	public void setQtblQadc02(String qtblQadc02) {
		this.qtblQadc02 = qtblQadc02;
	}

	public String getQtblQadc03() {
		return this.qtblQadc03;
	}

	public void setQtblQadc03(String qtblQadc03) {
		this.qtblQadc03 = qtblQadc03;
	}

	public String getQtblQadc04() {
		return this.qtblQadc04;
	}

	public void setQtblQadc04(String qtblQadc04) {
		this.qtblQadc04 = qtblQadc04;
	}

	public String getQtblQadc05() {
		return this.qtblQadc05;
	}

	public void setQtblQadc05(String qtblQadc05) {
		this.qtblQadc05 = qtblQadc05;
	}

	public Double getQtblQadd01() {
		return this.qtblQadd01;
	}

	public void setQtblQadd01(Double qtblQadd01) {
		this.qtblQadd01 = qtblQadd01;
	}

	public Double getQtblQadd02() {
		return this.qtblQadd02;
	}

	public void setQtblQadd02(Double qtblQadd02) {
		this.qtblQadd02 = qtblQadd02;
	}

	public Double getQtblQadd03() {
		return this.qtblQadd03;
	}

	public void setQtblQadd03(Double qtblQadd03) {
		this.qtblQadd03 = qtblQadd03;
	}

	public Double getQtblQadd04() {
		return this.qtblQadd04;
	}

	public void setQtblQadd04(Double qtblQadd04) {
		this.qtblQadd04 = qtblQadd04;
	}

	public Double getQtblQadd05() {
		return this.qtblQadd05;
	}

	public void setQtblQadd05(Double qtblQadd05) {
		this.qtblQadd05 = qtblQadd05;
	}

	public Boolean getQtblQadl01() {
		return this.qtblQadl01;
	}

	public void setQtblQadl01(Boolean qtblQadl01) {
		this.qtblQadl01 = qtblQadl01;
	}

	public Boolean getQtblQadl02() {
		return this.qtblQadl02;
	}

	public void setQtblQadl02(Boolean qtblQadl02) {
		this.qtblQadl02 = qtblQadl02;
	}

	public Date getQtblQadt01() {
		return this.qtblQadt01;
	}

	public void setQtblQadt01(Date qtblQadt01) {
		this.qtblQadt01 = qtblQadt01;
	}

	public Date getQtblQadt02() {
		return this.qtblQadt02;
	}

	public void setQtblQadt02(Date qtblQadt02) {
		this.qtblQadt02 = qtblQadt02;
	}

	public Double getOidQtblExt() {
		return this.oidQtblExt;
	}

	public void setOidQtblExt(Double oidQtblExt) {
		this.oidQtblExt = oidQtblExt;
	}

}