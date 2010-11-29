package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GriMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GriMstr
 * @author MyEclipse Persistence Tools
 */

public class GriMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GriMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GriMstr transientInstance) {
		log.debug("saving GriMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GriMstr persistentInstance) {
		log.debug("deleting GriMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GriMstr findById(com.gopawpaw.erp.hibernate.g.GriMstrId id) {
		log.debug("getting GriMstr instance with id: " + id);
		try {
			GriMstr instance = (GriMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GriMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GriMstr instance) {
		log.debug("finding GriMstr instance by example");
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
		log.debug("finding GriMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GriMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GriMstr instances");
		try {
			String queryString = "from GriMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GriMstr merge(GriMstr detachedInstance) {
		log.debug("merging GriMstr instance");
		try {
			GriMstr result = (GriMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GriMstr instance) {
		log.debug("attaching dirty GriMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GriMstr instance) {
		log.debug("attaching clean GriMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GriMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GriMstrDAO) ctx.getBean("GriMstrDAO");
	}
}