package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for RoDet
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RoDet
 * @author MyEclipse Persistence Tools
 */

public class RoDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RoDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RoDet transientInstance) {
		log.debug("saving RoDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RoDet persistentInstance) {
		log.debug("deleting RoDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RoDet findById(com.gopawpaw.erp.hibernate.r.RoDetId id) {
		log.debug("getting RoDet instance with id: " + id);
		try {
			RoDet instance = (RoDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RoDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RoDet instance) {
		log.debug("finding RoDet instance by example");
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
		log.debug("finding RoDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RoDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RoDet instances");
		try {
			String queryString = "from RoDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RoDet merge(RoDet detachedInstance) {
		log.debug("merging RoDet instance");
		try {
			RoDet result = (RoDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RoDet instance) {
		log.debug("attaching dirty RoDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RoDet instance) {
		log.debug("attaching clean RoDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RoDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RoDetDAO) ctx.getBean("RoDetDAO");
	}
}