package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for LdDet
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LdDet
 * @author MyEclipse Persistence Tools
 */

public class LdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LdDet transientInstance) {
		log.debug("saving LdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LdDet persistentInstance) {
		log.debug("deleting LdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LdDet findById(com.gopawpaw.erp.hibernate.l.LdDetId id) {
		log.debug("getting LdDet instance with id: " + id);
		try {
			LdDet instance = (LdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LdDet instance) {
		log.debug("finding LdDet instance by example");
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
		log.debug("finding LdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LdDet instances");
		try {
			String queryString = "from LdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LdDet merge(LdDet detachedInstance) {
		log.debug("merging LdDet instance");
		try {
			LdDet result = (LdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LdDet instance) {
		log.debug("attaching dirty LdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LdDet instance) {
		log.debug("attaching clean LdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LdDetDAO) ctx.getBean("LdDetDAO");
	}
}