package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LotMstr entity. @author MyEclipse Persistence Tools
 */
public class LotMstr extends AbstractLotMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LotMstr() {
	}

	/** minimal constructor */
	public LotMstr(LotMstrId id, Double oidLotMstr) {
		super(id, oidLotMstr);
	}

	/** full constructor */
	public LotMstr(LotMstrId id, String lotNbr, String lotLine, Date lotCreate,
			String lotPotUm, String lotUserid, Date lotDte01, Date lotDte02,
			Date lotDte03, Date lotDte04, Date lotDte05, Date lotDte06,
			Double lotDec01, Double lotDec02, Double lotDec03, Double lotDec04,
			Double lotDec05, Double lotDec06, String lotChr01, String lotChr02,
			String lotChr03, String lotChr04, String lotChr05, String lotChr06,
			Integer lotCmtindx, Double lotPotConv, String lotTrans,
			String lotUser1, String lotUser2, Double oidLotMstr) {
		super(id, lotNbr, lotLine, lotCreate, lotPotUm, lotUserid, lotDte01,
				lotDte02, lotDte03, lotDte04, lotDte05, lotDte06, lotDec01,
				lotDec02, lotDec03, lotDec04, lotDec05, lotDec06, lotChr01,
				lotChr02, lotChr03, lotChr04, lotChr05, lotChr06, lotCmtindx,
				lotPotConv, lotTrans, lotUser1, lotUser2, oidLotMstr);
	}

}
