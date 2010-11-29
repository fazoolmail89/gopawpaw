package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EscxDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EscxDet
 * @author MyEclipse Persistence Tools
 */

public class EscxDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EscxDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EscxDet transientInstance) {
		log.debug("saving EscxDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EscxDet persistentInstance) {
		log.debug("deleting EscxDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EscxDet findById(com.gopawpaw.erp.hibernate.e.EscxDetId id) {
		log.debug("getting EscxDet instance with id: " + id);
		try {
			EscxDet instance = (EscxDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EscxDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EscxDet instance) {
		log.debug("finding EscxDet instance by example");
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
		log.debug("finding EscxDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EscxDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EscxDet instances");
		try {
			String queryString = "from EscxDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EscxDet merge(EscxDet detachedInstance) {
		log.debug("merging EscxDet instance");
		try {
			EscxDet result = (EscxDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EscxDet instance) {
		log.debug("attaching dirty EscxDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EscxDet instance) {
		log.debug("attaching clean EscxDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EscxDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EscxDetDAO) ctx.getBean("EscxDetDAO");
	}
}