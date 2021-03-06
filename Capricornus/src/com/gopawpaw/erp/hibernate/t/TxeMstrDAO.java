package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TxeMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TxeMstr
 * @author MyEclipse Persistence Tools
 */

public class TxeMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TxeMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TxeMstr transientInstance) {
		log.debug("saving TxeMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TxeMstr persistentInstance) {
		log.debug("deleting TxeMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TxeMstr findById(com.gopawpaw.erp.hibernate.t.TxeMstrId id) {
		log.debug("getting TxeMstr instance with id: " + id);
		try {
			TxeMstr instance = (TxeMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TxeMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TxeMstr instance) {
		log.debug("finding TxeMstr instance by example");
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
		log.debug("finding TxeMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TxeMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TxeMstr instances");
		try {
			String queryString = "from TxeMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TxeMstr merge(TxeMstr detachedInstance) {
		log.debug("merging TxeMstr instance");
		try {
			TxeMstr result = (TxeMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TxeMstr instance) {
		log.debug("attaching dirty TxeMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TxeMstr instance) {
		log.debug("attaching clean TxeMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TxeMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TxeMstrDAO) ctx.getBean("TxeMstrDAO");
	}
}