package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SabDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SabDet
 * @author MyEclipse Persistence Tools
 */

public class SabDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SabDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SabDet transientInstance) {
		log.debug("saving SabDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SabDet persistentInstance) {
		log.debug("deleting SabDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SabDet findById(com.gopawpaw.erp.hibernate.s.SabDetId id) {
		log.debug("getting SabDet instance with id: " + id);
		try {
			SabDet instance = (SabDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SabDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SabDet instance) {
		log.debug("finding SabDet instance by example");
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
		log.debug("finding SabDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SabDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SabDet instances");
		try {
			String queryString = "from SabDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SabDet merge(SabDet detachedInstance) {
		log.debug("merging SabDet instance");
		try {
			SabDet result = (SabDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SabDet instance) {
		log.debug("attaching dirty SabDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SabDet instance) {
		log.debug("attaching clean SabDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SabDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SabDetDAO) ctx.getBean("SabDetDAO");
	}
}