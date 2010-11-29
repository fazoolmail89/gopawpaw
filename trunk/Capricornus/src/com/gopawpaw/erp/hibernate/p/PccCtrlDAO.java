package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PccCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PccCtrl
 * @author MyEclipse Persistence Tools
 */

public class PccCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PccCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PccCtrl transientInstance) {
		log.debug("saving PccCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PccCtrl persistentInstance) {
		log.debug("deleting PccCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PccCtrl findById(java.lang.String id) {
		log.debug("getting PccCtrl instance with id: " + id);
		try {
			PccCtrl instance = (PccCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PccCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PccCtrl instance) {
		log.debug("finding PccCtrl instance by example");
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
		log.debug("finding PccCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PccCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PccCtrl instances");
		try {
			String queryString = "from PccCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PccCtrl merge(PccCtrl detachedInstance) {
		log.debug("merging PccCtrl instance");
		try {
			PccCtrl result = (PccCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PccCtrl instance) {
		log.debug("attaching dirty PccCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PccCtrl instance) {
		log.debug("attaching clean PccCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PccCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PccCtrlDAO) ctx.getBean("PccCtrlDAO");
	}
}