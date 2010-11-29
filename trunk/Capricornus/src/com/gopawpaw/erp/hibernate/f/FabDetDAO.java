package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FabDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FabDet
 * @author MyEclipse Persistence Tools
 */

public class FabDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FabDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FabDet transientInstance) {
		log.debug("saving FabDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FabDet persistentInstance) {
		log.debug("deleting FabDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FabDet findById(com.gopawpaw.erp.hibernate.f.FabDetId id) {
		log.debug("getting FabDet instance with id: " + id);
		try {
			FabDet instance = (FabDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FabDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FabDet instance) {
		log.debug("finding FabDet instance by example");
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
		log.debug("finding FabDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FabDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FabDet instances");
		try {
			String queryString = "from FabDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FabDet merge(FabDet detachedInstance) {
		log.debug("merging FabDet instance");
		try {
			FabDet result = (FabDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FabDet instance) {
		log.debug("attaching dirty FabDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FabDet instance) {
		log.debug("attaching clean FabDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FabDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FabDetDAO) ctx.getBean("FabDetDAO");
	}
}