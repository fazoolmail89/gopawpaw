package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PjsxDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PjsxDet
 * @author MyEclipse Persistence Tools
 */

public class PjsxDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PjsxDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PjsxDet transientInstance) {
		log.debug("saving PjsxDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PjsxDet persistentInstance) {
		log.debug("deleting PjsxDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PjsxDet findById(com.gopawpaw.erp.hibernate.p.PjsxDetId id) {
		log.debug("getting PjsxDet instance with id: " + id);
		try {
			PjsxDet instance = (PjsxDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PjsxDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PjsxDet instance) {
		log.debug("finding PjsxDet instance by example");
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
		log.debug("finding PjsxDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PjsxDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PjsxDet instances");
		try {
			String queryString = "from PjsxDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PjsxDet merge(PjsxDet detachedInstance) {
		log.debug("merging PjsxDet instance");
		try {
			PjsxDet result = (PjsxDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PjsxDet instance) {
		log.debug("attaching dirty PjsxDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PjsxDet instance) {
		log.debug("attaching clean PjsxDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PjsxDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PjsxDetDAO) ctx.getBean("PjsxDetDAO");
	}
}