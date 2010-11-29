package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TeMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TeMstr
 * @author MyEclipse Persistence Tools
 */

public class TeMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TeMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TeMstr transientInstance) {
		log.debug("saving TeMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TeMstr persistentInstance) {
		log.debug("deleting TeMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TeMstr findById(com.gopawpaw.erp.hibernate.t.TeMstrId id) {
		log.debug("getting TeMstr instance with id: " + id);
		try {
			TeMstr instance = (TeMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TeMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TeMstr instance) {
		log.debug("finding TeMstr instance by example");
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
		log.debug("finding TeMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TeMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TeMstr instances");
		try {
			String queryString = "from TeMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TeMstr merge(TeMstr detachedInstance) {
		log.debug("merging TeMstr instance");
		try {
			TeMstr result = (TeMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TeMstr instance) {
		log.debug("attaching dirty TeMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TeMstr instance) {
		log.debug("attaching clean TeMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TeMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TeMstrDAO) ctx.getBean("TeMstrDAO");
	}
}