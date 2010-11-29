package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrqMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TrqMstr
 * @author MyEclipse Persistence Tools
 */

public class TrqMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TrqMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TrqMstr transientInstance) {
		log.debug("saving TrqMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrqMstr persistentInstance) {
		log.debug("deleting TrqMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrqMstr findById(com.gopawpaw.erp.hibernate.t.TrqMstrId id) {
		log.debug("getting TrqMstr instance with id: " + id);
		try {
			TrqMstr instance = (TrqMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TrqMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TrqMstr instance) {
		log.debug("finding TrqMstr instance by example");
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
		log.debug("finding TrqMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TrqMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TrqMstr instances");
		try {
			String queryString = "from TrqMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TrqMstr merge(TrqMstr detachedInstance) {
		log.debug("merging TrqMstr instance");
		try {
			TrqMstr result = (TrqMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrqMstr instance) {
		log.debug("attaching dirty TrqMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrqMstr instance) {
		log.debug("attaching clean TrqMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TrqMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TrqMstrDAO) ctx.getBean("TrqMstrDAO");
	}
}