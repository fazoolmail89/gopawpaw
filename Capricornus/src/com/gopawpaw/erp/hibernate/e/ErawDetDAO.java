package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ErawDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.ErawDet
 * @author MyEclipse Persistence Tools
 */

public class ErawDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ErawDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ErawDet transientInstance) {
		log.debug("saving ErawDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ErawDet persistentInstance) {
		log.debug("deleting ErawDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ErawDet findById(com.gopawpaw.erp.hibernate.e.ErawDetId id) {
		log.debug("getting ErawDet instance with id: " + id);
		try {
			ErawDet instance = (ErawDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.ErawDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ErawDet instance) {
		log.debug("finding ErawDet instance by example");
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
		log.debug("finding ErawDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ErawDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ErawDet instances");
		try {
			String queryString = "from ErawDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ErawDet merge(ErawDet detachedInstance) {
		log.debug("merging ErawDet instance");
		try {
			ErawDet result = (ErawDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ErawDet instance) {
		log.debug("attaching dirty ErawDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ErawDet instance) {
		log.debug("attaching clean ErawDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ErawDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ErawDetDAO) ctx.getBean("ErawDetDAO");
	}
}