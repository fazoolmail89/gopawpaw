package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FlscdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FlscdDet
 * @author MyEclipse Persistence Tools
 */

public class FlscdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FlscdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FlscdDet transientInstance) {
		log.debug("saving FlscdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FlscdDet persistentInstance) {
		log.debug("deleting FlscdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FlscdDet findById(com.gopawpaw.erp.hibernate.f.FlscdDetId id) {
		log.debug("getting FlscdDet instance with id: " + id);
		try {
			FlscdDet instance = (FlscdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FlscdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FlscdDet instance) {
		log.debug("finding FlscdDet instance by example");
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
		log.debug("finding FlscdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FlscdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FlscdDet instances");
		try {
			String queryString = "from FlscdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FlscdDet merge(FlscdDet detachedInstance) {
		log.debug("merging FlscdDet instance");
		try {
			FlscdDet result = (FlscdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FlscdDet instance) {
		log.debug("attaching dirty FlscdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FlscdDet instance) {
		log.debug("attaching clean FlscdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FlscdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FlscdDetDAO) ctx.getBean("FlscdDetDAO");
	}
}