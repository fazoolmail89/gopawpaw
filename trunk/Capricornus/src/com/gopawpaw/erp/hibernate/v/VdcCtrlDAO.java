package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VdcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VdcCtrl
 * @author MyEclipse Persistence Tools
 */

public class VdcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VdcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VdcCtrl transientInstance) {
		log.debug("saving VdcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VdcCtrl persistentInstance) {
		log.debug("deleting VdcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VdcCtrl findById(java.lang.String id) {
		log.debug("getting VdcCtrl instance with id: " + id);
		try {
			VdcCtrl instance = (VdcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VdcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VdcCtrl instance) {
		log.debug("finding VdcCtrl instance by example");
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
		log.debug("finding VdcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VdcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VdcCtrl instances");
		try {
			String queryString = "from VdcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VdcCtrl merge(VdcCtrl detachedInstance) {
		log.debug("merging VdcCtrl instance");
		try {
			VdcCtrl result = (VdcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VdcCtrl instance) {
		log.debug("attaching dirty VdcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VdcCtrl instance) {
		log.debug("attaching clean VdcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VdcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VdcCtrlDAO) ctx.getBean("VdcCtrlDAO");
	}
}