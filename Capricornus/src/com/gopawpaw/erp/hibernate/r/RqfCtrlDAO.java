package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqfCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqfCtrl
 * @author MyEclipse Persistence Tools
 */

public class RqfCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqfCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqfCtrl transientInstance) {
		log.debug("saving RqfCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqfCtrl persistentInstance) {
		log.debug("deleting RqfCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqfCtrl findById(java.lang.String id) {
		log.debug("getting RqfCtrl instance with id: " + id);
		try {
			RqfCtrl instance = (RqfCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqfCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqfCtrl instance) {
		log.debug("finding RqfCtrl instance by example");
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
		log.debug("finding RqfCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqfCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqfCtrl instances");
		try {
			String queryString = "from RqfCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqfCtrl merge(RqfCtrl detachedInstance) {
		log.debug("merging RqfCtrl instance");
		try {
			RqfCtrl result = (RqfCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqfCtrl instance) {
		log.debug("attaching dirty RqfCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqfCtrl instance) {
		log.debug("attaching clean RqfCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqfCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqfCtrlDAO) ctx.getBean("RqfCtrlDAO");
	}
}