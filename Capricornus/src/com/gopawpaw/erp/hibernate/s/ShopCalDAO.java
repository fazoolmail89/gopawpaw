package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShopCal entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.ShopCal
 * @author MyEclipse Persistence Tools
 */

public class ShopCalDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ShopCalDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ShopCal transientInstance) {
		log.debug("saving ShopCal instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ShopCal persistentInstance) {
		log.debug("deleting ShopCal instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ShopCal findById(com.gopawpaw.erp.hibernate.s.ShopCalId id) {
		log.debug("getting ShopCal instance with id: " + id);
		try {
			ShopCal instance = (ShopCal) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.ShopCal", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ShopCal instance) {
		log.debug("finding ShopCal instance by example");
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
		log.debug("finding ShopCal instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ShopCal as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ShopCal instances");
		try {
			String queryString = "from ShopCal";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ShopCal merge(ShopCal detachedInstance) {
		log.debug("merging ShopCal instance");
		try {
			ShopCal result = (ShopCal) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ShopCal instance) {
		log.debug("attaching dirty ShopCal instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ShopCal instance) {
		log.debug("attaching clean ShopCal instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShopCalDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ShopCalDAO) ctx.getBean("ShopCalDAO");
	}
}