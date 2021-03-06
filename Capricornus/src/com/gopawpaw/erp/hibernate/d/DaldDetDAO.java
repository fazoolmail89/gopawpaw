package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DaldDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DaldDet
 * @author MyEclipse Persistence Tools
 */

public class DaldDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DaldDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DaldDet transientInstance) {
		log.debug("saving DaldDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DaldDet persistentInstance) {
		log.debug("deleting DaldDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DaldDet findById(com.gopawpaw.erp.hibernate.d.DaldDetId id) {
		log.debug("getting DaldDet instance with id: " + id);
		try {
			DaldDet instance = (DaldDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DaldDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DaldDet instance) {
		log.debug("finding DaldDet instance by example");
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
		log.debug("finding DaldDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DaldDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DaldDet instances");
		try {
			String queryString = "from DaldDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DaldDet merge(DaldDet detachedInstance) {
		log.debug("merging DaldDet instance");
		try {
			DaldDet result = (DaldDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DaldDet instance) {
		log.debug("attaching dirty DaldDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DaldDet instance) {
		log.debug("attaching clean DaldDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DaldDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DaldDetDAO) ctx.getBean("DaldDetDAO");
	}
}