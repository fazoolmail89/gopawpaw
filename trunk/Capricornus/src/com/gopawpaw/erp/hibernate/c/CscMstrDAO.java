package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CscMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CscMstr
 * @author MyEclipse Persistence Tools
 */

public class CscMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CscMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CscMstr transientInstance) {
		log.debug("saving CscMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CscMstr persistentInstance) {
		log.debug("deleting CscMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CscMstr findById(com.gopawpaw.erp.hibernate.c.CscMstrId id) {
		log.debug("getting CscMstr instance with id: " + id);
		try {
			CscMstr instance = (CscMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CscMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CscMstr instance) {
		log.debug("finding CscMstr instance by example");
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
		log.debug("finding CscMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CscMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CscMstr instances");
		try {
			String queryString = "from CscMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CscMstr merge(CscMstr detachedInstance) {
		log.debug("merging CscMstr instance");
		try {
			CscMstr result = (CscMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CscMstr instance) {
		log.debug("attaching dirty CscMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CscMstr instance) {
		log.debug("attaching clean CscMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CscMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CscMstrDAO) ctx.getBean("CscMstrDAO");
	}
}