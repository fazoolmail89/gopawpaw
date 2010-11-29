package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PtcDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PtcDet
 * @author MyEclipse Persistence Tools
 */

public class PtcDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PtcDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PtcDet transientInstance) {
		log.debug("saving PtcDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PtcDet persistentInstance) {
		log.debug("deleting PtcDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PtcDet findById(com.gopawpaw.erp.hibernate.p.PtcDetId id) {
		log.debug("getting PtcDet instance with id: " + id);
		try {
			PtcDet instance = (PtcDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PtcDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PtcDet instance) {
		log.debug("finding PtcDet instance by example");
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
		log.debug("finding PtcDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PtcDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PtcDet instances");
		try {
			String queryString = "from PtcDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PtcDet merge(PtcDet detachedInstance) {
		log.debug("merging PtcDet instance");
		try {
			PtcDet result = (PtcDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PtcDet instance) {
		log.debug("attaching dirty PtcDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PtcDet instance) {
		log.debug("attaching clean PtcDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PtcDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PtcDetDAO) ctx.getBean("PtcDetDAO");
	}
}