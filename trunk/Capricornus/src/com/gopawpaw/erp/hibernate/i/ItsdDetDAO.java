package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ItsdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.ItsdDet
 * @author MyEclipse Persistence Tools
 */

public class ItsdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ItsdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ItsdDet transientInstance) {
		log.debug("saving ItsdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ItsdDet persistentInstance) {
		log.debug("deleting ItsdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ItsdDet findById(com.gopawpaw.erp.hibernate.i.ItsdDetId id) {
		log.debug("getting ItsdDet instance with id: " + id);
		try {
			ItsdDet instance = (ItsdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.ItsdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ItsdDet instance) {
		log.debug("finding ItsdDet instance by example");
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
		log.debug("finding ItsdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ItsdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ItsdDet instances");
		try {
			String queryString = "from ItsdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ItsdDet merge(ItsdDet detachedInstance) {
		log.debug("merging ItsdDet instance");
		try {
			ItsdDet result = (ItsdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ItsdDet instance) {
		log.debug("attaching dirty ItsdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ItsdDet instance) {
		log.debug("attaching clean ItsdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ItsdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ItsdDetDAO) ctx.getBean("ItsdDetDAO");
	}
}