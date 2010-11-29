package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CpMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CpMstr
 * @author MyEclipse Persistence Tools
 */

public class CpMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CpMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CpMstr transientInstance) {
		log.debug("saving CpMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CpMstr persistentInstance) {
		log.debug("deleting CpMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CpMstr findById(com.gopawpaw.erp.hibernate.c.CpMstrId id) {
		log.debug("getting CpMstr instance with id: " + id);
		try {
			CpMstr instance = (CpMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CpMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CpMstr instance) {
		log.debug("finding CpMstr instance by example");
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
		log.debug("finding CpMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CpMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CpMstr instances");
		try {
			String queryString = "from CpMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CpMstr merge(CpMstr detachedInstance) {
		log.debug("merging CpMstr instance");
		try {
			CpMstr result = (CpMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CpMstr instance) {
		log.debug("attaching dirty CpMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CpMstr instance) {
		log.debug("attaching clean CpMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CpMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CpMstrDAO) ctx.getBean("CpMstrDAO");
	}
}