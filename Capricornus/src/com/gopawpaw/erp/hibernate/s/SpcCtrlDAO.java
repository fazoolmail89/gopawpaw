package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SpcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SpcCtrl
 * @author MyEclipse Persistence Tools
 */

public class SpcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SpcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SpcCtrl transientInstance) {
		log.debug("saving SpcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SpcCtrl persistentInstance) {
		log.debug("deleting SpcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SpcCtrl findById(java.lang.String id) {
		log.debug("getting SpcCtrl instance with id: " + id);
		try {
			SpcCtrl instance = (SpcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SpcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SpcCtrl instance) {
		log.debug("finding SpcCtrl instance by example");
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
		log.debug("finding SpcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SpcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SpcCtrl instances");
		try {
			String queryString = "from SpcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SpcCtrl merge(SpcCtrl detachedInstance) {
		log.debug("merging SpcCtrl instance");
		try {
			SpcCtrl result = (SpcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SpcCtrl instance) {
		log.debug("attaching dirty SpcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SpcCtrl instance) {
		log.debug("attaching clean SpcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SpcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SpcCtrlDAO) ctx.getBean("SpcCtrlDAO");
	}
}