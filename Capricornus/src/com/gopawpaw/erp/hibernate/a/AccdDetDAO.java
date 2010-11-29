package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AccdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AccdDet
 * @author MyEclipse Persistence Tools
 */

public class AccdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AccdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AccdDet transientInstance) {
		log.debug("saving AccdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AccdDet persistentInstance) {
		log.debug("deleting AccdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AccdDet findById(com.gopawpaw.erp.hibernate.a.AccdDetId id) {
		log.debug("getting AccdDet instance with id: " + id);
		try {
			AccdDet instance = (AccdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AccdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AccdDet instance) {
		log.debug("finding AccdDet instance by example");
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
		log.debug("finding AccdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AccdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AccdDet instances");
		try {
			String queryString = "from AccdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AccdDet merge(AccdDet detachedInstance) {
		log.debug("merging AccdDet instance");
		try {
			AccdDet result = (AccdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AccdDet instance) {
		log.debug("attaching dirty AccdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AccdDet instance) {
		log.debug("attaching clean AccdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AccdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AccdDetDAO) ctx.getBean("AccdDetDAO");
	}
}