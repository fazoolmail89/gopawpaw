package com.gopawpaw.erp.hibernate.l;

/**
 * LotwWkfl entity. @author MyEclipse Persistence Tools
 */
public class LotwWkfl extends AbstractLotwWkfl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LotwWkfl() {
	}

	/** minimal constructor */
	public LotwWkfl(LotwWkflId id, Double oidLotwWkfl) {
		super(id, oidLotwWkfl);
	}

	/** full constructor */
	public LotwWkfl(LotwWkflId id, String lotwMfguser, String lotwUserid,
			String lotwUser1, String lotwUser2, String lotwQadc01,
			Double oidLotwWkfl) {
		super(id, lotwMfguser, lotwUserid, lotwUser1, lotwUser2, lotwQadc01,
				oidLotwWkfl);
	}

}
