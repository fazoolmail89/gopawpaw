package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RsuMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RsuMstr
 * @author MyEclipse Persistence Tools
 */

public class RsuMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RsuMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RsuMstr transientInstance) {
		log.debug("saving RsuMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RsuMstr persistentInstance) {
		log.debug("deleting RsuMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RsuMstr findById(com.gopawpaw.erp.hibernate.r.RsuMstrId id) {
		log.debug("getting RsuMstr instance with id: " + id);
		try {
			RsuMstr instance = (RsuMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RsuMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RsuMstr instance) {
		log.debug("finding RsuMstr instance by example");
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
		log.debug("finding RsuMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RsuMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RsuMstr instances");
		try {
			String queryString = "from RsuMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RsuMstr merge(RsuMstr detachedInstance) {
		log.debug("merging RsuMstr instance");
		try {
			RsuMstr result = (RsuMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RsuMstr instance) {
		log.debug("attaching dirty RsuMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RsuMstr instance) {
		log.debug("attaching clean RsuMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RsuMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RsuMstrDAO) ctx.getBean("RsuMstrDAO");
	}
}