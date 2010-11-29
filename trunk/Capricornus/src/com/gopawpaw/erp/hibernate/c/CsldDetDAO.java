package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CsldDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CsldDet
 * @author MyEclipse Persistence Tools
 */

public class CsldDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CsldDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CsldDet transientInstance) {
		log.debug("saving CsldDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CsldDet persistentInstance) {
		log.debug("deleting CsldDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CsldDet findById(com.gopawpaw.erp.hibernate.c.CsldDetId id) {
		log.debug("getting CsldDet instance with id: " + id);
		try {
			CsldDet instance = (CsldDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CsldDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CsldDet instance) {
		log.debug("finding CsldDet instance by example");
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
		log.debug("finding CsldDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CsldDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CsldDet instances");
		try {
			String queryString = "from CsldDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CsldDet merge(CsldDet detachedInstance) {
		log.debug("merging CsldDet instance");
		try {
			CsldDet result = (CsldDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CsldDet instance) {
		log.debug("attaching dirty CsldDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CsldDet instance) {
		log.debug("attaching clean CsldDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CsldDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CsldDetDAO) ctx.getBean("CsldDetDAO");
	}
}