package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BkadDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BkadDet
 * @author MyEclipse Persistence Tools
 */

public class BkadDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BkadDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BkadDet transientInstance) {
		log.debug("saving BkadDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BkadDet persistentInstance) {
		log.debug("deleting BkadDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BkadDet findById(com.gopawpaw.erp.hibernate.b.BkadDetId id) {
		log.debug("getting BkadDet instance with id: " + id);
		try {
			BkadDet instance = (BkadDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BkadDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BkadDet instance) {
		log.debug("finding BkadDet instance by example");
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
		log.debug("finding BkadDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BkadDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BkadDet instances");
		try {
			String queryString = "from BkadDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BkadDet merge(BkadDet detachedInstance) {
		log.debug("merging BkadDet instance");
		try {
			BkadDet result = (BkadDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BkadDet instance) {
		log.debug("attaching dirty BkadDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BkadDet instance) {
		log.debug("attaching clean BkadDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BkadDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BkadDetDAO) ctx.getBean("BkadDetDAO");
	}
}