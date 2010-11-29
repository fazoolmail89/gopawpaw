package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShtrDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.ShtrDet
 * @author MyEclipse Persistence Tools
 */

public class ShtrDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ShtrDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ShtrDet transientInstance) {
		log.debug("saving ShtrDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ShtrDet persistentInstance) {
		log.debug("deleting ShtrDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ShtrDet findById(com.gopawpaw.erp.hibernate.s.ShtrDetId id) {
		log.debug("getting ShtrDet instance with id: " + id);
		try {
			ShtrDet instance = (ShtrDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.ShtrDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ShtrDet instance) {
		log.debug("finding ShtrDet instance by example");
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
		log.debug("finding ShtrDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ShtrDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ShtrDet instances");
		try {
			String queryString = "from ShtrDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ShtrDet merge(ShtrDet detachedInstance) {
		log.debug("merging ShtrDet instance");
		try {
			ShtrDet result = (ShtrDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ShtrDet instance) {
		log.debug("attaching dirty ShtrDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ShtrDet instance) {
		log.debug("attaching clean ShtrDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShtrDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ShtrDetDAO) ctx.getBean("ShtrDetDAO");
	}
}