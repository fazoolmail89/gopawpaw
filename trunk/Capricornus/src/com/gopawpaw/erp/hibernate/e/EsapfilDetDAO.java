package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EsapfilDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EsapfilDet
 * @author MyEclipse Persistence Tools
 */

public class EsapfilDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EsapfilDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EsapfilDet transientInstance) {
		log.debug("saving EsapfilDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EsapfilDet persistentInstance) {
		log.debug("deleting EsapfilDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EsapfilDet findById(com.gopawpaw.erp.hibernate.e.EsapfilDetId id) {
		log.debug("getting EsapfilDet instance with id: " + id);
		try {
			EsapfilDet instance = (EsapfilDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EsapfilDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EsapfilDet instance) {
		log.debug("finding EsapfilDet instance by example");
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
		log.debug("finding EsapfilDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EsapfilDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EsapfilDet instances");
		try {
			String queryString = "from EsapfilDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EsapfilDet merge(EsapfilDet detachedInstance) {
		log.debug("merging EsapfilDet instance");
		try {
			EsapfilDet result = (EsapfilDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EsapfilDet instance) {
		log.debug("attaching dirty EsapfilDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EsapfilDet instance) {
		log.debug("attaching clean EsapfilDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EsapfilDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EsapfilDetDAO) ctx.getBean("EsapfilDetDAO");
	}
}