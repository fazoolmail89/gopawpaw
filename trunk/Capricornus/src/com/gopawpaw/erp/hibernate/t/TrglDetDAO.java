package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TrglDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TrglDet
 * @author MyEclipse Persistence Tools
 */

public class TrglDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TrglDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TrglDet transientInstance) {
		log.debug("saving TrglDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TrglDet persistentInstance) {
		log.debug("deleting TrglDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TrglDet findById(com.gopawpaw.erp.hibernate.t.TrglDetId id) {
		log.debug("getting TrglDet instance with id: " + id);
		try {
			TrglDet instance = (TrglDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TrglDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TrglDet instance) {
		log.debug("finding TrglDet instance by example");
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
		log.debug("finding TrglDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TrglDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TrglDet instances");
		try {
			String queryString = "from TrglDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TrglDet merge(TrglDet detachedInstance) {
		log.debug("merging TrglDet instance");
		try {
			TrglDet result = (TrglDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TrglDet instance) {
		log.debug("attaching dirty TrglDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TrglDet instance) {
		log.debug("attaching clean TrglDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TrglDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TrglDetDAO) ctx.getBean("TrglDetDAO");
	}
}