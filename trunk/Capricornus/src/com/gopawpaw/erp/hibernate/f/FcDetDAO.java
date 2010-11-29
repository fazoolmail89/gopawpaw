package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for FcDet
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FcDet
 * @author MyEclipse Persistence Tools
 */

public class FcDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FcDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FcDet transientInstance) {
		log.debug("saving FcDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FcDet persistentInstance) {
		log.debug("deleting FcDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FcDet findById(com.gopawpaw.erp.hibernate.f.FcDetId id) {
		log.debug("getting FcDet instance with id: " + id);
		try {
			FcDet instance = (FcDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FcDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FcDet instance) {
		log.debug("finding FcDet instance by example");
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
		log.debug("finding FcDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FcDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FcDet instances");
		try {
			String queryString = "from FcDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FcDet merge(FcDet detachedInstance) {
		log.debug("merging FcDet instance");
		try {
			FcDet result = (FcDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FcDet instance) {
		log.debug("attaching dirty FcDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FcDet instance) {
		log.debug("attaching clean FcDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FcDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FcDetDAO) ctx.getBean("FcDetDAO");
	}
}