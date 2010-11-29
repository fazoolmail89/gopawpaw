package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqpoRef entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqpoRef
 * @author MyEclipse Persistence Tools
 */

public class RqpoRefDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqpoRefDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqpoRef transientInstance) {
		log.debug("saving RqpoRef instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqpoRef persistentInstance) {
		log.debug("deleting RqpoRef instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqpoRef findById(com.gopawpaw.erp.hibernate.r.RqpoRefId id) {
		log.debug("getting RqpoRef instance with id: " + id);
		try {
			RqpoRef instance = (RqpoRef) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqpoRef", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqpoRef instance) {
		log.debug("finding RqpoRef instance by example");
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
		log.debug("finding RqpoRef instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqpoRef as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqpoRef instances");
		try {
			String queryString = "from RqpoRef";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqpoRef merge(RqpoRef detachedInstance) {
		log.debug("merging RqpoRef instance");
		try {
			RqpoRef result = (RqpoRef) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqpoRef instance) {
		log.debug("attaching dirty RqpoRef instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqpoRef instance) {
		log.debug("attaching clean RqpoRef instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqpoRefDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqpoRefDAO) ctx.getBean("RqpoRefDAO");
	}
}