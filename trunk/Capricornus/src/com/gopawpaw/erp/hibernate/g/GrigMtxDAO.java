package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrigMtx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrigMtx
 * @author MyEclipse Persistence Tools
 */

public class GrigMtxDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrigMtxDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrigMtx transientInstance) {
		log.debug("saving GrigMtx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrigMtx persistentInstance) {
		log.debug("deleting GrigMtx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrigMtx findById(com.gopawpaw.erp.hibernate.g.GrigMtxId id) {
		log.debug("getting GrigMtx instance with id: " + id);
		try {
			GrigMtx instance = (GrigMtx) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrigMtx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrigMtx instance) {
		log.debug("finding GrigMtx instance by example");
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
		log.debug("finding GrigMtx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrigMtx as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrigMtx instances");
		try {
			String queryString = "from GrigMtx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrigMtx merge(GrigMtx detachedInstance) {
		log.debug("merging GrigMtx instance");
		try {
			GrigMtx result = (GrigMtx) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrigMtx instance) {
		log.debug("attaching dirty GrigMtx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrigMtx instance) {
		log.debug("attaching clean GrigMtx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrigMtxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrigMtxDAO) ctx.getBean("GrigMtxDAO");
	}
}