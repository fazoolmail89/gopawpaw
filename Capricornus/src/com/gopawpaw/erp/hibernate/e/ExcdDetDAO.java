package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ExcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.ExcdDet
 * @author MyEclipse Persistence Tools
 */

public class ExcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ExcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ExcdDet transientInstance) {
		log.debug("saving ExcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ExcdDet persistentInstance) {
		log.debug("deleting ExcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ExcdDet findById(com.gopawpaw.erp.hibernate.e.ExcdDetId id) {
		log.debug("getting ExcdDet instance with id: " + id);
		try {
			ExcdDet instance = (ExcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.ExcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ExcdDet instance) {
		log.debug("finding ExcdDet instance by example");
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
		log.debug("finding ExcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ExcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ExcdDet instances");
		try {
			String queryString = "from ExcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ExcdDet merge(ExcdDet detachedInstance) {
		log.debug("merging ExcdDet instance");
		try {
			ExcdDet result = (ExcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ExcdDet instance) {
		log.debug("attaching dirty ExcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ExcdDet instance) {
		log.debug("attaching clean ExcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ExcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ExcdDetDAO) ctx.getBean("ExcdDetDAO");
	}
}