package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnbismDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnbismDet
 * @author MyEclipse Persistence Tools
 */

public class KnbismDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnbismDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnbismDet transientInstance) {
		log.debug("saving KnbismDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnbismDet persistentInstance) {
		log.debug("deleting KnbismDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnbismDet findById(com.gopawpaw.erp.hibernate.k.KnbismDetId id) {
		log.debug("getting KnbismDet instance with id: " + id);
		try {
			KnbismDet instance = (KnbismDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnbismDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnbismDet instance) {
		log.debug("finding KnbismDet instance by example");
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
		log.debug("finding KnbismDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnbismDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnbismDet instances");
		try {
			String queryString = "from KnbismDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnbismDet merge(KnbismDet detachedInstance) {
		log.debug("merging KnbismDet instance");
		try {
			KnbismDet result = (KnbismDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnbismDet instance) {
		log.debug("attaching dirty KnbismDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnbismDet instance) {
		log.debug("attaching clean KnbismDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnbismDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnbismDetDAO) ctx.getBean("KnbismDetDAO");
	}
}