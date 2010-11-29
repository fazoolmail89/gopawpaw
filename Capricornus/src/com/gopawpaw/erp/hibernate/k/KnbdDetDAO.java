package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnbdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnbdDet
 * @author MyEclipse Persistence Tools
 */

public class KnbdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnbdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnbdDet transientInstance) {
		log.debug("saving KnbdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnbdDet persistentInstance) {
		log.debug("deleting KnbdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnbdDet findById(com.gopawpaw.erp.hibernate.k.KnbdDetId id) {
		log.debug("getting KnbdDet instance with id: " + id);
		try {
			KnbdDet instance = (KnbdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnbdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnbdDet instance) {
		log.debug("finding KnbdDet instance by example");
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
		log.debug("finding KnbdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnbdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnbdDet instances");
		try {
			String queryString = "from KnbdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnbdDet merge(KnbdDet detachedInstance) {
		log.debug("merging KnbdDet instance");
		try {
			KnbdDet result = (KnbdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnbdDet instance) {
		log.debug("attaching dirty KnbdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnbdDet instance) {
		log.debug("attaching clean KnbdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnbdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnbdDetDAO) ctx.getBean("KnbdDetDAO");
	}
}