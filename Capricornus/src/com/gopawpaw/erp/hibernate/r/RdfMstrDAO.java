package com.gopawpaw.erp.hibernate.r;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * RdfMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.r.RdfMstr
 * @author MyEclipse Persistence Tools
 */

public class RdfMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(RdfMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(RdfMstr transientInstance) {
		log.debug("saving RdfMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RdfMstr persistentInstance) {
		log.debug("deleting RdfMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RdfMstr findById(com.gopawpaw.erp.hibernate.r.RdfMstrId id) {
		log.debug("getting RdfMstr instance with id: " + id);
		try {
			RdfMstr instance = (RdfMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.r.RdfMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RdfMstr instance) {
		log.debug("finding RdfMstr instance by example");
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
		log.debug("finding RdfMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RdfMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RdfMstr instances");
		try {
			String queryString = "from RdfMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RdfMstr merge(RdfMstr detachedInstance) {
		log.debug("merging RdfMstr instance");
		try {
			RdfMstr result = (RdfMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RdfMstr instance) {
		log.debug("attaching dirty RdfMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RdfMstr instance) {
		log.debug("attaching clean RdfMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RdfMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RdfMstrDAO) ctx.getBean("RdfMstrDAO");
	}
}