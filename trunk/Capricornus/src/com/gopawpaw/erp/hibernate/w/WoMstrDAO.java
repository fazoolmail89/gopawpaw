package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WoMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WoMstr
 * @author MyEclipse Persistence Tools
 */

public class WoMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WoMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WoMstr transientInstance) {
		log.debug("saving WoMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WoMstr persistentInstance) {
		log.debug("deleting WoMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WoMstr findById(com.gopawpaw.erp.hibernate.w.WoMstrId id) {
		log.debug("getting WoMstr instance with id: " + id);
		try {
			WoMstr instance = (WoMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WoMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WoMstr instance) {
		log.debug("finding WoMstr instance by example");
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
		log.debug("finding WoMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WoMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WoMstr instances");
		try {
			String queryString = "from WoMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WoMstr merge(WoMstr detachedInstance) {
		log.debug("merging WoMstr instance");
		try {
			WoMstr result = (WoMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WoMstr instance) {
		log.debug("attaching dirty WoMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WoMstr instance) {
		log.debug("attaching clean WoMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WoMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WoMstrDAO) ctx.getBean("WoMstrDAO");
	}
}