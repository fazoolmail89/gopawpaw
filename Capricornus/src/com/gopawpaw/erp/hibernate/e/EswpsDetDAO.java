package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EswpsDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EswpsDet
 * @author MyEclipse Persistence Tools
 */

public class EswpsDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EswpsDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EswpsDet transientInstance) {
		log.debug("saving EswpsDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EswpsDet persistentInstance) {
		log.debug("deleting EswpsDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EswpsDet findById(com.gopawpaw.erp.hibernate.e.EswpsDetId id) {
		log.debug("getting EswpsDet instance with id: " + id);
		try {
			EswpsDet instance = (EswpsDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EswpsDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EswpsDet instance) {
		log.debug("finding EswpsDet instance by example");
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
		log.debug("finding EswpsDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EswpsDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EswpsDet instances");
		try {
			String queryString = "from EswpsDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EswpsDet merge(EswpsDet detachedInstance) {
		log.debug("merging EswpsDet instance");
		try {
			EswpsDet result = (EswpsDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EswpsDet instance) {
		log.debug("attaching dirty EswpsDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EswpsDet instance) {
		log.debug("attaching clean EswpsDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EswpsDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EswpsDetDAO) ctx.getBean("EswpsDetDAO");
	}
}