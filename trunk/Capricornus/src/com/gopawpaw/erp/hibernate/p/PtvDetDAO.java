package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PtvDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PtvDet
 * @author MyEclipse Persistence Tools
 */

public class PtvDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PtvDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PtvDet transientInstance) {
		log.debug("saving PtvDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PtvDet persistentInstance) {
		log.debug("deleting PtvDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PtvDet findById(com.gopawpaw.erp.hibernate.p.PtvDetId id) {
		log.debug("getting PtvDet instance with id: " + id);
		try {
			PtvDet instance = (PtvDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PtvDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PtvDet instance) {
		log.debug("finding PtvDet instance by example");
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
		log.debug("finding PtvDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PtvDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PtvDet instances");
		try {
			String queryString = "from PtvDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PtvDet merge(PtvDet detachedInstance) {
		log.debug("merging PtvDet instance");
		try {
			PtvDet result = (PtvDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PtvDet instance) {
		log.debug("attaching dirty PtvDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PtvDet instance) {
		log.debug("attaching clean PtvDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PtvDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PtvDetDAO) ctx.getBean("PtvDetDAO");
	}
}