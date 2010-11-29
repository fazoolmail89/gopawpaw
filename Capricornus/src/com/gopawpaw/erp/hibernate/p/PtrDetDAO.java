package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PtrDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PtrDet
 * @author MyEclipse Persistence Tools
 */

public class PtrDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PtrDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PtrDet transientInstance) {
		log.debug("saving PtrDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PtrDet persistentInstance) {
		log.debug("deleting PtrDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PtrDet findById(com.gopawpaw.erp.hibernate.p.PtrDetId id) {
		log.debug("getting PtrDet instance with id: " + id);
		try {
			PtrDet instance = (PtrDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PtrDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PtrDet instance) {
		log.debug("finding PtrDet instance by example");
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
		log.debug("finding PtrDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PtrDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PtrDet instances");
		try {
			String queryString = "from PtrDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PtrDet merge(PtrDet detachedInstance) {
		log.debug("merging PtrDet instance");
		try {
			PtrDet result = (PtrDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PtrDet instance) {
		log.debug("attaching dirty PtrDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PtrDet instance) {
		log.debug("attaching clean PtrDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PtrDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PtrDetDAO) ctx.getBean("PtrDetDAO");
	}
}