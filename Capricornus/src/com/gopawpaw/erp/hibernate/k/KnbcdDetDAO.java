package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnbcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnbcdDet
 * @author MyEclipse Persistence Tools
 */

public class KnbcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnbcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnbcdDet transientInstance) {
		log.debug("saving KnbcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnbcdDet persistentInstance) {
		log.debug("deleting KnbcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnbcdDet findById(com.gopawpaw.erp.hibernate.k.KnbcdDetId id) {
		log.debug("getting KnbcdDet instance with id: " + id);
		try {
			KnbcdDet instance = (KnbcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnbcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnbcdDet instance) {
		log.debug("finding KnbcdDet instance by example");
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
		log.debug("finding KnbcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnbcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnbcdDet instances");
		try {
			String queryString = "from KnbcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnbcdDet merge(KnbcdDet detachedInstance) {
		log.debug("merging KnbcdDet instance");
		try {
			KnbcdDet result = (KnbcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnbcdDet instance) {
		log.debug("attaching dirty KnbcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnbcdDet instance) {
		log.debug("attaching clean KnbcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnbcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnbcdDetDAO) ctx.getBean("KnbcdDetDAO");
	}
}