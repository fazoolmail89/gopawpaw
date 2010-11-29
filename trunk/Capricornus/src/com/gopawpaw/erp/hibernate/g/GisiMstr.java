package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GisiMstr entity. @author MyEclipse Persistence Tools
 */
public class GisiMstr extends AbstractGisiMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GisiMstr() {
	}

	/** full constructor */
	public GisiMstr(GisiMstrId id, Integer gisiRefKey, Date gisiModDate,
			String gisiModUserid, String gisiUser1, String gisiUser2,
			String gisiQadc01, String gisiQadc02, Double oidGisiMstr) {
		super(id, gisiRefKey, gisiModDate, gisiModUserid, gisiUser1, gisiUser2,
				gisiQadc01, gisiQadc02, oidGisiMstr);
	}

}
