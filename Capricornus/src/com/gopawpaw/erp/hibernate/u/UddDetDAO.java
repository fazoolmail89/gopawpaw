package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UddDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UddDet
 * @author MyEclipse Persistence Tools
 */

public class UddDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UddDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UddDet transientInstance) {
		log.debug("saving UddDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UddDet persistentInstance) {
		log.debug("deleting UddDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UddDet findById(com.gopawpaw.erp.hibernate.u.UddDetId id) {
		log.debug("getting UddDet instance with id: " + id);
		try {
			UddDet instance = (UddDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UddDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UddDet instance) {
		log.debug("finding UddDet instance by example");
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
		log.debug("finding UddDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UddDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UddDet instances");
		try {
			String queryString = "from UddDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UddDet merge(UddDet detachedInstance) {
		log.debug("merging UddDet instance");
		try {
			UddDet result = (UddDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UddDet instance) {
		log.debug("attaching dirty UddDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UddDet instance) {
		log.debug("attaching clean UddDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UddDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UddDetDAO) ctx.getBean("UddDetDAO");
	}
}