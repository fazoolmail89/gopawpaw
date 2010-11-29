package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PocCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PocCtrl
 * @author MyEclipse Persistence Tools
 */

public class PocCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PocCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PocCtrl transientInstance) {
		log.debug("saving PocCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PocCtrl persistentInstance) {
		log.debug("deleting PocCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PocCtrl findById(java.lang.String id) {
		log.debug("getting PocCtrl instance with id: " + id);
		try {
			PocCtrl instance = (PocCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PocCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PocCtrl instance) {
		log.debug("finding PocCtrl instance by example");
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
		log.debug("finding PocCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PocCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PocCtrl instances");
		try {
			String queryString = "from PocCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PocCtrl merge(PocCtrl detachedInstance) {
		log.debug("merging PocCtrl instance");
		try {
			PocCtrl result = (PocCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PocCtrl instance) {
		log.debug("attaching dirty PocCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PocCtrl instance) {
		log.debug("attaching clean PocCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PocCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PocCtrlDAO) ctx.getBean("PocCtrlDAO");
	}
}