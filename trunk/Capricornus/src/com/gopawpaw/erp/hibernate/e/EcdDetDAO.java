package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EcdDet
 * @author MyEclipse Persistence Tools
 */

public class EcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EcdDet transientInstance) {
		log.debug("saving EcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EcdDet persistentInstance) {
		log.debug("deleting EcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EcdDet findById(com.gopawpaw.erp.hibernate.e.EcdDetId id) {
		log.debug("getting EcdDet instance with id: " + id);
		try {
			EcdDet instance = (EcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EcdDet instance) {
		log.debug("finding EcdDet instance by example");
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
		log.debug("finding EcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EcdDet instances");
		try {
			String queryString = "from EcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EcdDet merge(EcdDet detachedInstance) {
		log.debug("merging EcdDet instance");
		try {
			EcdDet result = (EcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EcdDet instance) {
		log.debug("attaching dirty EcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EcdDet instance) {
		log.debug("attaching clean EcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EcdDetDAO) ctx.getBean("EcdDetDAO");
	}
}