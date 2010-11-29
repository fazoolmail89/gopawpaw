package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PvodDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PvodDet
 * @author MyEclipse Persistence Tools
 */

public class PvodDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PvodDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PvodDet transientInstance) {
		log.debug("saving PvodDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PvodDet persistentInstance) {
		log.debug("deleting PvodDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PvodDet findById(com.gopawpaw.erp.hibernate.p.PvodDetId id) {
		log.debug("getting PvodDet instance with id: " + id);
		try {
			PvodDet instance = (PvodDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PvodDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PvodDet instance) {
		log.debug("finding PvodDet instance by example");
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
		log.debug("finding PvodDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PvodDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PvodDet instances");
		try {
			String queryString = "from PvodDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PvodDet merge(PvodDet detachedInstance) {
		log.debug("merging PvodDet instance");
		try {
			PvodDet result = (PvodDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PvodDet instance) {
		log.debug("attaching dirty PvodDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PvodDet instance) {
		log.debug("attaching clean PvodDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PvodDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PvodDetDAO) ctx.getBean("PvodDetDAO");
	}
}