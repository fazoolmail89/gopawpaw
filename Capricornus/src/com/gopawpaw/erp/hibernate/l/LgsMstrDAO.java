package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LgsMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LgsMstr
 * @author MyEclipse Persistence Tools
 */

public class LgsMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LgsMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LgsMstr transientInstance) {
		log.debug("saving LgsMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LgsMstr persistentInstance) {
		log.debug("deleting LgsMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LgsMstr findById(com.gopawpaw.erp.hibernate.l.LgsMstrId id) {
		log.debug("getting LgsMstr instance with id: " + id);
		try {
			LgsMstr instance = (LgsMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LgsMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LgsMstr instance) {
		log.debug("finding LgsMstr instance by example");
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
		log.debug("finding LgsMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LgsMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LgsMstr instances");
		try {
			String queryString = "from LgsMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LgsMstr merge(LgsMstr detachedInstance) {
		log.debug("merging LgsMstr instance");
		try {
			LgsMstr result = (LgsMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LgsMstr instance) {
		log.debug("attaching dirty LgsMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LgsMstr instance) {
		log.debug("attaching clean LgsMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LgsMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LgsMstrDAO) ctx.getBean("LgsMstrDAO");
	}
}