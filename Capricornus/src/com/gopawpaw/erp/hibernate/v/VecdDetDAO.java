package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VecdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VecdDet
 * @author MyEclipse Persistence Tools
 */

public class VecdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VecdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VecdDet transientInstance) {
		log.debug("saving VecdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VecdDet persistentInstance) {
		log.debug("deleting VecdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VecdDet findById(com.gopawpaw.erp.hibernate.v.VecdDetId id) {
		log.debug("getting VecdDet instance with id: " + id);
		try {
			VecdDet instance = (VecdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VecdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VecdDet instance) {
		log.debug("finding VecdDet instance by example");
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
		log.debug("finding VecdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VecdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VecdDet instances");
		try {
			String queryString = "from VecdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VecdDet merge(VecdDet detachedInstance) {
		log.debug("merging VecdDet instance");
		try {
			VecdDet result = (VecdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VecdDet instance) {
		log.debug("attaching dirty VecdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VecdDet instance) {
		log.debug("attaching clean VecdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VecdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VecdDetDAO) ctx.getBean("VecdDetDAO");
	}
}