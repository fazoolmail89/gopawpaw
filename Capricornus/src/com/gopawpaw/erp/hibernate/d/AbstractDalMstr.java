package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDalMstr entity provides the base persistence definition of the
 * DalMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDalMstr implements java.io.Serializable {

	// Fields

	private DalMstrId id;
	private String dalListDesc;
	private String dalModUserid;
	private Date dalModDate;
	private String dalUser1;
	private String dalUser2;
	private String dalChr01;
	private String dalChr02;
	private Double dalDec01;
	private Double dalDec02;
	private Integer dalInt01;
	private Integer dalInt02;
	private Boolean dalLog01;
	private Boolean dalLog02;
	private Date dalDte01;
	private Date dalDte02;
	private String dalQadc01;
	private String dalQadc02;
	private String dalQadc03;
	private String dalQadc04;
	private Double dalQadd01;
	private Double dalQadd02;
	private Integer dalQadi01;
	private Integer dalQadi02;
	private Boolean dalQadl01;
	private Boolean dalQadl02;
	private Date dalQadt01;
	private Date dalQadt02;
	private Double oidDalMstr;

	// Constructors

	/** default constructor */
	public AbstractDalMstr() {
	}

	/** minimal constructor */
	public AbstractDalMstr(DalMstrId id, Double oidDalMstr) {
		this.id = id;
		this.oidDalMstr = oidDalMstr;
	}

	/** full constructor */
	public AbstractDalMstr(DalMstrId id, String dalListDesc,
			String dalModUserid, Date dalModDate, String dalUser1,
			String dalUser2, String dalChr01, String dalChr02, Double dalDec01,
			Double dalDec02, Integer dalInt01, Integer dalInt02,
			Boolean dalLog01, Boolean dalLog02, Date dalDte01, Date dalDte02,
			String dalQadc01, String dalQadc02, String dalQadc03,
			String dalQadc04, Double dalQadd01, Double dalQadd02,
			Integer dalQadi01, Integer dalQadi02, Boolean dalQadl01,
			Boolean dalQadl02, Date dalQadt01, Date dalQadt02, Double oidDalMstr) {
		this.id = id;
		this.dalListDesc = dalListDesc;
		this.dalModUserid = dalModUserid;
		this.dalModDate = dalModDate;
		this.dalUser1 = dalUser1;
		this.dalUser2 = dalUser2;
		this.dalChr01 = dalChr01;
		this.dalChr02 = dalChr02;
		this.dalDec01 = dalDec01;
		this.dalDec02 = dalDec02;
		this.dalInt01 = dalInt01;
		this.dalInt02 = dalInt02;
		this.dalLog01 = dalLog01;
		this.dalLog02 = dalLog02;
		this.dalDte01 = dalDte01;
		this.dalDte02 = dalDte02;
		this.dalQadc01 = dalQadc01;
		this.dalQadc02 = dalQadc02;
		this.dalQadc03 = dalQadc03;
		this.dalQadc04 = dalQadc04;
		this.dalQadd01 = dalQadd01;
		this.dalQadd02 = dalQadd02;
		this.dalQadi01 = dalQadi01;
		this.dalQadi02 = dalQadi02;
		this.dalQadl01 = dalQadl01;
		this.dalQadl02 = dalQadl02;
		this.dalQadt01 = dalQadt01;
		this.dalQadt02 = dalQadt02;
		this.oidDalMstr = oidDalMstr;
	}

	// Property accessors

	public DalMstrId getId() {
		return this.id;
	}

	public void setId(DalMstrId id) {
		this.id = id;
	}

	public String getDalListDesc() {
		return this.dalListDesc;
	}

	public void setDalListDesc(String dalListDesc) {
		this.dalListDesc = dalListDesc;
	}

	public String getDalModUserid() {
		return this.dalModUserid;
	}

	public void setDalModUserid(String dalModUserid) {
		this.dalModUserid = dalModUserid;
	}

	public Date getDalModDate() {
		return this.dalModDate;
	}

	public void setDalModDate(Date dalModDate) {
		this.dalModDate = dalModDate;
	}

	public String getDalUser1() {
		return this.dalUser1;
	}

	public void setDalUser1(String dalUser1) {
		this.dalUser1 = dalUser1;
	}

	public String getDalUser2() {
		return this.dalUser2;
	}

	public void setDalUser2(String dalUser2) {
		this.dalUser2 = dalUser2;
	}

	public String getDalChr01() {
		return this.dalChr01;
	}

	public void setDalChr01(String dalChr01) {
		this.dalChr01 = dalChr01;
	}

	public String getDalChr02() {
		return this.dalChr02;
	}

	public void setDalChr02(String dalChr02) {
		this.dalChr02 = dalChr02;
	}

	public Double getDalDec01() {
		return this.dalDec01;
	}

	public void setDalDec01(Double dalDec01) {
		this.dalDec01 = dalDec01;
	}

	public Double getDalDec02() {
		return this.dalDec02;
	}

	public void setDalDec02(Double dalDec02) {
		this.dalDec02 = dalDec02;
	}

	public Integer getDalInt01() {
		return this.dalInt01;
	}

	public void setDalInt01(Integer dalInt01) {
		this.dalInt01 = dalInt01;
	}

	public Integer getDalInt02() {
		return this.dalInt02;
	}

	public void setDalInt02(Integer dalInt02) {
		this.dalInt02 = dalInt02;
	}

	public Boolean getDalLog01() {
		return this.dalLog01;
	}

	public void setDalLog01(Boolean dalLog01) {
		this.dalLog01 = dalLog01;
	}

	public Boolean getDalLog02() {
		return this.dalLog02;
	}

	public void setDalLog02(Boolean dalLog02) {
		this.dalLog02 = dalLog02;
	}

	public Date getDalDte01() {
		return this.dalDte01;
	}

	public void setDalDte01(Date dalDte01) {
		this.dalDte01 = dalDte01;
	}

	public Date getDalDte02() {
		return this.dalDte02;
	}

	public void setDalDte02(Date dalDte02) {
		this.dalDte02 = dalDte02;
	}

	public String getDalQadc01() {
		return this.dalQadc01;
	}

	public void setDalQadc01(String dalQadc01) {
		this.dalQadc01 = dalQadc01;
	}

	public String getDalQadc02() {
		return this.dalQadc02;
	}

	public void setDalQadc02(String dalQadc02) {
		this.dalQadc02 = dalQadc02;
	}

	public String getDalQadc03() {
		return this.dalQadc03;
	}

	public void setDalQadc03(String dalQadc03) {
		this.dalQadc03 = dalQadc03;
	}

	public String getDalQadc04() {
		return this.dalQadc04;
	}

	public void setDalQadc04(String dalQadc04) {
		this.dalQadc04 = dalQadc04;
	}

	public Double getDalQadd01() {
		return this.dalQadd01;
	}

	public void setDalQadd01(Double dalQadd01) {
		this.dalQadd01 = dalQadd01;
	}

	public Double getDalQadd02() {
		return this.dalQadd02;
	}

	public void setDalQadd02(Double dalQadd02) {
		this.dalQadd02 = dalQadd02;
	}

	public Integer getDalQadi01() {
		return this.dalQadi01;
	}

	public void setDalQadi01(Integer dalQadi01) {
		this.dalQadi01 = dalQadi01;
	}

	public Integer getDalQadi02() {
		return this.dalQadi02;
	}

	public void setDalQadi02(Integer dalQadi02) {
		this.dalQadi02 = dalQadi02;
	}

	public Boolean getDalQadl01() {
		return this.dalQadl01;
	}

	public void setDalQadl01(Boolean dalQadl01) {
		this.dalQadl01 = dalQadl01;
	}

	public Boolean getDalQadl02() {
		return this.dalQadl02;
	}

	public void setDalQadl02(Boolean dalQadl02) {
		this.dalQadl02 = dalQadl02;
	}

	public Date getDalQadt01() {
		return this.dalQadt01;
	}

	public void setDalQadt01(Date dalQadt01) {
		this.dalQadt01 = dalQadt01;
	}

	public Date getDalQadt02() {
		return this.dalQadt02;
	}

	public void setDalQadt02(Date dalQadt02) {
		this.dalQadt02 = dalQadt02;
	}

	public Double getOidDalMstr() {
		return this.oidDalMstr;
	}

	public void setOidDalMstr(Double oidDalMstr) {
		this.oidDalMstr = oidDalMstr;
	}

}