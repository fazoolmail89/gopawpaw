package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CksdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CksdDet
 * @author MyEclipse Persistence Tools
 */

public class CksdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CksdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CksdDet transientInstance) {
		log.debug("saving CksdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CksdDet persistentInstance) {
		log.debug("deleting CksdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CksdDet findById(com.gopawpaw.erp.hibernate.c.CksdDetId id) {
		log.debug("getting CksdDet instance with id: " + id);
		try {
			CksdDet instance = (CksdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CksdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CksdDet instance) {
		log.debug("finding CksdDet instance by example");
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
		log.debug("finding CksdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CksdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CksdDet instances");
		try {
			String queryString = "from CksdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CksdDet merge(CksdDet detachedInstance) {
		log.debug("merging CksdDet instance");
		try {
			CksdDet result = (CksdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CksdDet instance) {
		log.debug("attaching dirty CksdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CksdDet instance) {
		log.debug("attaching clean CksdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CksdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CksdDetDAO) ctx.getBean("CksdDetDAO");
	}
}