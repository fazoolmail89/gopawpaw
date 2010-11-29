package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RcsxRef entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RcsxRef
 * @author MyEclipse Persistence Tools
 */

public class RcsxRefDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RcsxRefDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RcsxRef transientInstance) {
		log.debug("saving RcsxRef instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RcsxRef persistentInstance) {
		log.debug("deleting RcsxRef instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RcsxRef findById(com.gopawpaw.erp.hibernate.r.RcsxRefId id) {
		log.debug("getting RcsxRef instance with id: " + id);
		try {
			RcsxRef instance = (RcsxRef) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RcsxRef", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RcsxRef instance) {
		log.debug("finding RcsxRef instance by example");
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
		log.debug("finding RcsxRef instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RcsxRef as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RcsxRef instances");
		try {
			String queryString = "from RcsxRef";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RcsxRef merge(RcsxRef detachedInstance) {
		log.debug("merging RcsxRef instance");
		try {
			RcsxRef result = (RcsxRef) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RcsxRef instance) {
		log.debug("attaching dirty RcsxRef instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RcsxRef instance) {
		log.debug("attaching clean RcsxRef instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RcsxRefDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RcsxRefDAO) ctx.getBean("RcsxRefDAO");
	}
}