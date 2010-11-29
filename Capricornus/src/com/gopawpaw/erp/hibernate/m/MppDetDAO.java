package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MppDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MppDet
 * @author MyEclipse Persistence Tools
 */

public class MppDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MppDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MppDet transientInstance) {
		log.debug("saving MppDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MppDet persistentInstance) {
		log.debug("deleting MppDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MppDet findById(com.gopawpaw.erp.hibernate.m.MppDetId id) {
		log.debug("getting MppDet instance with id: " + id);
		try {
			MppDet instance = (MppDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MppDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MppDet instance) {
		log.debug("finding MppDet instance by example");
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
		log.debug("finding MppDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MppDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MppDet instances");
		try {
			String queryString = "from MppDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MppDet merge(MppDet detachedInstance) {
		log.debug("merging MppDet instance");
		try {
			MppDet result = (MppDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MppDet instance) {
		log.debug("attaching dirty MppDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MppDet instance) {
		log.debug("attaching clean MppDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MppDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MppDetDAO) ctx.getBean("MppDetDAO");
	}
}