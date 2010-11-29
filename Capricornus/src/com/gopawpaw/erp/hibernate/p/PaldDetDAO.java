package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PaldDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PaldDet
 * @author MyEclipse Persistence Tools
 */

public class PaldDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PaldDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PaldDet transientInstance) {
		log.debug("saving PaldDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PaldDet persistentInstance) {
		log.debug("deleting PaldDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PaldDet findById(com.gopawpaw.erp.hibernate.p.PaldDetId id) {
		log.debug("getting PaldDet instance with id: " + id);
		try {
			PaldDet instance = (PaldDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PaldDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PaldDet instance) {
		log.debug("finding PaldDet instance by example");
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
		log.debug("finding PaldDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PaldDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PaldDet instances");
		try {
			String queryString = "from PaldDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PaldDet merge(PaldDet detachedInstance) {
		log.debug("merging PaldDet instance");
		try {
			PaldDet result = (PaldDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PaldDet instance) {
		log.debug("attaching dirty PaldDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PaldDet instance) {
		log.debug("attaching clean PaldDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PaldDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PaldDetDAO) ctx.getBean("PaldDetDAO");
	}
}