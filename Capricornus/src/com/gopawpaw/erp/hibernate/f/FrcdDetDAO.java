package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FrcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FrcdDet
 * @author MyEclipse Persistence Tools
 */

public class FrcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FrcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FrcdDet transientInstance) {
		log.debug("saving FrcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FrcdDet persistentInstance) {
		log.debug("deleting FrcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FrcdDet findById(com.gopawpaw.erp.hibernate.f.FrcdDetId id) {
		log.debug("getting FrcdDet instance with id: " + id);
		try {
			FrcdDet instance = (FrcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FrcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FrcdDet instance) {
		log.debug("finding FrcdDet instance by example");
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
		log.debug("finding FrcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FrcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FrcdDet instances");
		try {
			String queryString = "from FrcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FrcdDet merge(FrcdDet detachedInstance) {
		log.debug("merging FrcdDet instance");
		try {
			FrcdDet result = (FrcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FrcdDet instance) {
		log.debug("attaching dirty FrcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FrcdDet instance) {
		log.debug("attaching clean FrcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FrcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FrcdDetDAO) ctx.getBean("FrcdDetDAO");
	}
}