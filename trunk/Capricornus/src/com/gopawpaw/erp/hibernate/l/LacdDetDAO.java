package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LacdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LacdDet
 * @author MyEclipse Persistence Tools
 */

public class LacdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LacdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LacdDet transientInstance) {
		log.debug("saving LacdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LacdDet persistentInstance) {
		log.debug("deleting LacdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LacdDet findById(com.gopawpaw.erp.hibernate.l.LacdDetId id) {
		log.debug("getting LacdDet instance with id: " + id);
		try {
			LacdDet instance = (LacdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LacdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LacdDet instance) {
		log.debug("finding LacdDet instance by example");
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
		log.debug("finding LacdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LacdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LacdDet instances");
		try {
			String queryString = "from LacdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LacdDet merge(LacdDet detachedInstance) {
		log.debug("merging LacdDet instance");
		try {
			LacdDet result = (LacdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LacdDet instance) {
		log.debug("attaching dirty LacdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LacdDet instance) {
		log.debug("attaching clean LacdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LacdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LacdDetDAO) ctx.getBean("LacdDetDAO");
	}
}