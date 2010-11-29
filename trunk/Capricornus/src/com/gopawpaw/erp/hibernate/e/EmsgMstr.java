package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EmsgMstr entity. @author MyEclipse Persistence Tools
 */
public class EmsgMstr extends AbstractEmsgMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmsgMstr() {
	}

	/** minimal constructor */
	public EmsgMstr(EmsgMstrId id, Double oidEmsgMstr) {
		super(id, oidEmsgMstr);
	}

	/** full constructor */
	public EmsgMstr(EmsgMstrId id, String emsgEngCode, String emsgAction,
			Date emsgActDate, String emsgDesc, Integer emsgCmtindx,
			Date emsgDate, String emsgTime, String emsgEntered,
			String emsgUser1, String emsgUser2, String emsgActTime,
			Boolean emsgComplete, Date emsgFileDate1, Date emsgFileDate2,
			String emsgFileName, String emsgFileNbr1, String emsgFileNbr2,
			String emsgFileNbr3, String emsgFileNbr4, Integer emsgFileTrnbr,
			String emsgMsgType, String emsgNameDate1, String emsgNameDate2,
			String emsgNameNbr1, String emsgNameNbr2, String emsgNameNbr3,
			String emsgNameNbr4, Boolean emsgRead, String emsgUserid,
			String emsgQadc01, Double oidEmsgMstr) {
		super(id, emsgEngCode, emsgAction, emsgActDate, emsgDesc, emsgCmtindx,
				emsgDate, emsgTime, emsgEntered, emsgUser1, emsgUser2,
				emsgActTime, emsgComplete, emsgFileDate1, emsgFileDate2,
				emsgFileName, emsgFileNbr1, emsgFileNbr2, emsgFileNbr3,
				emsgFileNbr4, emsgFileTrnbr, emsgMsgType, emsgNameDate1,
				emsgNameDate2, emsgNameNbr1, emsgNameNbr2, emsgNameNbr3,
				emsgNameNbr4, emsgRead, emsgUserid, emsgQadc01, oidEmsgMstr);
	}

}
