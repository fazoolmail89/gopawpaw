package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CtMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CtMstr
 * @author MyEclipse Persistence Tools
 */

public class CtMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CtMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CtMstr transientInstance) {
		log.debug("saving CtMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CtMstr persistentInstance) {
		log.debug("deleting CtMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CtMstr findById(com.gopawpaw.erp.hibernate.c.CtMstrId id) {
		log.debug("getting CtMstr instance with id: " + id);
		try {
			CtMstr instance = (CtMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CtMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CtMstr instance) {
		log.debug("finding CtMstr instance by example");
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
		log.debug("finding CtMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CtMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CtMstr instances");
		try {
			String queryString = "from CtMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CtMstr merge(CtMstr detachedInstance) {
		log.debug("merging CtMstr instance");
		try {
			CtMstr result = (CtMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CtMstr instance) {
		log.debug("attaching dirty CtMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CtMstr instance) {
		log.debug("attaching clean CtMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CtMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CtMstrDAO) ctx.getBean("CtMstrDAO");
	}
}