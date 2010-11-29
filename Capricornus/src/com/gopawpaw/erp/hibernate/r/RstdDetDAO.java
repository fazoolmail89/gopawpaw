package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RstdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RstdDet
 * @author MyEclipse Persistence Tools
 */

public class RstdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RstdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RstdDet transientInstance) {
		log.debug("saving RstdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RstdDet persistentInstance) {
		log.debug("deleting RstdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RstdDet findById(com.gopawpaw.erp.hibernate.r.RstdDetId id) {
		log.debug("getting RstdDet instance with id: " + id);
		try {
			RstdDet instance = (RstdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RstdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RstdDet instance) {
		log.debug("finding RstdDet instance by example");
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
		log.debug("finding RstdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RstdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RstdDet instances");
		try {
			String queryString = "from RstdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RstdDet merge(RstdDet detachedInstance) {
		log.debug("merging RstdDet instance");
		try {
			RstdDet result = (RstdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RstdDet instance) {
		log.debug("attaching dirty RstdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RstdDet instance) {
		log.debug("attaching clean RstdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RstdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RstdDetDAO) ctx.getBean("RstdDetDAO");
	}
}