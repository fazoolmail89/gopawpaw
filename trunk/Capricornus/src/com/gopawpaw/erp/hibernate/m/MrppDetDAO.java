package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MrppDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MrppDet
 * @author MyEclipse Persistence Tools
 */

public class MrppDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MrppDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MrppDet transientInstance) {
		log.debug("saving MrppDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MrppDet persistentInstance) {
		log.debug("deleting MrppDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MrppDet findById(com.gopawpaw.erp.hibernate.m.MrppDetId id) {
		log.debug("getting MrppDet instance with id: " + id);
		try {
			MrppDet instance = (MrppDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MrppDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MrppDet instance) {
		log.debug("finding MrppDet instance by example");
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
		log.debug("finding MrppDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MrppDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MrppDet instances");
		try {
			String queryString = "from MrppDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MrppDet merge(MrppDet detachedInstance) {
		log.debug("merging MrppDet instance");
		try {
			MrppDet result = (MrppDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MrppDet instance) {
		log.debug("attaching dirty MrppDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MrppDet instance) {
		log.debug("attaching clean MrppDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MrppDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MrppDetDAO) ctx.getBean("MrppDetDAO");
	}
}