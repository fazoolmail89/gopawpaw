package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CkMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CkMstr
 * @author MyEclipse Persistence Tools
 */

public class CkMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CkMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CkMstr transientInstance) {
		log.debug("saving CkMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CkMstr persistentInstance) {
		log.debug("deleting CkMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CkMstr findById(com.gopawpaw.erp.hibernate.c.CkMstrId id) {
		log.debug("getting CkMstr instance with id: " + id);
		try {
			CkMstr instance = (CkMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CkMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CkMstr instance) {
		log.debug("finding CkMstr instance by example");
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
		log.debug("finding CkMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CkMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CkMstr instances");
		try {
			String queryString = "from CkMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CkMstr merge(CkMstr detachedInstance) {
		log.debug("merging CkMstr instance");
		try {
			CkMstr result = (CkMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CkMstr instance) {
		log.debug("attaching dirty CkMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CkMstr instance) {
		log.debug("attaching clean CkMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CkMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CkMstrDAO) ctx.getBean("CkMstrDAO");
	}
}