package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PcldDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PcldDet
 * @author MyEclipse Persistence Tools
 */

public class PcldDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PcldDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PcldDet transientInstance) {
		log.debug("saving PcldDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PcldDet persistentInstance) {
		log.debug("deleting PcldDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PcldDet findById(com.gopawpaw.erp.hibernate.p.PcldDetId id) {
		log.debug("getting PcldDet instance with id: " + id);
		try {
			PcldDet instance = (PcldDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PcldDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PcldDet instance) {
		log.debug("finding PcldDet instance by example");
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
		log.debug("finding PcldDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PcldDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PcldDet instances");
		try {
			String queryString = "from PcldDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PcldDet merge(PcldDet detachedInstance) {
		log.debug("merging PcldDet instance");
		try {
			PcldDet result = (PcldDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PcldDet instance) {
		log.debug("attaching dirty PcldDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PcldDet instance) {
		log.debug("attaching clean PcldDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PcldDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PcldDetDAO) ctx.getBean("PcldDetDAO");
	}
}