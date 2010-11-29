package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PttDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PttDet
 * @author MyEclipse Persistence Tools
 */

public class PttDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PttDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PttDet transientInstance) {
		log.debug("saving PttDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PttDet persistentInstance) {
		log.debug("deleting PttDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PttDet findById(com.gopawpaw.erp.hibernate.p.PttDetId id) {
		log.debug("getting PttDet instance with id: " + id);
		try {
			PttDet instance = (PttDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PttDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PttDet instance) {
		log.debug("finding PttDet instance by example");
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
		log.debug("finding PttDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PttDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PttDet instances");
		try {
			String queryString = "from PttDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PttDet merge(PttDet detachedInstance) {
		log.debug("merging PttDet instance");
		try {
			PttDet result = (PttDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PttDet instance) {
		log.debug("attaching dirty PttDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PttDet instance) {
		log.debug("attaching clean PttDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PttDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PttDetDAO) ctx.getBean("PttDetDAO");
	}
}