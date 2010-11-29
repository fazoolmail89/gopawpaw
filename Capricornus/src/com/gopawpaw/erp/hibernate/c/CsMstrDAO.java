package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CsMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CsMstr
 * @author MyEclipse Persistence Tools
 */

public class CsMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CsMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CsMstr transientInstance) {
		log.debug("saving CsMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CsMstr persistentInstance) {
		log.debug("deleting CsMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CsMstr findById(com.gopawpaw.erp.hibernate.c.CsMstrId id) {
		log.debug("getting CsMstr instance with id: " + id);
		try {
			CsMstr instance = (CsMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CsMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CsMstr instance) {
		log.debug("finding CsMstr instance by example");
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
		log.debug("finding CsMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CsMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CsMstr instances");
		try {
			String queryString = "from CsMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CsMstr merge(CsMstr detachedInstance) {
		log.debug("merging CsMstr instance");
		try {
			CsMstr result = (CsMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CsMstr instance) {
		log.debug("attaching dirty CsMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CsMstr instance) {
		log.debug("attaching clean CsMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CsMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CsMstrDAO) ctx.getBean("CsMstrDAO");
	}
}