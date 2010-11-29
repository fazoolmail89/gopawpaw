package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AtdMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AtdMstr
 * @author MyEclipse Persistence Tools
 */

public class AtdMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AtdMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AtdMstr transientInstance) {
		log.debug("saving AtdMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AtdMstr persistentInstance) {
		log.debug("deleting AtdMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AtdMstr findById(com.gopawpaw.erp.hibernate.a.AtdMstrId id) {
		log.debug("getting AtdMstr instance with id: " + id);
		try {
			AtdMstr instance = (AtdMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AtdMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AtdMstr instance) {
		log.debug("finding AtdMstr instance by example");
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
		log.debug("finding AtdMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AtdMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AtdMstr instances");
		try {
			String queryString = "from AtdMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AtdMstr merge(AtdMstr detachedInstance) {
		log.debug("merging AtdMstr instance");
		try {
			AtdMstr result = (AtdMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AtdMstr instance) {
		log.debug("attaching dirty AtdMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AtdMstr instance) {
		log.debug("attaching clean AtdMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AtdMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AtdMstrDAO) ctx.getBean("AtdMstrDAO");
	}
}