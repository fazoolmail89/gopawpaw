package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RsnRef entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RsnRef
 * @author MyEclipse Persistence Tools
 */

public class RsnRefDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RsnRefDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RsnRef transientInstance) {
		log.debug("saving RsnRef instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RsnRef persistentInstance) {
		log.debug("deleting RsnRef instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RsnRef findById(com.gopawpaw.erp.hibernate.r.RsnRefId id) {
		log.debug("getting RsnRef instance with id: " + id);
		try {
			RsnRef instance = (RsnRef) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RsnRef", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RsnRef instance) {
		log.debug("finding RsnRef instance by example");
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
		log.debug("finding RsnRef instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RsnRef as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RsnRef instances");
		try {
			String queryString = "from RsnRef";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RsnRef merge(RsnRef detachedInstance) {
		log.debug("merging RsnRef instance");
		try {
			RsnRef result = (RsnRef) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RsnRef instance) {
		log.debug("attaching dirty RsnRef instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RsnRef instance) {
		log.debug("attaching clean RsnRef instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RsnRefDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RsnRefDAO) ctx.getBean("RsnRefDAO");
	}
}