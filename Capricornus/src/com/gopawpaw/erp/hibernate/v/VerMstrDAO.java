package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VerMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VerMstr
 * @author MyEclipse Persistence Tools
 */

public class VerMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VerMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VerMstr transientInstance) {
		log.debug("saving VerMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VerMstr persistentInstance) {
		log.debug("deleting VerMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VerMstr findById(com.gopawpaw.erp.hibernate.v.VerMstrId id) {
		log.debug("getting VerMstr instance with id: " + id);
		try {
			VerMstr instance = (VerMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VerMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VerMstr instance) {
		log.debug("finding VerMstr instance by example");
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
		log.debug("finding VerMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VerMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VerMstr instances");
		try {
			String queryString = "from VerMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VerMstr merge(VerMstr detachedInstance) {
		log.debug("merging VerMstr instance");
		try {
			VerMstr result = (VerMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VerMstr instance) {
		log.debug("attaching dirty VerMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VerMstr instance) {
		log.debug("attaching clean VerMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VerMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VerMstrDAO) ctx.getBean("VerMstrDAO");
	}
}