package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FactCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FactCtrl
 * @author MyEclipse Persistence Tools
 */

public class FactCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FactCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FactCtrl transientInstance) {
		log.debug("saving FactCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FactCtrl persistentInstance) {
		log.debug("deleting FactCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FactCtrl findById(java.lang.String id) {
		log.debug("getting FactCtrl instance with id: " + id);
		try {
			FactCtrl instance = (FactCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FactCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FactCtrl instance) {
		log.debug("finding FactCtrl instance by example");
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
		log.debug("finding FactCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FactCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FactCtrl instances");
		try {
			String queryString = "from FactCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FactCtrl merge(FactCtrl detachedInstance) {
		log.debug("merging FactCtrl instance");
		try {
			FactCtrl result = (FactCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FactCtrl instance) {
		log.debug("attaching dirty FactCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FactCtrl instance) {
		log.debug("attaching clean FactCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FactCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FactCtrlDAO) ctx.getBean("FactCtrlDAO");
	}
}