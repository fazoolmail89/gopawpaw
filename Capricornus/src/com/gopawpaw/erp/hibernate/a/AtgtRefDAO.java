package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AtgtRef entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AtgtRef
 * @author MyEclipse Persistence Tools
 */

public class AtgtRefDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AtgtRefDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AtgtRef transientInstance) {
		log.debug("saving AtgtRef instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AtgtRef persistentInstance) {
		log.debug("deleting AtgtRef instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AtgtRef findById(com.gopawpaw.erp.hibernate.a.AtgtRefId id) {
		log.debug("getting AtgtRef instance with id: " + id);
		try {
			AtgtRef instance = (AtgtRef) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AtgtRef", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AtgtRef instance) {
		log.debug("finding AtgtRef instance by example");
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
		log.debug("finding AtgtRef instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AtgtRef as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AtgtRef instances");
		try {
			String queryString = "from AtgtRef";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AtgtRef merge(AtgtRef detachedInstance) {
		log.debug("merging AtgtRef instance");
		try {
			AtgtRef result = (AtgtRef) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AtgtRef instance) {
		log.debug("attaching dirty AtgtRef instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AtgtRef instance) {
		log.debug("attaching clean AtgtRef instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AtgtRefDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AtgtRefDAO) ctx.getBean("AtgtRefDAO");
	}
}