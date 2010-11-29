package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqmDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqmDet
 * @author MyEclipse Persistence Tools
 */

public class RqmDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqmDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqmDet transientInstance) {
		log.debug("saving RqmDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqmDet persistentInstance) {
		log.debug("deleting RqmDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqmDet findById(com.gopawpaw.erp.hibernate.r.RqmDetId id) {
		log.debug("getting RqmDet instance with id: " + id);
		try {
			RqmDet instance = (RqmDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqmDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqmDet instance) {
		log.debug("finding RqmDet instance by example");
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
		log.debug("finding RqmDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqmDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqmDet instances");
		try {
			String queryString = "from RqmDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqmDet merge(RqmDet detachedInstance) {
		log.debug("merging RqmDet instance");
		try {
			RqmDet result = (RqmDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqmDet instance) {
		log.debug("attaching dirty RqmDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqmDet instance) {
		log.debug("attaching clean RqmDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqmDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqmDetDAO) ctx.getBean("RqmDetDAO");
	}
}