package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SgidDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SgidDet
 * @author MyEclipse Persistence Tools
 */

public class SgidDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SgidDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SgidDet transientInstance) {
		log.debug("saving SgidDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SgidDet persistentInstance) {
		log.debug("deleting SgidDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SgidDet findById(com.gopawpaw.erp.hibernate.s.SgidDetId id) {
		log.debug("getting SgidDet instance with id: " + id);
		try {
			SgidDet instance = (SgidDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SgidDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SgidDet instance) {
		log.debug("finding SgidDet instance by example");
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
		log.debug("finding SgidDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SgidDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SgidDet instances");
		try {
			String queryString = "from SgidDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SgidDet merge(SgidDet detachedInstance) {
		log.debug("merging SgidDet instance");
		try {
			SgidDet result = (SgidDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SgidDet instance) {
		log.debug("attaching dirty SgidDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SgidDet instance) {
		log.debug("attaching clean SgidDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SgidDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SgidDetDAO) ctx.getBean("SgidDetDAO");
	}
}