package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FabdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FabdDet
 * @author MyEclipse Persistence Tools
 */

public class FabdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FabdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FabdDet transientInstance) {
		log.debug("saving FabdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FabdDet persistentInstance) {
		log.debug("deleting FabdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FabdDet findById(com.gopawpaw.erp.hibernate.f.FabdDetId id) {
		log.debug("getting FabdDet instance with id: " + id);
		try {
			FabdDet instance = (FabdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FabdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FabdDet instance) {
		log.debug("finding FabdDet instance by example");
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
		log.debug("finding FabdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FabdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FabdDet instances");
		try {
			String queryString = "from FabdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FabdDet merge(FabdDet detachedInstance) {
		log.debug("merging FabdDet instance");
		try {
			FabdDet result = (FabdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FabdDet instance) {
		log.debug("attaching dirty FabdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FabdDet instance) {
		log.debug("attaching clean FabdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FabdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FabdDetDAO) ctx.getBean("FabdDetDAO");
	}
}