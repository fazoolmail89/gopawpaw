package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WlrdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WlrdDet
 * @author MyEclipse Persistence Tools
 */

public class WlrdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WlrdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WlrdDet transientInstance) {
		log.debug("saving WlrdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WlrdDet persistentInstance) {
		log.debug("deleting WlrdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WlrdDet findById(com.gopawpaw.erp.hibernate.w.WlrdDetId id) {
		log.debug("getting WlrdDet instance with id: " + id);
		try {
			WlrdDet instance = (WlrdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WlrdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WlrdDet instance) {
		log.debug("finding WlrdDet instance by example");
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
		log.debug("finding WlrdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WlrdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WlrdDet instances");
		try {
			String queryString = "from WlrdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WlrdDet merge(WlrdDet detachedInstance) {
		log.debug("merging WlrdDet instance");
		try {
			WlrdDet result = (WlrdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WlrdDet instance) {
		log.debug("attaching dirty WlrdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WlrdDet instance) {
		log.debug("attaching clean WlrdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WlrdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WlrdDetDAO) ctx.getBean("WlrdDetDAO");
	}
}