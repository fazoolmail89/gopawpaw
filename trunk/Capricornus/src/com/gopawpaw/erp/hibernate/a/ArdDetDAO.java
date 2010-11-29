package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ArdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.ArdDet
 * @author MyEclipse Persistence Tools
 */

public class ArdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ArdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ArdDet transientInstance) {
		log.debug("saving ArdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ArdDet persistentInstance) {
		log.debug("deleting ArdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ArdDet findById(com.gopawpaw.erp.hibernate.a.ArdDetId id) {
		log.debug("getting ArdDet instance with id: " + id);
		try {
			ArdDet instance = (ArdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.ArdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ArdDet instance) {
		log.debug("finding ArdDet instance by example");
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
		log.debug("finding ArdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ArdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ArdDet instances");
		try {
			String queryString = "from ArdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ArdDet merge(ArdDet detachedInstance) {
		log.debug("merging ArdDet instance");
		try {
			ArdDet result = (ArdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ArdDet instance) {
		log.debug("attaching dirty ArdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ArdDet instance) {
		log.debug("attaching clean ArdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ArdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ArdDetDAO) ctx.getBean("ArdDetDAO");
	}
}