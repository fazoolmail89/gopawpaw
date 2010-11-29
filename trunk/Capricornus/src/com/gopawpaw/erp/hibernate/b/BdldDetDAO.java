package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BdldDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BdldDet
 * @author MyEclipse Persistence Tools
 */

public class BdldDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BdldDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BdldDet transientInstance) {
		log.debug("saving BdldDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BdldDet persistentInstance) {
		log.debug("deleting BdldDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BdldDet findById(com.gopawpaw.erp.hibernate.b.BdldDetId id) {
		log.debug("getting BdldDet instance with id: " + id);
		try {
			BdldDet instance = (BdldDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BdldDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BdldDet instance) {
		log.debug("finding BdldDet instance by example");
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
		log.debug("finding BdldDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BdldDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BdldDet instances");
		try {
			String queryString = "from BdldDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BdldDet merge(BdldDet detachedInstance) {
		log.debug("merging BdldDet instance");
		try {
			BdldDet result = (BdldDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BdldDet instance) {
		log.debug("attaching dirty BdldDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BdldDet instance) {
		log.debug("attaching clean BdldDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BdldDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BdldDetDAO) ctx.getBean("BdldDetDAO");
	}
}