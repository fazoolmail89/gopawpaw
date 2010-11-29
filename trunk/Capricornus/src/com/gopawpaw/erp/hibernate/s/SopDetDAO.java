package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SopDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SopDet
 * @author MyEclipse Persistence Tools
 */

public class SopDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SopDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SopDet transientInstance) {
		log.debug("saving SopDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SopDet persistentInstance) {
		log.debug("deleting SopDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SopDet findById(com.gopawpaw.erp.hibernate.s.SopDetId id) {
		log.debug("getting SopDet instance with id: " + id);
		try {
			SopDet instance = (SopDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SopDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SopDet instance) {
		log.debug("finding SopDet instance by example");
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
		log.debug("finding SopDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SopDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SopDet instances");
		try {
			String queryString = "from SopDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SopDet merge(SopDet detachedInstance) {
		log.debug("merging SopDet instance");
		try {
			SopDet result = (SopDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SopDet instance) {
		log.debug("attaching dirty SopDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SopDet instance) {
		log.debug("attaching clean SopDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SopDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SopDetDAO) ctx.getBean("SopDetDAO");
	}
}