package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BkdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BkdDet
 * @author MyEclipse Persistence Tools
 */

public class BkdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BkdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BkdDet transientInstance) {
		log.debug("saving BkdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BkdDet persistentInstance) {
		log.debug("deleting BkdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BkdDet findById(com.gopawpaw.erp.hibernate.b.BkdDetId id) {
		log.debug("getting BkdDet instance with id: " + id);
		try {
			BkdDet instance = (BkdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BkdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BkdDet instance) {
		log.debug("finding BkdDet instance by example");
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
		log.debug("finding BkdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BkdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BkdDet instances");
		try {
			String queryString = "from BkdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BkdDet merge(BkdDet detachedInstance) {
		log.debug("merging BkdDet instance");
		try {
			BkdDet result = (BkdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BkdDet instance) {
		log.debug("attaching dirty BkdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BkdDet instance) {
		log.debug("attaching clean BkdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BkdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BkdDetDAO) ctx.getBean("BkdDetDAO");
	}
}