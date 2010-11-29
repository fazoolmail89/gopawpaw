package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VefCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VefCtrl
 * @author MyEclipse Persistence Tools
 */

public class VefCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VefCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VefCtrl transientInstance) {
		log.debug("saving VefCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VefCtrl persistentInstance) {
		log.debug("deleting VefCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VefCtrl findById(java.lang.String id) {
		log.debug("getting VefCtrl instance with id: " + id);
		try {
			VefCtrl instance = (VefCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VefCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VefCtrl instance) {
		log.debug("finding VefCtrl instance by example");
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
		log.debug("finding VefCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VefCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VefCtrl instances");
		try {
			String queryString = "from VefCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VefCtrl merge(VefCtrl detachedInstance) {
		log.debug("merging VefCtrl instance");
		try {
			VefCtrl result = (VefCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VefCtrl instance) {
		log.debug("attaching dirty VefCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VefCtrl instance) {
		log.debug("attaching clean VefCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VefCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VefCtrlDAO) ctx.getBean("VefCtrlDAO");
	}
}