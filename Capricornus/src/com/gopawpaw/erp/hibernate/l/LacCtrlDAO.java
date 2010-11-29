package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LacCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LacCtrl
 * @author MyEclipse Persistence Tools
 */

public class LacCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LacCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LacCtrl transientInstance) {
		log.debug("saving LacCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LacCtrl persistentInstance) {
		log.debug("deleting LacCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LacCtrl findById(java.lang.String id) {
		log.debug("getting LacCtrl instance with id: " + id);
		try {
			LacCtrl instance = (LacCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LacCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LacCtrl instance) {
		log.debug("finding LacCtrl instance by example");
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
		log.debug("finding LacCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LacCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LacCtrl instances");
		try {
			String queryString = "from LacCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LacCtrl merge(LacCtrl detachedInstance) {
		log.debug("merging LacCtrl instance");
		try {
			LacCtrl result = (LacCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LacCtrl instance) {
		log.debug("attaching dirty LacCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LacCtrl instance) {
		log.debug("attaching clean LacCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LacCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LacCtrlDAO) ctx.getBean("LacCtrlDAO");
	}
}