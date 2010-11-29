package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EsapsDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EsapsDet
 * @author MyEclipse Persistence Tools
 */

public class EsapsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EsapsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EsapsDet transientInstance) {
		log.debug("saving EsapsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EsapsDet persistentInstance) {
		log.debug("deleting EsapsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EsapsDet findById(com.gopawpaw.erp.hibernate.e.EsapsDetId id) {
		log.debug("getting EsapsDet instance with id: " + id);
		try {
			EsapsDet instance = (EsapsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EsapsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EsapsDet instance) {
		log.debug("finding EsapsDet instance by example");
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
		log.debug("finding EsapsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EsapsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EsapsDet instances");
		try {
			String queryString = "from EsapsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EsapsDet merge(EsapsDet detachedInstance) {
		log.debug("merging EsapsDet instance");
		try {
			EsapsDet result = (EsapsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EsapsDet instance) {
		log.debug("attaching dirty EsapsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EsapsDet instance) {
		log.debug("attaching clean EsapsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EsapsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EsapsDetDAO) ctx.getBean("EsapsDetDAO");
	}
}