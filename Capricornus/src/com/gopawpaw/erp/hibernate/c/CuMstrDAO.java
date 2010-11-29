package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CuMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CuMstr
 * @author MyEclipse Persistence Tools
 */

public class CuMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CuMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CuMstr transientInstance) {
		log.debug("saving CuMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CuMstr persistentInstance) {
		log.debug("deleting CuMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CuMstr findById(java.lang.String id) {
		log.debug("getting CuMstr instance with id: " + id);
		try {
			CuMstr instance = (CuMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CuMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CuMstr instance) {
		log.debug("finding CuMstr instance by example");
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
		log.debug("finding CuMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CuMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CuMstr instances");
		try {
			String queryString = "from CuMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CuMstr merge(CuMstr detachedInstance) {
		log.debug("merging CuMstr instance");
		try {
			CuMstr result = (CuMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CuMstr instance) {
		log.debug("attaching dirty CuMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CuMstr instance) {
		log.debug("attaching clean CuMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CuMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CuMstrDAO) ctx.getBean("CuMstrDAO");
	}
}