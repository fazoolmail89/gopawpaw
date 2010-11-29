package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VepdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VepdDet
 * @author MyEclipse Persistence Tools
 */

public class VepdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VepdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VepdDet transientInstance) {
		log.debug("saving VepdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VepdDet persistentInstance) {
		log.debug("deleting VepdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VepdDet findById(com.gopawpaw.erp.hibernate.v.VepdDetId id) {
		log.debug("getting VepdDet instance with id: " + id);
		try {
			VepdDet instance = (VepdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VepdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VepdDet instance) {
		log.debug("finding VepdDet instance by example");
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
		log.debug("finding VepdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VepdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VepdDet instances");
		try {
			String queryString = "from VepdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VepdDet merge(VepdDet detachedInstance) {
		log.debug("merging VepdDet instance");
		try {
			VepdDet result = (VepdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VepdDet instance) {
		log.debug("attaching dirty VepdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VepdDet instance) {
		log.debug("attaching clean VepdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VepdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VepdDetDAO) ctx.getBean("VepdDetDAO");
	}
}