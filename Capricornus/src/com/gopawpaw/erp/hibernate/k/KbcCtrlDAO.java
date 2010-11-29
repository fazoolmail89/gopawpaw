package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KbcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KbcCtrl
 * @author MyEclipse Persistence Tools
 */

public class KbcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KbcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KbcCtrl transientInstance) {
		log.debug("saving KbcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KbcCtrl persistentInstance) {
		log.debug("deleting KbcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KbcCtrl findById(java.lang.String id) {
		log.debug("getting KbcCtrl instance with id: " + id);
		try {
			KbcCtrl instance = (KbcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KbcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KbcCtrl instance) {
		log.debug("finding KbcCtrl instance by example");
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
		log.debug("finding KbcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KbcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KbcCtrl instances");
		try {
			String queryString = "from KbcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KbcCtrl merge(KbcCtrl detachedInstance) {
		log.debug("merging KbcCtrl instance");
		try {
			KbcCtrl result = (KbcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KbcCtrl instance) {
		log.debug("attaching dirty KbcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KbcCtrl instance) {
		log.debug("attaching clean KbcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KbcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KbcCtrlDAO) ctx.getBean("KbcCtrlDAO");
	}
}