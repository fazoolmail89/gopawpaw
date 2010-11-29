package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrdfMtx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrdfMtx
 * @author MyEclipse Persistence Tools
 */

public class GrdfMtxDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrdfMtxDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrdfMtx transientInstance) {
		log.debug("saving GrdfMtx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrdfMtx persistentInstance) {
		log.debug("deleting GrdfMtx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrdfMtx findById(com.gopawpaw.erp.hibernate.g.GrdfMtxId id) {
		log.debug("getting GrdfMtx instance with id: " + id);
		try {
			GrdfMtx instance = (GrdfMtx) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrdfMtx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrdfMtx instance) {
		log.debug("finding GrdfMtx instance by example");
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
		log.debug("finding GrdfMtx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrdfMtx as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrdfMtx instances");
		try {
			String queryString = "from GrdfMtx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrdfMtx merge(GrdfMtx detachedInstance) {
		log.debug("merging GrdfMtx instance");
		try {
			GrdfMtx result = (GrdfMtx) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrdfMtx instance) {
		log.debug("attaching dirty GrdfMtx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrdfMtx instance) {
		log.debug("attaching clean GrdfMtx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrdfMtxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrdfMtxDAO) ctx.getBean("GrdfMtxDAO");
	}
}