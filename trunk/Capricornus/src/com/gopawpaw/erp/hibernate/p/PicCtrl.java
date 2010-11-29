package com.gopawpaw.erp.hibernate.p;

/**
 * PicCtrl entity. @author MyEclipse Persistence Tools
 */
public class PicCtrl extends AbstractPicCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PicCtrl() {
	}

	/** minimal constructor */
	public PicCtrl(String picPromoPre, Double oidPicCtrl) {
		super(picPromoPre, oidPicCtrl);
	}

	/** full constructor */
	public PicCtrl(Integer picQadi01, Boolean picFsFact, Integer picFsRfact,
			Integer picPoRfact, Integer picQoRfact, Integer picListId,
			String picPoDate, String picQoDate, String picSoDate,
			String picFsDate, Boolean picPoFact, Boolean picQoFact,
			Boolean picSoFact, String picUser1, String picUser2,
			Integer picSoRfact, Boolean picItemRegen, Boolean picCustRegen,
			Boolean picSoLinpri, Boolean picFsLinpri, Boolean picPoLinpri,
			Boolean picQoLinpri, String picDiscComb, String picPromoPre,
			String picQadc01, Double oidPicCtrl) {
		super(picQadi01, picFsFact, picFsRfact, picPoRfact, picQoRfact,
				picListId, picPoDate, picQoDate, picSoDate, picFsDate,
				picPoFact, picQoFact, picSoFact, picUser1, picUser2,
				picSoRfact, picItemRegen, picCustRegen, picSoLinpri,
				picFsLinpri, picPoLinpri, picQoLinpri, picDiscComb,
				picPromoPre, picQadc01, oidPicCtrl);
	}

}
