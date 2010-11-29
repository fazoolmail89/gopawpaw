package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SttqdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SttqdDet
 * @author MyEclipse Persistence Tools
 */

public class SttqdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SttqdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SttqdDet transientInstance) {
		log.debug("saving SttqdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SttqdDet persistentInstance) {
		log.debug("deleting SttqdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SttqdDet findById(com.gopawpaw.erp.hibernate.s.SttqdDetId id) {
		log.debug("getting SttqdDet instance with id: " + id);
		try {
			SttqdDet instance = (SttqdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SttqdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SttqdDet instance) {
		log.debug("finding SttqdDet instance by example");
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
		log.debug("finding SttqdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SttqdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SttqdDet instances");
		try {
			String queryString = "from SttqdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SttqdDet merge(SttqdDet detachedInstance) {
		log.debug("merging SttqdDet instance");
		try {
			SttqdDet result = (SttqdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SttqdDet instance) {
		log.debug("attaching dirty SttqdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SttqdDet instance) {
		log.debug("attaching clean SttqdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SttqdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SttqdDetDAO) ctx.getBean("SttqdDetDAO");
	}
}