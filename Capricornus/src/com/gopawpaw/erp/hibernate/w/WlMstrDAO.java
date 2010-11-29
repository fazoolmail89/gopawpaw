package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WlMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WlMstr
 * @author MyEclipse Persistence Tools
 */

public class WlMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WlMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WlMstr transientInstance) {
		log.debug("saving WlMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WlMstr persistentInstance) {
		log.debug("deleting WlMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WlMstr findById(com.gopawpaw.erp.hibernate.w.WlMstrId id) {
		log.debug("getting WlMstr instance with id: " + id);
		try {
			WlMstr instance = (WlMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WlMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WlMstr instance) {
		log.debug("finding WlMstr instance by example");
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
		log.debug("finding WlMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WlMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WlMstr instances");
		try {
			String queryString = "from WlMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WlMstr merge(WlMstr detachedInstance) {
		log.debug("merging WlMstr instance");
		try {
			WlMstr result = (WlMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WlMstr instance) {
		log.debug("attaching dirty WlMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WlMstr instance) {
		log.debug("attaching clean WlMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WlMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WlMstrDAO) ctx.getBean("WlMstrDAO");
	}
}