package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrcsDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TrcsDet
 * @author MyEclipse Persistence Tools
 */

public class TrcsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TrcsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TrcsDet transientInstance) {
		log.debug("saving TrcsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrcsDet persistentInstance) {
		log.debug("deleting TrcsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrcsDet findById(com.gopawpaw.erp.hibernate.t.TrcsDetId id) {
		log.debug("getting TrcsDet instance with id: " + id);
		try {
			TrcsDet instance = (TrcsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TrcsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TrcsDet instance) {
		log.debug("finding TrcsDet instance by example");
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
		log.debug("finding TrcsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TrcsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TrcsDet instances");
		try {
			String queryString = "from TrcsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TrcsDet merge(TrcsDet detachedInstance) {
		log.debug("merging TrcsDet instance");
		try {
			TrcsDet result = (TrcsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrcsDet instance) {
		log.debug("attaching dirty TrcsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrcsDet instance) {
		log.debug("attaching clean TrcsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TrcsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TrcsDetDAO) ctx.getBean("TrcsDetDAO");
	}
}