package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PtpDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PtpDet
 * @author MyEclipse Persistence Tools
 */

public class PtpDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PtpDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PtpDet transientInstance) {
		log.debug("saving PtpDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PtpDet persistentInstance) {
		log.debug("deleting PtpDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PtpDet findById(com.gopawpaw.erp.hibernate.p.PtpDetId id) {
		log.debug("getting PtpDet instance with id: " + id);
		try {
			PtpDet instance = (PtpDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PtpDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PtpDet instance) {
		log.debug("finding PtpDet instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PtpDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PtpDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PtpDet instances");
		try {
			String queryString = "from PtpDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PtpDet merge(PtpDet detachedInstance) {
		log.debug("merging PtpDet instance");
		try {
			PtpDet result = (PtpDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PtpDet instance) {
		log.debug("attaching dirty PtpDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PtpDet instance) {
		log.debug("attaching clean PtpDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PtpDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PtpDetDAO) ctx.getBean("PtpDetDAO");
	}
}