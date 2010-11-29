package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UsrcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UsrcCtrl
 * @author MyEclipse Persistence Tools
 */

public class UsrcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UsrcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UsrcCtrl transientInstance) {
		log.debug("saving UsrcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UsrcCtrl persistentInstance) {
		log.debug("deleting UsrcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UsrcCtrl findById(java.lang.Integer id) {
		log.debug("getting UsrcCtrl instance with id: " + id);
		try {
			UsrcCtrl instance = (UsrcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UsrcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UsrcCtrl instance) {
		log.debug("finding UsrcCtrl instance by example");
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
		log.debug("finding UsrcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UsrcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UsrcCtrl instances");
		try {
			String queryString = "from UsrcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UsrcCtrl merge(UsrcCtrl detachedInstance) {
		log.debug("merging UsrcCtrl instance");
		try {
			UsrcCtrl result = (UsrcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UsrcCtrl instance) {
		log.debug("attaching dirty UsrcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UsrcCtrl instance) {
		log.debug("attaching clean UsrcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UsrcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsrcCtrlDAO) ctx.getBean("UsrcCtrlDAO");
	}
}