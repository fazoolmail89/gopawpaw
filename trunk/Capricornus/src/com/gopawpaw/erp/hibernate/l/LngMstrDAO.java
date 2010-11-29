package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LngMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LngMstr
 * @author MyEclipse Persistence Tools
 */

public class LngMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LngMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LngMstr transientInstance) {
		log.debug("saving LngMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LngMstr persistentInstance) {
		log.debug("deleting LngMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LngMstr findById(java.lang.String id) {
		log.debug("getting LngMstr instance with id: " + id);
		try {
			LngMstr instance = (LngMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LngMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LngMstr instance) {
		log.debug("finding LngMstr instance by example");
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
		log.debug("finding LngMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LngMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LngMstr instances");
		try {
			String queryString = "from LngMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LngMstr merge(LngMstr detachedInstance) {
		log.debug("merging LngMstr instance");
		try {
			LngMstr result = (LngMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LngMstr instance) {
		log.debug("attaching dirty LngMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LngMstr instance) {
		log.debug("attaching clean LngMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LngMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LngMstrDAO) ctx.getBean("LngMstrDAO");
	}
}