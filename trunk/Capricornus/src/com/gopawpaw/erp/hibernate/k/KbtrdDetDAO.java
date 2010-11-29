package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KbtrdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KbtrdDet
 * @author MyEclipse Persistence Tools
 */

public class KbtrdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KbtrdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KbtrdDet transientInstance) {
		log.debug("saving KbtrdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KbtrdDet persistentInstance) {
		log.debug("deleting KbtrdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KbtrdDet findById(com.gopawpaw.erp.hibernate.k.KbtrdDetId id) {
		log.debug("getting KbtrdDet instance with id: " + id);
		try {
			KbtrdDet instance = (KbtrdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KbtrdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KbtrdDet instance) {
		log.debug("finding KbtrdDet instance by example");
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
		log.debug("finding KbtrdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KbtrdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KbtrdDet instances");
		try {
			String queryString = "from KbtrdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KbtrdDet merge(KbtrdDet detachedInstance) {
		log.debug("merging KbtrdDet instance");
		try {
			KbtrdDet result = (KbtrdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KbtrdDet instance) {
		log.debug("attaching dirty KbtrdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KbtrdDet instance) {
		log.debug("attaching clean KbtrdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KbtrdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KbtrdDetDAO) ctx.getBean("KbtrdDetDAO");
	}
}