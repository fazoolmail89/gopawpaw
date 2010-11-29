package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UfdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UfdDet
 * @author MyEclipse Persistence Tools
 */

public class UfdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UfdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UfdDet transientInstance) {
		log.debug("saving UfdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UfdDet persistentInstance) {
		log.debug("deleting UfdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UfdDet findById(com.gopawpaw.erp.hibernate.u.UfdDetId id) {
		log.debug("getting UfdDet instance with id: " + id);
		try {
			UfdDet instance = (UfdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UfdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UfdDet instance) {
		log.debug("finding UfdDet instance by example");
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
		log.debug("finding UfdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UfdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UfdDet instances");
		try {
			String queryString = "from UfdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UfdDet merge(UfdDet detachedInstance) {
		log.debug("merging UfdDet instance");
		try {
			UfdDet result = (UfdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UfdDet instance) {
		log.debug("attaching dirty UfdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UfdDet instance) {
		log.debug("attaching clean UfdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UfdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UfdDetDAO) ctx.getBean("UfdDetDAO");
	}
}