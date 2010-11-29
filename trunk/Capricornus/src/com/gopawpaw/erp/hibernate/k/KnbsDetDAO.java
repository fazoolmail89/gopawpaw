package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnbsDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnbsDet
 * @author MyEclipse Persistence Tools
 */

public class KnbsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnbsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnbsDet transientInstance) {
		log.debug("saving KnbsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnbsDet persistentInstance) {
		log.debug("deleting KnbsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnbsDet findById(com.gopawpaw.erp.hibernate.k.KnbsDetId id) {
		log.debug("getting KnbsDet instance with id: " + id);
		try {
			KnbsDet instance = (KnbsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnbsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnbsDet instance) {
		log.debug("finding KnbsDet instance by example");
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
		log.debug("finding KnbsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnbsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnbsDet instances");
		try {
			String queryString = "from KnbsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnbsDet merge(KnbsDet detachedInstance) {
		log.debug("merging KnbsDet instance");
		try {
			KnbsDet result = (KnbsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnbsDet instance) {
		log.debug("attaching dirty KnbsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnbsDet instance) {
		log.debug("attaching clean KnbsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnbsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnbsDetDAO) ctx.getBean("KnbsDetDAO");
	}
}