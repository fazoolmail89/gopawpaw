package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CacCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CacCtrl
 * @author MyEclipse Persistence Tools
 */

public class CacCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CacCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CacCtrl transientInstance) {
		log.debug("saving CacCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CacCtrl persistentInstance) {
		log.debug("deleting CacCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CacCtrl findById(java.lang.String id) {
		log.debug("getting CacCtrl instance with id: " + id);
		try {
			CacCtrl instance = (CacCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CacCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CacCtrl instance) {
		log.debug("finding CacCtrl instance by example");
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
		log.debug("finding CacCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CacCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CacCtrl instances");
		try {
			String queryString = "from CacCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CacCtrl merge(CacCtrl detachedInstance) {
		log.debug("merging CacCtrl instance");
		try {
			CacCtrl result = (CacCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CacCtrl instance) {
		log.debug("attaching dirty CacCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CacCtrl instance) {
		log.debug("attaching clean CacCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CacCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CacCtrlDAO) ctx.getBean("CacCtrlDAO");
	}
}