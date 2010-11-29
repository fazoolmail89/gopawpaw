package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FaclCal entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FaclCal
 * @author MyEclipse Persistence Tools
 */

public class FaclCalDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FaclCalDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FaclCal transientInstance) {
		log.debug("saving FaclCal instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FaclCal persistentInstance) {
		log.debug("deleting FaclCal instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FaclCal findById(com.gopawpaw.erp.hibernate.f.FaclCalId id) {
		log.debug("getting FaclCal instance with id: " + id);
		try {
			FaclCal instance = (FaclCal) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FaclCal", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FaclCal instance) {
		log.debug("finding FaclCal instance by example");
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
		log.debug("finding FaclCal instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FaclCal as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FaclCal instances");
		try {
			String queryString = "from FaclCal";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FaclCal merge(FaclCal detachedInstance) {
		log.debug("merging FaclCal instance");
		try {
			FaclCal result = (FaclCal) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FaclCal instance) {
		log.debug("attaching dirty FaclCal instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FaclCal instance) {
		log.debug("attaching clean FaclCal instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FaclCalDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FaclCalDAO) ctx.getBean("FaclCalDAO");
	}
}