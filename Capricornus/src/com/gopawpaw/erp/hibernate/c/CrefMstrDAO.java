package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CrefMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CrefMstr
 * @author MyEclipse Persistence Tools
 */

public class CrefMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CrefMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CrefMstr transientInstance) {
		log.debug("saving CrefMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CrefMstr persistentInstance) {
		log.debug("deleting CrefMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CrefMstr findById(com.gopawpaw.erp.hibernate.c.CrefMstrId id) {
		log.debug("getting CrefMstr instance with id: " + id);
		try {
			CrefMstr instance = (CrefMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CrefMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CrefMstr instance) {
		log.debug("finding CrefMstr instance by example");
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
		log.debug("finding CrefMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CrefMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CrefMstr instances");
		try {
			String queryString = "from CrefMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CrefMstr merge(CrefMstr detachedInstance) {
		log.debug("merging CrefMstr instance");
		try {
			CrefMstr result = (CrefMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CrefMstr instance) {
		log.debug("attaching dirty CrefMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CrefMstr instance) {
		log.debug("attaching clean CrefMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CrefMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CrefMstrDAO) ctx.getBean("CrefMstrDAO");
	}
}