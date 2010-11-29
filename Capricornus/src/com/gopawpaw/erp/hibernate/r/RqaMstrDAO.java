package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RqaMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RqaMstr
 * @author MyEclipse Persistence Tools
 */

public class RqaMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RqaMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RqaMstr transientInstance) {
		log.debug("saving RqaMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RqaMstr persistentInstance) {
		log.debug("deleting RqaMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RqaMstr findById(com.gopawpaw.erp.hibernate.r.RqaMstrId id) {
		log.debug("getting RqaMstr instance with id: " + id);
		try {
			RqaMstr instance = (RqaMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RqaMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RqaMstr instance) {
		log.debug("finding RqaMstr instance by example");
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
		log.debug("finding RqaMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RqaMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RqaMstr instances");
		try {
			String queryString = "from RqaMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RqaMstr merge(RqaMstr detachedInstance) {
		log.debug("merging RqaMstr instance");
		try {
			RqaMstr result = (RqaMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RqaMstr instance) {
		log.debug("attaching dirty RqaMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RqaMstr instance) {
		log.debug("attaching clean RqaMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RqaMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RqaMstrDAO) ctx.getBean("RqaMstrDAO");
	}
}