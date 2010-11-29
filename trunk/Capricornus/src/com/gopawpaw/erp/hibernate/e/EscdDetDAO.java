package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EscdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EscdDet
 * @author MyEclipse Persistence Tools
 */

public class EscdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EscdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EscdDet transientInstance) {
		log.debug("saving EscdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EscdDet persistentInstance) {
		log.debug("deleting EscdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EscdDet findById(com.gopawpaw.erp.hibernate.e.EscdDetId id) {
		log.debug("getting EscdDet instance with id: " + id);
		try {
			EscdDet instance = (EscdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EscdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EscdDet instance) {
		log.debug("finding EscdDet instance by example");
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
		log.debug("finding EscdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EscdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EscdDet instances");
		try {
			String queryString = "from EscdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EscdDet merge(EscdDet detachedInstance) {
		log.debug("merging EscdDet instance");
		try {
			EscdDet result = (EscdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EscdDet instance) {
		log.debug("attaching dirty EscdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EscdDet instance) {
		log.debug("attaching clean EscdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EscdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EscdDetDAO) ctx.getBean("EscdDetDAO");
	}
}