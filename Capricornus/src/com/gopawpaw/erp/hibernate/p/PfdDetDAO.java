package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PfdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PfdDet
 * @author MyEclipse Persistence Tools
 */

public class PfdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PfdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PfdDet transientInstance) {
		log.debug("saving PfdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PfdDet persistentInstance) {
		log.debug("deleting PfdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PfdDet findById(com.gopawpaw.erp.hibernate.p.PfdDetId id) {
		log.debug("getting PfdDet instance with id: " + id);
		try {
			PfdDet instance = (PfdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PfdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PfdDet instance) {
		log.debug("finding PfdDet instance by example");
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
		log.debug("finding PfdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PfdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PfdDet instances");
		try {
			String queryString = "from PfdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PfdDet merge(PfdDet detachedInstance) {
		log.debug("merging PfdDet instance");
		try {
			PfdDet result = (PfdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PfdDet instance) {
		log.debug("attaching dirty PfdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PfdDet instance) {
		log.debug("attaching clean PfdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PfdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PfdDetDAO) ctx.getBean("PfdDetDAO");
	}
}