package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TxbdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TxbdDet
 * @author MyEclipse Persistence Tools
 */

public class TxbdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TxbdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TxbdDet transientInstance) {
		log.debug("saving TxbdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TxbdDet persistentInstance) {
		log.debug("deleting TxbdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TxbdDet findById(com.gopawpaw.erp.hibernate.t.TxbdDetId id) {
		log.debug("getting TxbdDet instance with id: " + id);
		try {
			TxbdDet instance = (TxbdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TxbdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TxbdDet instance) {
		log.debug("finding TxbdDet instance by example");
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
		log.debug("finding TxbdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TxbdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TxbdDet instances");
		try {
			String queryString = "from TxbdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TxbdDet merge(TxbdDet detachedInstance) {
		log.debug("merging TxbdDet instance");
		try {
			TxbdDet result = (TxbdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TxbdDet instance) {
		log.debug("attaching dirty TxbdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TxbdDet instance) {
		log.debug("attaching clean TxbdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TxbdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TxbdDetDAO) ctx.getBean("TxbdDetDAO");
	}
}