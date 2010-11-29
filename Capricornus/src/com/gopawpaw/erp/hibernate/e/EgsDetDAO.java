package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EgsDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EgsDet
 * @author MyEclipse Persistence Tools
 */

public class EgsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EgsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EgsDet transientInstance) {
		log.debug("saving EgsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EgsDet persistentInstance) {
		log.debug("deleting EgsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EgsDet findById(com.gopawpaw.erp.hibernate.e.EgsDetId id) {
		log.debug("getting EgsDet instance with id: " + id);
		try {
			EgsDet instance = (EgsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EgsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EgsDet instance) {
		log.debug("finding EgsDet instance by example");
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
		log.debug("finding EgsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EgsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EgsDet instances");
		try {
			String queryString = "from EgsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EgsDet merge(EgsDet detachedInstance) {
		log.debug("merging EgsDet instance");
		try {
			EgsDet result = (EgsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EgsDet instance) {
		log.debug("attaching dirty EgsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EgsDet instance) {
		log.debug("attaching clean EgsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EgsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EgsDetDAO) ctx.getBean("EgsDetDAO");
	}
}