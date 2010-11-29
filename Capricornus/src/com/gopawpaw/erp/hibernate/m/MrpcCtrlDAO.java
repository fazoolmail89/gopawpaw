package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MrpcCtrl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MrpcCtrl
 * @author MyEclipse Persistence Tools
 */

public class MrpcCtrlDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MrpcCtrlDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MrpcCtrl transientInstance) {
		log.debug("saving MrpcCtrl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MrpcCtrl persistentInstance) {
		log.debug("deleting MrpcCtrl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MrpcCtrl findById(java.lang.String id) {
		log.debug("getting MrpcCtrl instance with id: " + id);
		try {
			MrpcCtrl instance = (MrpcCtrl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MrpcCtrl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MrpcCtrl instance) {
		log.debug("finding MrpcCtrl instance by example");
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
		log.debug("finding MrpcCtrl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MrpcCtrl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MrpcCtrl instances");
		try {
			String queryString = "from MrpcCtrl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MrpcCtrl merge(MrpcCtrl detachedInstance) {
		log.debug("merging MrpcCtrl instance");
		try {
			MrpcCtrl result = (MrpcCtrl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MrpcCtrl instance) {
		log.debug("attaching dirty MrpcCtrl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MrpcCtrl instance) {
		log.debug("attaching clean MrpcCtrl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MrpcCtrlDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MrpcCtrlDAO) ctx.getBean("MrpcCtrlDAO");
	}
}