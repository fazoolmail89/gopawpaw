package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EsapfsDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EsapfsDet
 * @author MyEclipse Persistence Tools
 */

public class EsapfsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EsapfsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EsapfsDet transientInstance) {
		log.debug("saving EsapfsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EsapfsDet persistentInstance) {
		log.debug("deleting EsapfsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EsapfsDet findById(com.gopawpaw.erp.hibernate.e.EsapfsDetId id) {
		log.debug("getting EsapfsDet instance with id: " + id);
		try {
			EsapfsDet instance = (EsapfsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EsapfsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EsapfsDet instance) {
		log.debug("finding EsapfsDet instance by example");
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
		log.debug("finding EsapfsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EsapfsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EsapfsDet instances");
		try {
			String queryString = "from EsapfsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EsapfsDet merge(EsapfsDet detachedInstance) {
		log.debug("merging EsapfsDet instance");
		try {
			EsapfsDet result = (EsapfsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EsapfsDet instance) {
		log.debug("attaching dirty EsapfsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EsapfsDet instance) {
		log.debug("attaching clean EsapfsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EsapfsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EsapfsDetDAO) ctx.getBean("EsapfsDetDAO");
	}
}