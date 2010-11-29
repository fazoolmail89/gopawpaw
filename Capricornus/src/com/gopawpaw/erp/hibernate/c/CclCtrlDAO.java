package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CclCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CclCtrl
 * @author MyEclipse Persistence Tools
 */

public class CclCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CclCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CclCtrl transientInstance) {
		log.debug("saving CclCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CclCtrl persistentInstance) {
		log.debug("deleting CclCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CclCtrl findById(java.lang.String id) {
		log.debug("getting CclCtrl instance with id: " + id);
		try {
			CclCtrl instance = (CclCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CclCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CclCtrl instance) {
		log.debug("finding CclCtrl instance by example");
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
		log.debug("finding CclCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CclCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CclCtrl instances");
		try {
			String queryString = "from CclCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CclCtrl merge(CclCtrl detachedInstance) {
		log.debug("merging CclCtrl instance");
		try {
			CclCtrl result = (CclCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CclCtrl instance) {
		log.debug("attaching dirty CclCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CclCtrl instance) {
		log.debug("attaching clean CclCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CclCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CclCtrlDAO) ctx.getBean("CclCtrlDAO");
	}
}