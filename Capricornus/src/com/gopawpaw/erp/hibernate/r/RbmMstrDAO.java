package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RbmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RbmMstr
 * @author MyEclipse Persistence Tools
 */

public class RbmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RbmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RbmMstr transientInstance) {
		log.debug("saving RbmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RbmMstr persistentInstance) {
		log.debug("deleting RbmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RbmMstr findById(com.gopawpaw.erp.hibernate.r.RbmMstrId id) {
		log.debug("getting RbmMstr instance with id: " + id);
		try {
			RbmMstr instance = (RbmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RbmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RbmMstr instance) {
		log.debug("finding RbmMstr instance by example");
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
		log.debug("finding RbmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RbmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RbmMstr instances");
		try {
			String queryString = "from RbmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RbmMstr merge(RbmMstr detachedInstance) {
		log.debug("merging RbmMstr instance");
		try {
			RbmMstr result = (RbmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RbmMstr instance) {
		log.debug("attaching dirty RbmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RbmMstr instance) {
		log.debug("attaching clean RbmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RbmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RbmMstrDAO) ctx.getBean("RbmMstrDAO");
	}
}