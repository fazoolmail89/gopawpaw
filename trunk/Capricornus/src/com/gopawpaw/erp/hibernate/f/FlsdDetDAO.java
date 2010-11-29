package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FlsdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FlsdDet
 * @author MyEclipse Persistence Tools
 */

public class FlsdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FlsdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FlsdDet transientInstance) {
		log.debug("saving FlsdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FlsdDet persistentInstance) {
		log.debug("deleting FlsdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FlsdDet findById(com.gopawpaw.erp.hibernate.f.FlsdDetId id) {
		log.debug("getting FlsdDet instance with id: " + id);
		try {
			FlsdDet instance = (FlsdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FlsdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FlsdDet instance) {
		log.debug("finding FlsdDet instance by example");
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
		log.debug("finding FlsdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FlsdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FlsdDet instances");
		try {
			String queryString = "from FlsdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FlsdDet merge(FlsdDet detachedInstance) {
		log.debug("merging FlsdDet instance");
		try {
			FlsdDet result = (FlsdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FlsdDet instance) {
		log.debug("attaching dirty FlsdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FlsdDet instance) {
		log.debug("attaching clean FlsdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FlsdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FlsdDetDAO) ctx.getBean("FlsdDetDAO");
	}
}