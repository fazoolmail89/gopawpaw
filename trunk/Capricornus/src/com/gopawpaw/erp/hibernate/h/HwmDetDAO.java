package com.gopawpaw.erp.hibernate.h;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * HwmDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.h.HwmDet
 * @author MyEclipse Persistence Tools
 */

public class HwmDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(HwmDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(HwmDet transientInstance) {
		log.debug("saving HwmDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(HwmDet persistentInstance) {
		log.debug("deleting HwmDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HwmDet findById(com.gopawpaw.erp.hibernate.h.HwmDetId id) {
		log.debug("getting HwmDet instance with id: " + id);
		try {
			HwmDet instance = (HwmDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.h.HwmDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(HwmDet instance) {
		log.debug("finding HwmDet instance by example");
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
		log.debug("finding HwmDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from HwmDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all HwmDet instances");
		try {
			String queryString = "from HwmDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public HwmDet merge(HwmDet detachedInstance) {
		log.debug("merging HwmDet instance");
		try {
			HwmDet result = (HwmDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(HwmDet instance) {
		log.debug("attaching dirty HwmDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HwmDet instance) {
		log.debug("attaching clean HwmDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HwmDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HwmDetDAO) ctx.getBean("HwmDetDAO");
	}
}