package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TotdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TotdDet
 * @author MyEclipse Persistence Tools
 */

public class TotdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TotdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TotdDet transientInstance) {
		log.debug("saving TotdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TotdDet persistentInstance) {
		log.debug("deleting TotdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TotdDet findById(com.gopawpaw.erp.hibernate.t.TotdDetId id) {
		log.debug("getting TotdDet instance with id: " + id);
		try {
			TotdDet instance = (TotdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TotdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TotdDet instance) {
		log.debug("finding TotdDet instance by example");
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
		log.debug("finding TotdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TotdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TotdDet instances");
		try {
			String queryString = "from TotdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TotdDet merge(TotdDet detachedInstance) {
		log.debug("merging TotdDet instance");
		try {
			TotdDet result = (TotdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TotdDet instance) {
		log.debug("attaching dirty TotdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TotdDet instance) {
		log.debug("attaching clean TotdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TotdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TotdDetDAO) ctx.getBean("TotdDetDAO");
	}
}