package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WcMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WcMstr
 * @author MyEclipse Persistence Tools
 */

public class WcMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WcMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WcMstr transientInstance) {
		log.debug("saving WcMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WcMstr persistentInstance) {
		log.debug("deleting WcMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WcMstr findById(com.gopawpaw.erp.hibernate.w.WcMstrId id) {
		log.debug("getting WcMstr instance with id: " + id);
		try {
			WcMstr instance = (WcMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WcMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WcMstr instance) {
		log.debug("finding WcMstr instance by example");
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
		log.debug("finding WcMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WcMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WcMstr instances");
		try {
			String queryString = "from WcMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WcMstr merge(WcMstr detachedInstance) {
		log.debug("merging WcMstr instance");
		try {
			WcMstr result = (WcMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WcMstr instance) {
		log.debug("attaching dirty WcMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WcMstr instance) {
		log.debug("attaching clean WcMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WcMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WcMstrDAO) ctx.getBean("WcMstrDAO");
	}
}