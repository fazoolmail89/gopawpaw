package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.ShdDet
 * @author MyEclipse Persistence Tools
 */

public class ShdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ShdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ShdDet transientInstance) {
		log.debug("saving ShdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ShdDet persistentInstance) {
		log.debug("deleting ShdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ShdDet findById(com.gopawpaw.erp.hibernate.s.ShdDetId id) {
		log.debug("getting ShdDet instance with id: " + id);
		try {
			ShdDet instance = (ShdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.ShdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ShdDet instance) {
		log.debug("finding ShdDet instance by example");
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
		log.debug("finding ShdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ShdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ShdDet instances");
		try {
			String queryString = "from ShdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ShdDet merge(ShdDet detachedInstance) {
		log.debug("merging ShdDet instance");
		try {
			ShdDet result = (ShdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ShdDet instance) {
		log.debug("attaching dirty ShdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ShdDet instance) {
		log.debug("attaching clean ShdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ShdDetDAO) ctx.getBean("ShdDetDAO");
	}
}