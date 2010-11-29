package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WltMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WltMstr
 * @author MyEclipse Persistence Tools
 */

public class WltMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WltMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WltMstr transientInstance) {
		log.debug("saving WltMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WltMstr persistentInstance) {
		log.debug("deleting WltMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WltMstr findById(com.gopawpaw.erp.hibernate.w.WltMstrId id) {
		log.debug("getting WltMstr instance with id: " + id);
		try {
			WltMstr instance = (WltMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WltMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WltMstr instance) {
		log.debug("finding WltMstr instance by example");
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
		log.debug("finding WltMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WltMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WltMstr instances");
		try {
			String queryString = "from WltMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WltMstr merge(WltMstr detachedInstance) {
		log.debug("merging WltMstr instance");
		try {
			WltMstr result = (WltMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WltMstr instance) {
		log.debug("attaching dirty WltMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WltMstr instance) {
		log.debug("attaching clean WltMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WltMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WltMstrDAO) ctx.getBean("WltMstrDAO");
	}
}