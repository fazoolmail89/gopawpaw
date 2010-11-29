package com.gopawpaw.erp.hibernate.t;

/**
 * TblMstrId entity. @author MyEclipse Persistence Tools
 */
public class TblMstrId extends AbstractTblMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TblMstrId() {
	}

	/** minimal constructor */
	public TblMstrId(String tblDomain, String tblComptype, String tblCompcode) {
		super(tblDomain, tblComptype, tblCompcode);
	}

	/** full constructor */
	public TblMstrId(String tblDomain, String tblPartype, String tblParcode,
			String tblComptype, String tblCompcode) {
		super(tblDomain, tblPartype, tblParcode, tblComptype, tblCompcode);
	}

}
