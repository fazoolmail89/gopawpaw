package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WhlMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WhlMstr
 * @author MyEclipse Persistence Tools
 */

public class WhlMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WhlMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WhlMstr transientInstance) {
		log.debug("saving WhlMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WhlMstr persistentInstance) {
		log.debug("deleting WhlMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WhlMstr findById(com.gopawpaw.erp.hibernate.w.WhlMstrId id) {
		log.debug("getting WhlMstr instance with id: " + id);
		try {
			WhlMstr instance = (WhlMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WhlMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WhlMstr instance) {
		log.debug("finding WhlMstr instance by example");
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
		log.debug("finding WhlMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WhlMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WhlMstr instances");
		try {
			String queryString = "from WhlMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WhlMstr merge(WhlMstr detachedInstance) {
		log.debug("merging WhlMstr instance");
		try {
			WhlMstr result = (WhlMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WhlMstr instance) {
		log.debug("attaching dirty WhlMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WhlMstr instance) {
		log.debug("attaching clean WhlMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WhlMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WhlMstrDAO) ctx.getBean("WhlMstrDAO");
	}
}