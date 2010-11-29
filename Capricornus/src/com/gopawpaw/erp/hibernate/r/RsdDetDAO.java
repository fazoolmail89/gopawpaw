package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RsdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RsdDet
 * @author MyEclipse Persistence Tools
 */

public class RsdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RsdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RsdDet transientInstance) {
		log.debug("saving RsdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RsdDet persistentInstance) {
		log.debug("deleting RsdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RsdDet findById(com.gopawpaw.erp.hibernate.r.RsdDetId id) {
		log.debug("getting RsdDet instance with id: " + id);
		try {
			RsdDet instance = (RsdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RsdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RsdDet instance) {
		log.debug("finding RsdDet instance by example");
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
		log.debug("finding RsdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RsdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RsdDet instances");
		try {
			String queryString = "from RsdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RsdDet merge(RsdDet detachedInstance) {
		log.debug("merging RsdDet instance");
		try {
			RsdDet result = (RsdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RsdDet instance) {
		log.debug("attaching dirty RsdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RsdDet instance) {
		log.debug("attaching clean RsdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RsdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RsdDetDAO) ctx.getBean("RsdDetDAO");
	}
}