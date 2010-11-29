package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RmdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RmdDet
 * @author MyEclipse Persistence Tools
 */

public class RmdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RmdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RmdDet transientInstance) {
		log.debug("saving RmdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RmdDet persistentInstance) {
		log.debug("deleting RmdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RmdDet findById(com.gopawpaw.erp.hibernate.r.RmdDetId id) {
		log.debug("getting RmdDet instance with id: " + id);
		try {
			RmdDet instance = (RmdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RmdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RmdDet instance) {
		log.debug("finding RmdDet instance by example");
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
		log.debug("finding RmdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RmdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RmdDet instances");
		try {
			String queryString = "from RmdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RmdDet merge(RmdDet detachedInstance) {
		log.debug("merging RmdDet instance");
		try {
			RmdDet result = (RmdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RmdDet instance) {
		log.debug("attaching dirty RmdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RmdDet instance) {
		log.debug("attaching clean RmdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RmdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RmdDetDAO) ctx.getBean("RmdDetDAO");
	}
}