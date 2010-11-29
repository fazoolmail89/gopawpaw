package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SpdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SpdDet
 * @author MyEclipse Persistence Tools
 */

public class SpdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SpdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SpdDet transientInstance) {
		log.debug("saving SpdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SpdDet persistentInstance) {
		log.debug("deleting SpdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SpdDet findById(com.gopawpaw.erp.hibernate.s.SpdDetId id) {
		log.debug("getting SpdDet instance with id: " + id);
		try {
			SpdDet instance = (SpdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SpdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SpdDet instance) {
		log.debug("finding SpdDet instance by example");
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
		log.debug("finding SpdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SpdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SpdDet instances");
		try {
			String queryString = "from SpdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SpdDet merge(SpdDet detachedInstance) {
		log.debug("merging SpdDet instance");
		try {
			SpdDet result = (SpdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SpdDet instance) {
		log.debug("attaching dirty SpdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SpdDet instance) {
		log.debug("attaching clean SpdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SpdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SpdDetDAO) ctx.getBean("SpdDetDAO");
	}
}