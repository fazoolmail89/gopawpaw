package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AcdDet
 * @author MyEclipse Persistence Tools
 */

public class AcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AcdDet transientInstance) {
		log.debug("saving AcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AcdDet persistentInstance) {
		log.debug("deleting AcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AcdDet findById(com.gopawpaw.erp.hibernate.a.AcdDetId id) {
		log.debug("getting AcdDet instance with id: " + id);
		try {
			AcdDet instance = (AcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AcdDet instance) {
		log.debug("finding AcdDet instance by example");
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
		log.debug("finding AcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AcdDet instances");
		try {
			String queryString = "from AcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AcdDet merge(AcdDet detachedInstance) {
		log.debug("merging AcdDet instance");
		try {
			AcdDet result = (AcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AcdDet instance) {
		log.debug("attaching dirty AcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AcdDet instance) {
		log.debug("attaching clean AcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AcdDetDAO) ctx.getBean("AcdDetDAO");
	}
}