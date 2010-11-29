package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CnsudDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CnsudDet
 * @author MyEclipse Persistence Tools
 */

public class CnsudDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CnsudDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CnsudDet transientInstance) {
		log.debug("saving CnsudDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CnsudDet persistentInstance) {
		log.debug("deleting CnsudDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CnsudDet findById(com.gopawpaw.erp.hibernate.c.CnsudDetId id) {
		log.debug("getting CnsudDet instance with id: " + id);
		try {
			CnsudDet instance = (CnsudDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CnsudDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CnsudDet instance) {
		log.debug("finding CnsudDet instance by example");
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
		log.debug("finding CnsudDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CnsudDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CnsudDet instances");
		try {
			String queryString = "from CnsudDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CnsudDet merge(CnsudDet detachedInstance) {
		log.debug("merging CnsudDet instance");
		try {
			CnsudDet result = (CnsudDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CnsudDet instance) {
		log.debug("attaching dirty CnsudDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CnsudDet instance) {
		log.debug("attaching clean CnsudDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CnsudDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CnsudDetDAO) ctx.getBean("CnsudDetDAO");
	}
}