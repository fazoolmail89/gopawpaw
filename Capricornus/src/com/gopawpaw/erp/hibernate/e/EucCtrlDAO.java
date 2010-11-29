package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EucCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EucCtrl
 * @author MyEclipse Persistence Tools
 */

public class EucCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EucCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EucCtrl transientInstance) {
		log.debug("saving EucCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EucCtrl persistentInstance) {
		log.debug("deleting EucCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EucCtrl findById(java.lang.String id) {
		log.debug("getting EucCtrl instance with id: " + id);
		try {
			EucCtrl instance = (EucCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EucCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EucCtrl instance) {
		log.debug("finding EucCtrl instance by example");
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
		log.debug("finding EucCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EucCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EucCtrl instances");
		try {
			String queryString = "from EucCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EucCtrl merge(EucCtrl detachedInstance) {
		log.debug("merging EucCtrl instance");
		try {
			EucCtrl result = (EucCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EucCtrl instance) {
		log.debug("attaching dirty EucCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EucCtrl instance) {
		log.debug("attaching clean EucCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EucCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EucCtrlDAO) ctx.getBean("EucCtrlDAO");
	}
}