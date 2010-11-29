package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CaqMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CaqMstr
 * @author MyEclipse Persistence Tools
 */

public class CaqMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CaqMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CaqMstr transientInstance) {
		log.debug("saving CaqMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CaqMstr persistentInstance) {
		log.debug("deleting CaqMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CaqMstr findById(com.gopawpaw.erp.hibernate.c.CaqMstrId id) {
		log.debug("getting CaqMstr instance with id: " + id);
		try {
			CaqMstr instance = (CaqMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CaqMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CaqMstr instance) {
		log.debug("finding CaqMstr instance by example");
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
		log.debug("finding CaqMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CaqMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CaqMstr instances");
		try {
			String queryString = "from CaqMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CaqMstr merge(CaqMstr detachedInstance) {
		log.debug("merging CaqMstr instance");
		try {
			CaqMstr result = (CaqMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CaqMstr instance) {
		log.debug("attaching dirty CaqMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CaqMstr instance) {
		log.debug("attaching clean CaqMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CaqMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CaqMstrDAO) ctx.getBean("CaqMstrDAO");
	}
}