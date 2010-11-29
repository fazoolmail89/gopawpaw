package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WlrmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WlrmMstr
 * @author MyEclipse Persistence Tools
 */

public class WlrmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WlrmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WlrmMstr transientInstance) {
		log.debug("saving WlrmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WlrmMstr persistentInstance) {
		log.debug("deleting WlrmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WlrmMstr findById(com.gopawpaw.erp.hibernate.w.WlrmMstrId id) {
		log.debug("getting WlrmMstr instance with id: " + id);
		try {
			WlrmMstr instance = (WlrmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WlrmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WlrmMstr instance) {
		log.debug("finding WlrmMstr instance by example");
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
		log.debug("finding WlrmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WlrmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WlrmMstr instances");
		try {
			String queryString = "from WlrmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WlrmMstr merge(WlrmMstr detachedInstance) {
		log.debug("merging WlrmMstr instance");
		try {
			WlrmMstr result = (WlrmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WlrmMstr instance) {
		log.debug("attaching dirty WlrmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WlrmMstr instance) {
		log.debug("attaching clean WlrmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WlrmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WlrmMstrDAO) ctx.getBean("WlrmMstrDAO");
	}
}