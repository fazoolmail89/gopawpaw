package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * GrcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.GrcMstr
 * @author MyEclipse Persistence Tools
 */

public class GrcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(GrcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(GrcMstr transientInstance) {
		log.debug("saving GrcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GrcMstr persistentInstance) {
		log.debug("deleting GrcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GrcMstr findById(com.gopawpaw.erp.hibernate.g.GrcMstrId id) {
		log.debug("getting GrcMstr instance with id: " + id);
		try {
			GrcMstr instance = (GrcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.GrcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GrcMstr instance) {
		log.debug("finding GrcMstr instance by example");
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
		log.debug("finding GrcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GrcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GrcMstr instances");
		try {
			String queryString = "from GrcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GrcMstr merge(GrcMstr detachedInstance) {
		log.debug("merging GrcMstr instance");
		try {
			GrcMstr result = (GrcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GrcMstr instance) {
		log.debug("attaching dirty GrcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GrcMstr instance) {
		log.debug("attaching clean GrcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GrcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GrcMstrDAO) ctx.getBean("GrcMstrDAO");
	}
}