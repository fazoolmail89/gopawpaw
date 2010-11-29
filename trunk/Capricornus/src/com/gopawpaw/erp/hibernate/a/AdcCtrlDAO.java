package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AdcCtrl
 * @author MyEclipse Persistence Tools
 */

public class AdcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AdcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AdcCtrl transientInstance) {
		log.debug("saving AdcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AdcCtrl persistentInstance) {
		log.debug("deleting AdcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AdcCtrl findById(java.lang.String id) {
		log.debug("getting AdcCtrl instance with id: " + id);
		try {
			AdcCtrl instance = (AdcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AdcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AdcCtrl instance) {
		log.debug("finding AdcCtrl instance by example");
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
		log.debug("finding AdcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AdcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AdcCtrl instances");
		try {
			String queryString = "from AdcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AdcCtrl merge(AdcCtrl detachedInstance) {
		log.debug("merging AdcCtrl instance");
		try {
			AdcCtrl result = (AdcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AdcCtrl instance) {
		log.debug("attaching dirty AdcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AdcCtrl instance) {
		log.debug("attaching clean AdcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AdcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AdcCtrlDAO) ctx.getBean("AdcCtrlDAO");
	}
}