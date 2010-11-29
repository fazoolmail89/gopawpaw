package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EswpfilDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EswpfilDet
 * @author MyEclipse Persistence Tools
 */

public class EswpfilDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EswpfilDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EswpfilDet transientInstance) {
		log.debug("saving EswpfilDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EswpfilDet persistentInstance) {
		log.debug("deleting EswpfilDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EswpfilDet findById(com.gopawpaw.erp.hibernate.e.EswpfilDetId id) {
		log.debug("getting EswpfilDet instance with id: " + id);
		try {
			EswpfilDet instance = (EswpfilDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EswpfilDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EswpfilDet instance) {
		log.debug("finding EswpfilDet instance by example");
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
		log.debug("finding EswpfilDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EswpfilDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EswpfilDet instances");
		try {
			String queryString = "from EswpfilDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EswpfilDet merge(EswpfilDet detachedInstance) {
		log.debug("merging EswpfilDet instance");
		try {
			EswpfilDet result = (EswpfilDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EswpfilDet instance) {
		log.debug("attaching dirty EswpfilDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EswpfilDet instance) {
		log.debug("attaching clean EswpfilDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EswpfilDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EswpfilDetDAO) ctx.getBean("EswpfilDetDAO");
	}
}