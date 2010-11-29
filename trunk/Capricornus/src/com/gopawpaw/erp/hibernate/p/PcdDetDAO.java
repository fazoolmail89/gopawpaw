package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PcdDet
 * @author MyEclipse Persistence Tools
 */

public class PcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PcdDet transientInstance) {
		log.debug("saving PcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PcdDet persistentInstance) {
		log.debug("deleting PcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PcdDet findById(com.gopawpaw.erp.hibernate.p.PcdDetId id) {
		log.debug("getting PcdDet instance with id: " + id);
		try {
			PcdDet instance = (PcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PcdDet instance) {
		log.debug("finding PcdDet instance by example");
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
		log.debug("finding PcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PcdDet instances");
		try {
			String queryString = "from PcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PcdDet merge(PcdDet detachedInstance) {
		log.debug("merging PcdDet instance");
		try {
			PcdDet result = (PcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PcdDet instance) {
		log.debug("attaching dirty PcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PcdDet instance) {
		log.debug("attaching clean PcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PcdDetDAO) ctx.getBean("PcdDetDAO");
	}
}