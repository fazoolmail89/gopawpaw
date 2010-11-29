package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AtwkDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AtwkDet
 * @author MyEclipse Persistence Tools
 */

public class AtwkDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AtwkDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AtwkDet transientInstance) {
		log.debug("saving AtwkDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AtwkDet persistentInstance) {
		log.debug("deleting AtwkDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AtwkDet findById(com.gopawpaw.erp.hibernate.a.AtwkDetId id) {
		log.debug("getting AtwkDet instance with id: " + id);
		try {
			AtwkDet instance = (AtwkDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AtwkDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AtwkDet instance) {
		log.debug("finding AtwkDet instance by example");
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
		log.debug("finding AtwkDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AtwkDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AtwkDet instances");
		try {
			String queryString = "from AtwkDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AtwkDet merge(AtwkDet detachedInstance) {
		log.debug("merging AtwkDet instance");
		try {
			AtwkDet result = (AtwkDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AtwkDet instance) {
		log.debug("attaching dirty AtwkDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AtwkDet instance) {
		log.debug("attaching clean AtwkDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AtwkDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AtwkDetDAO) ctx.getBean("AtwkDetDAO");
	}
}