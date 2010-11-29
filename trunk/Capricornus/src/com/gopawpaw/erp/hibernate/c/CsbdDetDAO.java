package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CsbdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CsbdDet
 * @author MyEclipse Persistence Tools
 */

public class CsbdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CsbdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CsbdDet transientInstance) {
		log.debug("saving CsbdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CsbdDet persistentInstance) {
		log.debug("deleting CsbdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CsbdDet findById(com.gopawpaw.erp.hibernate.c.CsbdDetId id) {
		log.debug("getting CsbdDet instance with id: " + id);
		try {
			CsbdDet instance = (CsbdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CsbdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CsbdDet instance) {
		log.debug("finding CsbdDet instance by example");
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
		log.debug("finding CsbdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CsbdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CsbdDet instances");
		try {
			String queryString = "from CsbdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CsbdDet merge(CsbdDet detachedInstance) {
		log.debug("merging CsbdDet instance");
		try {
			CsbdDet result = (CsbdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CsbdDet instance) {
		log.debug("attaching dirty CsbdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CsbdDet instance) {
		log.debug("attaching clean CsbdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CsbdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CsbdDetDAO) ctx.getBean("CsbdDetDAO");
	}
}