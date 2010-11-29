package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLotMstr entity provides the base persistence definition of the
 * LotMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLotMstr implements java.io.Serializable {

	// Fields

	private LotMstrId id;
	private String lotNbr;
	private String lotLine;
	private Date lotCreate;
	private String lotPotUm;
	private String lotUserid;
	private Date lotDte01;
	private Date lotDte02;
	private Date lotDte03;
	private Date lotDte04;
	private Date lotDte05;
	private Date lotDte06;
	private Double lotDec01;
	private Double lotDec02;
	private Double lotDec03;
	private Double lotDec04;
	private Double lotDec05;
	private Double lotDec06;
	private String lotChr01;
	private String lotChr02;
	private String lotChr03;
	private String lotChr04;
	private String lotChr05;
	private String lotChr06;
	private Integer lotCmtindx;
	private Double lotPotConv;
	private String lotTrans;
	private String lotUser1;
	private String lotUser2;
	private Double oidLotMstr;

	// Constructors

	/** default constructor */
	public AbstractLotMstr() {
	}

	/** minimal constructor */
	public AbstractLotMstr(LotMstrId id, Double oidLotMstr) {
		this.id = id;
		this.oidLotMstr = oidLotMstr;
	}

	/** full constructor */
	public AbstractLotMstr(LotMstrId id, String lotNbr, String lotLine,
			Date lotCreate, String lotPotUm, String lotUserid, Date lotDte01,
			Date lotDte02, Date lotDte03, Date lotDte04, Date lotDte05,
			Date lotDte06, Double lotDec01, Double lotDec02, Double lotDec03,
			Double lotDec04, Double lotDec05, Double lotDec06, String lotChr01,
			String lotChr02, String lotChr03, String lotChr04, String lotChr05,
			String lotChr06, Integer lotCmtindx, Double lotPotConv,
			String lotTrans, String lotUser1, String lotUser2, Double oidLotMstr) {
		this.id = id;
		this.lotNbr = lotNbr;
		this.lotLine = lotLine;
		this.lotCreate = lotCreate;
		this.lotPotUm = lotPotUm;
		this.lotUserid = lotUserid;
		this.lotDte01 = lotDte01;
		this.lotDte02 = lotDte02;
		this.lotDte03 = lotDte03;
		this.lotDte04 = lotDte04;
		this.lotDte05 = lotDte05;
		this.lotDte06 = lotDte06;
		this.lotDec01 = lotDec01;
		this.lotDec02 = lotDec02;
		this.lotDec03 = lotDec03;
		this.lotDec04 = lotDec04;
		this.lotDec05 = lotDec05;
		this.lotDec06 = lotDec06;
		this.lotChr01 = lotChr01;
		this.lotChr02 = lotChr02;
		this.lotChr03 = lotChr03;
		this.lotChr04 = lotChr04;
		this.lotChr05 = lotChr05;
		this.lotChr06 = lotChr06;
		this.lotCmtindx = lotCmtindx;
		this.lotPotConv = lotPotConv;
		this.lotTrans = lotTrans;
		this.lotUser1 = lotUser1;
		this.lotUser2 = lotUser2;
		this.oidLotMstr = oidLotMstr;
	}

	// Property accessors

	public LotMstrId getId() {
		return this.id;
	}

	public void setId(LotMstrId id) {
		this.id = id;
	}

	public String getLotNbr() {
		return this.lotNbr;
	}

	public void setLotNbr(String lotNbr) {
		this.lotNbr = lotNbr;
	}

	public String getLotLine() {
		return this.lotLine;
	}

	public void setLotLine(String lotLine) {
		this.lotLine = lotLine;
	}

	public Date getLotCreate() {
		return this.lotCreate;
	}

	public void setLotCreate(Date lotCreate) {
		this.lotCreate = lotCreate;
	}

	public String getLotPotUm() {
		return this.lotPotUm;
	}

	public void setLotPotUm(String lotPotUm) {
		this.lotPotUm = lotPotUm;
	}

	public String getLotUserid() {
		return this.lotUserid;
	}

	public void setLotUserid(String lotUserid) {
		this.lotUserid = lotUserid;
	}

	public Date getLotDte01() {
		return this.lotDte01;
	}

	public void setLotDte01(Date lotDte01) {
		this.lotDte01 = lotDte01;
	}

	public Date getLotDte02() {
		return this.lotDte02;
	}

	public void setLotDte02(Date lotDte02) {
		this.lotDte02 = lotDte02;
	}

	public Date getLotDte03() {
		return this.lotDte03;
	}

	public void setLotDte03(Date lotDte03) {
		this.lotDte03 = lotDte03;
	}

	public Date getLotDte04() {
		return this.lotDte04;
	}

	public void setLotDte04(Date lotDte04) {
		this.lotDte04 = lotDte04;
	}

	public Date getLotDte05() {
		return this.lotDte05;
	}

	public void setLotDte05(Date lotDte05) {
		this.lotDte05 = lotDte05;
	}

	public Date getLotDte06() {
		return this.lotDte06;
	}

	public void setLotDte06(Date lotDte06) {
		this.lotDte06 = lotDte06;
	}

	public Double getLotDec01() {
		return this.lotDec01;
	}

	public void setLotDec01(Double lotDec01) {
		this.lotDec01 = lotDec01;
	}

	public Double getLotDec02() {
		return this.lotDec02;
	}

	public void setLotDec02(Double lotDec02) {
		this.lotDec02 = lotDec02;
	}

	public Double getLotDec03() {
		return this.lotDec03;
	}

	public void setLotDec03(Double lotDec03) {
		this.lotDec03 = lotDec03;
	}

	public Double getLotDec04() {
		return this.lotDec04;
	}

	public void setLotDec04(Double lotDec04) {
		this.lotDec04 = lotDec04;
	}

	public Double getLotDec05() {
		return this.lotDec05;
	}

	public void setLotDec05(Double lotDec05) {
		this.lotDec05 = lotDec05;
	}

	public Double getLotDec06() {
		return this.lotDec06;
	}

	public void setLotDec06(Double lotDec06) {
		this.lotDec06 = lotDec06;
	}

	public String getLotChr01() {
		return this.lotChr01;
	}

	public void setLotChr01(String lotChr01) {
		this.lotChr01 = lotChr01;
	}

	public String getLotChr02() {
		return this.lotChr02;
	}

	public void setLotChr02(String lotChr02) {
		this.lotChr02 = lotChr02;
	}

	public String getLotChr03() {
		return this.lotChr03;
	}

	public void setLotChr03(String lotChr03) {
		this.lotChr03 = lotChr03;
	}

	public String getLotChr04() {
		return this.lotChr04;
	}

	public void setLotChr04(String lotChr04) {
		this.lotChr04 = lotChr04;
	}

	public String getLotChr05() {
		return this.lotChr05;
	}

	public void setLotChr05(String lotChr05) {
		this.lotChr05 = lotChr05;
	}

	public String getLotChr06() {
		return this.lotChr06;
	}

	public void setLotChr06(String lotChr06) {
		this.lotChr06 = lotChr06;
	}

	public Integer getLotCmtindx() {
		return this.lotCmtindx;
	}

	public void setLotCmtindx(Integer lotCmtindx) {
		this.lotCmtindx = lotCmtindx;
	}

	public Double getLotPotConv() {
		return this.lotPotConv;
	}

	public void setLotPotConv(Double lotPotConv) {
		this.lotPotConv = lotPotConv;
	}

	public String getLotTrans() {
		return this.lotTrans;
	}

	public void setLotTrans(String lotTrans) {
		this.lotTrans = lotTrans;
	}

	public String getLotUser1() {
		return this.lotUser1;
	}

	public void setLotUser1(String lotUser1) {
		this.lotUser1 = lotUser1;
	}

	public String getLotUser2() {
		return this.lotUser2;
	}

	public void setLotUser2(String lotUser2) {
		this.lotUser2 = lotUser2;
	}

	public Double getOidLotMstr() {
		return this.oidLotMstr;
	}

	public void setOidLotMstr(Double oidLotMstr) {
		this.oidLotMstr = oidLotMstr;
	}

}