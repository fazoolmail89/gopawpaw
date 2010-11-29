package com.gopawpaw.erp.hibernate.e;

/**
 * EmpMstrId entity. @author MyEclipse Persistence Tools
 */
public class EmpMstrId extends AbstractEmpMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmpMstrId() {
	}

	/** full constructor */
	public EmpMstrId(String empDomain, String empAddr) {
		super(empDomain, empAddr);
	}

}
