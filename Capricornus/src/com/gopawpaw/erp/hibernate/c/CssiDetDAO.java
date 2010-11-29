package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CssiDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CssiDet
 * @author MyEclipse Persistence Tools
 */

public class CssiDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CssiDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CssiDet transientInstance) {
		log.debug("saving CssiDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CssiDet persistentInstance) {
		log.debug("deleting CssiDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CssiDet findById(com.gopawpaw.erp.hibernate.c.CssiDetId id) {
		log.debug("getting CssiDet instance with id: " + id);
		try {
			CssiDet instance = (CssiDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CssiDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CssiDet instance) {
		log.debug("finding CssiDet instance by example");
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
		log.debug("finding CssiDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CssiDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CssiDet instances");
		try {
			String queryString = "from CssiDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CssiDet merge(CssiDet detachedInstance) {
		log.debug("merging CssiDet instance");
		try {
			CssiDet result = (CssiDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CssiDet instance) {
		log.debug("attaching dirty CssiDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CssiDet instance) {
		log.debug("attaching clean CssiDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CssiDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CssiDetDAO) ctx.getBean("CssiDetDAO");
	}
}