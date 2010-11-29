package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PidDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PidDet
 * @author MyEclipse Persistence Tools
 */

public class PidDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PidDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PidDet transientInstance) {
		log.debug("saving PidDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PidDet persistentInstance) {
		log.debug("deleting PidDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PidDet findById(com.gopawpaw.erp.hibernate.p.PidDetId id) {
		log.debug("getting PidDet instance with id: " + id);
		try {
			PidDet instance = (PidDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PidDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PidDet instance) {
		log.debug("finding PidDet instance by example");
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
		log.debug("finding PidDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PidDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PidDet instances");
		try {
			String queryString = "from PidDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PidDet merge(PidDet detachedInstance) {
		log.debug("merging PidDet instance");
		try {
			PidDet result = (PidDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PidDet instance) {
		log.debug("attaching dirty PidDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PidDet instance) {
		log.debug("attaching clean PidDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PidDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PidDetDAO) ctx.getBean("PidDetDAO");
	}
}