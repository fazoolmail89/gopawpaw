package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EtCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EtCtrl
 * @author MyEclipse Persistence Tools
 */

public class EtCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EtCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EtCtrl transientInstance) {
		log.debug("saving EtCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EtCtrl persistentInstance) {
		log.debug("deleting EtCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EtCtrl findById(java.lang.String id) {
		log.debug("getting EtCtrl instance with id: " + id);
		try {
			EtCtrl instance = (EtCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EtCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EtCtrl instance) {
		log.debug("finding EtCtrl instance by example");
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
		log.debug("finding EtCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EtCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EtCtrl instances");
		try {
			String queryString = "from EtCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EtCtrl merge(EtCtrl detachedInstance) {
		log.debug("merging EtCtrl instance");
		try {
			EtCtrl result = (EtCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EtCtrl instance) {
		log.debug("attaching dirty EtCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EtCtrl instance) {
		log.debug("attaching clean EtCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EtCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EtCtrlDAO) ctx.getBean("EtCtrlDAO");
	}
}