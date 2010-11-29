package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FabchdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FabchdDet
 * @author MyEclipse Persistence Tools
 */

public class FabchdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FabchdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FabchdDet transientInstance) {
		log.debug("saving FabchdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FabchdDet persistentInstance) {
		log.debug("deleting FabchdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FabchdDet findById(com.gopawpaw.erp.hibernate.f.FabchdDetId id) {
		log.debug("getting FabchdDet instance with id: " + id);
		try {
			FabchdDet instance = (FabchdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FabchdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FabchdDet instance) {
		log.debug("finding FabchdDet instance by example");
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
		log.debug("finding FabchdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FabchdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FabchdDet instances");
		try {
			String queryString = "from FabchdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FabchdDet merge(FabchdDet detachedInstance) {
		log.debug("merging FabchdDet instance");
		try {
			FabchdDet result = (FabchdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FabchdDet instance) {
		log.debug("attaching dirty FabchdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FabchdDet instance) {
		log.debug("attaching clean FabchdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FabchdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FabchdDetDAO) ctx.getBean("FabchdDetDAO");
	}
}