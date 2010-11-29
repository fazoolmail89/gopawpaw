package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqdDet
 * @author MyEclipse Persistence Tools
 */

public class RqdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqdDet transientInstance) {
		log.debug("saving RqdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqdDet persistentInstance) {
		log.debug("deleting RqdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqdDet findById(com.gopawpaw.erp.hibernate.r.RqdDetId id) {
		log.debug("getting RqdDet instance with id: " + id);
		try {
			RqdDet instance = (RqdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqdDet instance) {
		log.debug("finding RqdDet instance by example");
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
		log.debug("finding RqdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqdDet instances");
		try {
			String queryString = "from RqdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqdDet merge(RqdDet detachedInstance) {
		log.debug("merging RqdDet instance");
		try {
			RqdDet result = (RqdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqdDet instance) {
		log.debug("attaching dirty RqdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqdDet instance) {
		log.debug("attaching clean RqdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqdDetDAO) ctx.getBean("RqdDetDAO");
	}
}