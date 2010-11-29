package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CncuMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CncuMstr
 * @author MyEclipse Persistence Tools
 */

public class CncuMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CncuMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CncuMstr transientInstance) {
		log.debug("saving CncuMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CncuMstr persistentInstance) {
		log.debug("deleting CncuMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CncuMstr findById(com.gopawpaw.erp.hibernate.c.CncuMstrId id) {
		log.debug("getting CncuMstr instance with id: " + id);
		try {
			CncuMstr instance = (CncuMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CncuMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CncuMstr instance) {
		log.debug("finding CncuMstr instance by example");
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
		log.debug("finding CncuMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CncuMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CncuMstr instances");
		try {
			String queryString = "from CncuMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CncuMstr merge(CncuMstr detachedInstance) {
		log.debug("merging CncuMstr instance");
		try {
			CncuMstr result = (CncuMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CncuMstr instance) {
		log.debug("attaching dirty CncuMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CncuMstr instance) {
		log.debug("attaching clean CncuMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CncuMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CncuMstrDAO) ctx.getBean("CncuMstrDAO");
	}
}