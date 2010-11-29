package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CkdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CkdDet
 * @author MyEclipse Persistence Tools
 */

public class CkdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CkdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CkdDet transientInstance) {
		log.debug("saving CkdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CkdDet persistentInstance) {
		log.debug("deleting CkdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CkdDet findById(com.gopawpaw.erp.hibernate.c.CkdDetId id) {
		log.debug("getting CkdDet instance with id: " + id);
		try {
			CkdDet instance = (CkdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CkdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CkdDet instance) {
		log.debug("finding CkdDet instance by example");
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
		log.debug("finding CkdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CkdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CkdDet instances");
		try {
			String queryString = "from CkdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CkdDet merge(CkdDet detachedInstance) {
		log.debug("merging CkdDet instance");
		try {
			CkdDet result = (CkdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CkdDet instance) {
		log.debug("attaching dirty CkdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CkdDet instance) {
		log.debug("attaching clean CkdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CkdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CkdDetDAO) ctx.getBean("CkdDetDAO");
	}
}