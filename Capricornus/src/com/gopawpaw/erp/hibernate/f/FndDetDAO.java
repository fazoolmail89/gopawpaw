package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FndDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FndDet
 * @author MyEclipse Persistence Tools
 */

public class FndDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FndDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FndDet transientInstance) {
		log.debug("saving FndDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FndDet persistentInstance) {
		log.debug("deleting FndDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FndDet findById(com.gopawpaw.erp.hibernate.f.FndDetId id) {
		log.debug("getting FndDet instance with id: " + id);
		try {
			FndDet instance = (FndDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FndDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FndDet instance) {
		log.debug("finding FndDet instance by example");
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
		log.debug("finding FndDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FndDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FndDet instances");
		try {
			String queryString = "from FndDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FndDet merge(FndDet detachedInstance) {
		log.debug("merging FndDet instance");
		try {
			FndDet result = (FndDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FndDet instance) {
		log.debug("attaching dirty FndDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FndDet instance) {
		log.debug("attaching clean FndDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FndDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FndDetDAO) ctx.getBean("FndDetDAO");
	}
}