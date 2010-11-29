package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SosrdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SosrdDet
 * @author MyEclipse Persistence Tools
 */

public class SosrdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SosrdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SosrdDet transientInstance) {
		log.debug("saving SosrdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SosrdDet persistentInstance) {
		log.debug("deleting SosrdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SosrdDet findById(com.gopawpaw.erp.hibernate.s.SosrdDetId id) {
		log.debug("getting SosrdDet instance with id: " + id);
		try {
			SosrdDet instance = (SosrdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SosrdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SosrdDet instance) {
		log.debug("finding SosrdDet instance by example");
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
		log.debug("finding SosrdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SosrdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SosrdDet instances");
		try {
			String queryString = "from SosrdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SosrdDet merge(SosrdDet detachedInstance) {
		log.debug("merging SosrdDet instance");
		try {
			SosrdDet result = (SosrdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SosrdDet instance) {
		log.debug("attaching dirty SosrdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SosrdDet instance) {
		log.debug("attaching clean SosrdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SosrdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SosrdDetDAO) ctx.getBean("SosrdDetDAO");
	}
}