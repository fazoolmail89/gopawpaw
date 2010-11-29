package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PgmDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PgmDet
 * @author MyEclipse Persistence Tools
 */

public class PgmDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PgmDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PgmDet transientInstance) {
		log.debug("saving PgmDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PgmDet persistentInstance) {
		log.debug("deleting PgmDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PgmDet findById(com.gopawpaw.erp.hibernate.p.PgmDetId id) {
		log.debug("getting PgmDet instance with id: " + id);
		try {
			PgmDet instance = (PgmDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PgmDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PgmDet instance) {
		log.debug("finding PgmDet instance by example");
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
		log.debug("finding PgmDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PgmDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PgmDet instances");
		try {
			String queryString = "from PgmDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PgmDet merge(PgmDet detachedInstance) {
		log.debug("merging PgmDet instance");
		try {
			PgmDet result = (PgmDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PgmDet instance) {
		log.debug("attaching dirty PgmDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PgmDet instance) {
		log.debug("attaching clean PgmDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PgmDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PgmDetDAO) ctx.getBean("PgmDetDAO");
	}
}