package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for CdDet
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CdDet
 * @author MyEclipse Persistence Tools
 */

public class CdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CdDet transientInstance) {
		log.debug("saving CdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CdDet persistentInstance) {
		log.debug("deleting CdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CdDet findById(com.gopawpaw.erp.hibernate.c.CdDetId id) {
		log.debug("getting CdDet instance with id: " + id);
		try {
			CdDet instance = (CdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CdDet instance) {
		log.debug("finding CdDet instance by example");
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
		log.debug("finding CdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CdDet instances");
		try {
			String queryString = "from CdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CdDet merge(CdDet detachedInstance) {
		log.debug("merging CdDet instance");
		try {
			CdDet result = (CdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CdDet instance) {
		log.debug("attaching dirty CdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CdDet instance) {
		log.debug("attaching clean CdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CdDetDAO) ctx.getBean("CdDetDAO");
	}
}