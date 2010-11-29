package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GrrMstr entity. @author MyEclipse Persistence Tools
 */
public class GrrMstr extends AbstractGrrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrrMstr() {
	}

	/** minimal constructor */
	public GrrMstr(GrrMstrId id, Double oidGrrMstr) {
		super(id, oidGrrMstr);
	}

	/** full constructor */
	public GrrMstr(GrrMstrId id, String grrDesc, Integer grrWidth,
			String grrAddId, Date grrAddDate, String grrModId, Date grrModDate,
			String grrGroup, Boolean grrStatus, Integer grrCmtindx,
			String grrUser1, String grrUser2, Boolean grrContPg,
			String grrBrkGl, String grrBrkAc, String grrQadc01,
			Double oidGrrMstr) {
		super(id, grrDesc, grrWidth, grrAddId, grrAddDate, grrModId,
				grrModDate, grrGroup, grrStatus, grrCmtindx, grrUser1,
				grrUser2, grrContPg, grrBrkGl, grrBrkAc, grrQadc01, oidGrrMstr);
	}

}
