package com.gopawpaw.erp.hibernate.u;

/**
 * UsrwWkfl entity. @author MyEclipse Persistence Tools
 */
public class UsrwWkfl extends AbstractUsrwWkfl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UsrwWkfl() {
	}

	/** minimal constructor */
	public UsrwWkfl(UsrwWkflId id, Double oidUsrwWkfl) {
		super(id, oidUsrwWkfl);
	}

	/** full constructor */
	public UsrwWkfl(UsrwWkflId id, String usrwKey3, String usrwKey4,
			String usrwKey5, String usrwKey6, String usrwCharfld,
			String usrwDecfld, String usrwDatefld, String usrwUser1,
			String usrwUser2, String usrwQadc01, String usrwLogfld,
			String usrwIntfld, Double oidUsrwWkfl) {
		super(id, usrwKey3, usrwKey4, usrwKey5, usrwKey6, usrwCharfld,
				usrwDecfld, usrwDatefld, usrwUser1, usrwUser2, usrwQadc01,
				usrwLogfld, usrwIntfld, oidUsrwWkfl);
	}

}
