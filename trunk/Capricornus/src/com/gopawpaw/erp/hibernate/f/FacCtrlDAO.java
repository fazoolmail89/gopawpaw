package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FacCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FacCtrl
 * @author MyEclipse Persistence Tools
 */

public class FacCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FacCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FacCtrl transientInstance) {
		log.debug("saving FacCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FacCtrl persistentInstance) {
		log.debug("deleting FacCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FacCtrl findById(java.lang.String id) {
		log.debug("getting FacCtrl instance with id: " + id);
		try {
			FacCtrl instance = (FacCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FacCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FacCtrl instance) {
		log.debug("finding FacCtrl instance by example");
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
		log.debug("finding FacCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FacCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FacCtrl instances");
		try {
			String queryString = "from FacCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FacCtrl merge(FacCtrl detachedInstance) {
		log.debug("merging FacCtrl instance");
		try {
			FacCtrl result = (FacCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FacCtrl instance) {
		log.debug("attaching dirty FacCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FacCtrl instance) {
		log.debug("attaching clean FacCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FacCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FacCtrlDAO) ctx.getBean("FacCtrlDAO");
	}
}