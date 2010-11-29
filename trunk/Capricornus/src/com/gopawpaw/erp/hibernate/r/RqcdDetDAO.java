package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqcdDet
 * @author MyEclipse Persistence Tools
 */

public class RqcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqcdDet transientInstance) {
		log.debug("saving RqcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqcdDet persistentInstance) {
		log.debug("deleting RqcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqcdDet findById(com.gopawpaw.erp.hibernate.r.RqcdDetId id) {
		log.debug("getting RqcdDet instance with id: " + id);
		try {
			RqcdDet instance = (RqcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqcdDet instance) {
		log.debug("finding RqcdDet instance by example");
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
		log.debug("finding RqcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqcdDet instances");
		try {
			String queryString = "from RqcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqcdDet merge(RqcdDet detachedInstance) {
		log.debug("merging RqcdDet instance");
		try {
			RqcdDet result = (RqcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqcdDet instance) {
		log.debug("attaching dirty RqcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqcdDet instance) {
		log.debug("attaching clean RqcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqcdDetDAO) ctx.getBean("RqcdDetDAO");
	}
}