package com.gopawpaw.erp.hibernate.w;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * WtxMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.w.WtxMstr
 * @author MyEclipse Persistence Tools
 */

public class WtxMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WtxMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(WtxMstr transientInstance) {
		log.debug("saving WtxMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WtxMstr persistentInstance) {
		log.debug("deleting WtxMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WtxMstr findById(com.gopawpaw.erp.hibernate.w.WtxMstrId id) {
		log.debug("getting WtxMstr instance with id: " + id);
		try {
			WtxMstr instance = (WtxMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.w.WtxMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WtxMstr instance) {
		log.debug("finding WtxMstr instance by example");
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
		log.debug("finding WtxMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WtxMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all WtxMstr instances");
		try {
			String queryString = "from WtxMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WtxMstr merge(WtxMstr detachedInstance) {
		log.debug("merging WtxMstr instance");
		try {
			WtxMstr result = (WtxMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WtxMstr instance) {
		log.debug("attaching dirty WtxMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WtxMstr instance) {
		log.debug("attaching clean WtxMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WtxMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WtxMstrDAO) ctx.getBean("WtxMstrDAO");
	}
}