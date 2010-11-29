package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ccd1Det entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.Ccd1Det
 * @author MyEclipse Persistence Tools
 */

public class Ccd1DetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Ccd1DetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Ccd1Det transientInstance) {
		log.debug("saving Ccd1Det instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ccd1Det persistentInstance) {
		log.debug("deleting Ccd1Det instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ccd1Det findById(com.gopawpaw.erp.hibernate.c.Ccd1DetId id) {
		log.debug("getting Ccd1Det instance with id: " + id);
		try {
			Ccd1Det instance = (Ccd1Det) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.Ccd1Det", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ccd1Det instance) {
		log.debug("finding Ccd1Det instance by example");
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
		log.debug("finding Ccd1Det instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ccd1Det as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Ccd1Det instances");
		try {
			String queryString = "from Ccd1Det";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ccd1Det merge(Ccd1Det detachedInstance) {
		log.debug("merging Ccd1Det instance");
		try {
			Ccd1Det result = (Ccd1Det) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ccd1Det instance) {
		log.debug("attaching dirty Ccd1Det instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ccd1Det instance) {
		log.debug("attaching clean Ccd1Det instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Ccd1DetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Ccd1DetDAO) ctx.getBean("Ccd1DetDAO");
	}
}