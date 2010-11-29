package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnbfdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnbfdDet
 * @author MyEclipse Persistence Tools
 */

public class KnbfdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnbfdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnbfdDet transientInstance) {
		log.debug("saving KnbfdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnbfdDet persistentInstance) {
		log.debug("deleting KnbfdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnbfdDet findById(com.gopawpaw.erp.hibernate.k.KnbfdDetId id) {
		log.debug("getting KnbfdDet instance with id: " + id);
		try {
			KnbfdDet instance = (KnbfdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnbfdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnbfdDet instance) {
		log.debug("finding KnbfdDet instance by example");
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
		log.debug("finding KnbfdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnbfdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnbfdDet instances");
		try {
			String queryString = "from KnbfdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnbfdDet merge(KnbfdDet detachedInstance) {
		log.debug("merging KnbfdDet instance");
		try {
			KnbfdDet result = (KnbfdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnbfdDet instance) {
		log.debug("attaching dirty KnbfdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnbfdDet instance) {
		log.debug("attaching clean KnbfdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnbfdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnbfdDetDAO) ctx.getBean("KnbfdDetDAO");
	}
}