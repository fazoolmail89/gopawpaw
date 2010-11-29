package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AtgMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AtgMstr
 * @author MyEclipse Persistence Tools
 */

public class AtgMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AtgMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AtgMstr transientInstance) {
		log.debug("saving AtgMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AtgMstr persistentInstance) {
		log.debug("deleting AtgMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AtgMstr findById(com.gopawpaw.erp.hibernate.a.AtgMstrId id) {
		log.debug("getting AtgMstr instance with id: " + id);
		try {
			AtgMstr instance = (AtgMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AtgMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AtgMstr instance) {
		log.debug("finding AtgMstr instance by example");
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
		log.debug("finding AtgMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AtgMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AtgMstr instances");
		try {
			String queryString = "from AtgMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AtgMstr merge(AtgMstr detachedInstance) {
		log.debug("merging AtgMstr instance");
		try {
			AtgMstr result = (AtgMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AtgMstr instance) {
		log.debug("attaching dirty AtgMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AtgMstr instance) {
		log.debug("attaching clean AtgMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AtgMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AtgMstrDAO) ctx.getBean("AtgMstrDAO");
	}
}