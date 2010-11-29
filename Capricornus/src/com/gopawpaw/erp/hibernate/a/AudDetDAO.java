package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AudDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AudDet
 * @author MyEclipse Persistence Tools
 */

public class AudDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AudDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AudDet transientInstance) {
		log.debug("saving AudDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AudDet persistentInstance) {
		log.debug("deleting AudDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AudDet findById(com.gopawpaw.erp.hibernate.a.AudDetId id) {
		log.debug("getting AudDet instance with id: " + id);
		try {
			AudDet instance = (AudDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AudDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AudDet instance) {
		log.debug("finding AudDet instance by example");
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
		log.debug("finding AudDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AudDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AudDet instances");
		try {
			String queryString = "from AudDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AudDet merge(AudDet detachedInstance) {
		log.debug("merging AudDet instance");
		try {
			AudDet result = (AudDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AudDet instance) {
		log.debug("attaching dirty AudDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AudDet instance) {
		log.debug("attaching clean AudDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AudDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AudDetDAO) ctx.getBean("AudDetDAO");
	}
}