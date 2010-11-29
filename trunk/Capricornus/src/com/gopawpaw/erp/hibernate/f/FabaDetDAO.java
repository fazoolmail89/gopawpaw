package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * FabaDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.FabaDet
 * @author MyEclipse Persistence Tools
 */

public class FabaDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FabaDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(FabaDet transientInstance) {
		log.debug("saving FabaDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FabaDet persistentInstance) {
		log.debug("deleting FabaDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FabaDet findById(com.gopawpaw.erp.hibernate.f.FabaDetId id) {
		log.debug("getting FabaDet instance with id: " + id);
		try {
			FabaDet instance = (FabaDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.FabaDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FabaDet instance) {
		log.debug("finding FabaDet instance by example");
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
		log.debug("finding FabaDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FabaDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FabaDet instances");
		try {
			String queryString = "from FabaDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FabaDet merge(FabaDet detachedInstance) {
		log.debug("merging FabaDet instance");
		try {
			FabaDet result = (FabaDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FabaDet instance) {
		log.debug("attaching dirty FabaDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FabaDet instance) {
		log.debug("attaching clean FabaDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FabaDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FabaDetDAO) ctx.getBean("FabaDetDAO");
	}
}