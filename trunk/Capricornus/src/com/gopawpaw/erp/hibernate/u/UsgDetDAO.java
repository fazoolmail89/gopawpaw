package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UsgDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UsgDet
 * @author MyEclipse Persistence Tools
 */

public class UsgDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UsgDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UsgDet transientInstance) {
		log.debug("saving UsgDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UsgDet persistentInstance) {
		log.debug("deleting UsgDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UsgDet findById(com.gopawpaw.erp.hibernate.u.UsgDetId id) {
		log.debug("getting UsgDet instance with id: " + id);
		try {
			UsgDet instance = (UsgDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UsgDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UsgDet instance) {
		log.debug("finding UsgDet instance by example");
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
		log.debug("finding UsgDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UsgDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UsgDet instances");
		try {
			String queryString = "from UsgDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UsgDet merge(UsgDet detachedInstance) {
		log.debug("merging UsgDet instance");
		try {
			UsgDet result = (UsgDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UsgDet instance) {
		log.debug("attaching dirty UsgDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UsgDet instance) {
		log.debug("attaching clean UsgDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UsgDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsgDetDAO) ctx.getBean("UsgDetDAO");
	}
}