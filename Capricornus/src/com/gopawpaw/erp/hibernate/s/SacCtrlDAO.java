package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SacCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SacCtrl
 * @author MyEclipse Persistence Tools
 */

public class SacCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SacCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SacCtrl transientInstance) {
		log.debug("saving SacCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SacCtrl persistentInstance) {
		log.debug("deleting SacCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SacCtrl findById(java.lang.String id) {
		log.debug("getting SacCtrl instance with id: " + id);
		try {
			SacCtrl instance = (SacCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SacCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SacCtrl instance) {
		log.debug("finding SacCtrl instance by example");
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
		log.debug("finding SacCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SacCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SacCtrl instances");
		try {
			String queryString = "from SacCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SacCtrl merge(SacCtrl detachedInstance) {
		log.debug("merging SacCtrl instance");
		try {
			SacCtrl result = (SacCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SacCtrl instance) {
		log.debug("attaching dirty SacCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SacCtrl instance) {
		log.debug("attaching clean SacCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SacCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SacCtrlDAO) ctx.getBean("SacCtrlDAO");
	}
}