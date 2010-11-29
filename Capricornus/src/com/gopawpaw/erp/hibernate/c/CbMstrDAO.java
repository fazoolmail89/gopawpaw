package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CbMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CbMstr
 * @author MyEclipse Persistence Tools
 */

public class CbMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CbMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CbMstr transientInstance) {
		log.debug("saving CbMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CbMstr persistentInstance) {
		log.debug("deleting CbMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CbMstr findById(com.gopawpaw.erp.hibernate.c.CbMstrId id) {
		log.debug("getting CbMstr instance with id: " + id);
		try {
			CbMstr instance = (CbMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CbMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CbMstr instance) {
		log.debug("finding CbMstr instance by example");
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
		log.debug("finding CbMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CbMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CbMstr instances");
		try {
			String queryString = "from CbMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CbMstr merge(CbMstr detachedInstance) {
		log.debug("merging CbMstr instance");
		try {
			CbMstr result = (CbMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CbMstr instance) {
		log.debug("attaching dirty CbMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CbMstr instance) {
		log.debug("attaching clean CbMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CbMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CbMstrDAO) ctx.getBean("CbMstrDAO");
	}
}