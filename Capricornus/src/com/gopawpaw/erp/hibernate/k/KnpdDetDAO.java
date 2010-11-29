package com.gopawpaw.erp.hibernate.k;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * KnpdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.k.KnpdDet
 * @author MyEclipse Persistence Tools
 */

public class KnpdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(KnpdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(KnpdDet transientInstance) {
		log.debug("saving KnpdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(KnpdDet persistentInstance) {
		log.debug("deleting KnpdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public KnpdDet findById(com.gopawpaw.erp.hibernate.k.KnpdDetId id) {
		log.debug("getting KnpdDet instance with id: " + id);
		try {
			KnpdDet instance = (KnpdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.k.KnpdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(KnpdDet instance) {
		log.debug("finding KnpdDet instance by example");
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
		log.debug("finding KnpdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from KnpdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all KnpdDet instances");
		try {
			String queryString = "from KnpdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public KnpdDet merge(KnpdDet detachedInstance) {
		log.debug("merging KnpdDet instance");
		try {
			KnpdDet result = (KnpdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(KnpdDet instance) {
		log.debug("attaching dirty KnpdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(KnpdDet instance) {
		log.debug("attaching clean KnpdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KnpdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KnpdDetDAO) ctx.getBean("KnpdDetDAO");
	}
}