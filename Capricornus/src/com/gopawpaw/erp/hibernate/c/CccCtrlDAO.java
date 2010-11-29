package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CccCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CccCtrl
 * @author MyEclipse Persistence Tools
 */

public class CccCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CccCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CccCtrl transientInstance) {
		log.debug("saving CccCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CccCtrl persistentInstance) {
		log.debug("deleting CccCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CccCtrl findById(java.lang.String id) {
		log.debug("getting CccCtrl instance with id: " + id);
		try {
			CccCtrl instance = (CccCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CccCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CccCtrl instance) {
		log.debug("finding CccCtrl instance by example");
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
		log.debug("finding CccCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CccCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CccCtrl instances");
		try {
			String queryString = "from CccCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CccCtrl merge(CccCtrl detachedInstance) {
		log.debug("merging CccCtrl instance");
		try {
			CccCtrl result = (CccCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CccCtrl instance) {
		log.debug("attaching dirty CccCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CccCtrl instance) {
		log.debug("attaching clean CccCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CccCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CccCtrlDAO) ctx.getBean("CccCtrlDAO");
	}
}