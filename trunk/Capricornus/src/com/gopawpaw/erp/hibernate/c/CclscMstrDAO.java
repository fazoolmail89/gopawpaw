package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CclscMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CclscMstr
 * @author MyEclipse Persistence Tools
 */

public class CclscMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CclscMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CclscMstr transientInstance) {
		log.debug("saving CclscMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CclscMstr persistentInstance) {
		log.debug("deleting CclscMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CclscMstr findById(com.gopawpaw.erp.hibernate.c.CclscMstrId id) {
		log.debug("getting CclscMstr instance with id: " + id);
		try {
			CclscMstr instance = (CclscMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CclscMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CclscMstr instance) {
		log.debug("finding CclscMstr instance by example");
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
		log.debug("finding CclscMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CclscMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CclscMstr instances");
		try {
			String queryString = "from CclscMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CclscMstr merge(CclscMstr detachedInstance) {
		log.debug("merging CclscMstr instance");
		try {
			CclscMstr result = (CclscMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CclscMstr instance) {
		log.debug("attaching dirty CclscMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CclscMstr instance) {
		log.debug("attaching clean CclscMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CclscMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CclscMstrDAO) ctx.getBean("CclscMstrDAO");
	}
}