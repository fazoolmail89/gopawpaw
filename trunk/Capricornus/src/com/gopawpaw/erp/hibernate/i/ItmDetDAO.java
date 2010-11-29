package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ItmDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.ItmDet
 * @author MyEclipse Persistence Tools
 */

public class ItmDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ItmDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ItmDet transientInstance) {
		log.debug("saving ItmDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ItmDet persistentInstance) {
		log.debug("deleting ItmDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ItmDet findById(com.gopawpaw.erp.hibernate.i.ItmDetId id) {
		log.debug("getting ItmDet instance with id: " + id);
		try {
			ItmDet instance = (ItmDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.ItmDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ItmDet instance) {
		log.debug("finding ItmDet instance by example");
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
		log.debug("finding ItmDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ItmDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ItmDet instances");
		try {
			String queryString = "from ItmDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ItmDet merge(ItmDet detachedInstance) {
		log.debug("merging ItmDet instance");
		try {
			ItmDet result = (ItmDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ItmDet instance) {
		log.debug("attaching dirty ItmDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ItmDet instance) {
		log.debug("attaching clean ItmDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ItmDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ItmDetDAO) ctx.getBean("ItmDetDAO");
	}
}