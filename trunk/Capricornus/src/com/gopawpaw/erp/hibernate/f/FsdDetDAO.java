package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FsdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FsdDet
 * @author MyEclipse Persistence Tools
 */

public class FsdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FsdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FsdDet transientInstance) {
		log.debug("saving FsdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FsdDet persistentInstance) {
		log.debug("deleting FsdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FsdDet findById(com.gopawpaw.erp.hibernate.f.FsdDetId id) {
		log.debug("getting FsdDet instance with id: " + id);
		try {
			FsdDet instance = (FsdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FsdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FsdDet instance) {
		log.debug("finding FsdDet instance by example");
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
		log.debug("finding FsdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FsdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FsdDet instances");
		try {
			String queryString = "from FsdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FsdDet merge(FsdDet detachedInstance) {
		log.debug("merging FsdDet instance");
		try {
			FsdDet result = (FsdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FsdDet instance) {
		log.debug("attaching dirty FsdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FsdDet instance) {
		log.debug("attaching clean FsdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FsdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FsdDetDAO) ctx.getBean("FsdDetDAO");
	}
}