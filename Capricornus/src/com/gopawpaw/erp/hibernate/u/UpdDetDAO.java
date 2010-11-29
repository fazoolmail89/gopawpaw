package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UpdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UpdDet
 * @author MyEclipse Persistence Tools
 */

public class UpdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UpdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UpdDet transientInstance) {
		log.debug("saving UpdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UpdDet persistentInstance) {
		log.debug("deleting UpdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UpdDet findById(com.gopawpaw.erp.hibernate.u.UpdDetId id) {
		log.debug("getting UpdDet instance with id: " + id);
		try {
			UpdDet instance = (UpdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UpdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UpdDet instance) {
		log.debug("finding UpdDet instance by example");
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
		log.debug("finding UpdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UpdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UpdDet instances");
		try {
			String queryString = "from UpdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UpdDet merge(UpdDet detachedInstance) {
		log.debug("merging UpdDet instance");
		try {
			UpdDet result = (UpdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UpdDet instance) {
		log.debug("attaching dirty UpdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UpdDet instance) {
		log.debug("attaching clean UpdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UpdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UpdDetDAO) ctx.getBean("UpdDetDAO");
	}
}