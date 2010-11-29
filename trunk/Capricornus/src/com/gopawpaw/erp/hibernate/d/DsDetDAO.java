package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for DsDet
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DsDet
 * @author MyEclipse Persistence Tools
 */

public class DsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DsDet transientInstance) {
		log.debug("saving DsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DsDet persistentInstance) {
		log.debug("deleting DsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DsDet findById(com.gopawpaw.erp.hibernate.d.DsDetId id) {
		log.debug("getting DsDet instance with id: " + id);
		try {
			DsDet instance = (DsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DsDet instance) {
		log.debug("finding DsDet instance by example");
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
		log.debug("finding DsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DsDet instances");
		try {
			String queryString = "from DsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DsDet merge(DsDet detachedInstance) {
		log.debug("merging DsDet instance");
		try {
			DsDet result = (DsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DsDet instance) {
		log.debug("attaching dirty DsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DsDet instance) {
		log.debug("attaching clean DsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DsDetDAO) ctx.getBean("DsDetDAO");
	}
}