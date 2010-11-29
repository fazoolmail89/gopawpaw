package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EudDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EudDet
 * @author MyEclipse Persistence Tools
 */

public class EudDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EudDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EudDet transientInstance) {
		log.debug("saving EudDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EudDet persistentInstance) {
		log.debug("deleting EudDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EudDet findById(com.gopawpaw.erp.hibernate.e.EudDetId id) {
		log.debug("getting EudDet instance with id: " + id);
		try {
			EudDet instance = (EudDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EudDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EudDet instance) {
		log.debug("finding EudDet instance by example");
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
		log.debug("finding EudDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EudDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EudDet instances");
		try {
			String queryString = "from EudDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EudDet merge(EudDet detachedInstance) {
		log.debug("merging EudDet instance");
		try {
			EudDet result = (EudDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EudDet instance) {
		log.debug("attaching dirty EudDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EudDet instance) {
		log.debug("attaching clean EudDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EudDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EudDetDAO) ctx.getBean("EudDetDAO");
	}
}