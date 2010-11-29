package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShftDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.ShftDet
 * @author MyEclipse Persistence Tools
 */

public class ShftDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ShftDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ShftDet transientInstance) {
		log.debug("saving ShftDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ShftDet persistentInstance) {
		log.debug("deleting ShftDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ShftDet findById(com.gopawpaw.erp.hibernate.s.ShftDetId id) {
		log.debug("getting ShftDet instance with id: " + id);
		try {
			ShftDet instance = (ShftDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.ShftDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ShftDet instance) {
		log.debug("finding ShftDet instance by example");
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
		log.debug("finding ShftDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ShftDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ShftDet instances");
		try {
			String queryString = "from ShftDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ShftDet merge(ShftDet detachedInstance) {
		log.debug("merging ShftDet instance");
		try {
			ShftDet result = (ShftDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ShftDet instance) {
		log.debug("attaching dirty ShftDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ShftDet instance) {
		log.debug("attaching clean ShftDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShftDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ShftDetDAO) ctx.getBean("ShftDetDAO");
	}
}