package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVerMstr entity provides the base persistence definition of the
 * VerMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVerMstr implements java.io.Serializable {

	// Fields

	private VerMstrId id;
	private Boolean verActiveFlag;
	private Date verStart;
	private Date verEnd;
	private String verAsnLeadtime;
	private Integer verDaysEarly;
	private Integer verDaysLate;
	private Boolean verUseShippct;
	private Double verOvershipPct;
	private Double verUndershipPct;
	private Boolean verUseShipqty;
	private Integer verOvershipQty;
	private Integer verUndershipQty;
	private Boolean verUseShippctCost;
	private Double verOvershipPctCost;
	private Boolean verUseShipqtyCost;
	private Double verOvershipQtyCost;
	private String verContact;
	private String verEmailAddress;
	private String verModUserid;
	private Date verModDate;
	private String verUser1;
	private String verUser2;
	private String verUser3;
	private String verUser4;
	private String verQadc01;
	private String verQadc02;
	private String verQadc03;
	private String verQadc04;
	private Double verQadd01;
	private Double verQadd02;
	private Boolean verQadl01;
	private Boolean verQadl02;
	private Date verQadt02;
	private Date verQadt01;
	private Integer verQadi01;
	private Integer verQadi02;
	private Double oidVerMstr;

	// Constructors

	/** default constructor */
	public AbstractVerMstr() {
	}

	/** minimal constructor */
	public AbstractVerMstr(VerMstrId id, Double oidVerMstr) {
		this.id = id;
		this.oidVerMstr = oidVerMstr;
	}

	/** full constructor */
	public AbstractVerMstr(VerMstrId id, Boolean verActiveFlag, Date verStart,
			Date verEnd, String verAsnLeadtime, Integer verDaysEarly,
			Integer verDaysLate, Boolean verUseShippct, Double verOvershipPct,
			Double verUndershipPct, Boolean verUseShipqty,
			Integer verOvershipQty, Integer verUndershipQty,
			Boolean verUseShippctCost, Double verOvershipPctCost,
			Boolean verUseShipqtyCost, Double verOvershipQtyCost,
			String verContact, String verEmailAddress, String verModUserid,
			Date verModDate, String verUser1, String verUser2, String verUser3,
			String verUser4, String verQadc01, String verQadc02,
			String verQadc03, String verQadc04, Double verQadd01,
			Double verQadd02, Boolean verQadl01, Boolean verQadl02,
			Date verQadt02, Date verQadt01, Integer verQadi01,
			Integer verQadi02, Double oidVerMstr) {
		this.id = id;
		this.verActiveFlag = verActiveFlag;
		this.verStart = verStart;
		this.verEnd = verEnd;
		this.verAsnLeadtime = verAsnLeadtime;
		this.verDaysEarly = verDaysEarly;
		this.verDaysLate = verDaysLate;
		this.verUseShippct = verUseShippct;
		this.verOvershipPct = verOvershipPct;
		this.verUndershipPct = verUndershipPct;
		this.verUseShipqty = verUseShipqty;
		this.verOvershipQty = verOvershipQty;
		this.verUndershipQty = verUndershipQty;
		this.verUseShippctCost = verUseShippctCost;
		this.verOvershipPctCost = verOvershipPctCost;
		this.verUseShipqtyCost = verUseShipqtyCost;
		this.verOvershipQtyCost = verOvershipQtyCost;
		this.verContact = verContact;
		this.verEmailAddress = verEmailAddress;
		this.verModUserid = verModUserid;
		this.verModDate = verModDate;
		this.verUser1 = verUser1;
		this.verUser2 = verUser2;
		this.verUser3 = verUser3;
		this.verUser4 = verUser4;
		this.verQadc01 = verQadc01;
		this.verQadc02 = verQadc02;
		this.verQadc03 = verQadc03;
		this.verQadc04 = verQadc04;
		this.verQadd01 = verQadd01;
		this.verQadd02 = verQadd02;
		this.verQadl01 = verQadl01;
		this.verQadl02 = verQadl02;
		this.verQadt02 = verQadt02;
		this.verQadt01 = verQadt01;
		this.verQadi01 = verQadi01;
		this.verQadi02 = verQadi02;
		this.oidVerMstr = oidVerMstr;
	}

	// Property accessors

	public VerMstrId getId() {
		return this.id;
	}

	public void setId(VerMstrId id) {
		this.id = id;
	}

	public Boolean getVerActiveFlag() {
		return this.verActiveFlag;
	}

	public void setVerActiveFlag(Boolean verActiveFlag) {
		this.verActiveFlag = verActiveFlag;
	}

	public Date getVerStart() {
		return this.verStart;
	}

	public void setVerStart(Date verStart) {
		this.verStart = verStart;
	}

	public Date getVerEnd() {
		return this.verEnd;
	}

	public void setVerEnd(Date verEnd) {
		this.verEnd = verEnd;
	}

	public String getVerAsnLeadtime() {
		return this.verAsnLeadtime;
	}

	public void setVerAsnLeadtime(String verAsnLeadtime) {
		this.verAsnLeadtime = verAsnLeadtime;
	}

	public Integer getVerDaysEarly() {
		return this.verDaysEarly;
	}

	public void setVerDaysEarly(Integer verDaysEarly) {
		this.verDaysEarly = verDaysEarly;
	}

	public Integer getVerDaysLate() {
		return this.verDaysLate;
	}

	public void setVerDaysLate(Integer verDaysLate) {
		this.verDaysLate = verDaysLate;
	}

	public Boolean getVerUseShippct() {
		return this.verUseShippct;
	}

	public void setVerUseShippct(Boolean verUseShippct) {
		this.verUseShippct = verUseShippct;
	}

	public Double getVerOvershipPct() {
		return this.verOvershipPct;
	}

	public void setVerOvershipPct(Double verOvershipPct) {
		this.verOvershipPct = verOvershipPct;
	}

	public Double getVerUndershipPct() {
		return this.verUndershipPct;
	}

	public void setVerUndershipPct(Double verUndershipPct) {
		this.verUndershipPct = verUndershipPct;
	}

	public Boolean getVerUseShipqty() {
		return this.verUseShipqty;
	}

	public void setVerUseShipqty(Boolean verUseShipqty) {
		this.verUseShipqty = verUseShipqty;
	}

	public Integer getVerOvershipQty() {
		return this.verOvershipQty;
	}

	public void setVerOvershipQty(Integer verOvershipQty) {
		this.verOvershipQty = verOvershipQty;
	}

	public Integer getVerUndershipQty() {
		return this.verUndershipQty;
	}

	public void setVerUndershipQty(Integer verUndershipQty) {
		this.verUndershipQty = verUndershipQty;
	}

	public Boolean getVerUseShippctCost() {
		return this.verUseShippctCost;
	}

	public void setVerUseShippctCost(Boolean verUseShippctCost) {
		this.verUseShippctCost = verUseShippctCost;
	}

	public Double getVerOvershipPctCost() {
		return this.verOvershipPctCost;
	}

	public void setVerOvershipPctCost(Double verOvershipPctCost) {
		this.verOvershipPctCost = verOvershipPctCost;
	}

	public Boolean getVerUseShipqtyCost() {
		return this.verUseShipqtyCost;
	}

	public void setVerUseShipqtyCost(Boolean verUseShipqtyCost) {
		this.verUseShipqtyCost = verUseShipqtyCost;
	}

	public Double getVerOvershipQtyCost() {
		return this.verOvershipQtyCost;
	}

	public void setVerOvershipQtyCost(Double verOvershipQtyCost) {
		this.verOvershipQtyCost = verOvershipQtyCost;
	}

	public String getVerContact() {
		return this.verContact;
	}

	public void setVerContact(String verContact) {
		this.verContact = verContact;
	}

	public String getVerEmailAddress() {
		return this.verEmailAddress;
	}

	public void setVerEmailAddress(String verEmailAddress) {
		this.verEmailAddress = verEmailAddress;
	}

	public String getVerModUserid() {
		return this.verModUserid;
	}

	public void setVerModUserid(String verModUserid) {
		this.verModUserid = verModUserid;
	}

	public Date getVerModDate() {
		return this.verModDate;
	}

	public void setVerModDate(Date verModDate) {
		this.verModDate = verModDate;
	}

	public String getVerUser1() {
		return this.verUser1;
	}

	public void setVerUser1(String verUser1) {
		this.verUser1 = verUser1;
	}

	public String getVerUser2() {
		return this.verUser2;
	}

	public void setVerUser2(String verUser2) {
		this.verUser2 = verUser2;
	}

	public String getVerUser3() {
		return this.verUser3;
	}

	public void setVerUser3(String verUser3) {
		this.verUser3 = verUser3;
	}

	public String getVerUser4() {
		return this.verUser4;
	}

	public void setVerUser4(String verUser4) {
		this.verUser4 = verUser4;
	}

	public String getVerQadc01() {
		return this.verQadc01;
	}

	public void setVerQadc01(String verQadc01) {
		this.verQadc01 = verQadc01;
	}

	public String getVerQadc02() {
		return this.verQadc02;
	}

	public void setVerQadc02(String verQadc02) {
		this.verQadc02 = verQadc02;
	}

	public String getVerQadc03() {
		return this.verQadc03;
	}

	public void setVerQadc03(String verQadc03) {
		this.verQadc03 = verQadc03;
	}

	public String getVerQadc04() {
		return this.verQadc04;
	}

	public void setVerQadc04(String verQadc04) {
		this.verQadc04 = verQadc04;
	}

	public Double getVerQadd01() {
		return this.verQadd01;
	}

	public void setVerQadd01(Double verQadd01) {
		this.verQadd01 = verQadd01;
	}

	public Double getVerQadd02() {
		return this.verQadd02;
	}

	public void setVerQadd02(Double verQadd02) {
		this.verQadd02 = verQadd02;
	}

	public Boolean getVerQadl01() {
		return this.verQadl01;
	}

	public void setVerQadl01(Boolean verQadl01) {
		this.verQadl01 = verQadl01;
	}

	public Boolean getVerQadl02() {
		return this.verQadl02;
	}

	public void setVerQadl02(Boolean verQadl02) {
		this.verQadl02 = verQadl02;
	}

	public Date getVerQadt02() {
		return this.verQadt02;
	}

	public void setVerQadt02(Date verQadt02) {
		this.verQadt02 = verQadt02;
	}

	public Date getVerQadt01() {
		return this.verQadt01;
	}

	public void setVerQadt01(Date verQadt01) {
		this.verQadt01 = verQadt01;
	}

	public Integer getVerQadi01() {
		return this.verQadi01;
	}

	public void setVerQadi01(Integer verQadi01) {
		this.verQadi01 = verQadi01;
	}

	public Integer getVerQadi02() {
		return this.verQadi02;
	}

	public void setVerQadi02(Integer verQadi02) {
		this.verQadi02 = verQadi02;
	}

	public Double getOidVerMstr() {
		return this.oidVerMstr;
	}

	public void setOidVerMstr(Double oidVerMstr) {
		this.oidVerMstr = oidVerMstr;
	}

}